package com.pradipta.lambdas.unit3;

import com.pradipta.lambdas.unit1.Person;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample1 {
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("Pradipta", "Sarma", 25),
                new Person("Swaranga", "Sarma", 33),
                new Person("Debanga", "Sarma", 29),
                new Person("Bagmita", "Sharma", 32),
                new Person("Bharati", "Sarma", 62)
        );

       //System.out.println(persons.stream().filter(p1 -> p1.getFirstname().startsWith("B")).collect(Collectors.toList()));
        System.out.println(persons.stream().filter(p->p.getFirstname().startsWith("B")));
    }
}
