package com.shashank.java.coding.problems.lambda.design.patterns.factory;

import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class FruitFactory {
  private static final Map<String, Supplier<Fruit>> MELONS = Map.of("Gac", Gac::new, "Cantaloupe", Cantaloupe::new);

  public static Fruit newInstance(Class<? extends Fruit> clazz) {

    Supplier<Fruit> fruitSupplier = MELONS.get(clazz.getSimpleName());
    if (Objects.isNull(fruitSupplier)) {
      throw new IllegalArgumentException(
          "Invalid clazz argument: " + clazz);
    }

    return fruitSupplier.get();
  }

  public static void main(String[] args) {
    Gac gac = (Gac) FruitFactory.newInstance(Gac.class);


  }


}
