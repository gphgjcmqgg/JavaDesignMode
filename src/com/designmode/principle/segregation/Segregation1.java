package com.designmode.principle.segregation;

public class Segregation1 {
  public static void main (String[] args) {
    A a = new A();
    B b = new B();
    a.dependence1(b);
    a.dependence4(b);
    a.dependence5(b);
  }
}

interface IInterface {
  void operation1();
  void operation2();
  void operation3();
  void operation4();
  void operation5();
}
class A {
  public void dependence1(IInterface operation) {
    operation.operation1();
  }
  public void dependence4(IInterface operation) {
    operation.operation4();
  }
  public void dependence5(IInterface operation) {
    operation.operation5();
  }
}
class B implements IInterface {
  @Override
  public void operation1() {
    System.out.println("operation1");
  }

  @Override
  public void operation2() {
    System.out.println("operation2");
  }

  @Override
  public void operation3() {
    System.out.println("operation3");
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