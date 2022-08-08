package com.dening.study.api.common.pattern.chainpattern.latest;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;
import com.dening.study.api.common.pattern.chainpattern.two.BlacklistValidateChainHandler;
import com.dening.study.api.common.pattern.chainpattern.two.RoleValidateChainHandler;
import com.dening.study.api.common.pattern.chainpattern.two.TokenValidateChainHandler;

public class UserLoginChainBuilderService {

    public void loginChain(UserLoginReq req) {
        AbstractChainHandler.ChainBuilder builder = new AbstractChainHandler.ChainBuilder();
        builder.addHandler(new BlacklistValidateChainLatestHandler())
                .addHandler(new TokenValidateChainLatestHandler())
                // 注意：最终的责任链终点不需要调用下一个责任链节点，区别
                .addHandler(new RoleValidateChainLatestHandler());

        builder.build().doHandler(req);
    }

    /**
     * 模拟客户端调用责任链
     * @param args
     */
    public static void main(String[] args) {
        UserLoginReq req = new UserLoginReq();
        req.setUserId(6L);
        req.setToken("TOKEN_1");
        req.setRole("管理员");
        UserLoginChainBuilderService service = new UserLoginChainBuilderService();
        service.loginChain(req);

    }
}
