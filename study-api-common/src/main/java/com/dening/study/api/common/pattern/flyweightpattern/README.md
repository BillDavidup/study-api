# 享元设计模式

## 使用场景
- String中字符串常量池、Integer类中的数值缓存、连接池
- 
## 原理
### 单纯享元模式
- 抽象享元角色(Flyweight):给一个抽象接口，规定所有具体享元角色都必须实现的方法。
- 具体享元角色(ConcreteFlyweight):实现抽象享元角色所规定的接口，如果有内蕴状态，必须为内蕴状态提供存储空间。
- 享元工厂角色(FlyweightFactory):

### 复合享元模式

## 思考
1.缺点：
2.

## `Github代码仓库：`
git@github.com:BillDavidup/study-api.git
`分支`：feature/DN-20220826.addFlyweightPattern
## `参考：`
- [深入设计模式](https://refactoringguru.cn/design-patterns/chain-of-responsibility)
- [就因为把int改成Integer，第2天被辞了](https://zhuanlan.zhihu.com/p/428307037)
- [《JAVA与模式》之享元模式](https://www.cnblogs.com/java-my-life/archive/2012/04/26/2468499.html)