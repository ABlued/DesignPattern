package decoratorPattern.coffee;

import decoratorPattern.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        String description = "다크 로스트";
    }

    @Override
    public double cost() {
        return .89;
    }
}
