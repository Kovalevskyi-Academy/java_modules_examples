package com.defaultIMPL;

import com.Calculator;
import com.defaultIMPL.braine.Computer;
import com.defaultIMPL.input.Parser;
import com.defaultIMPL.output.Printer;

public class DefaultCalculator implements Calculator {

  @Override
  public void start(String... args) {
    var prsr = new Parser(args);
    var left = prsr.getLeft();
    var ops = prsr.getOps();
    var right = prsr.getRight();
    Printer.printConditions(left, ops, right);
    var result = Computer.compute(left, ops, right);
    Printer.printResult(result);
  }
}
