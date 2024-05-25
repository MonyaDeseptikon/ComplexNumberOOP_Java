import java.util.logging.Level;
import java.util.logging.Logger;


public class ComplexCalculator implements Calculable<ComplexNumber> {
    public static Logger log = Log.log(ComplexCalculator .class.getName());
        private ComplexNumber result;
    int aNumReal;
    int aNumImg;
    int bNumReal;
    int bNumImg;

    public ComplexCalculator() {
        log.log(Level.INFO, "Запущен комлексный калькулятор");
        this.result = new ComplexNumber(0, 0);
    }

    public void setComplexNumbers(ComplexNumber a, ComplexNumber b){
        this.aNumReal = a.getReal();
        this.aNumImg = a.getImaginary();
        this.bNumReal = b.getReal();
        this.bNumImg = b.getImaginary();
    }

    @Override
    public void sum(ComplexNumber a, ComplexNumber b) {
        setComplexNumbers(a, b);
        result.setReal(aNumReal + bNumReal);
        result.setImaginary(aNumImg + bNumImg);
    }

    @Override
    public void substract(ComplexNumber a, ComplexNumber b) {
        setComplexNumbers(a, b);
        result.setReal(aNumReal - bNumReal);
        result.setImaginary(aNumImg - bNumImg);
    }

    @Override
    public void multiply(ComplexNumber a, ComplexNumber b) {
        setComplexNumbers(a, b);
        result.setReal(aNumReal * bNumReal - aNumImg * bNumImg);
        result.setImaginary(aNumReal * bNumImg + aNumImg * bNumReal);
    }

    @Override
    public void division(ComplexNumber a, ComplexNumber b) {
        setComplexNumbers(a, b);
        result.setReal(aNumReal * bNumReal + aNumImg * bNumImg);
        result.setImaginary(aNumImg * bNumReal - aNumReal * bNumImg);
        result.setDivider(bNumReal * bNumReal + bNumImg * bNumImg);
    }

    @Override
    public ComplexNumber result() {
        return result;
    }

    @Override
    public void resetResult() {
        this.result.setReal(0);
        this.result.setImaginary(0);
        this.result.setDivider(0);
    }
}
