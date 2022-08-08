package com.dening.study.api.common.pattern.chainpattern.two;

import com.dening.study.api.common.pattern.chainpattern.UserBlacklistSet;
import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

/**
 * 1.用户黑名单校验
 */
public class BlacklistValidateChainHandler extends ChainHandler {

    @Override
    public void doHandler(UserLoginReq req) {

        if (UserBlacklistSet.blacklistSet.contains(req.getUserId())) {
            System.out.println("用户在黑名单中，请求提前终止");
            return;
        }
        System.out.println("用户不在黑名单中，请求继续传导到下一个责任链");
        nextHandler.doHandler(req);
    }
}
