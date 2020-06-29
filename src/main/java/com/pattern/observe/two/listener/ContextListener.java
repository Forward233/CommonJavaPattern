package com.pattern.observe.two.listener;

import com.pattern.observe.two.event.Event;

/**
 * @author: yhl
 * @DateTime: 2020/6/29 7:29
 * @Description:
 */
public interface ContextListener<T extends Event> extends EventListener {

    void onApplicationEvent(T event);
}
