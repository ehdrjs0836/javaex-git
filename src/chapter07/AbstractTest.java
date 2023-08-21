package chapter07;

public class AbstractTest {
  public static void main(String[] args) {
    Contrete c = new Contrete(100,50);
    c.show();
  }
}

abstract class Abstract {
  int i;
  public Abstract(int i) {
    this.i = i;
  }
  abstract void show();
}

class Contrete extends Abstract {
  int j;
  public Contrete(int i, int j) {
    super(i);
    this.j = j;
  }
  @Override
  void show() {
    System.out.printf("i = %d, j = %d", i,j);
  }
}