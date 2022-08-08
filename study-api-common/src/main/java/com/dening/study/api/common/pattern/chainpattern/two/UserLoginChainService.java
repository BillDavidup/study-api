package com.dening.study.api.common.pattern.chainpattern.two;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

public class UserLoginChainService {
    public void login(UserLoginReq req) {
        /**
         * 缺点：责任链的连接全靠硬编码
         */
        ChainHandler blacklistValidateChainHandler = new BlacklistValidateChainHandler();
        ChainHandler tokenValidateChainHandler = new TokenValidateChainHandler();
        ChainHandler roleValidateChainHandler = new RoleValidateChainHandler();
        blacklistValidateChainHandler.nextHandler(tokenValidateChainHandler);
        tokenValidateChainHandler.nextHandler(roleValidateChainHandler);

        // 责任链头结点开始处理
        blacklistValidateChainHandler.doHandler(req);
    }

    /**
     * 模拟客户端调用责任链
     *
     * @param args
     */
    public static void main(String[] args) {
        UserLoginReq req = new UserLoginReq();
        req.setUserId(6L);
        req.setToken("TOKEN_1");
        req.setRole("管理员");

        UserLoginChainService service = new UserLoginChainService();
        service.login(req);
    }
}
