package chapter07;

public class TalkableTest {
  static void talk(Tallkable tallkable) {
    tallkable.talk();
  };

  public static void main(String[] args) {
    talk(new Korean());
    talk(new American());
  }
}

interface Tallkable {
  void talk();
}

class Korean implements Tallkable{
  @Override
  public void talk() {
    System.out.println("안녕하세요!");
  }
}

class American implements Tallkable{

  @Override
  public void talk() {
    System.out.println("Hello");
  }
}