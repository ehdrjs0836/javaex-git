package chapter07;

public class AbstractClassEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.draw();
    Square square = new Square();
    square.draw();
  }
}

abstract class Shape {
  double pi = 3.14;
  
  abstract void draw();
  
  public double findArea(){
    return 0.0;
  }
}

class Circle extends Shape{
  @Override
  void draw() {
    System.out.println("원을 그리다");
  }
}

class Square extends Shape{

  @Override
  void draw() {
    System.out.println("사각형을 그리다");
  }
}