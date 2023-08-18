package challengeCh6;

public class BankAccount {
  private final int MIN_VALUE = 0;
  private int balance;
  private String accountNo;
  private String accountOwner;

  public BankAccount(String accountNo, String accountOwner, int balance) {
    this.accountNo = accountNo;
    this.accountOwner = accountOwner;
    this.balance = balance;
  }
  public void setBalance(int balance) {
    if(balance >= MIN_VALUE) {
      this.balance = balance;
    }
  }
  public int getBalance() {
    return balance;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }
  public String getAccountOwner() {
    return accountOwner;
  }

  public void withdraw(int money) {
    if(money >= 0) {
      int remains = balance - money;
      if(remains >= MIN_VALUE) {
        this.balance = remains;
      } 
    }
  }

  public void deposit(int money) {
    if(money >= 0) {
      int remains = balance + money;
      if(remains >= MIN_VALUE) {
        this.balance = remains;
      }
    }
  }
}
