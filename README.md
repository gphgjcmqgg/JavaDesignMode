# JavaDesignMode

UML类图           重点

描述类与类之间关系的图

## 设计模式的7大原则

1. 单一职责原则
2. 接口隔离原则（Interface Segregation Principle）
3. 依赖倒转原则（Dependence Inversion Principle）
4. 里氏代换原则（Liskov Substitution Principle）
5. 开闭原则（Open Close Principle）
6. 迪米特法则，又称最少知道原则（Demeter Principle）
7. 合成复用原则（Composite Reuse Principle）

## 单例设计模式

单例设计模式一共有8种写法

1. 饿汉式 2种
2. 懒汉式 3种
3. 双重检查
4. 静态内部类
5. 枚举

## UML类图

1. 用于描述系统中的类（对象）本身的组成和类（对象）之间的各种静态关系
2. 类之间的关系：依赖、泛化（继承）、实现、关联、聚合与组合

* 类图-依赖关系（dependence）

只要是在类中用到了对方，那么他们之间就存在依赖关系。
构成依赖

1. 类中用到了对方
2. 如果是类的成员属性
3. 如果是方法的返回类型
4. 是方法接收的参数类型
5. 方法中使用到

* 类图-泛化关系（generalization）

泛化关系实际上就是继承关系，他是依赖关系的特例。
如果A类继承了B类，我们就说A和B存在泛化关系。

* 类图-实现关系（Implementation）

* 类图-关联关系（Association）
























