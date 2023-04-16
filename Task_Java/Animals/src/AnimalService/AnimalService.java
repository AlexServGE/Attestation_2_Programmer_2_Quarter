package AnimalService;

import AnimalClasses.Animal;
import AnimalClasses.DomesticAnimals.Cat;
import AnimalClasses.DomesticAnimals.Dog;
import AnimalClasses.DomesticAnimals.Hamster;
import AnimalClasses.PackAnimals.Camel;
import AnimalClasses.PackAnimals.Donkey;
import AnimalClasses.PackAnimals.Horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AnimalService {

    Random rd = new Random();
    ArrayList<String> rNames = new ArrayList<>(Arrays.asList("Сима", "Ума", "Гадя"));
    ArrayList<String> rBDates = new ArrayList<>(Arrays.asList("2023-01-01", "2022-01-01", "2021-01-01"));


    public Animal createAnimal(String breed) {
        String name = this.rNames.get(this.rd.nextInt(3));
        String bDate = this.rBDates.get(this.rd.nextInt(3));
        switch (breed) {
            case "Dog":
                return new Dog(name, bDate);
            case "Cat":
                return new Cat(name, bDate);
            case "Hamster":
                return new Hamster(name, bDate);
            case "Donkey":
                return new Donkey(name, bDate);
            case "Horse":
                return new Horse(name, bDate);
            case "Camel":
                return new Camel(name, bDate);
            default:
                return null;
        }
    }

    public void addCommand(Animal someAnimal) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите команду, которую будет знать выбранное животное: \n" +
                "user$: ");
        String userInput = input.next();
        someAnimal.getAnimalCommands().add(userInput);
    }
}

