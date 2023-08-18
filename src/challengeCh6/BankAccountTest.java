package challengeCh6;

public class BankAccountTest {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(300000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.withdraw(300000); //출금
    System.out.println("현재 잔고: " + account.getBalance());

    account.deposit(1000000); //입금
    System.out.println("현재 잔고: " + account.getBalance());

    account.deposit(100); //한도초과로 윗값 나오게 출력
    System.out.println("현재 잔고: " + account.getBalance());
  }
}

