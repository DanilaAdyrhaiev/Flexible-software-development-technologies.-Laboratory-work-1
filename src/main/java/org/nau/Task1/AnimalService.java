package org.nau.Task1;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    int count = 0;

    public List<Animal> generateTenAnimals(){
        List<Animal> animalList = new ArrayList<>();

        animalList.add(createAnimal("Dog", 5, "Mammal", "John"));
        animalList.add(createAnimal("Cat", 3, "Mammal", "Alice"));
        animalList.add(createAnimal("Bird", 1, "Bird", "Bob"));
        animalList.add(createAnimal("Fish", 2, "Aquatic", "Emma"));
        animalList.add(createAnimal("Turtle", 4, "Reptile", "David"));
        animalList.add(createAnimal("Rabbit", 2, "Mammal", "Sophia"));
        animalList.add(createAnimal("Hamster", 1, "Mammal", "Oliver"));
        animalList.add(createAnimal("Snake", 3, "Reptile", "Charlotte"));
        animalList.add(createAnimal("Parrot", 2, "Bird", "James"));
        animalList.add(createAnimal("Ferret", 2, "Mammal", "Emily"));

        return animalList;
    }

    public Animal createAnimal(String name, int age, String type, String ownersName){
        count++;
        return new Animal(count, type, age, name, ownersName);
    }
}
