package com.designmode.singletontype.type4;

// 懒汉式 双重检查
// 推荐使用
public class SingletonType4 {
    public static void main(String[] args) {
      Singleton s1 = Singleton.getInstance();
      Singleton s2 = Singleton.getInstance();
      System.out.println(s1 == s2);
    }
}

// 线程安全
class Singleton {
    private static volatile Singleton instance;
  
    private Singleton() {

    }
    
    public static Singleton getInstance(){
      if (instance == null) {
        synchronized(Singleton.class) {
          if (instance == null) {
            instance = new Singleton();
          } 
        }
      }
      return instance;
    }
}

