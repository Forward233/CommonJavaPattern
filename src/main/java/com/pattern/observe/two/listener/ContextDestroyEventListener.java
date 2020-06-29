package com.pattern.observe.two.listener;

import com.pattern.observe.two.event.AbstractContextEvent;
import com.pattern.observe.two.event.Event;

/**
 * @author: yhl
 * @DateTime: 2020/6/29 18:07
 * @Description:
 */
public class ContextDestroyEventListener implements ContextListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        if (event != null) {
            AbstractContextEvent abstractContextEvent = (AbstractContextEvent) event;
            System.out.println("容器销毁----------------->销毁时间为：" + abstractContextEvent.getTimestamp());
        }

    }
}
