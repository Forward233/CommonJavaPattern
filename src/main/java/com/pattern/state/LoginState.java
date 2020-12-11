package com.pattern.state;

/**
 * @author: yhl
 * @DateTime: 2020/12/11 14:02
 * @Description:
 */
public class LoginState extends UserState{
    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
