
package org.jflowlight.opendaylight.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jflowlight")
public class ApplyActions {

    @Expose
    private List<Action> action = new ArrayList<Action>();

    /**
     * 
     * @return
     *     The action
     */
    public List<Action> getAction() {
        return action;
    }

    /**
     * 
     * @param action
     *     The action
     */
    public void setAction(List<Action> action) {
        this.action = action;
    }

}
