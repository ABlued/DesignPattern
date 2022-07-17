package strategyPattern;

public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("날개를 갖고 날아다닙니다.");
    }
}

class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("날개가 없어 날지 못합니다.");
    }
}

class FlyRocketPowered implements FlyBehavior{
    public void fly(){
        System.out.println("로켓 추진으로 날아갑니다.");
    }
}