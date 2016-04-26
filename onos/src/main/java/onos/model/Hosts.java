package onos.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hosts {
	@SerializedName("hosts")
    @Expose
    private List<Host> hosts = new ArrayList<>();

	/**
	 * @return the hosts
	 */
	public List<Host> getHosts() {
		return hosts;
	}

	/**
	 * @param hosts the hosts to set
	 */
	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}
}
