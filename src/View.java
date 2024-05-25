import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private Factory factory;
    private Calculable calculator;
    private String type;


    public View() {
        this.factory = new Factory();
        this.calculator = setCalculator();
    }
    public void run(){
        while(true){
            calculate(setArguments());
            String answer = prompt();
            if(!answer.equalsIgnoreCase("y")){
                System.exit(0);
            }
        }
    }

    private String prompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить}? (y/n): ");
        return scanner.nextLine();
    }

    private Calculable setCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип калькулятора (Complex or Standard): ");
        this.type = scanner.nextLine();
        return factory.choseCalc(type);
    }

    private void calculate(List<?> arguments){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оператор (+, -, *, /): ");
        String operator = scanner.nextLine();
        switch (operator){
            case "+":
                calculator.sum(arguments.get(0), arguments.get(1));
                break;
            case "-":
                calculator.substract(arguments.get(0), arguments.get(1));
                break;
            case "*":
                calculator.multiply(arguments.get(0), arguments.get(1));
                break;
            case "/":
                calculator.division(arguments.get(0), arguments.get(1));
                break;
        }
        System.out.println(String.format("Результат: %s", calculator.result()) );
        calculator.resetResult();
    }

    private List<?> setArguments(){
        Scanner scanner = new Scanner(System.in);
        if(type.equalsIgnoreCase("complex")){
            List<ComplexNumber> args = new ArrayList<>();
            int first;
            int second;
            System.out.println("Введите первое комплексное число:");
            System.out.println("Введите первый аргумент: ");
            first = scanner.nextInt();
            System.out.println("Введите второй аргумент: ");
            second = scanner.nextInt();
            args.add(new ComplexNumber(first, second));
            System.out.println("Введите второе комплексное число:");
            System.out.println("Введите первый аргумент: ");
            first = scanner.nextInt();
            System.out.println("Введите второй аргумент: ");
            second = scanner.nextInt();
            args.add(new ComplexNumber(first, second));
            return args;
        }
        else {
            List<Double> args = new ArrayList<>();
            System.out.println("Введите первый аргумент: ");
            args.add(scanner.nextDouble());
            System.out.println("Введите второй аргумент: ");
            args.add(scanner.nextDouble());
            return args;
        }
    }

}
