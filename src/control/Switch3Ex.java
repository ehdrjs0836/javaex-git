package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    String bio = scanner.nextLine();
    String kind = "";
    if (bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")) {
      kind = "조류";
    } else if (bio.equals("고등어") || bio.equals("참치")) {
      kind = "어류";
    } else {
      kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);
    System.out.println("동물의 이름을 입력하세요.");
    bio = scanner.nextLine();
    //kind = "";
//    switch (bio) {
//      case "호랑이" :
//      case "사자":
//        kind = "포유류";
//        break;
//      case "독수리" :
//      case "참새":
//        kind = "조류";
//        break;
//      case "고등어" :
//      case "참치":
//        kind = "어류";
//        break;
//      default:
//        kind = "해당없음";
//    }
    switch (bio) {
      case "호랑이","사자" -> System.out.println("포유류");
      case "독수리","참새" -> System.out.println("조류");
      default -> System.out.println("해당없음");
    }
  }
}
