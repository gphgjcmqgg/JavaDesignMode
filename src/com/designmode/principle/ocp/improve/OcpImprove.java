package com.designmode.principle.ocp.improve;
// 开闭原则
public class OcpImprove {
  public static void main (String[] args) {
      GraphicEditer edit = new GraphicEditer();
      edit.drawShape(new Rectangle());
      edit.drawShape(new Circle());
  }
}

class GraphicEditer {
  public void drawShape(Shape s) {
    s.draw();
  }
}

abstract class Shape {
  int m_type;
  public abstract void draw();
}

class Rectangle extends Shape {
  Rectangle() {
    super.m_type = 1;
  }
  public void draw() {
    System.out.println("画矩形");
  }
}

class Circle extends Shape {
  Circle() {
    super.m_type = 2;
  }
  public void draw() {
    System.out.println("画圆形");
  }
}