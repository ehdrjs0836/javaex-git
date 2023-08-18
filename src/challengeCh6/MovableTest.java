package challengeCh6;

public class MovableTest {
  public static void main(String[] args) {
    Point p = new Point(10,20);
    p.toStr();
    MovablePoint mp = new MovablePoint(10,20,100,200);
    mp.toStr();
  }
}

class Point {
  private int x,y;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  void toStr() {
    System.out.println("좌표" + x + y);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class MovablePoint extends Point{
  private int xSpeed, ySpeed;

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  void toStr() {
    System.out.println("좌표"+ getX() + getY() +"좌표속도" + xSpeed + ySpeed);
  }

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
}