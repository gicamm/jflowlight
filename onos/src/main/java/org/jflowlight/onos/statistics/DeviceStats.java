package org.jflowlight.onos.statistics;

import java.util.List;

public class DeviceStats {
	private String deviceId;
	private List<TableStats> tables;
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
	 * @return the tables
	 */
	public List<TableStats> getTables() {
		return tables;
	}
	/**
	 * @param tables the tables to set
	 */
	public void setTables(List<TableStats> tables) {
		this.tables = tables;
	}
	
	public Long getPackets()
	{
		Long toReturn = new Long(0);
		for (TableStats table : tables)
		{
			toReturn += table.getPackets();
		}
		return toReturn;
	}
	
	public Long getBytes()
	{
		Long toReturn = new Long(0);
		for (TableStats table : tables)
		{
			toReturn += table.getBytes();
		}
		return toReturn;
	}
}
