package com.kodilla.stream.lambda;

public class RegularAgeChecker implements  AgeChecker{
    @Override
    public boolean checkAge(Person person) {
        return person.getAge()>21;
    }
}
