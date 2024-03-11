import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers = new ArrayList<>();

    private Animal[] animals = new Animal[20];

    private ArrayList<Animal> smallAnimals = new ArrayList<>();

    private ArrayList<Animal> bigAnimals = new ArrayList<>();


    public void addAnimal(Animal animal){
        switch (animal.size){
            case BIG:
                if(smallAnimals.size() <= 10){
                    smallAnimals.add(animal);
                    animals[animals.length-1] = animal;
                }
            case SMALL:
                if(bigAnimals.size() <= 10){
                    bigAnimals.add(animal);
                    animals[animals.length-1] = animal;
                }
        }

    }

    public void addFlower(Flower flower){
        ArrayList<FlowerType> flowerTypes = new ArrayList<>();
        double area = 10000;

        for (Flower f: flowers) {
            area = area - f.neededArea;
            for (FlowerType fl:flowerTypes) {
                if(){
            }
        }

        if(flowerTypes.size() <= 5){
            if(area- flower.neededArea > 0){
                flowers.add(flower);
            }
        }else{

        }

        for (FlowerType f:flowerTypes) {
            if(flower.flowerType == flowerTypes.get(f.ordinal())){

            }
        }

    }




}
