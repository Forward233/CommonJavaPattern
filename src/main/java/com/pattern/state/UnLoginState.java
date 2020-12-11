package com.pattern.state;

/**
 * @author: yhl
 * @DateTime: 2020/12/11 14:03
 * @Description:
 */
public class UnLoginState extends UserState{

    @Override
    public void favorite() {
        this.switch2Login();
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        System.out.println(comment);
    }

    /**
     * 状态切换
     */
    private void switch2Login() {
        System.out.println("跳转到登录页面！");
        this.appContext.setState(AppContext.LOGIN_STATE);
    }
}
