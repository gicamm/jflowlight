package onos.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.google.gson.annotations.Expose;
/*
 * Example 
 * {"id":"1125901125646315",
 * "tableId":0,
 * "appId":"org.onosproject.core",
 * "groupId":0,
 * "priority":40000,
 * "timeout":0,
 * "isPermanent":true,
 * "deviceId":"of:000000000000000c",
 * "state":"ADDED",
 * "life":1876580,
 * "packets":0,
 * "bytes":0,
 * "lastSeen":1460886232177,
 * "treatment":
 * 		{"instructions":
 * 			[
 * 				{"type":"OUTPUT","port":"CONTROLLER"}
 * 			],
 * 			"deferred":[]
 * 		},
 * 	"selector": 
 * 		{"criteria": 
 * 			[ 
 * 				{"type":"ETH_TYPE","ethType":"0x806"} 
 *			] 
 *		} 
 *  }
 * 
 * 
 */
public class FlowRule {
	@Expose
    private String id;
	
    @Expose
    private Long tableId;
    
	@Expose
    private Long priority;

    @Expose
    private Long timeout;
    
    @Expose
    private String deviceId;
    
    @Expose
    private Treatment treatment;

    @Expose
    private Selector selector;
    
    @Expose 
    private Long bytes;
    @Expose
    private Long packets;
	/**
	 * @return the bytes
	 */
	public Long getBytes() {
		return bytes;
	}

	/**
	 * @param bytes the bytes to set
	 */
	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	/**
	 * @return the packets
	 */
	public Long getPackets() {
		return packets;
	}

	/**
	 * @param packets the packets to set
	 */
	public void setPackets(Long packets) {
		this.packets = packets;
	}

	/**
	 * @return the selector
	 */
	public Selector getSelector() {
		return selector;
	}

	/**
	 * @param selector the selector to set
	 */
	public void setSelector(Selector selector) {
		this.selector = selector;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the tableId
	 */
	public Long getTableId() {
		return tableId;
	}

	/**
	 * @param tableId the tableId to set
	 */
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	/**
	 * @return the priority
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * @return the timeout
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the treatment
	 */
	public Treatment getTreatment() {
		return treatment;
	}

	/**
	 * @param treatment the treatment to set
	 */
	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}
	
	public Map<String, Object> getMatchs() {
		Map<String, Object> matchs = new ConcurrentHashMap<>();
 		for (Criterion c: getSelector().getCriteria())
 			if (c.getMatch() != null)
 				matchs.put(c.getMatch().getKey(), c.getMatch().getValue());
 		return matchs;
	}
/*	@Expose
    private Map<String,Object> match;*/
    
//    public Treatment getTreatment() {
//		return treatment;
//	}
//
//	public void setTreatment(Treatment treatment) {
//		this.treatment = treatment;
//	}
//
//	/* SET Methods */
//    public void setId(String id)
//    {
//    	this.id = id;
//    }
//    
//    public void setTableId(Long tableId)
//    {
//    	this.tableId = tableId;
//    }
//    
//    public void setPriority(Long priority)
//    {
//    	this.priority = priority;
//    }
//    
//    public void setTimeout(Long timeout)
//    {
//    	this.timeout = timeout;
//    }
//    
//    public void setDeviceId(String deviceId)
//    {
//    	this.deviceId = deviceId;
//    }
//    
//    /* GET Methods */
//    
//    public String getId()
//    {
//    	return id;
//    }
//    
//    public Long getTableId()
//    {
//    	return tableId;
//    }
//    
//    public Long getPriority()
//    {
//    	return priority;
//    }
//    
//    
//    public Long getTimeout()
//    {
//    	return timeout;
//    }
//    
//    public String getDeviceId()
//    {
//    	return deviceId;
//    }
//    

}
