package complexNum.impl;

import complexNum.util.Calculable;

public class LogableCalculator implements Calculable {
    private final Calculable calculable;

    public LogableCalculator(Calculable calculable) {
        this.calculable = calculable;
    }


    @Override
    public void sum(double a, double c, double b, double d) {
        System.out.println(String.format("Суммирую (%s + i * %s) и (%s + i * %s)", a, c, b, d));
        calculable.sum(a, c, b, d);

    }

    @Override
    public void multiply(double a, double c, double b, double d) {
        System.out.println(String.format("Перемножаю (%s + i * %s) и (%s + i * %s)", a, c, b, d));
        calculable.sum(a, c, b, d);

    }

    @Override
    public void divide(double a, double c, double b, double d) {
        System.out.println(String.format("Делю (%s + i * %s) на (%s + i * %s)", a, c, b, d));
        calculable.sum(a, c, b, d);
    }

    @Override
    public void subtraction(double a, double c, double b, double d) {
        System.out.println(String.format("Отнимаю от (%s + i * %s)  (%s + i * %s)", a, c, b, d));
        calculable.sum(a, c, b, d);

    }

    @Override
    public ComplexNumber result() {
        return null;
    }

    @Override
    public void clear() {

    }
}
