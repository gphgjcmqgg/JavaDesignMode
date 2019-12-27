package com.designmode.uml.aggregation;

// 聚合关系  （可有可无）
public class Computer {
    private Monitor monitor;

    public Monitor getMonitor() {
      return monitor;
    }

    public void setMonitor(Monitor monitor) {
      this.monitor = monitor;
    }
}