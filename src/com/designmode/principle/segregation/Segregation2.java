package com.designmode.principle.segregation;

// 接口隔离原则
public class Segregation2 {
  public static void main (String[] args) {
    AA a = new AA();
    BB b = new BB();
    a.dependence1(b);
    a.dependence4(b);
    a.dependence5(b);
  }
}

interface IInterfaceA {
  void operation1();
}

interface IInterfaceB {
  void operation4();
  void operation5();
}

interface IInterfaceC {
  void operation2();
  void operation3();
}

class AA {
  public void dependence1(IInterfaceA operation) {
    operation.operation1();
  }
  public void dependence4(IInterfaceB operation) {
    operation.operation4();
  }
  public void dependence5(IInterfaceB operation) {
    operation.operation5();
  }
}
class BB implements IInterfaceA, IInterfaceB {
  @Override
  public void operation1() {
    System.out.println("operation1");
  }

  @Override
  public void operation4() {
    System.out.println("operation4");
  }

  @Override
  public void operation5() {
    System.out.println("operation5");
  }
}