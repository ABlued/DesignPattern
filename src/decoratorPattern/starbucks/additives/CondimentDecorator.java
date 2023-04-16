package decoratorPattern.starbucks.additives;

import decoratorPattern.starbucks.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
