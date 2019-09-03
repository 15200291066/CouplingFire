package org.couplingfire.core;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/31
 */
public interface RegionEventFirer extends EventFirer{
    default String regionName() {
        return "";
    }
}
