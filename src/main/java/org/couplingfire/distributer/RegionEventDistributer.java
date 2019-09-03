package org.couplingfire.distributer;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/26
 */
public interface RegionEventDistributer extends EventDistributer{


    default String regionName()
    {
        return this.getClass().getName();
    }
}
