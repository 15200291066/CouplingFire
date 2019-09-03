package org.couplingfire.registry;

import org.couplingfire.distributer.EventDistributer;
import org.couplingfire.listener.EventListener;
import org.couplingfire.listener.RegionEventListener;

import java.rmi.Remote;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/9/2
 */
public interface ListenerRegistionMachine {

    void registryLocal(Class<? extends RegionEventListener> eventListener);

    void registryRemote(String moduleName, RemoteRegistionInfo registionInfo);

    void registryRemote(Class<? extends RegionEventListener> eventListener);
}
