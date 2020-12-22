package com.kodilla.stream.lambda;

import java.util.ArrayList;
import java.util.List;

public final class Dogs {

    public static List<String> getDogs() {

        final List<String> theDogsList = new ArrayList<>();
        theDogsList.add("Reks");
        theDogsList.add("Pucio");
        theDogsList.add("Maks");

        return new ArrayList<>(theDogsList);

    }


}
