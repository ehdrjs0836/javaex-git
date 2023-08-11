package challengeCh4;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0,"Yellow");
    Circle c2 = new Circle(1.0,"rEd");
    Circle c3 = new Circle(3.0,"ReD");

    System.out.println(Circle.getNumberOfCircles());
    System.out.println(Circle.getNumberOfRedCircles());
  }
}
