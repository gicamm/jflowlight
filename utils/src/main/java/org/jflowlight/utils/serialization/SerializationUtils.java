package org.jflowlight.utils.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Type;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class SerializationUtils {

    private final static Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private final static XStream xstream = new XStream(new DomDriver());

    public final static <T> T fromJson(final String json, final Class<T> klass){
        return gson.fromJson(json,klass);
    }

    /**
     *
     * @param source
     * @param type
     * @param <T>
     * @return an object from JSON format
     */
    public static <T> T fromJson(final String source, final Type type){
        return gson.fromJson(source,type);
    }

    public static String toJson(final Object source) throws SerializationException {
        return gson.toJson(source);
    }

    /**
     *
     * @param json
     * @return pretty JSON string
     */
    public static String prettyPrintJson(final String json) {
        if(StringUtils.isBlank(json))
            return "{}";

        final JsonParser jp = new JsonParser();
        final JsonElement je = jp.parse(json);
        return new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create().toJson(je);
    }

    /**
     * Serialize an object to XML format.
     *
     * @param obj Object to serialize
     * @return    Serialized object
     * @throws SerializationException
     */
    public static String toXML(final Object obj) throws SerializationException {
        if(obj == null)
            throw new SerializationException("object to write must be not null");
        return xstream.toXML(obj);
    }

    /**
     *
     * @param xml
     * @param <T>
     * @return
     * @throws SerializationException
     */
    public <T> T fromXML(final String xml) throws SerializationException {
        return (T)xstream.fromXML(xml);
    }

}
