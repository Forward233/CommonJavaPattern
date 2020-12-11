package com.pattern.state;

/**
 * @author: yhl
 * @DateTime: 2020/12/11 14:15
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        AppContext appContext = new AppContext();
        appContext.favorite();
        appContext.comment("评论：好文章，来三百个赞！");
    }
}
