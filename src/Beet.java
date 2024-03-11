public class Beet extends Flower{

    private final FlowerType flowerType = FlowerType.BEET;

    public Beet(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }
}
