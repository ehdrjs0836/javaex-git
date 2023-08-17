package chapter06;

public class FinalMethodEx {
  public static void main(String[] args) {
    
  }
}

class Chess {
  enum ChessPlayer {
    WHITE,BLACK
  }
  final ChessPlayer getFirstPlayer() {
    return ChessPlayer.WHITE;
  }
}

class WorldChess extends Chess {
//  @Override
//  ChessPlayer getFirstPlayer() {
//    return ChessPlayer.BLACK;
//  }
  //상속은 받을수있지만 오버라이딩 못하게 final 메서드 사용
}
