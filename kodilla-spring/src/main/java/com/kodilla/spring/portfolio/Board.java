package com.kodilla.spring.portfolio;

public class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDoList(String task){
        toDoList.add(task);
    }

    public void addInProgressList(String task){
        inProgressList.add(task);
    }

    public void addDoneList(String task){
        doneList.add(task);
    }



}
