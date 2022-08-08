package com.dening.study.api.common.pattern.chainpattern.two;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

/**
 * 3.用户角色校验
 */
public class RoleValidateChainHandler extends ChainHandler {
    @Override
    public void doHandler(UserLoginReq req) {
        String role = req.getRole();
        if (!"管理员".equals(role)) {
            System.out.println("用户不是管理员，请求提前终止");
            return;
        }
        System.out.println("请求到达责任链终点，用户角色通过验证，请求信息req:" + req);
        // 责任链终点不需要调用下一个责任链节点
    }
}
