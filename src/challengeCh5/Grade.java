package challengeCh5;

public enum Grade {

  A("Excellent"),B("Good"),C("SoSo");
  //필드
  private String grade;
  //생성자
  private Grade(){}

  private Grade(String grade) {
    this.grade = grade;
  }
  public String getGrade(){
    return grade;
  }
}
