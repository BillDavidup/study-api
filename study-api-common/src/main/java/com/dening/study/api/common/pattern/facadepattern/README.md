# 门面设计模式

## 使用场景
一般的Controller内部依赖的Service类聚合了多个不同领域的Service服务，提供了单一接口

## 原理
- 门面模式，客户端直接跟门面类打交道，门面类聚合了很多子系统服务，统一给客户端
- 提供服务，客户端不需要知道内部细节
- 门面类不继承扩展服务，因为它仅仅作为门面，提供接待能力，而不具备具体业务的逻辑

## 思考
1.缺点：
2.

## `Github代码仓库：`
git@github.com:BillDavidup/study-api.git
`分支`：feature/DN-20220823.addFacadePattern
## `参考：`
- [深入设计模式](https://refactoringguru.cn/design-patterns/chain-of-responsibility)
- [意外发现，原来你不知道自己每天都在用门面模式](https://zhuanlan.zhihu.com/p/432830709)
- [JAVA设计模式之门面模式（外观模式） ](https://blog.csdn.net/jason0539/article/details/22775311)