package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Dogs;
import com.kodilla.stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        /*
        System.out.println("Welcome to module 7 - Stream");

        //SaySomething saySomething = new SaySomething();
        //saySomething.say();

        Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.println("Example text lambda");
        processor.execute(codeToExecute);

        processor.execute(() -> System.out.println("text"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(23,456, FunctionalCalculator::addAToB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("LITWO, OJCZYZNO MOJA", a -> a.toLowerCase()));
        System.out.println(poemBeautifier.beautify("litwo moja litwo", a -> a.toUpperCase()));
        System.out.println(poemBeautifier.beautify("litwo moja litwo", a -> a.replace('i', 'a')));
        Reverse reverse = new Reverse();
        System.out.println(reverse.decorate("litwo moja litwo"));
        */

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream().filter(a -> a.length() > 15).map(a -> a.toLowerCase()).forEach(System.out::println);
//      filter zwraca wartośc true/false, w tym przypadku będzie true jak String będzie dłuższy niż 15 znaków
        Dogs.getDogs().stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
//      raz mamy wyrażenie Lamba raz referencje do metody


/*        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/


/*        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   // [1]
                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
                .collect(Collectors.toList());                                       // [3]
        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
        theResultListOfBooks.stream()                                           // [5]
                .forEach(System.out::println);*/


        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream().filter(book -> book.getYearOfPublication()>2005).collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);

        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);


    }



}
