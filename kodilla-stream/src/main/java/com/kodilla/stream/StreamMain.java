package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
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


    }

}
