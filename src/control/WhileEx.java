package control;

import java.util.Scanner;

/**
 *  종료를 입력할 때 까지 동물의 이름을 입력받는다. 입력받은 동물의 종류를 출력하라
 *  while 문 이용
 */
public class WhileEx {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    int i = 0;
//    while (true) {
//      System.out.println("동물을 입력하시오.");
//      String bio = scanner.nextLine();
//      String kind = "";
//      if (bio.equals("호랑이") || bio.equals("사자")) {
//        kind = "포유류";
//        System.out.printf("%s는 %s입니다.\n", bio, kind);
//      } else if (bio.equals("독수리") || bio.equals("참새")) {
//        kind = "조류";
//        System.out.printf("%s는 %s입니다.\n", bio, kind);
//      } else if (bio.equals("종료")) {
//        break;
//      } else {
//        kind = "해당없음";
//        System.out.printf("%s는 %s입니다.\n", bio, kind);
//      }
//    }
    String bio = "", kind = "";
    while (true) {
      System.out.println("동물의 이름 입력하세요.(종료를 누르면 종료됩니다.)");
      bio = scanner.next();
      if (bio.equals("종료")) break;
      switch (bio) {
        case "호랑이", "사자" -> kind = "포유류";
        case "독수리", "참새" -> kind = "조류";
        default -> kind = "해당없음";
      }
      System.out.printf("%s는 %s입니다.\n", bio, kind);
    }
  }
}
