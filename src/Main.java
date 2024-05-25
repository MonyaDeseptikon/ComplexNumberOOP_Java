import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Запущено приложение комплексные числа");
        View view = new View();
        view.run();

    }
}
