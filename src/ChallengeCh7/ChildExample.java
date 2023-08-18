package ChallengeCh7;

public class ChildExample {
  public static void main(String[] args) {
    Child2 child2 = new Child2();
    //자식 객체가 호출하기전에 부모 생성자가 먼저 호출되는게 숨겨져있음
  }
}

class Parent2 {
  public String nation;

  public Parent2(){
    this("대한민국");
    System.out.println("Parent() call");
  }

  public Parent2(String nation) {
    this.nation = nation;
    System.out.println("Parent(String nation) call");
  }
}

class Child2 extends Parent2 {
  public String name;

  public  Child2() {
    this("홍길동");
    System.out.println("Child() call");
  }

  public Child2(String name) {
    this.name = name;
    System.out.println("Child(String name) call");
  }
}
