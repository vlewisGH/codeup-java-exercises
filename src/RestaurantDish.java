public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish(int cost, String name, boolean recommend){
        setCostInCents(cost);
        setNameOfDish(name);
        setWouldRecommend(recommend);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }


    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public String eat(){
        return "Nom nom nom!";
    }

}
