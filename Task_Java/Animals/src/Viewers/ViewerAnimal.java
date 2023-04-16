package Viewers;

import AnimalClasses.Animal;
import AnimalReestrService.AnimalReestrService;

import java.util.Scanner;

public class ViewerAnimal {

    String selection;
    Scanner userPut = new Scanner(System.in);

    public void createAnimalMenu() {
        System.out.print(
                "----------------------------------------------------\n" +
                        "Выберите вид животного, которое Вы хотите создать: \n" +
                        "1: Домашнее \n" +
                        "2: Въючное \n" +
                        "user$: "
        );
        this.userSelects();
    }

    public void createDomesticAnimalMenu() {
        System.out.print(
                "----------------------------------------------------\n" +
                        "Выберите породу животного, которое Вы хотите создать: \n" +
                        "1: Собака \n" +
                        "2: Кошка \n" +
                        "3: Хомяк \n" +
                        "user$: "
        );
        this.userSelects();
    }

    public void createPackAnimalMenu() {
        System.out.print(
                "----------------------------------------------------\n" +
                        "Выберите породу животного, которое Вы хотите создать: \n" +
                        "1: Конь \n" +
                        "2: Верблюд \n" +
                        "3: Осёл \n" +
                        "user$: "
        );
        this.userSelects();
    }

//check for errors!!!
    public Animal selectAnimalMenu(AnimalReestrService aRS){
        System.out.printf(
                "----------------------------------------------------\n" +
                        "Выберите id животного, которое хотите отредактировать: \n" +
                        "%s \n" +
                        "user$: ", aRS.getAnimalList().toString()
        );
        this.userSelects();
        return aRS.getAnimalList().get(Integer.parseInt(this.getSelection())-1);
    }

    public void changeAnimalMenu(){
        System.out.print(
                "----------------------------------------------------\n" +
                        "Что бы Вы хотели изменить: \n" +
                        "1: Обучить дополнительной команде \n" +
                        "user$: "
        );
        this.userSelects();
    }

    public String getSelection() {
        return selection;
    }

    public void userSelects() {
        this.selection = this.userPut.next();
    }

}
