package challengeCh06;

public class OverShadowTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name); //필드는 오버라이딩 되지 않는다.
    p.print(); //메소드는 오버라이딩 됨
  }
}

class Parent {
  String name = "영조";

  void print(){
    System.out.println("영조 입니다.");
  }
}

class Child extends Parent {
  String name = "사도세자";

  void print(){
    System.out.println("사도세자 입니다.");
  }
}