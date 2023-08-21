package chapter07;

public class AnonymousDemo{
  public static void main(String[] args) {
    // 익명클래스(Anonymous class) = 클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
    Parent p = new Parent() { //부모의 이름을 빌려다가
//      @Override
//      public void parent() {
//        System.out.println("익명클래스에서 구현한 메서드");
//      }
    };
    p.parent();
  }
}

//class OnlyOnce implements Parent {
//  @Override
//  public void parent() {
//    System.out.println("parent");
//  }
//}

//interface Parent {
//  void parent();
//}

class Parent{
  void parent() {
    System.out.println("부모");
  }
}