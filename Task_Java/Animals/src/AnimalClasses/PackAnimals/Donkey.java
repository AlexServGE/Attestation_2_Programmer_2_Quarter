package AnimalClasses.PackAnimals;



import AnimalClasses.PackAnimal;

public class Donkey extends PackAnimal {


    public Donkey(String name, String bDate) {
        super(name, bDate);
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "thisAnimalId=" + thisAnimalId +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", commands=" + cmds.toString() +
                '}';}
}
