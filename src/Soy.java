/**
 * Created by Тим on 02.06.2017.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " не сыпь мне сой на рану(кофе для не переваривающих молоко лохов)  ";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}