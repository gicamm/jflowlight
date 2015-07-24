
package org.jflowlight.opendaylight.model;

import com.google.gson.annotations.Expose;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class Duration {

    @Expose
    private Long second;
    @Expose
    private Long nanosecond;

    /**
     * 
     * @return
     *     The second
     */
    public Long getSecond() {
        return second;
    }

    /**
     * 
     * @param second
     *     The second
     */
    public void setSecond(Long second) {
        this.second = second;
    }

    public Duration withSecond(Long second) {
        this.second = second;
        return this;
    }

    /**
     * 
     * @return
     *     The nanosecond
     */
    public Long getNanosecond() {
        return nanosecond;
    }

    /**
     * 
     * @param nanosecond
     *     The nanosecond
     */
    public void setNanosecond(Long nanosecond) {
        this.nanosecond = nanosecond;
    }

    public Duration withNanosecond(Long nanosecond) {
        this.nanosecond = nanosecond;
        return this;
    }

}
