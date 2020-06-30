package com.pattern.observe.two.listener;

import com.pattern.observe.two.event.ContextDestroyEvent;
import com.pattern.observe.two.event.Event;

/**
 * @author: yhl
 * @DateTime: 2020/6/29 18:07
 * @Description:
 */
public class ContextDestroyEventListener implements ContextListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        if (event instanceof ContextDestroyEvent) {
            System.out.println("容器销毁----------------->销毁时间为：" + ((ContextDestroyEvent) event).getTimestamp());
        }
    }
}
