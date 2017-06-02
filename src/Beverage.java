/**
 * Created by Тим on 02.06.2017.
 */
public abstract class Beverage {
    String description = "Какой-то напиток";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}