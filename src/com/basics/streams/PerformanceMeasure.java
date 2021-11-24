package com.basics.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class PerformanceMeasure {
    public static void main(String[] args) {
    new PerformanceMeasure().serialPerformanceTest();
  new PerformanceMeasure().parallelPerformanceTest();
    }
    public void serialPerformanceTest(){
        List<Long> range = LongStream.rangeClosed(1,10000000)
                .boxed().collect(Collectors.toList());
        Instant start = Instant.now();
        range.stream().reduce(Long::sum);
        Instant end = Instant.now();

        Duration duration =Duration.between(start,end);
        System.out.println("TIme taken in serial execution is: "+duration.toMillis());

    }
    public void parallelPerformanceTest(){
        List<Long> range = LongStream.rangeClosed(1,10000000)
                .boxed().collect(Collectors.toList());
        Instant start = Instant.now();
        range.stream().parallel().reduce(Long::sum);
        Instant end = Instant.now();

        Duration duration =Duration.between(start,end);
        System.out.println("TIme taken in parallel execution is: "+duration.toMillis());

    }


}