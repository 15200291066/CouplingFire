package org.couplingfire.listener;

import org.couplingfire.event.Event;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/9/3
 */
public interface RegionEventListener {

    default String regionName() {
        return this.getClass().getSimpleName();
    }
}
