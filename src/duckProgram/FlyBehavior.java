package duckProgram;

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

