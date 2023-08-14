package challengeCh5;

public class Count {
  public static void main(String[] args) {
    System.out.println(countChar("heLlo",'l'));
  }

  static  int countChar(String s, char c) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (Character.toUpperCase(c) == s.toUpperCase().charAt(i)) {
        count++;
      }
    }
    return count;
  }
}
