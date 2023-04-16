package AnimalClasses.DomesticAnimals;

import AnimalClasses.DomesticAnimal;

public class Hamster extends DomesticAnimal {


    public Hamster(String name, String bDate) {
        super(name, bDate);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "thisAnimalId=" + thisAnimalId +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", commands=" + cmds.toString() +
                '}';
    }
}
