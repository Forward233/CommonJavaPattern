package com.pattern.chain.one;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:48
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("admin", "123456");
    }
}
