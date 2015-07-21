import org.jflowlight.floodligh.FloodlightController;
import org.jflowlight.model.flow.Flow;
import org.jflowlight.model.Flows;
import org.jflowlight.model.ControllerSummary;
import org.jflowlight.model.Switch;
import org.jflowlight.model.route.SwitchRoute;
import org.jflowlight.model.topology.Topology;
import org.jflowlight.utils.serialization.SerializationException;
import org.jflowlight.utils.serialization.SerializationUtils;
import org.jflowlight.utils.rest.RestClient;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FloodlightControllerTest {

    final FloodlightController controller = new FloodlightController("127.0.0.1",8080,null,null);
    final RestClient restClient = new RestClient("127.0.0.1",8080);

    private void print(final Object obj) throws SerializationException {
        print(SerializationUtils.toJson(obj));
    }

    private void print(final String s){
        System.out.println(SerializationUtils.prettyPrintJson(s));
    }

    @Test
    public void testFloodlight() throws Exception {


        System.out.println("\n"+restClient.get("/wm/core/memory/json"));
        System.out.println("\n"+restClient.get("/wm/topology/links/json"));
        System.out.println("\n"+restClient.get("/wm/topology/switchclusters/json "));
        System.out.println("\n"+restClient.get("/wm/topology/external-links/json"));
        System.out.println("\n"+restClient.get("/wm/device/"));
        System.out.println("\n"+restClient.get(" /wm/staticflowpusher/list/all/json"));

        //  Retrieve aggregate stats across all switches
        System.out.println("\n"+restClient.get("/wm/core/switch/all/port/json"));
        System.out.println("\n"+restClient.get("/wm/core/switch/all/queue/json"));


        System.out.println("\n"+restClient.get("/wm/core/switch/all/aggregate/json"));
        System.out.println("\n"+restClient.get("/wm/core/switch/all/desc/json"));
        System.out.println("\n"+restClient.get("/wm/core/switch/all/table/json"));
        System.out.println("\n"+restClient.get("/wm/core/switch/all/features/json"));

        //  List of global traffic counters in the controller (across all switches)
//        System.out.println("\nCounter"+"\n"+restClient.get("/wm/core/counter/all/json"));


        System.out.println("\nstorage/tables"+"\n"+restClient.get("/wm/core/storage/tables/json"));
    }


    @Test
    public void testQoS() throws Exception {

        System.out.println("\nQoS"+"\n"+restClient.get("/wm/firewall/module/enable/json"));
        System.out.println("\nQoS"+"\n"+restClient.get("/wm/firewall/module/status/json"));
        System.out.println("\nQoS"+"\n"+restClient.get("/wm/firewall/module/disable/json"));
        System.out.println("\nQoS"+"\n"+restClient.get("/wm/firewall/module/status/json"));
        System.out.println("\nQoS"+"\n"+restClient.get("/wm/firewall/rules/json"));
    }

    @Test
    public void testListFlows() throws Exception {
        System.out.println(restClient.get("/wm/staticflowpusher/list/all/json"));

    }

    @Test
    public void testClearFlowEntries() throws Exception {
        testListFlows();
        controller.clearFlowEntries("00:00:00:00:00:00:00:01");
        testListFlows();
        controller.clearFlowEntries(null);
        testListFlows();
    }

    @Test
    public void testAddDropFlowRow() throws Exception {
        final Flow flow = new Flow();
        flow.setActive(true).
                setSwitchID("00:00:00:00:00:00:00:01").
                setName("drop-test").
                setEtherType("0x800").
                setDstIp("10.0.0.1").
                setSrcIp("10.0.0.2");
        controller.addFlowEntry(flow);
    }

    /**
     * This flow redirect the traffic sent by A from B to C
     * @throws Exception
     */
    @Test
    public void testFlowRedirect() throws Exception {
        final Flow flow = new Flow();
        flow.setActive(true).
                setSwitchID("00:00:00:00:00:00:00:01").
                setName("redirect").
                setEtherType("0x800").
                setDstIp("10.0.2.1").
                setSrcIp("10.0.2.4").
                setActions("set-dst-ip=10.0.2.2");
        controller.addFlowEntry(flow);
        testListFlows();
    }

    @Test
    public void testRemoveFlowRow() throws Exception {
        final String flowRequest = "{\"switch\": \"00:00:00:00:00:00:00:01\", \"name\":\"flow-mod-3\", \"priority\":\"32768\", \"ingress-port\":\"2\",\"active\":\"true\", \"actions\":\"output=2\"}";
        restClient.post("/wm/staticflowpusher/json", flowRequest);
    }


    @Test
    public void testAddFlow() throws Exception {
        final Flow flowRequest = new Flow();
        flowRequest.setSwitchID("00:00:00:00:00:00:00:01");
        flowRequest.setName("flow-mod-1");
        flowRequest.setActions("output=2");
        flowRequest.setPriority("15221");

        restClient.post("/wm/staticflowpusher/json", flowRequest);
        testListFlows();
    }

    @Test
    public void testDeleteFlowRow() throws Exception {
        final Flow flowRequest = new Flow();
        flowRequest.setSwitchID("00:00:00:00:00:00:00:02");
        flowRequest.setName("flow-mod-2");
        flowRequest.setActions("output=2");
        flowRequest.setPriority("15222");

        restClient.post("/wm/staticflowpusher/json", flowRequest);
        testListFlows();
    }

    ////
    // FIREWALL
    ////
    @Test
    public void testFirewall() throws Exception {
        System.out.println(controller.isFirewallEnabled());
        controller.enableFirewall();
        System.out.println(controller.isFirewallEnabled());
        controller.disableFirewall();
        System.out.println(controller.isFirewallEnabled());
    }

    @Test
    public void testFirewallAdd() throws Exception {
        final Map<String,String> map = new HashMap<String, String>();
        map.put("switchid", "00:00:00:00:00:00:00:01");
        map.put("action", "ALLOW");
        System.out.println(restClient.post("/wm/firewall/rules/json", map));

    }

    ////
    // END FIREWALL
    ////

    ////
    // TOPOLOGY
    ////

    @Test
    public void testTopology() throws Exception {
        print(controller.route("00:00:00:00:00:00:00:01", 22, "00:00:00:00:00:00:00:04", 22));
    }


    ////
    // END TOPOLOGY
    ////

    ////
    // CONTROLLER
    ////

    @Test
    public void testController() throws Exception {
//        System.out.println("\n"+restClient.get("/wm/core/counter/OFSwitchManager/all/json"));
//        System.out.println("\n"+restClient.get("/wm/core/memory/json"));
//        System.out.println("\n"+restClient.get("/wm/core/health/json"));
//        System.out.println("\n"+restClient.get("/wm/core/storage/tables/json"));
//        print("\n"+restClient.get(" /wm/topology/links/json "));
//        print("\n"+restClient.get(" /wm/topology/switchclusters/json "));
//        print("\n"+restClient.get(" /wm/device/ "));
        print("\n"+restClient.get(" /wm/topology/route/00:00:00:00:00:00:00:01/22/00:00:00:00:00:00:00:06/22/json"));
//        System.out.println("\n"+restClient.get(" /wm/device/ "));

    }


    ////
    // END CONTROLLER
    ////

    ////
    // STATS
    ////

    @Test
    public void testStats() throws Exception {
        print(restClient.get("/wm/core/switch/all/port/json"));
//        print(restClient.get(" /wm/device/ "));
//        print(restClient.get("/wm/core/switch/all/aggregate/json"));
//        print(restClient.get("/wm/core/switch/00:00:00:00:00:00:00:06/port/json"));
//        print(restClient.get("/wm/core/switch/00:00:00:00:00:00:00:05/port/json"));
//        print(restClient.get("/wm/core/switch/00:00:00:00:00:00:00:04/port/json"));
//        print(restClient.get("/wm/core/switch/00:00:00:00:00:00:00:03/port/json"));
//        print(restClient.get("/wm/core/switch/00:00:00:00:00:00:00:02/port/json"));
//        print(restClient.get("/wm/core/switch/00:00:00:00:00:00:00:01/port/json"));
    }


    ////
    // END STATS
    ////

    @Test
    public void testFloodlightModel() throws Exception {
        testClearFlowEntries();

        final Map<String, Collection<Map<String, Flow>>> flows = controller.getFlow();
        System.out.println("\n"+ flows);

        final Flows flow = controller.getFlow(flows.keySet().iterator().next());
        System.out.println("\n"+ flow);

        final ControllerSummary controllerSummary = controller.summary();
        System.out.println("\n"+ controllerSummary);

        final Collection<Switch> switches = controller.getSwitches();
        System.out.println("\n"+ switches);
        final Collection<Topology> topology = controller.topology();
        System.out.println("\n"+ topology);
        final Map<String, Collection<String>> clusters = controller.clusters();
        System.out.println("\n"+ clusters);

        final Collection<SwitchRoute> route = controller.route("00:00:00:00:00:00:00:01", 22, "00:00:00:00:00:00:00:06", 22);
        System.out.println("\n"+ route);
        System.out.println("END");

    }

    @Test
    public void testDefineFlow() throws Exception {

        controller.clearFlowEntries(null);

        // Use diamond.py

        printRoute();

        //Define a new flow
        Flow flow;

        //Switch 1 to Switch 3
        flow = new Flow().setName("flow1").
                setSwitchID("00:00:00:00:00:00:00:01").
                setInPort(1).
                setActions("output=3").
                setActive(true);
        controller.addFlowEntry(flow);

        //Switch 1 to Switch 3
        flow = new Flow().
                setName("flow2").
                setSwitchID("00:00:00:00:00:00:00:03").
                setActions("output=2").
                setActive(true);
        controller.addFlowEntry(flow);

        //Switch 1 to Switch 3
        flow = new Flow().
                setName("flow3").
                setCookie("0").
                setSwitchID("00:00:00:00:00:00:00:05").
                setActions("output=2").
                setActive(true);
        controller.addFlowEntry(flow);

        Thread.sleep(2500);
        System.out.println();
        testListFlows();

        System.out.println();
        // Check the current flow
        printRoute();
        controller.clearFlowEntries(null);

    }

    @Test
    public void testQosModule() throws Exception {

    }

    @Test
    public void printRoute(){
        final Collection<SwitchRoute> route = controller.route("00:00:00:00:00:00:00:01", 3, "00:00:00:00:00:00:00:06", 211);
        for(final SwitchRoute sr : route)
            System.out.println(sr.getSwitch() +" " + sr.getPort().getPortNumber());
    }

}