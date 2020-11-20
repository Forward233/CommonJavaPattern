package com.pattern.chain.one;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:48
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();
        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(new Member("admin","123456"));
    }
}
