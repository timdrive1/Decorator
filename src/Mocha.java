/**
 * Created by Тим on 02.06.2017.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " а если добавить какао в кофе то получится Mocha за ваши деньги";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}