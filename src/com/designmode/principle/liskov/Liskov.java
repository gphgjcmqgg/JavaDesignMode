package com.designmode.principle.liskov;

public class Liskov {
  public static void main(String[] args) {
    
  }
}

class A {
  public int fun1(int num1,int num2) {
    return num1 - num2;
  }
}

class B extends A {
  public int fun1(int num1,int num2) {
    return num1 + num2;
  }

  public int fun2(int num1,int num2) {
    return fun1(num1, num2) + 9;
  }
}


