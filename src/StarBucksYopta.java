/**
 * Created by Тим on 02.06.2017.
 */
public class StarBucksYopta {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " за $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);

        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " за $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " 2за $" + beverage3.cost());
    }
}
