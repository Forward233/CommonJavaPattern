package com.pattern.observe.one;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: yhl
 * @DateTime: 2020/6/28 22:55
 * @Description: 主题实现类
 */
public class ConcreteIdol implements Idol {

    private final String idolName;
    private final Set<Fan> fanList;

    public ConcreteIdol(String idolName) {
        fanList = new HashSet<>();
        this.idolName = idolName;
    }

    @Override
    public void adFan(Fan fan) {
        fanList.add(fan);
    }

    @Override
    public void delFan(Fan fan) {
        fanList.remove(fan);
    }

    @Override
    public void notifyFan(String msg) {
        for (Fan fan : fanList) {
            fan.update(idolName + msg);
        }
    }
}
