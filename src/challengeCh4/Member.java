package challengeCh4;

public class Member {
     //필드 : 이름, 아이디, 암호, 나이
    private String name;
    private String id;
    private String pw;
    private int age;

    //생성자(모든 회원정보 사용)

  public Member(String name, String id, String pw, int age) {
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  //접근자

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getPw() {
    return pw;
  }

  public int getAge() {
    return age;
  }

  //설정자(이름,나이(0~120))
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if(age < 0 || age > 120) {
      System.out.println("나이가 너무 어리거나 너무 많습니다.");
    }else {
      this.age = age;
    }
  }
}

