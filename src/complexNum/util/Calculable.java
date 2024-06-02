package complexNum.util;

import complexNum.impl.ComplexNumber;

public interface Calculable {
    void sum(double a, double c, double b, double d);
    void multiply(double a, double c, double b, double d);
    void divide(double a, double c, double b, double d);
    void subtraction(double a, double c, double b, double d);
    ComplexNumber result();
    void clear();
}
