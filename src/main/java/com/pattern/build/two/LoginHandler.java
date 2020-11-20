package com.pattern.build.two;

import com.pattern.chain.one.Member;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:28
 * @Description:
 */
public class LoginHandler extends Handler<Member> {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功...");
        member.setRoleName("管理员");
        chain.doHandler(member);
    }
}
