package classExample;

public class LocalVarEx {
  public static void main(String[] args) {
    int a = 2; //지역변수지만 method안에선 전역변수
    double b = 0.0;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    for (int i=0; i < 2; i++){
     int c = 1; //for 블럭안에서만 사용가능한 지역변수
      System.out.println("c = " + c); 
      System.out.println("a = " + a);
    }
    System.out.println("a = " + a);
  }
}
