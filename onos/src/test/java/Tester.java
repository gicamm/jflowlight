import onos.OnosController;
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
		}
		catch(Exception e)
		{}
	}
}
