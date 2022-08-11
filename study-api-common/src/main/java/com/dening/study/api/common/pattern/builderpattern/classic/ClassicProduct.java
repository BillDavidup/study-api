package com.dening.study.api.common.pattern.builderpattern.classic;

import lombok.Data;

/**
 * 需要构建的bean
 */
@Data
public class ClassicProduct {
    /**
     * 定义一些关于产品的操作
     */
    private String part1;
    private String part2;
}
