package com.kodilla.stream.lambda;


public class PersonAgeChecker {

    public static void main(String[] args) {

        Person person = new Person(20, "Jacek");

        printMoreThen20(person, new AgeChecker() {
            @Override
            public boolean checkAge(Person person) {
                return person.getAge() > 18;
            }
        });

        //nie musimy podawać new Agechekcer, kompilator się domyśli
        //Lambda
        printMoreThen20(person, p -> p.getAge() > 20);

    }

    public static void printMoreThen20(Person person, AgeChecker ageChecker){
        System.out.println("Result: " + ageChecker.checkAge(person));
    }


}
