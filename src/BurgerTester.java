public class BurgerTester {


    public static void main(String[] args) {
        BurgerTools.mostPopularTopping = "lettuce";
        BurgerTools.averageDaysBeforeExpiration = 14;
        BurgerTools.temperatureWhenCooked = 450;

        BurgerTools.grill();
    }
}
