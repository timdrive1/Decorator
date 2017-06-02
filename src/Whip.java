/**
 * Created by Тим on 02.06.2017.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " и сливок тебе туда же";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}