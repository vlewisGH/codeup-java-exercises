public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish newDish = new RestaurantDish(50,"Fries",true);

        System.out.println(newDish.getCostInCents());
        System.out.println(newDish.getNameOfDish());
        System.out.println(newDish.getWouldRecommend());

        System.out.println(newDish.eat());
    }
}
