package com.pattern.visit2;

/**
 * @author yhl
 * @Title: Mint
 * @Description: TODO
 * @date 2019/6/21/021 23:57
 */
public class MintCompany implements Company {
    @Override
    public String create(Paper paper) {
        return "纸币";
    }

    @Override
    public String create(Cupurm cupurm) {
        return "铜币";
    }
}
