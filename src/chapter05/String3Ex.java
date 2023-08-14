package chapter05;

public class String3Ex {
  public static void main(String[] args) {
    String s1 = "Hi, Java";
    String s2 = "!!!";
    System.out.println(s1.charAt(4));
    System.out.println(s1.concat(s2));
    String s3 = " ";
    String s4 = "";
    //문자열 길이가 0일때만 isEmpty
    //문자열이 공백이거나 길이가 0일때 isBlank
    System.out.println("s3.isEmpty() =>" + s3.isEmpty());
    System.out.println("s4.isEmpty() =>" + s4.isEmpty());
    System.out.println("s3.isBlank() =>" + s3.isBlank());
    System.out.println("s4.isBlank() =>" + s4.isBlank());
    System.out.println(s1.toLowerCase()); //소문자로 변환
    System.out.println(s1.toUpperCase()); //대문자로 변환
    System.out.println(s1); //내부적으로는 변하지 않아서 s1을 출력해도 원본상태로 출력됨

    System.out.println(s1.substring(4));
    System.out.println(s1.substring(4,6));
    System.out.println(s1.length());
  }

}
