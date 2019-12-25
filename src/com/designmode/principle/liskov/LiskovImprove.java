package com.designmode.principle.liskov;

public class LiskovImprove {
  public static void main(String[] args) {
    
  }
}

class Base {
  
}

class AA extends Base {
  public int fun1(int num1,int num2) {
    return num1 - num2;
  }
}

class BB extends Base {
  // 如果B需要使用A类的方法，使用组合关系
  private AA a = new AA(); // 组合

  public int fun1(int num1,int num2) {
    return num1 + num2;
  }

  public int fun2(int num1,int num2) {
    return fun1(num1, num2) + 9;
  }

  public int fun3(int num1,int num2) {
    return this.a.fun1(num1, num2);
  }
}