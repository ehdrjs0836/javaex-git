package challengeCh6;

public class Vehicle {
  String color;
  int speed;

  void show(){
    System.out.println(color);
    System.out.println(speed);
  }

  public Vehicle(String color, int speed){
    this.color = color;
    this.speed = speed;
  }

}

class Car extends Vehicle{
  int displacement;
  int gears;
  @Override
  void show() {
    System.out.println(color);
    System.out.println(speed);
    System.out.println(displacement);
    System.out.println(gears);
  }

  public Car(String color, int speed, int displacement, int gears){
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
}