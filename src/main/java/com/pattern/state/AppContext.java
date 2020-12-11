package com.pattern.state;

/**
 * @author: yhl
 * @DateTime: 2020/12/11 14:02
 * @Description:
 */
public class AppContext {

    public static final UserState LOGIN_STATE = new LoginState();
    public static final UserState UN_LOGIN_STATE = new UnLoginState();

    private UserState currentState = UN_LOGIN_STATE;

    {
        LOGIN_STATE.setAppContext(this);
        UN_LOGIN_STATE.setAppContext(this);
    }

    public void setState(UserState userState) {
        this.currentState = userState;
        this.currentState.setAppContext(this);
    }

    public UserState getState() {
        return this.currentState;
    }

    public void favorite() {
        this.currentState.favorite();
    }

    public void comment(String comment) {
        this.currentState.comment(comment);
    }

}
