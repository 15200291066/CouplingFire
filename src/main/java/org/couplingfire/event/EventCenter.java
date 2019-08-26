package org.couplingfire.event;

import org.couplingfire.distributer.RegionEventDistributer;

import java.util.List;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/26
 *
 * 事件中心，管理所有的事件分发器
 */
public interface EventCenter {

    List<RegionEventDistributer> getAllRegionDistributer();

    RegionEventDistributer getRegionDistributerByName(String regionName);

    void addRegionEentDistributer(RegionEventDistributer r);

    void removeRegionEventDistributer(RegionEventDistributer r);

    void removeRegionEventDistributer(String regionName);

    void clearRegionEventDistributer();

    int getRegionDistributerSize();
}
