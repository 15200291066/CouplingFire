package org.couplingfire.listener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/31
 */
public class EventListenerProxy implements InvocationHandler {
    private Class ArsonistInterface;

    public Class getArsonistInterface() {
        return ArsonistInterface;
    }

    public void setArsonistInterface(Class arsonistInterface) {
        ArsonistInterface = arsonistInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
