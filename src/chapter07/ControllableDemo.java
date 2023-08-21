package chapter07;

public class ControllableDemo {
  public static void main(String[] args) {
//    TV tv1 = new TV();
//    tv1.turnOn();
//    tv1.turnOff();
//    tv1.repair();
//    //tv1.reset(); 클래스에 속한 메서드가 아니라 인터페이스에 속한 메서드
//    Controllable.reset();
//
//    TV tv2 = new TV();
//    tv2.remoteOn();
//    tv2.remoteOff();
//
//    Computer computer = new Computer();
//    computer.turnOn();
//    computer.turnOff();
//    computer.repair();
//    Controllable.reset();
//
//    Notebook notebook = new Notebook();
//    notebook.turnOn();
//    notebook.turnOff();
//    notebook.inMyBag();
    Controllable[] controllables = { //new Controllable();은 안됨
        new TV(),
        new Computer(),
        new Notebook()
    };
    for (Controllable controllable:controllables) {
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
      Controllable.reset();
    }
//    controllables[0].turnOn();
//    controllables[1].turnOn();
//    controllables[2].turnOn();
  }
}
