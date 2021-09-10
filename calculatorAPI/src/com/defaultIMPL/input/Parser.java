package com.defaultIMPL.input;

public record Parser(String... args) {

  public Parser {
    validate(args);
  }

  void validate(String... args) {
    if (args.length != 3 || ("0".equals(args[2]) && ("/".equals(args[1]) || "%".equals(args[1])))) {
      throw new ArithmeticException();
    }
  }

  public Number getLeft() {
    return Long.valueOf(args[0]);
  }

  public Number getRight() {
    return Long.valueOf(args[2]);
  }

  public String getOps() {
    return args[1];
  }
}
