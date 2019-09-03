package org.couplingfire.manager;

import org.couplingfire.listener.EventListener;
import org.couplingfire.listener.RegionEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/9/3
 */
public class EventListenerManager {
    private Map<String, List<RegionEventListener>> eventListenerHolder = new ConcurrentHashMap();

    public List<RegionEventListener> getEventListener(String regionName) {
        return eventListenerHolder.get(regionName);
    }

    public List<RegionEventListener> addEventListener(RegionEventListener listener) {
        List<RegionEventListener> listeners = eventListenerHolder.get(listener.regionName());
        if (listeners == null) {
            listeners = new ArrayList<>();
            eventListenerHolder.put(listener.regionName(), listeners);
        }
        return listeners;
    }
}
