package org.couplingfire.distributer;

import org.couplingfire.event.Event;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/26
 * 事件分发器
 */
public interface EventDistributer {

  default void fireEvent(Event e)
  {

  }

}
