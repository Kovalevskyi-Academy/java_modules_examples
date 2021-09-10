package com.start;

import com.Calculator;
import implementation.TestThisImplementation;
import java.util.Arrays;

public class Main {
  public static void main(String... args) {
    //testCalcAPI();
    //testCalcIMPL();
    testServices();


  }

  private static void testCalcAPI() {
    var operations = new String[][]{
        {"3", "+", "3"},
        {"4", "/", "4"},
        {"5", "*", "5"},
        {"6", "-", "6"},
        {"7", "%", "7"}
    };
//    Arrays.stream(operations).forEach(CalculatorTest::main);
  }

  private static void testCalcIMPL() {
    var operations = new String[][]{
        {"3", "+", "3"},
        {"4", "/", "4"},
        {"5", "*", "5"},
        {"6", "-", "6"},
        {"7", "%", "7"}
    };
    Arrays.stream(operations).forEach(TestThisImplementation::main);
  }

  private static void testServices() {
    var calculators = Calculator.getAll();

    for (var item : calculators) {
      System.out.println(item.getClass());
      item.start("2", "+", "2");
    }
  }

}
