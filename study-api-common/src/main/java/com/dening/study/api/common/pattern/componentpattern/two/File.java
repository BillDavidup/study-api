package com.dening.study.api.common.pattern.componentpattern.two;

public class File extends Directory {

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }

}
