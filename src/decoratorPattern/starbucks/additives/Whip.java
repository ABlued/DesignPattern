package decoratorPattern.starbucks.additives;

import decoratorPattern.starbucks.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage; // 감싸고자 하는 음료수를 저장하는 인스턴스 변수
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }
}
