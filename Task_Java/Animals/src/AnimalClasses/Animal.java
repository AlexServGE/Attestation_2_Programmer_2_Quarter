package AnimalClasses;

import java.util.ArrayList;

public abstract class Animal {
    ArrayList<String> animalCommands = new ArrayList<>();

    protected String name;
    protected String bDate;
    protected int thisAnimalId;
    protected ArrayList<String> cmds;
    static int animalId = 0;


    public Animal(String name, String bDate) {
        animalId += 1;
        this.name = name;
        this.bDate = bDate;
        this.thisAnimalId = animalId;
        this.cmds = new ArrayList<>();
    }

    public ArrayList<String> getAnimalCommands() {
        return this.cmds;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalCommands=" + animalCommands +
                ", name='" + name + '\'' +
                ", bDate='" + bDate + '\'' +
                ", thisAnimalId=" + thisAnimalId +
                ", commands=" + cmds +
                '}';
    }
}
