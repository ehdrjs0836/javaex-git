package challengeCh06;

public class OverrideTest {
  public static void main(String[] args) {
    Car c = new Car("파랑",200,1000,5);
    c.show();
    Vehicle v = c;
    v.show();
  }
}
