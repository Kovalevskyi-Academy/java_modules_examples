package com;


import com.defaultIMPL.DefaultCalculator;
import java.util.Arrays;

public class CalculatorTest {

  public static void main(String... args) {
    if (args.length != 3) {
      doTestDefaultIMPL();
    } else {
      new DefaultCalculator().start(args);
    }

  }

  private static void doTestDefaultIMPL() {
    System.out.println("TEST CALCULATION");
    var operations = new String[][]{
        {"3", "+", "3"},
        {"4", "/", "4"},
        {"5", "*", "5"},
        {"6", "-", "6"},
        {"7", "%", "7"}
    };
    var calculator = new DefaultCalculator();
    Arrays.stream(operations)
        .forEach(calculator::start);
    System.out.println("END OF TESTS");
  }

}
