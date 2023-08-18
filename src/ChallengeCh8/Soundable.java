package ChallengeCh8;

public interface Soundable {
  public String sound();
}

class SoundableExample {
  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }

  public static void main(String[] args) {
//    printSound(new Cat());
//    printSound(new Dog());
  }
}

//class Cat implements Soundable {
//}
