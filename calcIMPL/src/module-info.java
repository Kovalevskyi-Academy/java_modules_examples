import implementation.InteractiveCommandLineCalculator;

module calcIMPL {
  //requires calculatorAPI;
  requires transitive calculatorAPI;

  exports implementation;

  provides com.Calculator with InteractiveCommandLineCalculator;
}
