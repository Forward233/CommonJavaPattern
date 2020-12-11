package com.pattern.state;

/**
 * @author: yhl
 * @DateTime: 2020/12/11 14:02
 * @Description:
 */
public abstract class UserState {
    protected AppContext appContext;

    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
