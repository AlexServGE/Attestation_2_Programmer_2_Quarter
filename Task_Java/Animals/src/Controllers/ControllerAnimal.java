package Controllers;

import AnimalClasses.Animal;
import AnimalReestrService.AnimalReestrService;
import Viewers.ViewerAnimal;
import AnimalService.AnimalService;

public class ControllerAnimal {

    AnimalService aS = new AnimalService();
    ViewerAnimal vwAC = new ViewerAnimal();

    public Animal createAnimal() {
        this.vwAC.createAnimalMenu();
        switch (this.vwAC.getSelection()) {
            case "1": //domestic
                this.vwAC.createDomesticAnimalMenu();
                switch (this.vwAC.getSelection()) {
                    case "1":
                        return this.aS.createAnimal("Dog");
                    case "2":
                        return this.aS.createAnimal("Cat");
                    case "3":
                        return this.aS.createAnimal("Hamster");
                    default:
                        return null;
                }
            case "2": //pack
                this.vwAC.createPackAnimalMenu();
                switch (this.vwAC.getSelection()) {
                    case "1":
                        return this.aS.createAnimal("Horse");
                    case "2":
                        return this.aS.createAnimal("Camel");
                    case "3":
                        return this.aS.createAnimal("Donkey");
                }
            default:
                return null;
        }
    }

    public void changeAnimal(AnimalReestrService aRS) {
        Animal someAnimal = this.vwAC.selectAnimalMenu(aRS);
        this.vwAC.changeAnimalMenu();
        if (this.vwAC.getSelection().equals("1")) { //обучить команде
            aS.addCommand(someAnimal);
        }
    }
}

