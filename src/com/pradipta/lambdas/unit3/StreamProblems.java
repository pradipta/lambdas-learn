package com.pradipta.lambdas.unit3;

import com.pradipta.lambdas.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamProblems {
    public static void main(String[] args){
//        Get student with exact match name "Pradipta"
//        Get student with matching surname "Sarma"
//        Get all student of age 29.
//        Create a List<Student> from the List<TempStudent>
//                Convert List<Student> to List<String> of student name
//        Convert List<students> to String
//        Change the case of List<String>
//        Sort List<String>
//                Conditionally apply Filter condition, say if flag is enabled then.

        List<Person> persons = Arrays.asList(
                new Person("Pradipta", "Sarma", 25),
                new Person("Swaranga", "Sarma", 33),
                new Person("Debanga", "Sarma", 29),
                new Person("Bagmita", "Sharma", 32),
                new Person("Bharati", "Sarma", 62)
        );
        System.out.println(persons.stream().filter(p->p.getFirstname().equals("Pradipta")).collect(Collectors.toList()));
        System.out.println(persons.stream().filter(p->p.getLastname().equals("Sarma")).collect(Collectors.toList()));
        System.out.println(persons.stream().filter(p->p.getAge() == 29).collect(Collectors.toList()));
    }
}
