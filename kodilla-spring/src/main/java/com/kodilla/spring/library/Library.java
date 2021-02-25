package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

//@Service
public class Library {

    private final List<String> books = new ArrayList<>();

//    @Autowired
    private LibraryDbController libraryDbController;
    /*pole przechowuje referencje do klasy, pole inicjowane jest przez konstruktor klasy jesli jest*/

//    @Autowired
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }


}
