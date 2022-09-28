package com.dening.study.api.common.pattern.statepattern.one;

/**
 * 具体状态
 */
public class RepeatVoteState implements VoteAbstractState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }

}
