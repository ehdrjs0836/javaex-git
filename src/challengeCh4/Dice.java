package challengeCh4;

public class Dice {
//  public int roll(){
//    return (int)(Math.random()*6)+1; //형변환전에 먼저 연산해야함
//  }
  public int roll(){
    return (int)Math.ceil((Math.random()*6));
  }
}
