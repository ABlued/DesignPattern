package decoratorPattern.additives;

import decoratorPattern.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage; // 감싸고자 하는 음료수를 저장하는 인스턴스 변수
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 라떼";
    }

    @Override
    public double cost() {
        return beverage.cost() + .35;
    }
}
