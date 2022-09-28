package com.dening.study.api.common.pattern.statepattern.one;

/**
 * 具体状态
 */
public class NormalVoteState implements VoteAbstractState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }

}

