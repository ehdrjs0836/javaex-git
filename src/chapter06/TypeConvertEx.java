package chapter06;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int number = s.number;
//    s.work();
//    s.whoAmI();
//
//    name = p.name;
//    p.whoAmI();
    Person p;
    Student s = new Student();
    Worker w = new Worker();
    p = s; //주소가 할당됨
    String name = p.name;
    p.whoAmI();
    //자식을 가리키지만 자식의 가능을 쓸수없다.
    //앞으로 생성 될 상속을 메서드 하나로 통일할수 있다.

    p = w;
    p.whoAmI();
    //s = w; 상속관계가 없어서 형제간 상속은 안된다.

    Object o = new Person(); //오브젝트는 조상이므로 자동 형변환이 되지만 자손의 기능은 쓸수없다.
    o = s;
    o = p;
    Person p1 = new Student();
    Person p2 = new Student(); //다형성때문에 가능
  }
}
