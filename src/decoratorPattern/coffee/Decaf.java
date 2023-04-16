package decoratorPattern.coffee;

import decoratorPattern.Beverage;

public class Decaf extends Beverage { // 데코레이터 클래스
    public Decaf(){
        String description = "디카페인";
    }

    @Override
    public double cost() {
        return .89;
    }
}
