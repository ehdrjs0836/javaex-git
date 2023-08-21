package chapter07;

import java.util.Arrays;
import java.util.Comparator;

public class PersonComparetest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동",32, 170, 75),
        new Person("박지성",40, 175, 68),
        new Person("손흥민",20, 180, 70)
    };

    // 나이를 기준으로 나이가 가장 많은 사람부터 이름을 출력하시오.
    // 두 가지 방법을 이용해서 나이가 많은 사람부터 출력하는 방법을 찾아보기
    // 힌트: 1. compareTo의 리턴값
    //      2. Arrays.sort 후 순서를 뒤집는 메서드 활용
    System.out.println("정렬전");
    for (Person person:persons) {
      System.out.println(person);
    }
    System.out.println("정렬후");
    Arrays.sort(persons, Comparator.reverseOrder());
    for (Person person:persons) {
      System.out.println(person);
    }
  }
}

class Person implements Comparable<Person>{
  String name;
  int age;
  int height;
  int weight;
  public Person(String name,int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public int compareTo(Person person) {
//    return person.age - this.age;
    return this.age - person.age;
  }

  @Override
  public String toString() {
    return "연장자순:["+ name +"]";
  }
}


