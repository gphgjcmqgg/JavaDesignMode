package com.designmode.singletontype.type6;

// 借助jdk1.5中添加的枚举来实现单例模式。不仅能避免多线程问题，而且还能防止反序列化重新创建新的对象
// 推荐使用
public class SingletonType6 {
    public static void main(String[] args) {
      Singleton s1 = Singleton.INSTANCE;
      Singleton s2 = Singleton.INSTANCE;
      System.out.println(s1 == s2);
    }
}

// 使用枚举，可以实现单例
enum Singleton {
    INSTANCE;
    public void sayOk() {
      System.out.println("ok~");
    }
  }
