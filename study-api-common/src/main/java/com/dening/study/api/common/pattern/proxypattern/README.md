# 门面设计模式

## 使用场景
一般的Controller内部依赖的Service类聚合了多个不同领域的Service服务，提供了单一接口

## 原理
- 抽象对象角色：声明了目标对象和代理对象的共同接口，这样一来在任何可以使用目标对象的地方都可以使用代理对象。

- 目标对象角色：定义了代理对象所代表的目标对象。

- 代理对象角色：代理对象内部含有目标对象的引用，从而可以在任何时候操作目标对象；代理对象提供一个与目标对象相同的接口，以便可以在任何时候替代目标对象。代理对象通常在客户端调用传递给目标对象之前或之后，执行某个操作，而不是单纯地将调用传递给目标对象。

## 思考
1.缺点：
2.

## `Github代码仓库：`
git@github.com:BillDavidup/study-api.git
`分支`：feature/DN-20220824.addProxyPattern
## `参考：`
- [深入设计模式](https://refactoringguru.cn/design-patterns/chain-of-responsibility)
- [从没有人将代理模式分析得如此透彻](https://zhuanlan.zhihu.com/p/426130872)
- [《JAVA与模式》之代理模式 ](https://www.cnblogs.com/java-my-life/archive/2012/04/23/2466712.html)