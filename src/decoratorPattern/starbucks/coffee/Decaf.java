package decoratorPattern.starbucks.coffee;

import decoratorPattern.starbucks.Beverage;

public class Decaf extends Beverage { // 데코레이터 클래스
    public Decaf(){
        description = "디카페인";
    }

    @Override
    public double cost() {
        return .89;
    }
}
