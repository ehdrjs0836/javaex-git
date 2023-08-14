package chapter05;

import classExample.Car;

public class String2CompareEx {
  public static void main(String[] args) {
    String s1 = "HI, JAVA";
    String s2 = "hi, java";

    Car c1 = new Car();
    Car c2 = new Car();

    System.out.println(c1==c2);
    System.out.println(c1.equals(c2)); //객체에 hashcode와 equals를 override 안해서 비교를 잘못함
    
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
  }
}
