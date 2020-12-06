package com.shashank.java.coding.problems.lambda.design.patterns.testing;

import static org.junit.Assert.*;

import java.util.function.Function;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class TestingFunctionalInterfaceTest {
  private TestingFunctionalInterface testingFunctionalInterface;

  @Before
  public void setUp() throws Exception {
    testingFunctionalInterface =  new TestingFunctionalInterface();
  }

  @Test
  public void reduceStrings() {
    Function<String, String> upperCase = (s) -> s.toUpperCase();
    Function<String, String> concat = (s) -> s.concat("DONE");
    Function<String, String> f = testingFunctionalInterface.reduceStrings(upperCase, concat);
    MatcherAssert.assertThat(f.apply("test"), CoreMatchers.equalTo("TESTDONE"));

  }
}