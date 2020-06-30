package com.pattern.observe.two;

import com.pattern.observe.two.event.ContextDestroyEvent;
import com.pattern.observe.two.event.ContextRunningEvent;
import com.pattern.observe.two.event.ContextStartEvent;
import com.pattern.observe.two.listener.ContextDestroyEventListener;
import com.pattern.observe.two.listener.ContextRunningEventListener;
import com.pattern.observe.two.listener.ContextStartEventListener;
import com.pattern.observe.two.multicaster.ApplicationEventMulticaster;
import com.pattern.observe.two.multicaster.SimpleApplicationEventMulticaster;

/**
 * @author: yhl
 * @DateTime: 2020/6/29 7:42
 * @Description:
 * [Spring是如何实现事件监听机制的？ Spring源码（二） - 掘金](https://juejin.im/post/5e421bfc6fb9a07cd80f1354)
 */
public class Client {

    public static void main(String[] args) {
        // 新建SimpleApplicationEventMulticaster对象，并添加容器生命周期监听器
        ApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.addContextListener(new ContextStartEventListener());
        eventMulticaster.addContextListener(new ContextRunningEventListener());
        eventMulticaster.addContextListener(new ContextDestroyEventListener());
        // 发射容器启动事件ContextStartEvent
        eventMulticaster.multicastEvent(new ContextStartEvent());
        // 发射容器正在运行事件ContextRunningEvent
        eventMulticaster.multicastEvent(new ContextRunningEvent());
        // 发射容器销毁事件ContextDestroyEvent
        eventMulticaster.multicastEvent(new ContextDestroyEvent());


        // 时间监听器只监听对应的事件
    }
}
