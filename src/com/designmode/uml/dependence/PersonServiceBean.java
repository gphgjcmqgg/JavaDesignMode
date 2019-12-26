package com.designmode.uml.dependence;

public class PersonServiceBean {
  private PersonDao personDao; // 类

  public void save(Person person) {

  }

  public IDCard getIDCard(Integer personid) {
    return null;
  }

  public void modify() {
    Department department = new Department();
  }


}

// 构成依赖
// 1. 类中用到了对方
// 2. 如果是类的成员属性
// 3. 如果是方法的返回类型
// 4. 是方法接收的参数类型
// 5. 方法中使用到