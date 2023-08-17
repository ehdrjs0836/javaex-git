package chapter06;

public class Circle {
  double radius ;
  static String color = "white";
  static void setRadius(String aaa) { System.out.println("white 입니다."); } //정적 변수 오버라이딩 테스트
  final void changeRadius(double radius) { //final 변수
    this.radius = radius;
  } //final 변수 오버라이딩 테스트
  private void secret() {
    System.out.println("비밀입니다.");
  } //부모클래스 보다 범위 적은 거 오버라이딩 테스트

  protected void findRadius() {
    System.out.println("반지름이 10.0입니다.");
  } //부모클래스 보다 범위 적은 거 오버라이딩 테스트2
  public double findArea() {
    return Math.PI * radius * radius;
  }

}
