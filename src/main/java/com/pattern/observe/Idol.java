package com.pattern.observe;

/**
 * @author: yhl
 * @DateTime: 2020/6/28 22:54
 * @Description: 抽象主题接口
 */
public interface Idol {
    void adFan(Fan fan);

    void delFan(Fan fan);

    void notifyFan(String msg);
}
