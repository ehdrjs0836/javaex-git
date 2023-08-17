package chapter06;

public class TypeDownCasting {
  public static void main(String[] args) {
//    Student s = (Student) new Person();
//    s.whoAmI();
//    s.work();
    Student s = new Student();
    Person p = new Person();
    Worker w = new Worker();

    System.out.println("s instanceof  Student ==> " + (s instanceof  Student));
    System.out.println("s instanceof  Person ==> " + (s instanceof  Person));
    System.out.println("p instanceof  Student ==> " + (p instanceof  Student));
    System.out.println("p instanceof  Object ==> " + (p instanceof  Object));
    //System.out.println("s instanceof  String" + (s instanceof  String));

    downCast(p);
    downCast(s);
    downCast(w);
  }

  static void downCast(Person p) { //부모클래스로 상속받은 자식클래스나 부모클래스 타입인 경우에만 가능
    if(p instanceof Student) { //downCast(s);
      Student s = (Student) p;
      s.work();
    } else if (p instanceof  Worker) {
      Worker w = (Worker)p;
      w.work();
    } else {
      p.whoAmI();
    }
  }
//  static void downCast(Student s) {
//
//  }
//  static void downCast(Worker w) {
//
//  }
}
