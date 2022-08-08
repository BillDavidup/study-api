package com.dening.study.api.common.pattern.chainpattern;

import lombok.Data;

@Data
public class UserLoginReq {
    // 用户id
    Long userId;
    // 客户端校验token
    String token;
    // 用户角色
    String role;
}
