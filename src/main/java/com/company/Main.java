package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.database.Connector;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal burek = new Animal("dog");
        burek.name = "Burek";

        Human wiesiek = new Human("Wiesław", "Wszywka");

        Connector.connect();

        burek.saveAnimal();
        wiesiek.saveHuman();

    }
}
