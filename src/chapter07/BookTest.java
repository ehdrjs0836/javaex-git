package chapter07;

import java.util.Arrays;

public class BookTest {
  public static void main(String[] args) {
    Book[] books = {
        new Book(15000),
        new Book(50000),
        new Book(20000),
    };
    System.out.println("정렬전");
    for (Book book: books) {
      System.out.println(book);
    }
    Arrays.sort(books); //기준을 정의해줘야 비교할수있음
    System.out.println("정렬후");
    for (Book book: books) {
      System.out.println(book);
    }

//    int[] numbers = {15000,50000,20000}; //숫자끼리라서 비교가 됨
//    System.out.println("정렬전");
//    for (int number:numbers) {
//      System.out.println(number);
//    }
//    Arrays.sort(numbers);
//    System.out.println("정렬후");
//    for (int number:numbers) {
//      System.out.println(number);
//    }
  }
}

class Book implements Comparable<Book>{
  int price;
  public Book(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Book book) {
    return this.price - book.price;
    }

  @Override
  public String toString() {
    return "Book [price=" + price + "]";
  }
}

