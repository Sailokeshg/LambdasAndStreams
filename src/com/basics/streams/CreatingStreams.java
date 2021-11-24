package com.basics.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.SplittableRandom;
import java.util.stream.Stream;

public class CreatingStreams {
    private void testCollectionStreams(){
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>(2);
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.stream().forEach(System.out::println);
    }
    private void testEmptyStream(){
        Stream<Integer> emptyIntegerStream = Stream.empty();
        System.out.println(emptyIntegerStream.count());
    }
    private void testStreamFromValues(){
        Stream<String> movieNameStreams = Stream.of("Malignant","Predestination");
        System.out.println(movieNameStreams.count());
    }

    private void testFileStream(){
        try {
            Stream<String> fileLines = Files.lines(Paths.get("/home/lokers/output.txt"));
            fileLines.forEach(System.out::println);
        }
        catch (IOException e){
            e.getMessage();
        }

    }
    private void testGenerateIterateStreams(){
        Stream<Double> randomNumbers = Stream.generate(Math::random);
       // randomNumbers.forEach(System.out::println);

        Stream<Integer> wholeNumbers= Stream.iterate(1,i->i+1);
        wholeNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new CreatingStreams().testEmptyStream();
        new CreatingStreams().testStreamFromValues();
        new CreatingStreams().testCollectionStreams();
       // new CreatingStreams().testGenerateIterateStreams();
        new CreatingStreams().testFileStream();
    }
}
