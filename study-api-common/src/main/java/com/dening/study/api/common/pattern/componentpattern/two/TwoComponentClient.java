package com.dening.study.api.common.pattern.componentpattern.two;

/**
 * 安全组合模式的好处是接口定义职责清晰，符合设计模式的单一职责原则和接口隔离原则；
 * 缺点是客户需要区分树枝节点和叶子节点，这样才能正确处理各个层次的操作，客户端无法依赖抽象接口（Component），违背了设计模式的依赖倒置原则。
 */
public class TwoComponentClient {

    public static void main(String[] args) {
        System.out.println("============安全组合模式===========");

        File qq = new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("Word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder wps = new Folder("金山软件", 3);
        wps.add(new File("WPS.exe"));
        office.add(wps);

        Folder root = new Folder("根目录", 1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        System.out.println("----------show()方法效果-----------");
        root.show();

        System.out.println("----------list()方法效果-----------");
        root.list();
    }

}
