package jp.sample;

public class CalculatorApp {
	public static void main(String[] args) {
        BasicCalculation calculator = new BasicCalculation();
        CaluculatorHistory history = new CaluculatorHistory();

        double a = 10;
        double b = 5;

        double result1 = calculator.add(a, b);
        history.addRecord(a + " + " + b + " = " + result1);

        double result2 = calculator.subtract(a, b);
        history.addRecord(a + " - " + b + " = " + result2);

        double result3 = calculator.multiply(a, b);
        history.addRecord(a + " * " + b + " = " + result3);

        double result4 = calculator.divide(a, b);
        history.addRecord(a + " / " + b + " = " + result4);

        history.showHistory();
    }

}
