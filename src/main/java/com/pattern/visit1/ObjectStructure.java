package com.pattern.visit1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yhl
 * @DateTime: 2019/12/5 17:17
 * @Description:
 */
public class ObjectStructure {

    List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element m : elements) {
            m.accept(visitor);
        }

    }
}
