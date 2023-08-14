package chapter05;

public class String4Ex {
  public static void main(String[] args) {
    String java = String.format("%s %.1f","Java", 3.14);
    System.out.println(java);
    String join = String.join(",", "apple", "banana");
    System.out.println(join);
    String s = String.valueOf(3);
    System.out.println(s);
  }
}
