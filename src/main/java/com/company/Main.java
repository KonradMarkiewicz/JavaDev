package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.database.Connector;

import java.util.*;

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

        SortedMap<String, String> cars = new TreeMap<>();
        cars.put("X5","BMW");
        cars.put("Punto","Fiat");
        cars.put("Enzo","Ferrari");
        cars.put("Gallardo","Lamborgini");

        System.out.println("Cars in created map ordered by models ascending:");
        for(String car : cars.keySet()){
            System.out.println(car);
        }

        Map<String, Integer> countriesSize = new HashMap<>();
        countriesSize.put("Poland",312696);
        countriesSize.put("Germany",357578);
        countriesSize.put("Belarus",207595);
        countriesSize.put("Czech Republic",78866);
        countriesSize.put("Slovakia",49035);

        int maxSize = Collections.max(countriesSize.values());
        System.out.println( "Largest size in countriesSize HashHap is: " + maxSize);

        int minSize = Collections.min(countriesSize.values());
        System.out.println("Smallest size in countriesSize HashHap is: " + minSize);
    }

}
