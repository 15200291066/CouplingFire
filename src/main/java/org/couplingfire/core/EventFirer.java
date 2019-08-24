package org.couplingfire.core;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/24
 */
public interface EventFirer {
    default <T extends EventListener> void fire()
    {

    }
}
