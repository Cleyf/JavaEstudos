package AuxiliarPOO;

public class CurrencyConverter {

    public static final double DOLLAR = 3.10;

    public static double imposto(double imp){
        return imp = (DOLLAR * 6 / 100);
    }

    public static double converter(double real){
        return real = (DOLLAR*6/100 + DOLLAR) * real;
    }
}
