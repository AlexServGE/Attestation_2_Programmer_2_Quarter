package Controllers;

import AnimalClasses.Animal;
import AnimalReestrService.AnimalReestrService;
import Viewers.Viewer;


public class Controller {
    Viewer vw = new Viewer();
    ControllerAnimal cAC = new ControllerAnimal();
    AnimalReestrService aRS = new AnimalReestrService();

    public Controller() {
        this.vw.startScreen();
        this.sessionStart();
    }

    public void sessionStart() {

        while (!this.vw.getSelection().equals("4")){
            this.vw.startMenu();
            switch(this.vw.getSelection()){
                case "1":
                    Animal newAnimal = this.cAC.createAnimal();
                    aRS.addAnimal(newAnimal);
                    break;
                case "2":
                    aRS.showAnimals();
                    break;
                case "3":
                    cAC.changeAnimal(aRS);
                    break;
            }
        }
    }
}
