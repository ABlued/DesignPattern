package decoratorPattern.coffee;

import decoratorPattern.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        String description = "디카페인";
    }

    @Override
    public double cost() {
        return .89;
    }
}
