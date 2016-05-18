package org.jflowlight.onos.statistics;

public class TableStats {
	private Integer tableId;
	private String deviceId;
	//private Long life;
	private Long packets;
	private Long bytes;
	//private Long lastSeen;
	/**
	 * @return the tableId
	 */
	public Integer getTableId() {
		return tableId;
	}
	/**
	 * @param tableId the tableId to set
	 */
	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}
	/**
	 * @return the id of the device the table belongs to
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
//	/**
//	 * @return the life
//	 */
//	public Long getLife() {
//		return life;
//	}
//	/**
//	 * @param life the life to set
//	 */
//	public void setLife(Long life) {
//		this.life = life;
//	}
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
//	/**
//	 * @return the lastSeen
//	 */
//	public Long getLastSeen() {
//		return lastSeen;
//	}
//	/**
//	 * @param lastSeen the lastSeen to set
//	 */
//	public void setLastSeen(Long lastSeen) {
//		this.lastSeen = lastSeen;
//	}
}
