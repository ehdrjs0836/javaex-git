package chapter07;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = {
        new Television(false),
        new Radio(true)
    };

    for (Controller controller:controllers) {
      controller.show();
    }
  }
}

abstract class Controller {
  boolean power;
  public Controller(Boolean power) {
    this.power = power;
  }
  void show() {
    if(power) {
      System.out.println(this.getName()+"가 켜졌습니다.");
    } else {
      System.out.println(this.getName()+"가 꺼졌습니다.");
    }
  }
  abstract String getName();
}

class Television extends Controller {
  public Television(Boolean power) {
    super(power);
  }
  @Override
  String getName() {
    return "Television";
  }
}

class Radio extends Controller {
  public Radio(Boolean power) {
    super(power);
  }
  @Override
  String getName() {
    return "Radio";
  }
}