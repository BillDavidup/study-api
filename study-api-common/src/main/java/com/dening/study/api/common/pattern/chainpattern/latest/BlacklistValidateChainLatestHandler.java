package com.dening.study.api.common.pattern.chainpattern.latest;

import com.dening.study.api.common.pattern.chainpattern.UserBlacklistSet;
import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

public class BlacklistValidateChainLatestHandler extends AbstractChainHandler {

    @Override
    public void doHandler(UserLoginReq req) {

        if (UserBlacklistSet.blacklistSet.contains(req.getUserId())) {
            System.out.println("Latest 用户在黑名单中，请求提前终止");
            return;
        }
        System.out.println("Latest 用户不在黑名单中，请求继续传导到下一个责任链");
        nextHandler.doHandler(req);
    }
}
