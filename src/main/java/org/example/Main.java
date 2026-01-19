package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Calculator calculator = new Calculator();

        int result = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
