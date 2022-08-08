package com.dening.study.api.common.pattern.chainpattern;

import java.util.HashSet;

public class UserBlacklistSet {
    public static final HashSet<Long> blacklistSet = new HashSet<>();

    static {
        blacklistSet.add(1L);
        blacklistSet.add(2L);
        blacklistSet.add(3L);
        blacklistSet.add(4L);
        blacklistSet.add(5L);
    }
}
