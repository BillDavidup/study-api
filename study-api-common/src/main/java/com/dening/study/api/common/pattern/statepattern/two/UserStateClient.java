package com.dening.study.api.common.pattern.statepattern.two;

public class UserStateClient {

    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论: 好文章，360个赞!");
    }

}
