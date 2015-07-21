import org.jflowlight.model.flow.FlowModel;
import org.jflowlight.opendaylight.OpenDayLightController;
import org.jflowlight.opendaylight.model.NodeStatus;
import org.jflowlight.utils.serialization.SerializationException;
import org.jflowlight.utils.serialization.SerializationUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.junit.Test;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class OpenDayLightControllerTest {

    final OpenDayLightController controller = new OpenDayLightController("127.0.0.1",8181,"admin","admin");

    @Test
    public void testGetTopology(){
        System.out.println(controller.getTopology());
    }

    @Test
    public void testGetAllNode() throws Exception {
        print(controller.getAllNode());

    }

    @Test
    public void testStatistics() throws Exception {


    }

    @Test
    public void testConnection() throws Exception {
        print(controller.getNodeConnection("openflow:1", 1));
    }

    @Test
    public void testNodeStatus() throws Exception {
//        final NodeStatus nodeStatus = controller.getNodeStatus("openflow:1");
        final NodeStatus nodeStatus = controller.getNodeStatus(1);
//        print(nodeStatus);

        final Map<String, NodeStatus> nodesStatus = controller.getNodeStatus();
        print(nodesStatus);
    }

    @Test
    public void testDeleteFlows() throws Exception {
        final int start = 150;
        final Collection<String> switches = Arrays.asList("openflow:1", "openflow:2", "openflow:3", "openflow:4", "openflow:5", "openflow:6");
        for(final String switchID: switches) {
            for(int i = start; i <= start + 250; i++) {
                controller.deleteFlowEntry(switchID,0,i);
            }
        }

    }

    @Test
    public void testAddDelete() throws Exception {
//        controller.deleteFlowEntry("openflow:6",0,2);
        controller.addFlowEntry("flowTest", "openflow:6", 0, 0, 2, null, Collections.singleton("10.0.1.0"), 24, null, null, 1);
    }

    @Test
    public void testAddFlow_6s3H() throws Exception {

        //Output
        controller.addFlowEntry("flowOut","openflow:1",155,0,155,null,"10.0.1.2",32,1);
        controller.addFlowEntry("flowOut","openflow:2",155,0,155,null,"10.0.2.2",32,1);
        controller.addFlowEntry("flowOut","openflow:6",155,0,155,null,"10.0.6.2",32,1);


        // 1 to 6
        controller.addFlowEntry("flow1-6","openflow:1",160,0,160,null,"10.0.6.0",24,3);
        controller.addFlowEntry("flow1-6","openflow:3",160,0,160,null,"10.0.6.0",24,2);
        controller.addFlowEntry("flow1-6","openflow:4",160,0,160,null,"10.0.6.0",24,2);
        controller.addFlowEntry("flow1-6","openflow:5",160,0,160,null,"10.0.6.0",24,2);

        // 6 to 1
        controller.addFlowEntry("flow6-1","openflow:6",165,0,165,null,"10.0.1.0",24,3);
        controller.addFlowEntry("flow6-1","openflow:5",165,0,165,null,"10.0.1.0",24,1);
        controller.addFlowEntry("flow6-1","openflow:4",165,0,165,null,"10.0.1.0",24,1);
        controller.addFlowEntry("flow6-1","openflow:3",165,0,165,null,"10.0.1.0",24,1);


        // 2 to 6
        controller.addFlowEntry("flow1-6","openflow:2",170,0,170,null,"10.0.6.0",24,3);

        // 6 to 2
        controller.addFlowEntry("flow6-2","openflow:6",170,0,170,null,"10.0.2.0",24,2);

    }

    @Test
    public void testGetFlowEntry() throws Exception {
        // Switch 1 to Switch 2
        print(controller.getFlow("openflow:1", 0, 151));
    }

    @Test
    public void testGetFlows() throws Exception {
        final Map<String, FlowModel> flow = controller.getFlow("openflow:1", 0);
        print(flow);
    }

    @Test
    public void testTopology() throws Exception {
        print(controller.getTopology());
    }



    private void print(final Object obj) throws SerializationException {
        print(SerializationUtils.toJson(obj));
    }

    private void print(final String s){
        System.out.println(SerializationUtils.prettyPrintJson(s));
    }

    @Test
    public void testListFlow() throws Exception {
//        print(controller.getFlow("openflow:1"));
        print(controller.getFlow("openflow:1", 0, 1));
        print(controller.getFlow("openflow:1", 0, 2));
        print(controller.getFlow("openflow:1", 0, 3));
        print(controller.getFlow("openflow:1", 0, 4));
        print(controller.getFlow("openflow:1", 0, 5));
    }

    @Test
    public void testPushFlow() throws Exception {
        // Switch 1 to Switch 2
        controller.addFlowEntry("flow1","openflow:1",1,0,1,"10.0.2.1","10.0.2.2",2);
        controller.addFlowEntry("flow13","openflow:1",1,0,2,null,"10.0.2.1",1);
        controller.addFlowEntry("flow12","openflow:1",1,0,3,null,"10.0.2.2",2);
        controller.addFlowEntry("flow1","openflow:1",1,0,4,"10.0.2.2",null,3);

        // Switch 2 to Switch 3
        controller.addFlowEntry("flow2","openflow:2",1,0,1,"10.0.2.2",null,2);

        // Switch 3 to Switch 4
        controller.addFlowEntry("flow3","openflow:3",1,0,1,"10.0.2.2",null,2);

        // Switch 4 to Switch 6
        controller.addFlowEntry("flow4","openflow:4",1,0,1,"10.0.2.2",null,2);

        // Switch 6 to Output host
        controller.addFlowEntry("flow6","openflow:6",1,0,1,"10.0.2.2",null,1);
    }

    @Test
    public void testPushFlow2() throws Exception {
        // Switch 1 to Switch 2
        controller.addFlowEntry("flow11","openflow:1",1,0,1,"10.0.2.2","10.0.2.3",3); // H2 to H3
        controller.addFlowEntry("flow12","openflow:1",1,0,2,"10.0.2.1","10.0.2.3",4); // H1 to H3
        controller.addFlowEntry("flow13","openflow:1",1,0,3,null,"10.0.2.2",2); // ALL to H2
        controller.addFlowEntry("flow14","openflow:1",1,0,4,null,"10.0.2.1",1); // ALL to H1

        // Switch 2 to Switch 3
        controller.addFlowEntry("flow21","openflow:2",1,0,1,"10.0.2.2","10.0.2.3",2); // H2 to H3

        // Switch 3 to Switch 4
        controller.addFlowEntry("flow31","openflow:3",1,0,1,"10.0.2.2","10.0.2.3",2); // H2 to H3

        // Switch 4 to Switch 6
        controller.addFlowEntry("flow41","openflow:4",1,0,1,"10.0.2.2","10.0.2.3",2); // H2 to H3

        //Switch 5 to Switch 6
        controller.addFlowEntry("flow51","openflow:5",1,0,1,"10.0.2.1","10.0.2.3",2); // H1 to H3

        // Switch 6 to Output host
        controller.addFlowEntry("flow61","openflow:6",1,0,1,null,"10.0.2.3",1); // ALL to H3

    }

    @Test
    public void testDelete() throws Exception {
        // Switch 1 to Switch 2
        controller.deleteFlowEntry("openflow:1", 0, 1);

        // Switch 2 to Switch 3
        controller.deleteFlowEntry("openflow:2", 0, 1);

        // Switch 3 to Switch 4
        controller.deleteFlowEntry("openflow:3", 0, 1);

        // Switch 4 to Switch 6
        controller.deleteFlowEntry("openflow:4", 0, 1);

        // Switch 6 to Output host
        controller.deleteFlowEntry("openflow:6", 0, 1);
    }

}