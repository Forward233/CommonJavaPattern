package com.pattern.observe.two.multicaster;

import com.pattern.observe.two.event.Event;
import com.pattern.observe.two.listener.ContextListener;

/**
 * @author: yhl
 * @DateTime: 2020/6/29 7:31
 * @Description:
 */
public interface ApplicationEventMulticaster {

    void addContextListener(ContextListener<Event> contextListener);

    void removeContextListener(ContextListener<Event> contextListener);

    void removeAllContextListeners();

    void multicastEvent(Event event);

}
