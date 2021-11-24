package com.basics.streams;

import javax.xml.transform.stream.StreamSource;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stats {

  private void range(){
      IntStream ints = IntStream.rangeClosed(10,100);
      ints.forEach(System.out::println);
  }
  private void testMinAndMax(){
      IntStream intsForMax = IntStream.rangeClosed(10,20);
      IntStream intsForMin = IntStream.rangeClosed(10,20);
      OptionalInt maxInt = intsForMax.max();
      OptionalInt minInt = intsForMin.min();
      System.out.println("Maximum from the range is "+(maxInt.getAsInt()));
      System.out.println("Minimum from the range is "+(minInt.getAsInt()));
  }
  private void average(){
      IntStream intsForAverage = IntStream.rangeClosed(10,20);
      OptionalDouble average = intsForAverage.average();
      System.out.println("Average of range is "+average.getAsDouble());
  }
    public static void main(String[] args) {
        new Stats().range();
        new Stats().testMinAndMax();
        new Stats().average();
    }
}