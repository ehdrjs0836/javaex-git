package ChallengeCh7;

public class InheritenceTest {
}

class Parent {
  public String name;

  public Parent(String name) {
    this.name = name;
  }
}

class Child extends Parent {
  public int studentNo;

  public Child(String name, int studentNo) {
    //this.name = name;
    super(name);
    this.studentNo = studentNo;
  }
}