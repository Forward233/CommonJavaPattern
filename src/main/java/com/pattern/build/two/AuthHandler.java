package com.pattern.build.two;


import com.pattern.chain.one.Member;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:28
 * @Description:
 */
public class AuthHandler extends Handler<Member> {
    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("您是管理员，允许操作！");
    }
}
