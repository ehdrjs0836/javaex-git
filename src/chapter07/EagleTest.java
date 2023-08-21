package chapter07;

/**
 *  익명 클래스
 */
public class EagleTest {
  public static void main(String[] args) {
    ABird b = new ABird() {
      void fly(){
        System.out.println("독수리가 날아간다.");
      }
    };
    b.fly();
  }
}

//class Eagle extends ABird {
//
//  @Override
//  void fly() {
//    System.out.println("독수리가 날아간다");
//  }
//}