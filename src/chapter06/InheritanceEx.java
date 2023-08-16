package chapter06;

public class InheritanceEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.radius = 2.0;

    Ball ball = new Ball();
    ball.radius = 2.0;
    //ball.setRadius("white");
    //ball.changeRadius(10.0);
    //정적 변수와 파이널 변수는 상속은 가능하지만 오버라이딩은 불가능
    System.out.printf("원의 넓이 %.2f, 공의 넓이 %.2f\n",
        circle.findArea(), ball.findArea());
    System.out.printf("공의 부피 %.2f", ball.findVolume());
  }
}

