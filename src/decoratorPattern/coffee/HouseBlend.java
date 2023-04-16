package decoratorPattern.coffee;

import decoratorPattern.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        String description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
