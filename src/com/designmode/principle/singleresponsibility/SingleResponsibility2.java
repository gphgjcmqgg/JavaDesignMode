package com.designmode.principle.singleresponsibility;

public class SingleResponsibility2 {
  public static void main (String[] args) {
    RoadVehicle roadVehicle = new RoadVehicle();
    AirVehicle airVehicle = new AirVehicle();
    roadVehicle.run("摩托车");
    roadVehicle.run("汽车");
    airVehicle.run("飞机");
  }
}

class RoadVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在公路上运行...");
  }
}

class AirVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在天上飞...");
  }
}

class SeaVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在水上开...");
  }
}

