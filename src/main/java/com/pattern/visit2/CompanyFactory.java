package com.pattern.visit2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yhl
 * @Title: CompanyFactory
 * @Description: TODO
 * @date 2019/6/22/022 0:00
 */
public class CompanyFactory {
    List<Material> materials = new ArrayList<>();

    public void add(Material material) {
        materials.add(material);
    }

    public void remove(Material material) {
        materials.remove(material);
    }

    public void accept(Company company) {
        for (Material m : materials) {
            m.accept(company);
        }

    }
}
