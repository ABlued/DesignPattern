package decoratorPattern.starbucks.coffee;

import decoratorPattern.starbucks.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return .89;
    }
}
