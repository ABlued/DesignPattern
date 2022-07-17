package strategyPattern;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("안녕하세요 빨간오리입니다.");
    }
}
