package chapter06;

public class CarClassCastEx {
  public static void main(String[] args) {
    Vehicle v = new Car(); //형변환 하더라도 자식클래스의 기능을 사용 할수 없지만
    System.out.println(v.name);
    v.whoAmI(); //오버라이드한 건 사용 가능하다.
    v.move();

    Vehicle v1 = new Vehicle();
    v1.whoAmI();

    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = v1;
    vehicles[1] = new Car(); //상속관계인 자식클래스기 때문에 업캐스팅으로 담을수 있음
    vehicles[2] = new SportsCar(); //Car를 상속받은 자손 클래스기 때문에 업캐스팅으로 담을수 있음

    for (Vehicle vehicle : vehicles) {
      vehicle.whoAmI();
    }
  }
}
