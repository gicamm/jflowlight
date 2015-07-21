package org.jflowlight.utils.rest;

import org.apache.commons.lang3.StringUtils;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.jflowlight.utils.serialization.SerializationException;
import org.jflowlight.utils.serialization.SerializationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class RestClient implements AutoCloseable{

    protected final static Logger LOGGER = LoggerFactory.getLogger(RestClient.class);

    private final String user,password;
    private final String address;
    private final int port;
    private final String controllerURL;
    private final Client client;

    public RestClient(String address, int port) {
        this(address, port,null,null);
    }

    public RestClient(final String address, final int port, final String user, final String password) {
        this.user = user;
        this.password = StringUtils.trim(password);
        this.address = StringUtils.trim(address);
        this.port = port;
        final ClientConfig config = new ClientConfig();
        client = ClientBuilder.newClient(config);
        if(StringUtils.isNotBlank(user)){
            HttpAuthenticationFeature authenticationFeature = HttpAuthenticationFeature.basic(user,password);
            client.register(authenticationFeature);
        }

        controllerURL = "http://"+address+":"+port;
    }


    /**
     *
     * @param url
     * @return
     */
    private Invocation.Builder buildWebResource(final String[] url){
        return buildWebResource(url,false);
    }

    /**
     *
     * @param url
     * @param xml
     * @return
     */
    private Invocation.Builder buildWebResource(final String[] url, final boolean xml){
        UriBuilder path = UriBuilder.fromUri(controllerURL);

        for(final String resource:url)
            path = path.path(StringUtils.trim(resource));

        return buildWebResource(path,xml);
    }

    /**
     *
     * @param uri
     * @return
     */
    private Invocation.Builder buildWebResource(final String uri, final boolean xml){
        return buildWebResource(UriBuilder.fromUri(controllerURL + StringUtils.trim(uri)),xml);
    }


    /**
     *
     * @param uri
     * @return
     */
    private Invocation.Builder buildWebResource(final String uri){
        return buildWebResource(uri, false);
    }

    /**
     *
     * @param uri
     * @param xml
     * @return
     */
    private Invocation.Builder buildWebResource(final UriBuilder uri, final boolean xml){
        final Invocation.Builder request = client.target(uri).request();
        request.accept(xml ? MediaType.APPLICATION_XML : MediaType.APPLICATION_JSON);
        return xml ? request.header("Content-Type", "application/xml") : request.header("Content-Type", "application/json");
    }

    /**
     *
     * @param url
     * @param klass
     * @param <T>
     * @return
     */
    public <T> T get(final String[] url, final Class<T> klass){
        return SerializationUtils.fromJson(get(url), klass);
    }

    /**
     *
     * @param url
     * @param type
     * @param <T>
     * @return
     */
    public <T> T get(final String[] url, final Type type){
        return SerializationUtils.fromJson(get(url), type);
    }

    /**
     *
     * @param url
     * @param klass
     * @param <T>
     * @return
     */
    public <T> T get(final String url, final Class<T> klass){
        return SerializationUtils.fromJson(get(url), klass);
    }

    /**
     *
     * @param url
     * @param type
     * @param <T>
     * @return
     */
    public <T> T get(final String url, final Type type){
        return SerializationUtils.fromJson(get(url), type);
    }

    /**
     *
     * @param url
     * @param type
     * @param <T>
     * @return
     */
    public <T> T get(final Type type, final String... url){
        return SerializationUtils.fromJson(get(url), type);
    }

    /**
     *
     * @param url
     * @param klass
     * @param <T>
     * @return
     */
    public <T> T get(final Class<T> klass, final String... url){
        return SerializationUtils.fromJson(get(url), klass);
    }

    /**
     *
     * @param url
     * @return
     */
    public String get(final String... url){
        return get(false, url);
    }

    /**
     *
     * @param xml
     * @param url
     * @return
     */
    public String get(final boolean xml,final String... url){
        try {
            final String s = buildWebResource(url, xml).get(String.class);
            return s;
        }catch (final RuntimeException e){
            LOGGER.warn("Error getting data from [{}]", Arrays.asList(url));
            throw e;
        }
    }

    /**
     *
     * @param url
     * @return
     */
    public String get(final String url){
        return get(url, false);
    }

    /**
     *
     * @param url
     * @return
     */
    public String get(final String url, final boolean xml){
        return buildWebResource(url,xml).get(String.class);
    }

    /**
     *
     * @param entity
     * @param url
     */
    public void post(final Object entity, final String... url) throws RestClientException {
        try {
            buildWebResource(url).accept(MediaType.APPLICATION_JSON_TYPE).post(buildEntity(entity instanceof String ? (String)entity : SerializationUtils.toJson(entity),true));
        } catch (final SerializationException e) {
            throw new RestClientException(e);
        }
    }

    /**
     *
     * @param url
     * @param entity
     * @return
     */
    public Response post(final String url, final Object entity) throws RestClientException {
        try {
            return post(url, SerializationUtils.toJson(entity));
        } catch (final SerializationException e) {
            throw new RestClientException(e);
        }
    }

    private Entity<String> buildEntity(final String source, final boolean json){
        return json ? Entity.json(source) : Entity.xml(source);
    }

    /**
     *
     * @param url
     * @param json
     * @return
     */
    public Response post(final String url, final String json) throws RestClientException {
        return closeAndReturn(buildWebResource(url).post(buildEntity(json, true)));
    }

    /**
     *
     * @param url
     * @param xml
     * @return
     */
    public Response postXML(final String url, final String xml) throws RestClientException {
        return closeAndReturn(buildWebResource(url, true).post(buildEntity(xml, false)));
    }

    private Response closeAndReturn(final Response response){
        response.close();
        return response;
    }

    /**
     *
     * @param url
     * @return
     */
    public Response post(final String url, final Map<String, String> values) throws RestClientException {

        final FormDataMultiPart multipart = new FormDataMultiPart();
        for(final Map.Entry<String,String> entry : values.entrySet()){
            multipart.field(entry.getKey(), entry.getValue());
        }

        return closeAndReturn(buildWebResource(url).post(Entity.entity(multipart, multipart.getMediaType())));
    }

    /**
     *
     * @param url
     * @return
     */
    public Response put(final String url, final String json) throws RestClientException {
        return closeAndReturn(buildWebResource(url, false).put(buildEntity(json, true)));
    }

    /**
     *
     * @param url
     * @return
     */
    public Response putXML(final String url, final String xml) throws RestClientException {
        return closeAndReturn(buildWebResource(url, true).put(buildEntity(xml,false)));
    }

    /**
     *
     * @param url
     * @return
     */
    public Response delete(final String url) throws RestClientException {
        return buildWebResource(url).delete(Response.class);
    }

    @Override
    public void close() throws Exception {
        client.close();
    }

}
