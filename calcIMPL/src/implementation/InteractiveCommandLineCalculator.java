package implementation;

import com.Calculator;
import java.util.Scanner;

/**
 * Simple example of calculator implementation without any checks.
 */

public class InteractiveCommandLineCalculator implements Calculator {

  private static final String START_MESSAGE =
      "Please enter three elements separated by spaces: left operand, operation, right operand.";
  private static final String AFTER_CALCULATION_MESSAGE =
      """
          Please enter next three elements.
          Or type the 'quit' word to exit from this program.
          """;

  private long left;
  private String operation;
  private long right;
  private long result;


  @Override
  public void start(String... args) {

    System.out.println(START_MESSAGE);
    var in = new Scanner(System.in);
    var line = in.nextLine();

    while (!"quit".equals(line)) {
      parseInput(line);
      calculate();
      printResult(result);
      System.out.println(AFTER_CALCULATION_MESSAGE);
      line = in.nextLine();
    }
  }

  private void printResult(long result) {
    System.out.printf(
        """
                        
            The input was:
            Left operand: %s
            Operation: %s
            Right operand: %s
            RESULT: %s
            """,
        left,
        operation,
        right,
        result);
  }

  private void calculate() {
    result = switch (operation) {
      case "+" -> left + right;
      case "-" -> left - right;
      case "/" -> left / right;
      case "*" -> left * right;
      case "%" -> left % right;
      default -> throw new IllegalArgumentException();
    };
  }


  private void parseInput(String line) {
    var cookedLine = line.strip().split(" ");
    left = Long.parseLong(cookedLine[0]);
    operation = cookedLine[1];
    right = Long.parseLong(cookedLine[2]);
  }
}
