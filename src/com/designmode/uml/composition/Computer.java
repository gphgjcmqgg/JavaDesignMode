package com.designmode.uml.composition;

// 组合关系  （密不可分，同生共死）
public class Computer {
    private Monitor monitor = new Monitor();
    private Mouse mouse = new Mouse();

}