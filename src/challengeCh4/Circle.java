package challengeCh4;

public class Circle {
  //static /class/ 정적변수
  private static long numberOfCircles;
  private static long numberOfRedCircles;
  //instance 변수
  private double radius;
  private String color;
  //생성자
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    numberOfCircles++;
    if(color.equalsIgnoreCase("red")) {
      numberOfRedCircles++; //빨간공이 만들어질때만 증가하도록 수정
    }
  }

  public static long getNumberOfCircles() {
    return numberOfCircles;
  }

  public static long getNumberOfRedCircles() {
    return numberOfRedCircles;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
