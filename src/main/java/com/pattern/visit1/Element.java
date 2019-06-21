package com.pattern.visit1;

/**
 * @author yhl
 * @Title: Element
 * @Description: TODO
 * @date 2019/6/21/021 22:54
 */
public interface Element {
    void accept(Visitor visitor);
}
