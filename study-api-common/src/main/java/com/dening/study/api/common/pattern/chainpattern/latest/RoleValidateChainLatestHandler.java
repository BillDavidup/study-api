package com.dening.study.api.common.pattern.chainpattern.latest;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

public class RoleValidateChainLatestHandler extends AbstractChainHandler {

    @Override
    public void doHandler(UserLoginReq req) {
        String role = req.getRole();
        if (!"管理员".equals(role)) {
            System.out.println("Latest用户不是管理员，请求提前终止");
            return;
        }
        System.out.println("Latest 请求到达责任链终点，用户角色通过验证，请求信息req:" + req);
        // 责任链终点不需要调用下一个责任链节点
    }
}
