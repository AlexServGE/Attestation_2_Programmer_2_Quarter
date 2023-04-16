package AnimalReestrService;

import AnimalClasses.Animal;

import java.util.ArrayList;

public class AnimalReestrService {

    public ArrayList<Animal> animalList;

    public AnimalReestrService(){
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal someAnimal) {
        this.animalList.add(someAnimal);
    }

    public void showAnimals(){
        for (int i = 0; i < this.animalList.size(); i++){
            System.out.println(this.animalList.get(i));
        }
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }
}
