package org.couplingfire.event;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/26
 */
public class Event<T> {

    private T eventData;

    private Integer eventType;

    public T getEventData() {
        return eventData;
    }

    public void setEventData(T eventData) {
        this.eventData = eventData;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }
}
