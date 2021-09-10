module calculatorAPI {
  exports com to calcIMPL, beginner;

  uses com.Calculator;

  provides com.Calculator with com.defaultIMPL.DefaultCalculator;
}
