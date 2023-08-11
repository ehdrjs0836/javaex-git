package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.0);
    System.out.println("circle.getRadius() = " + circle.getRadius());
   System.out.printf("circle의 넓이 = %.2f", circle.findArea());
  }

}


