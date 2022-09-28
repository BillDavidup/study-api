package com.dening.study.api.common.pattern.statepattern.one;

public class VoteStateClient {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("wudening", "A");
        }
    }

}
