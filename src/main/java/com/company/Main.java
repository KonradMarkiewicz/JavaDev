package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.database.Connector;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal burek = new Animal("dog");
        burek.name = "Burek";

        Animal mruczek = new Animal("cat");
        mruczek.name = "Mruczek";

        Human wiesiek = new Human("Wiesław", "Wszywka");

        Connector.connect();

        burek.saveAnimal();
        mruczek.saveAnimal();

        wiesiek.saveHuman();

        List<Animal> animals = mruczek.findAnimals();
        List<Human> humans = wiesiek.findHumans();

    }

}
