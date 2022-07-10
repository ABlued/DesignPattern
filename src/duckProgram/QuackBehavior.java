package duckProgram;

public interface QuackBehavior{
    void quack();
}

class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("꽥꽥");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("삑삑");
    }
}
class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("아무 소리도 내지 못합니다");
    }
}
