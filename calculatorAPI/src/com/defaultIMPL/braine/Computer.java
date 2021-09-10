package com.defaultIMPL.braine;

public class Computer {

  public static Number compute(Number left, String ops, Number right) {
    return switch (ops) {
      case "+" -> (long) left + (long) right;
      case "-" -> (long) left - (long) right;
      case "/" -> (long) left / (long) right;
      case "*" -> (long) left * (long) right;
      case "%" -> (long) left % (long) right;
      default -> throw new IllegalArgumentException();
    };
  }
}
