import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexNumber {
    public static Logger log = Log.log(ComplexNumber .class.getName());
    private int real;
    private int imaginary;
    private int divider;


    public ComplexNumber(int real, int imaginary) {
        log.log(Level.INFO, "Запущен конструктор комлексного числа");
        this.real = real;
        this.imaginary = imaginary;
        this.divider = 0;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

    @Override
    public String toString() {
        if (divider == 0) {
            return "ComplexNumber{" +
                    "real=" + real +
                    ", imaginary=" + imaginary + 'i' +
                    '}';
        } else {
            return "ComplexNumber{" +
                    "real=" + '(' + real + '/' + divider + ')' +
                    ", imaginary=" + '(' + imaginary + 'i' + '/' + divider + ')' +
                    '}';
        }
    }
}
