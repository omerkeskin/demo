package com.example.demo.experiment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hellop");

        Map<String,Person> myMap = new HashMap<>();

        Person omer = new Person("Omer","Keskin",30);
        Person kamil = new Person("Kamil","Reis",12);
        Person seda = new Person("Seda","Ozturk",26);
        Person esma = new Person("Esma","Nadir",37);

        myMap.put("omer",omer);
        myMap.put("kamil",kamil);
        myMap.put("seda",seda);

        myMap.forEach((s, person) -> System.out.println(person));
        System.out.println("-------------------------------------");
        //BiFunction

        //myMap.compute("seda", (s, person) -> new Person("Mrs.".concat(person.getName()), person.getSurname(),person.getAge()+5));

        myMap.computeIfAbsent("esma",s -> esma);


        myMap.forEach((s, person) -> System.out.println(person));

    }
}
