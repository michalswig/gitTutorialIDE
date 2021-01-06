package com.kodilla.exception.io;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(final String fileName) throws FileReaderException {

//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("names.txt").getFile());
//        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
//            fileLines.forEach(System.out::println);
//        } catch (IOException e) {
//            throw new FileReaderException();
////            System.out.println("Error reading file" + e);
//        } finally {
//            System.out.println("always!");
//        }
//
//        System.out.println(file.getPath());
//    }

        ClassLoader classLoader = getClass().getClassLoader();
        try(Stream<String> fileLines = Files.lines(Paths.get(classLoader.getResource("fileName").toURI()))){
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("always");
        }

    }


}
