package org.couplingfire.event;

import org.couplingfire.distributer.RegionEventDistributer;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/26
 */
public class DefaultEventCenter implements EventCenter{

    private volatile List<RegionEventDistributer> holder = new ArrayList<RegionEventDistributer>();

    @Override
    public List<RegionEventDistributer> getAllRegionDistributer() {
        return holder;
    }

    @Override
    public RegionEventDistributer getRegionDistributerByName(String regionName) {
      for (RegionEventDistributer r : holder)
      {
          if (r.regionName().equals(regionName))
          {
              return r;
          }
      }
      return null;
    }

    @Override
    public void addRegionEentDistributer(RegionEventDistributer r) {
        if (! holder.contains(r))
            holder.add(r);
    }

    @Override
    public void removeRegionEventDistributer(RegionEventDistributer r) {
        holder.remove(r);
    }

    @Override
    public void removeRegionEventDistributer(String regionName) {
        for (RegionEventDistributer r : holder)
        {
            if (r.regionName().equals(regionName))
            {
               holder.remove(r);
            }
        }
    }

    @Override
    public void clearRegionEventDistributer() {
        holder.clear();
    }

    @Override
    public int getRegionDistributerSize() {
        return holder.size();
    }

}
