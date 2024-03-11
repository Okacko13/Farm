public class Corn extends Flower{

    private final FlowerType flowerType = FlowerType.CORN;

    public Corn(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }
}
