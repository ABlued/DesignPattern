package duckProgram;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("안녕하세요 고무오리입니다.");
    }
}
