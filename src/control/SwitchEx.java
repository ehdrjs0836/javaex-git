package control;

public class SwitchEx {
  public static void main(String[] args) {
    int number = 2;

    switch (number) {
      case 3 :
        System.out.print("3");
        break;
      case 2 :
        System.out.print("2");
        break;
      case 1 :
        System.out.print("1"); //맨밑에는 브레이크를 안붙혀도 빠져나옴
    }
  }
}
