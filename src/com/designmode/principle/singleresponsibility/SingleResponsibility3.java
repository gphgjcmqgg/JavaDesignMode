package com.designmode.principle.singleresponsibility;

public class SingleResponsibility3 {
  public static void main (String[] args) {
    Vehicle2 vehicle = new Vehicle2();
    vehicle.run("摩托车");
    vehicle.run("汽车");
    vehicle.runAir("飞机");
  }
}

class Vehicle2 {
  public void run(String vehicle) {
    System.out.println(vehicle + "在公路上运行...");
  }
  public void runAir(String vehicle) {
    System.out.println(vehicle + "在天上飞...");
  }
}
