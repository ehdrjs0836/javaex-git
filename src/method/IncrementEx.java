package method;

public class IncrementEx {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("메소드 호출 전 x = " + x);
    increment(x);
    System.out.println("메소드 호출 후 x = " + x);
  }

  static void increment(int num) {
    System.out.println("메소드 시작 num = " + num);
    num++;
    System.out.println("메소드 종료 num = " + num);
  }
}
