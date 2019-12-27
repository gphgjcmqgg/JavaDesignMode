package com.designmode.singletontype.type2;

// 1.优点：在类装载的时候就完成实例化，避免了线程同步问题
// 2.缺点：没有达到lazy loader效果，如果从始至终从未使用过这个实例，则会造成内存的浪费
public class SingletonType2 {
    public static void main(String[] args) {
      Singleton s1 = Singleton.getInstance();
      Singleton s2 = Singleton.getInstance();
      System.out.println(s1 == s2);
    }
}

// 静态代码块
class Singleton {
    private static Singleton instance;
    
    static {
      instance = new Singleton();
    }
    private Singleton() {

    }
    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
      return instance;
    }
}