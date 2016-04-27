import java.util.ArrayList;
import java.util.Collection;

import org.jflowlight.onos.OnosController;
import org.junit.Test;

public class Tester {
	final OnosController controller = new OnosController("192.168.0.2", 8181, "onos", "rocks");
	@Test
	public void TestFlow()
	{
		System.out.println("Hello world test");
	//	System.out.println(controller.test());
		try{
		//controller.getFlow(null, null);
			System.out.println(controller.getFlow(null, null).toString());
			System.out.println(controller.getHosts().toString());
			System.out.println(controller.getLinks().toString());
			Collection<String> macSrc = new ArrayList<String>();
			macSrc.add("AA:BB:CC:DD:EE:FF");
			/*addFlowEntry(String flowname, String switchID,
					Integer priority, Integer tableID, Integer entryID,
					Collection<String> ipv4Srcs, Collection<String> ipv4Dsts,
					int ipBit, Collection<String> macSrcs, Collection<String> macDsts,
					Integer outputPort)*/
			controller.addFlowEntry("test", "of:000000000000000c", 
					new Integer(15), null, null, 
					null, null, 
					0, macSrc, null, 
					new Integer(10));
			System.out.println(controller.getStats().toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
