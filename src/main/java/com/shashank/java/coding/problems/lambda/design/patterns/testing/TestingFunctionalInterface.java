package com.shashank.java.coding.problems.lambda.design.patterns.testing;

import java.util.function.Function;
import java.util.stream.Stream;

public class TestingFunctionalInterface {

  public Function<String, String> reduceStrings(
      Function<String, String> ...functions) {

    Function<String, String> function = Stream.of(functions)
        .reduce(Function.identity(), Function::andThen);

    return function;
  }

}
