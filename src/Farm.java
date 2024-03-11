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



}
