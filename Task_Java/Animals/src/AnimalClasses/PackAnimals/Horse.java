package AnimalClasses.PackAnimals;


import AnimalClasses.PackAnimal;

public class Horse extends PackAnimal {


    public Horse(String name, String bDate) {
        super(name, bDate);
    }
    @Override
    public String toString() {
        return "Horse{" +
                "thisAnimalId=" + thisAnimalId +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", commands=" + cmds.toString() +
                '}';}
}
