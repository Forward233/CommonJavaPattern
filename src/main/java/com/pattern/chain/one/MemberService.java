package com.pattern.chain.one;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 10:37
 * @Description:
 */
public class MemberService {

    public void login(String userName, String loginPassword) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();
        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(new Member(userName,loginPassword));
    }
}
