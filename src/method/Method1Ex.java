package method;

public class Method1Ex {
  public static void main(String[] args) {
//    int sum = 0;
//    for (int i = 1; i <= 10; i++) {
//      sum += i;
//    }
//    System.out.println("sum(1~10) = " + sum);
//    sum = 0;
//    for (int i = 10; i <= 100; i++) {
//      sum += i;
//    }
//    System.out.println("sum(10~100) = " + sum);
//    sum = 0;
//    for(int i=100; i<=1000; i++) {
//      sum += i;
//    }
//    System.out.println("sum(100~1000) = " + sum);
    System.out.printf("sum(1~10) = %d\n", sum(1, 10L));
    System.out.printf("sum(10~100) = %d\n", sum(10, 100L));
    System.out.printf("sum(100~1000) = %d\n", sum(100, 1000L));
  }

   static long sum(long num1, long num2) {
    long sum = 0;
    for (long i = num1; i <= num2; i++) {
      sum += i;
    }
    return sum;
  }
}
