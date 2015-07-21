package org.jflowlight.model;

import java.io.Serializable;

/**
 * @author Giovanni Cammarata
 */
public abstract class BaseModel<T extends BaseModel> implements Serializable{

    protected String id;
    protected Long byteCount;
    protected Long packetCount;
    protected Long durationInSecond;
    protected Long durationInNanosecond;

    public String getId() {
        return id;
    }

    public T setId(String id) {
        this.id = id;
        return (T) this;
    }

    public Long getByteCount() {
        return byteCount;
    }

    public T setByteCount(Long byteCount) {
        this.byteCount = byteCount;
        return (T) this;
    }

    public Long getPacketCount() {
        return packetCount;
    }

    public T setPacketCount(Long packetCount) {
        this.packetCount = packetCount;
        return (T) this;
    }

    public Long getDurationInSecond() {
        return durationInSecond;
    }

    public T setDurationInSecond(Long durationInSecond) {
        this.durationInSecond = durationInSecond;
        return (T) this;
    }

    public Long getDurationInNanosecond() {
        return durationInNanosecond;
    }

    public T setDurationInNanosecond(Long durationInNanosecond) {
        this.durationInNanosecond = durationInNanosecond;
        return (T) this;
    }
}
