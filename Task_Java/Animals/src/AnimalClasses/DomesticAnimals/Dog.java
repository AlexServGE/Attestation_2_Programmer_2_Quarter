package AnimalClasses.DomesticAnimals;


import AnimalClasses.DomesticAnimal;

public class Dog extends DomesticAnimal {


    public Dog(String name, String bDate) {
        super(name, bDate);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "thisAnimalId=" + thisAnimalId +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", commands=" + cmds.toString() +
                '}';
    }
}
