package sample;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = 1_000_000;
    int b = 2_000_000;
    long c = (long) a * b;
    System.out.println(c);

    double result = 5/0.0;
    double r = 5 % 0.0;
    boolean b1 = Double.isInfinite(result);
    boolean b2 = Double.isNaN(r);
    System.out.println("result = " + result);
    System.out.println("r = " + r);
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);

  }
}
