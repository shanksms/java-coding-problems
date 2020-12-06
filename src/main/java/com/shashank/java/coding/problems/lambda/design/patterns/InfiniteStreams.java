package com.shashank.java.coding.problems.lambda.design.patterns;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreams {

  public List<Integer> firstNEvenNumbers(int n) {
    Stream<Integer> infStream = Stream.iterate(1, i -> i + 1);
    return infStream.filter(num -> num % 2 == 0).limit(n).collect(Collectors.toList());

  }


}
