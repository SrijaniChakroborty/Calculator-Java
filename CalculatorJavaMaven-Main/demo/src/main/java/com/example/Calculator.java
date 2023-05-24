package main.java.com.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */


import java.util.*;

public class Calculator {

  public double sum(double a, double b) {
    return a + b;
  }

  public double minus(double a, double b) {
    return a - b;
  }

  public String divide(double a, double b) {
    if (b == 0) return "by zero not possible";
    return String.valueOf(a / b);
  }

  public double multiply(double a, double b) {
    return a * b;
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
    int x;
    double score;
    double a;
    double b;
    System.out.println("Choose an operation:");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");

    x = scan.nextInt();
    System.out.println("Enter first value");
    a = scan.nextDouble();
    System.out.println("Enter second value");
    b = scan.nextDouble();
    switch (x) {
      case 1:
        score = calc.sum(a, b);
        System.out.println("Addition " + score);
        break;
      case 2:
        score = calc.minus(a, b);
        System.out.println("Substraction " + score);
        break;
      case 3:
        score = calc.multiply(a, b);
        System.out.println("Multiplication " + score);
        break;
      case 4:
        String msg;
        msg = calc.divide(a, b);
        System.out.println("Division " + msg);
        break;
      default:
        System.out.println("Wrong choice");
        break;
    }
    scan.close();
  }
}
