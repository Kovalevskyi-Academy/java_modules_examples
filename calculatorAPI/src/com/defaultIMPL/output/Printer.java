package com.defaultIMPL.output;

public class Printer {

  public static void printConditions(Number left, String ops, Number right) {
    System.out.printf("Computing %s %s %s ...", left, ops, right);
  }

  public static void printResult(Number result) {
    System.out.printf("%nResult is: %s%n", result);
  }
}
