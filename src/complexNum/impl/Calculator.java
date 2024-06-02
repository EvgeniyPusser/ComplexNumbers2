package complexNum.impl;

import complexNum.util.Calculable;

public class Calculator implements Calculable {
   ComplexNumber result;
   double realPart = 0;
   double imaginaryPart = 0;


    @Override
    public void sum(double a, double c, double b, double d) {
        double tempResultReal = a + b;
        double tempResultImaginary = c + d;

        realPart= realPart + tempResultReal;
        imaginaryPart=imaginaryPart + tempResultImaginary;

    }

    @Override
    public void multiply(double a, double c, double b, double d) {
        double tempResultReal = a * b - c * d;
        double tempResultImaginary = a * d + c * b;
        realPart = realPart + tempResultReal;
        imaginaryPart = imaginaryPart + tempResultImaginary;

    }

    @Override
    public void divide(double a, double c, double b, double d) {

            double tempResultReal = (a * b + c * d )/( b * b + d * d);
            double tempResultImaginary = (c * b - a * d)/ (b * b + d * d);
            realPart = realPart + tempResultReal;
            imaginaryPart = imaginaryPart + tempResultImaginary;

    }

    @Override
    public void subtraction(double a, double c, double b, double d) {
        double tempResultReal = a - b;
        double tempResultImaginary = c - d;
        realPart = realPart + tempResultReal;
        imaginaryPart = imaginaryPart + tempResultImaginary;
    }

    @Override
    public ComplexNumber result() {
        System.out.printf("Result: %s + i * %s \n", realPart, imaginaryPart);
        ComplexNumber cn = new ComplexNumber(0, 0);
        cn.setRealPart(realPart);
        cn.setImaginaryPart(imaginaryPart);
        return cn;
    }

    @Override
    public void clear() {

    }

}
