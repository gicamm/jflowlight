
package org.jflowlight.opendaylight.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Instructions {

    @Expose
    private List<Instruction> instruction = new ArrayList<Instruction>();

    /**
     * 
     * @return
     *     The instruction
     */
    public List<Instruction> getInstruction() {
        return instruction;
    }

    /**
     * 
     * @param instruction
     *     The instruction
     */
    public void setInstruction(List<Instruction> instruction) {
        this.instruction = instruction;
    }

}
