package challengeCh06;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    circle.show();
    ColoredCircle coloredCircle = new ColoredCircle(10,"white");
    coloredCircle.show();
  }
}

class Circle {
  int radius;
  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }
  public Circle(int radius) {
    this.radius = radius;
  }
}

class ColoredCircle extends Circle {
  String color;
  @Override
  void show() {
    System.out.println("반지름이 "+ radius + "인" + color + "원이다.");
  }
  public ColoredCircle(int radius) {
    super(radius);
  }
  public ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }
}
