package decoratorPattern.starbucks.additives;

import decoratorPattern.starbucks.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage; // 감싸고자 하는 음료수를 저장하는 인스턴스 변수
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .30;
    }
}
