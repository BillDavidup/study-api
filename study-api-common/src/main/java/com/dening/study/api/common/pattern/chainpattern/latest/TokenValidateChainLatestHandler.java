package com.dening.study.api.common.pattern.chainpattern.latest;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

public class TokenValidateChainLatestHandler extends AbstractChainHandler {

    @Override
    public void doHandler(UserLoginReq req) {
        String token = req.getToken();
        if (!"TOKEN_1".equals(token)) {
            System.out.println("Latest token不是TOKEN_1，请求提前终止");
            return;
        }
        System.out.println("Latest token匹配上了TOKEN_1，请求继续传导到下一个责任链");
        nextHandler.doHandler(req);
    }
}
