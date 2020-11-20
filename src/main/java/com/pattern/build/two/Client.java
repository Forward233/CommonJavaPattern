package com.pattern.build.two;


/**
 * @author: yhl
 * @DateTime: 2020/11/20 10:50
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("admin", "123456");
    }
}
