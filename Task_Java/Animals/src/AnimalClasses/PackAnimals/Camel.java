package AnimalClasses.PackAnimals;


import AnimalClasses.PackAnimal;

public class Camel extends PackAnimal {


    public Camel(String name, String bDate) {
        super(name, bDate);
    }

    @Override
    public String toString() {
        return "Camel{" +
                "thisAnimalId=" + thisAnimalId +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", commands=" + cmds.toString() +
                '}';}
}
