package com.pattern.build.two;


import com.pattern.chain.one.Member;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 10:39
 * @Description:
 */
public class MemberService {

    public void login(String userName, String loginPassword) {
        Handler.Builder<Member> builder = new Handler.Builder<>();
        builder
                .addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(new Member(userName, loginPassword));
    }
}
