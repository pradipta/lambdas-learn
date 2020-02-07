package com.pradipta.lambdas.unit3;

import com.pradipta.lambdas.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionStuff {
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("Pradipta", "Sarma", 25),
                new Person("Swaranga", "Sarma", 33),
                new Person("Debanga", "Sarma", 29),
                new Person("Bagmita", "Sharma", 32),
                new Person("Bharati", "Sarma", 62)
        );
//
//        persons.forEach(new Consumer<Person>() {
//            @Override
//            public void accept(Person person) {
//
//            }
//        });

        persons.forEach(System.out::println);
    }

    static void print(){
        System.out.println("Hi");
    }
}
