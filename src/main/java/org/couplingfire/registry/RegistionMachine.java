package org.couplingfire.registry;

import org.couplingfire.listener.RegionEventListener;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/9/3
 */
public class RegistionMachine implements ListenerRegistionMachine {

    @Override
    public void registryLocal(Class<? extends RegionEventListener> eventListener) {
        if (null == eventListener) {
            throw new IllegalArgumentException("eventListener can not be null");
        }
    }

    @Override
    public void registryRemote(String moduleName, RemoteRegistionInfo registionInfo) {

    }

    @Override
    public void registryRemote(Class<? extends RegionEventListener> eventListener) {

    }
}
