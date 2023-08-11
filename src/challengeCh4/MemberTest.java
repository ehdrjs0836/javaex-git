package challengeCh4;

public class MemberTest {
  public static void main(String[] args) {
    Member member = new Member("홍길동","hongkd","1234",20);
    member.setAge(130);
    System.out.printf("%s의 나이는 %d입니다.", member.getName(),member.getAge());
  }
}
