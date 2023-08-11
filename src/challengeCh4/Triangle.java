package challengeCh4;

public class Triangle {

  private double base;
  private double height;

  private boolean bool;

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  public double findArea() {
    return base * height / 2;
  }

  public double getBase() {
    return base;
  }
  public void setBase(double base) {
    if(base <= 0){
      System.out.println("밑변이 0보다 커야 합니다.");
      return;
    }
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if(height <= 0){
      System.out.println("높이가 0보다 커야 합니다.");
      return;
    }
    this.height = height;
  }

  public boolean isSameArea(Triangle triangle) {
    return this.findArea() == triangle.findArea();
    //    if(this.findArea() == t2.findArea()) return true;
//    if(this.findArea() != t2.findArea()) return false;
//    return false;
  }
}
