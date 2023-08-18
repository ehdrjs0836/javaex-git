package challengeCh6;

import java.util.Scanner;

public class BankApplication {
  static BankAccount[] bankAccounts = new BankAccount[100];
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int opt = 0;

    while(true) {
      System.out.println("-----------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("-----------------------------------------------");
      System.out.print("선택>");
      opt = scanner.nextInt();
      if(opt == 5) {
        System.out.println("프로그램 종료");
        break;
      }
      switch (opt) {
        case 1 : createAccount(); break;
        case 2 : accountList(); break;
        case 3 : depositMoney(); break;
        case 4 : withdrawMoney(); break;
      }
    }
  }
  static void createAccount(){
    System.out.println("------");
    System.out.println("계좌생성");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo = scanner.next();
    System.out.print("예금주 : ");
    String accountOwner = scanner.next();
    System.out.print("초기입금액 : ");
    int balance=scanner.nextInt();
    for (int i = 0; i < bankAccounts.length; i++) {
      if(bankAccounts[i] == null) {
        BankAccount bankAccount = new BankAccount(accountNo, accountOwner, balance);
        bankAccounts[i] = bankAccount;
        System.out.println("결과: 계좌가 생성되었습니다.");
        break;
      } else if(bankAccounts[i].getAccountNo().equals(accountNo)) {
        System.out.println("오류 : 동일한 계좌번호가 존재합니다.");
        break;
      }
    }
  }
  static void accountList() {
    System.out.println("------");
    System.out.println("계좌목록");
    System.out.println("------");
    for (int i = 0; i < bankAccounts.length; i++) {
      if(bankAccounts[i] == null) break;
      System.out.printf("%s %s %d \n", bankAccounts[i].getAccountNo(), bankAccounts[i].getAccountOwner(), bankAccounts[i].getBalance());
    }
  }
  static void depositMoney() {
    System.out.println("------");
    System.out.println("예금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo = scanner.next();
    System.out.print("예금액 : ");
    int money=scanner.nextInt();
    BankAccount findAccount = findAccount(accountNo);
    findAccount.deposit(money);
//    for (BankAccount bankAccount:bankAccounts) {
//      if (bankAccount == null) {
//        break;
//      } else if(bankAccount.getAccountNo().equals(accountNo)) {
//        bankAccount.deposit(money);
//        break;
//      }
//    }
  }
  static void withdrawMoney(){
    System.out.println("------");
    System.out.println("출금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo = scanner.next();
    System.out.print("출금액 : ");
    int money=scanner.nextInt();
    BankAccount findAccount = findAccount(accountNo);
    //int findIndex = findIndex(accountNo);
    findAccount.withdraw(money);
    //bankAccounts[findIndex].withdraw(money);
//    for (BankAccount bankAccount:bankAccounts) {
//      if (bankAccount == null) {
//        break;
//      } else if(bankAccount.getAccountNo().equals(accountNo)) {
//        bankAccount.withdraw(money);
//        System.out.println("결과: 출금이 성공되었습니다.");
//        break;
//      }
//    }
  }

  static BankAccount findAccount(String accountNo) {
    BankAccount returnAccount = null;
    for (BankAccount bankAccount:bankAccounts) {
      if (bankAccount == null) break;
      if(bankAccount.getAccountNo().equals(accountNo)) {
        returnAccount = bankAccount;
      }
    }
    return returnAccount;
  }

//  static int findIndex(String accountNo) {
//    int index = -1;
//    for (int i = 0; i < bankAccounts.length; i++) {
//      if (bankAccounts[i] == null) break;
//      if(bankAccounts[i].getAccountNo().equals(accountNo)) {
//        index = i;
//      }
//    }
//    return index;
//  }
}
