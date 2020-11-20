package com.pattern.chain.one;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:28
 * @Description:
 */
public class ValidateHandler extends Handler{
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) ||
                StringUtils.isEmpty(member.getLoginPassword())) {
            System.out.println("用户名或者密码错误");
            return;
        }
        System.out.println("用户名和密码校验成功...");
        chain.doHandler(member);
    }
}
