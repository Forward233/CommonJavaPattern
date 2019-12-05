package com.pattern.visit2;

/**
 * @author yhl
 * @Title: Client
 * @Description: TODO
 * @date 2019/6/22/022 0:00
 */
public class Client {
    public static void main(String[] args) {
        CompanyFactory companyFactory = new CompanyFactory();

        // 添加元素
        companyFactory.add(new Paper());
        companyFactory.add(new Cupurm());

        // 访问者
        ArtCompany artCompany = new ArtCompany();
        companyFactory.accept(artCompany);

        // 访问者
        MintCompany mintCompany = new MintCompany();
        companyFactory.accept(mintCompany);

    }

}
