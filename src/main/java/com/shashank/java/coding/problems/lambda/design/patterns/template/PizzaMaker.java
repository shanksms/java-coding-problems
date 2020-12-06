package com.shashank.java.coding.problems.lambda.design.patterns.template;

import java.util.function.Consumer;

public class PizzaMaker {

  public void make(Pizza pizza, Consumer<Pizza> addTopIngredients) {
    makeDough(pizza);
    addTopIngredients.accept(pizza);
    bake(pizza);
  }

  private void makeDough(Pizza p) {
    System.out.println("Make dough");
  }

  private void bake(Pizza p) {
    System.out.println("Bake the pizza");
  }


  public static void main(String[] args) {
    Pizza sPizza = new Pizza();
    new PizzaMaker().make(sPizza, (pizza) -> System.out.println("adding toppings on " + pizza));
  }
}
