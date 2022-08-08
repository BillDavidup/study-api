package com.dening.study.api.common.pattern.chainpattern.one;

import com.dening.study.api.common.pattern.chainpattern.UserBlacklistSet;
import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

public class UserLoginService {

    public void login(UserLoginReq req) {

        Long userId = req.getUserId();
        String token = req.getToken();
        String role = req.getRole();


        /**
         * 1.用户黑名单校验
         */
        if (UserBlacklistSet.blacklistSet.contains(userId)) {
            System.out.println("用户在黑名单中，请求提前终止");
            return;
        }

        /**
         * 2.用户token校验
         */
        if (!"TOKEN_1".equals(token)) {
            System.out.println("token不是TOKEN_1，请求提前终止");
            return;
        }

        /**
         * 3.用户角色校验
         */
        if (!"管理员".equals(role)) {
            System.out.println("用户不是管理员，请求提前终止");
            return;
        }
        System.out.println("用户通过验证，请求信息req:" + req);
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
        UserLoginService service = new UserLoginService();
        service.login(req);
    }

}
