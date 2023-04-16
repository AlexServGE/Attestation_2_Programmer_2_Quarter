package AnimalClasses.DomesticAnimals;


import AnimalClasses.DomesticAnimal;

public class Cat extends DomesticAnimal {


    public Cat(String name, String bDate) {
        super(name, bDate);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "thisAnimalId=" + thisAnimalId +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", commands=" + cmds.toString() +
                '}';}

}
