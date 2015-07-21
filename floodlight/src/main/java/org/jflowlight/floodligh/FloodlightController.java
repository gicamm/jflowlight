package org.jflowlight.floodligh;

import org.jflowlight.model.ControllerSummary;
import org.jflowlight.model.Flows;
import org.jflowlight.model.GenericResponse;
import org.jflowlight.model.Switch;
import org.jflowlight.model.flow.Flow;
import org.jflowlight.model.route.SwitchRoute;
import org.jflowlight.model.topology.Topology;
import org.jflowlight.utils.rest.RestClient;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;
import org.jflowlight.JolException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class FloodlightController {

    private final RestClient client;

    public FloodlightController(final String address, final int port, final String user, final String password) {
        client = new RestClient(address,port,user,password);
    }

    /**
     * TODO validate response
     * @param url
     */
    private void getAndValidate(final String... url){
        client.get(url);
    }

    ////
    // FLOW
    ////

    /**
     *
     * @return
     */
    public Map<String,Collection<Map<String,Flow>>> getFlow(){
        return client.get(new TypeToken<Map<String,Collection<Map<String,Flow>>>>() {}.getType(),
                FloodlighConstants.WM,
                FloodlighConstants.STATICFLOWPUSHER,
                FloodlighConstants.LIST,
                FloodlighConstants.ALL,
                FloodlighConstants.JSON);
    }

    /**
     *
     * @return
     */
    public Flows getFlow(final String ID){
        return client.get(Flows.class,
                FloodlighConstants.WM,
                FloodlighConstants.STATICFLOWPUSHER,
                FloodlighConstants.LIST,
                ID,
                FloodlighConstants.JSON);
    }

    public void addFlowEntry(final Flow flow) throws JolException {
        client.post(flow,FloodlighConstants.WM,FloodlighConstants.STATICFLOWPUSHER,FloodlighConstants.JSON);
    }

    /**
     *
     * @param switchID
     * @throws JolException
     */
    public void clearFlowEntries(final String switchID) throws JolException {
        final String[] params;
        if(StringUtils.isBlank(switchID)){
            params = new String[]{FloodlighConstants.WM,FloodlighConstants.STATICFLOWPUSHER,FloodlighConstants.CLEAR,FloodlighConstants.ALL,FloodlighConstants.JSON};
        }else {
            params = new String[]{FloodlighConstants.WM,FloodlighConstants.STATICFLOWPUSHER,FloodlighConstants.CLEAR,switchID,FloodlighConstants.JSON};
        }

        getAndValidate(params);
    }

    ////
    // END FLOW
    ////

    /**
     *
     * @return
     */
    public ControllerSummary summary(){
        return client.get(ControllerSummary.class,
                FloodlighConstants.WM,
                FloodlighConstants.CORE,
                FloodlighConstants.CONTROLLER,
                FloodlighConstants.SUMMARY,
                FloodlighConstants.JSON);
    }

    /**
     *
     * @return
     */
    public Collection<Switch> getSwitches(){
        return client.get(new TypeToken<Collection<Switch>>() {}.getType(),
                FloodlighConstants.WM,
                FloodlighConstants.CORE,
                FloodlighConstants.CONTROLLER,
                FloodlighConstants.SWITCHES,
                FloodlighConstants.JSON);
    }

    ////
    // ROUTE
    ////
    public List<SwitchRoute> route(final String srcSwitchID, final int srcPort, final String dstSwitchID, final int dstPort){
        return client.get(new TypeToken<List<SwitchRoute>>() {}.getType(),
                FloodlighConstants.WM,
                FloodlighConstants.TOPOLOGY,
                FloodlighConstants.ROUTE,
                srcSwitchID,
                String.valueOf(srcPort),
                dstSwitchID,
                String.valueOf(dstPort),
                FloodlighConstants.JSON);
    }
    ////
    // END ROUTE
    ////

    ////
    // TOPOLOGY
    ////
    /**
     *
     * @return
     */
    public Collection<Topology> topology(){
        return client.get(new TypeToken<Collection<Topology>>() {}.getType(),
                FloodlighConstants.WM,
                FloodlighConstants.TOPOLOGY,
                FloodlighConstants.LINKS,
                FloodlighConstants.JSON);
    }

    /**
     *
     * @return
     */
    public Map<String,Collection<String>> clusters(){
        return client.get(new TypeToken<Map<String,Collection<String>>>() {}.getType(),
                FloodlighConstants.WM,
                FloodlighConstants.TOPOLOGY,
                FloodlighConstants.SWITCHCLUSTERS,
                FloodlighConstants.JSON);
    }

    ////
    // END TOPOLOGY
    ////

    ////
    // FIREWALL
    ////
    /**
     *
     */
    public void enableFirewall(){
        firewallRequest(FloodlighConstants.ENABLE);
    }

    /**
     *
     */
    public void disableFirewall(){
        firewallRequest(FloodlighConstants.DISABLE);
    }

    /**
     *
     * @return
     */
    public boolean isFirewallEnabled(){
        return StringUtils.contains(firewallRequest(FloodlighConstants.STATUS).getResult(), "enabled");
    }

    /**
     *
     * @param param
     * @return
     */
    private GenericResponse firewallRequest(final String param){
        return client.get(GenericResponse.class,
                FloodlighConstants.WM,
                FloodlighConstants.FIREWALL,
                FloodlighConstants.MODULE,
                param,
                FloodlighConstants.JSON);
    }

    ////
    // END FIREWALL
    ////

}
