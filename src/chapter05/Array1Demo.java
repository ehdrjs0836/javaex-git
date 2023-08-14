package chapter05;

import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    // 표준 입력으로 5개의 과목 점수를 입력받아서 배열에 저장한다.
    // 배열에 들어가 있는 점수의 총합과 평균을 구하라
    Scanner scanner = new Scanner(System.in);
    int[] scores = new int[5];
    int sum = 0;
    float avg = 0.0f;
    for (int i = 0; i < scores.length; i++) {
      scores[i] = scanner.nextInt();
      sum += scores[i];
    }
    for (int score: scores) {
      //System.out.println(score);
      sum += score;
    }
    avg = sum / (float)scores.length;
    System.out.printf("sum = %d, avg = %.1f", sum, avg);
  }
}
