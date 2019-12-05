package com.pattern.visit2;

/**
 * @author yhl
 * @Title: ArtCompany
 * @Description: TODO
 * @date 2019/6/21/021 23:56
 */
public class ArtCompany implements Company {
    @Override
    public String create(Paper paper) {
        return "讲学图";
    }

    @Override
    public String create(Cupurm cupurm) {
        return "朱熹铜像";
    }
}
