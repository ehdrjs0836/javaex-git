package chapter05;

public class Array1Ex {
  public static void main(String[] args) {
    int sum = 0, avg = 0;
    int sc1 = 90, sc2 = 80, sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum/3;

    sum = 0;
    avg = 0;

//    int[] scores = new int[5];
//    scores[0]=90;
//    scores[1]=80;
//    scores[2]=100;
//    scores[3]=100;
//    scores[4]=90;

    //sum = scores[0] + scores[1] + scores[2];
    int[] scores = {90,80,100}; //제일 많이 사용되는 초기화
    for (int i = 0; i < scores.length; i++) { //length를 사용하여 반복성을 줄이고 재사용성을 가능하게 만듦
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d , avg = %d \n", sum, avg);
    int[] scoresBig = new int[6];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i]; //배열을 카피
    }
    scores = scoresBig; //새로 만든 배열의 주소값을 가리키게 주소값 대입시키기
    scores[3] = 110;
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    //배열에 접근하기 쉽게 만들어진 foreach문
    for (int score: scores) { //배열의 값을 score에 담음
      System.out.println(score);
    }
  }
}
