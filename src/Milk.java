/**
 * Created by Тим on 02.06.2017.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " и молока туда же за 10 центов";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}