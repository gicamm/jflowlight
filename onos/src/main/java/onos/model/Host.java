package onos.model;

import java.util.List;

import com.google.gson.annotations.Expose;

/*{
 * "id":"00:00:00:00:00:10/-1",
 * "mac":"00:00:00:00:00:10",
 * "vlan":"-1",
 * "ipAddresses":["10.0.0.16"],
 * "location":{"elementId":"of:000000000000000d","port":"6"}
 * }*/
public class Host {
	@Expose
	private String id;
	@Expose
	private String mac;
	@Expose
	private String vlan;
	@Expose
	private List<String> ipAddresses;
	@Expose
	private Location location;
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
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}
	/**
	 * @param mac the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
	/**
	 * @return the vlan
	 */
	public String getVlan() {
		return vlan;
	}
	/**
	 * @param vlan the vlan to set
	 */
	public void setVlan(String vlan) {
		this.vlan = vlan;
	}
	/**
	 * @return the ipAddresses
	 */
	public List<String> getIpAddresses() {
		return ipAddresses;
	}
	/**
	 * @param ipAddresses the ipAddresses to set
	 */
	public void setIpAddresses(List<String> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	
}
