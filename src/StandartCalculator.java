import java.util.logging.Level;
import java.util.logging.Logger;

public class StandartCalculator implements Calculable<Double> {
    private double result;
    public static Logger log = Log.log(StandartCalculator .class.getName());

    public StandartCalculator() {
        log.log(Level.INFO, "Запущен стандартный калькулятор");
        this.result = 0;
    }

    @Override
    public void sum(Double a, Double b) {
        result = a + b;
    }

    @Override
    public void substract(Double a, Double b) {
        result = a - b;
    }

    @Override
    public void multiply(Double a, Double b) {
        result = a * b;
    }

    @Override
    public void division(Double a, Double b) {
        result = a / b;
    }

    public Double result(){
        return result;
    }
    public void resetResult(){
        this.result = 0;
    }
}
