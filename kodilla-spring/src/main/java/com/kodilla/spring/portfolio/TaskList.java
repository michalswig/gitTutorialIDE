package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void add(String text){
        tasks.add(tasks.size(), text);
    }

    public String read(int index){
        return tasks.get(index);
    }

    public int getTasksQnt(){
        return tasks.size();
    }

}