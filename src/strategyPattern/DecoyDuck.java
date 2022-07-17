package strategyPattern;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("안녕하세요 장난감 오리입니다.");
    }
}
