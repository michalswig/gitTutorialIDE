package com.kodilla.stream.person;                       // [1]

import java.util.ArrayList;                              // [2]
import java.util.List;                                   // [3]

public final class People {                              // [4]

    public static List<String> getList() {                // [5]

        final List<String> theList = new ArrayList<>();    // [6]
//        Zmienna ta jest typu List, a nie ArrayList – dobrą praktyką jest typowanie zmiennych przechowujących kolekcje poprzez typ interfejsu, a nie typ konkretnej klasy implementującej interfejs. Oczywiście tworzony poprzez new po prawej stronie znaku = obiekt, musi być już konkretnej klasy implementującej ten interfejs. Taki sposób typowania zmiennych jest bardziej elastyczny (można do takiej zmiennej przypisać w programie również inne implementacje list, np. LinkedList lub inną)
//        Na końcu przy ArrayList pojawiły się puste nawiasy ostrokątne <> – możemy skrócić zapis w ten sposób, jeżeli z typu zmiennej wynika, jakiego typu obiekty będą w kolekcji (tu: umieszczone przy typie zmiennej).
        theList.add("John Smith");                         // [7]
        theList.add("Dorothy Newman");                     // [8]
        theList.add("John Wolkowitz");                     // [9]
        theList.add("Lucy Riley");                         // [10]
        theList.add("Owen Rogers");                        // [11]
        theList.add("Matilda Davies");                     // [12]
        theList.add("Declan Booth");                       // [13]
        theList.add("Corinne Foster");                     // [14]
        theList.add("Khloe fry");                          // [15]
        theList.add("Martin Valenzuela");                  // [16]

        return new ArrayList<>(theList);                   // [17]
//        zwracamy kopię the list
    }
}