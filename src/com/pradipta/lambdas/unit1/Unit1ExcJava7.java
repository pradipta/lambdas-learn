package com.pradipta.lambdas.unit1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcJava7 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Pradipta", "Sarma", 25),
                new Person("Swaranga", "Sarma", 33),
                new Person("Debanga", "Sarma", 29),
                new Person("Bagmita", "Sharma", 32),
                new Person("Bharati", "Sarma", 62)
        );

        sortByLastName(persons);
        printConditional(persons, new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getFirstname().startsWith("B");
            }
        });
        printAll(persons);

        //Step 1:  Sort List By Last name

        //Step 2: Create method Print all elements

        //Step 3: Create method to print whose name starts with B

    }

    public static void sortByLastName(List<Person> persons) {
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        });

        System.out.println("Sorted in Java7: "+ persons);
    }

    public static void printConditional(List<Person> persons, Predicate<Person> condition){
        for (Person person: persons){
            if (condition.test(person)){
                System.out.println(person);
            }
        }
    }

    public static void printAll(List<Person> persons) {
        printConditional(persons, new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return true;
            }
        });
    }
//
//    public interface Condition {
//        public Boolean satisfies(Person person);
//    }
}
