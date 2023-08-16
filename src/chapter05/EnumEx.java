package chapter05;

public class EnumEx {
  public static void main(String[] args) {
    People people = new People();
    people.age = 20;
    people.gender = Gender.MALE;
    people.direction = Direction.EAST;

    People anotherPeople = new People();
    anotherPeople.age = 30;
    anotherPeople.gender = Gender.FEMALE;
    anotherPeople.direction = Direction.WEST;

    if (people.gender == anotherPeople.gender) { //타입 의존적이 아니라 enum 의존적
      System.out.println("남성입니다.");
    }
    if (people.direction.compareTo(anotherPeople.direction) == 0) {
      System.out.println("같은 방향입니다.");
    } else {
      System.out.println("다른 방향입니다."+ people.direction.compareTo(anotherPeople.direction));
    }
    System.out.println(people.gender);
    System.out.println(people.direction);

    //System.out.println(people.gender.valueOf(people.gender.name()));
    System.out.println(people.gender.getGender());
    System.out.println(people.gender.name());
    System.out.println(people.gender.ordinal());
  }
}

class People {
  int age;
  Gender gender;
  Direction direction;
}

class People1 {
  //static final int MALE = 0;
  static final int FEMALE = 1;
  //static final int EAST = 0;
  static final int WEST = 1;
  //static final int SOUTH = 3;
  //static final int NORTH = 4;
}
