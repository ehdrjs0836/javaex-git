package classExample2;

public class Circle {
  double radius;
  String color;

  public Circle() {
    this(1.0,"white");
//    this.radius = 1.0;
//    this.color = "white";
  }
  public Circle(double radius){
    this(radius,"white");
//    this.radius =radius;
//    this.color = "white";
  }
  public Circle(String color){
    this.radius = 1.0;
    this.color = color;
  }
  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }

}
