package org.couplingfire.listener;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/31
 */
public class EventListenerFactoryBean<T> implements FactoryBean<T> {

    private Class<T> arsonistInterface;

    public EventListenerFactoryBean(Class<T> arsonistInterface) {
        this.arsonistInterface = arsonistInterface;
    }

    @Override
    public T getObject() throws Exception {
        if (null == arsonistInterface)
            throw new IllegalArgumentException("arsonistInterface is null");
        EventListenerProxy proxy = new EventListenerProxy();
        proxy.setArsonistInterface(arsonistInterface);
       // ModuleProcessor.addModuleProxy(moduleProxy);
        return (T) Proxy.newProxyInstance(arsonistInterface.getClassLoader(), new Class[] { arsonistInterface}, proxy);

    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
