/**
 * Created by Тим on 02.06.2017.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Еспрессо \n Анекдот: \n -Мне кофе \n -Вам с виски?\n -Мне без\n -Без виски?\n -Без кофе";
    }

    public double cost() {
        return 1.99;
    }
}