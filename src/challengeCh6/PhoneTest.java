package challengeCh6;

public class PhoneTest {
  public static void main(String[] args) {
    Phone[] phones = { new Phone("황진이"), new Telephone("길동이","내일"), new Smartphone("민국이","갤러그")};
    for (Phone phone:phones) {
      if (phone instanceof Smartphone){ //private (범위가 큰 쪽부터 조건을 걸면 범위가 큰 쪽의 조건에 포함되기때문에 범위가 작은거부터 조건에 걸리게 해야함)
        Smartphone smartphone = (Smartphone) phone;
        smartphone.playGame();
        //((Smartphone)phone).playGame();
      } else if (phone instanceof Telephone) { //protected
        Telephone telephone = (Telephone) phone;
        telephone.autoAnswering();
        //((Telephone)phone).autoAnswering();
      } else { //public
        phone.talk();
      }
    }
  }
}
