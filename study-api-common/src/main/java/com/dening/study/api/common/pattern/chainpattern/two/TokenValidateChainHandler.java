package com.dening.study.api.common.pattern.chainpattern.two;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

/**
 * 2.用户token校验
 */
public class TokenValidateChainHandler extends ChainHandler {

    @Override
    public void doHandler(UserLoginReq req) {
        String token = req.getToken();
        if (!"TOKEN_1".equals(token)) {
            System.out.println("token不是TOKEN_1，请求提前终止");
            return;
        }
        System.out.println("token匹配上了TOKEN_1，请求继续传导到下一个责任链");
        nextHandler.doHandler(req);
    }
}
