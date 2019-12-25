package com.designmode.principle.inversion;

// 依赖倒转
public class DependecyInversionImprove {
  public static void main (String[] args) {
    Person2 p = new Person2();
   IReceiver email = new Email2();
   IReceiver weixin = new WeiXin();
   p.receive(email);
   p.receive(weixin);
  }
}

interface IReceiver {
  String getInfo();
}

class Email2 implements IReceiver{
  @Override
  public String getInfo() {
    return "电子邮件信息";
  }
}

class WeiXin implements IReceiver{
  @Override
  public String getInfo() {
    return "WeiXin信息";
  }
}

// 完成Person接收消息的功能
// 方式1 分析
// 1.简单，比较容易想到
// 2.如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接收方法
// 3.解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
//   因为Email，Weixin等等属于接收的范围，他们各自实现IReceiver接口就ok，这样我们就符合依赖倒转原则
class Person2 {
  // 这里我们对接口依赖
  public void receive(IReceiver receiver) {
    System.out.println(receiver.getInfo());
  }
}

// 依赖倒转方式
// 方式1：通过接口传递实现依赖
// interface IOpenAndClose {
//   void open(ITV tv);
// }

// interface ITV {
//   void play();
// }

// class OpenAndClose implements IOpenAndClose {
//   @Override
//   public void open(ITV tv) {
//     tv.play();
//   }
// }

// 方式2：通过构造方法依赖传递
// interface IOpenAndClose {
//   void open();
// }

// interface ITV {
//   void play();
// }

// class OpenAndClose implements IOpenAndClose {
//   private ITV tv;
//   public OpenAndClose(ITV tv){
//       this.tv = tv;
//   }

//   @Override
//   public void open() {
//     this.tv.play();
//   }
// }

// 方式3：通过setter方法依赖传递
// interface IOpenAndClose {
//   void open();
// }

// interface ITV {
//   void play();
// }

// class OpenAndClose implements IOpenAndClose {
//   private ITV tv;
  
//   public void setTv(ITV tv) {
//       this.tv = tv;
//   }

//   @Override
//   public void open() {
//     this.tv.play();
//   }
// }