package com.pattern.visit2;

/**
 * @author yhl
 * @Title: Cupurm
 * @Description: TODO
 * @date 2019/6/21/021 23:55
 */
public class Cupurm implements Material {
    @Override
    public void accept(Company company) {
        String s = company.create(this);
        System.out.println(s);
    }
}
