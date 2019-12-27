package com.designmode.singletontype.type3;

// 懒汉式 线程不安全
// 优点：起到懒加载的作用，但是只能在单线程下使用
// 缺点：存在线程安全问题
public class SingletonType3 {
    public static void main(String[] args) {
      Singleton s1 = Singleton.getInstance();
      Singleton s2 = Singleton.getInstance();
      System.out.println(s1 == s2);
    }
}

// 线程不安全
class Singleton {
    private static Singleton instance;
  
    private Singleton() {

    }
    
    public static Singleton getInstance(){
      if (instance == null) {
        instance = new Singleton();
      }
      return instance;
    }
}

// 线程安全,但效率低下
class Singleton1 {
  private static Singleton1 instance;

  private Singleton1() {

  }
  
  public static synchronized Singleton1 getInstance(){
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }
}