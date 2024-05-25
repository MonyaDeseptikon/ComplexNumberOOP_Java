public class Factory {

    public Calculable choseCalc(String message){
        if(message.equalsIgnoreCase("Complex")){
            return new ComplexCalculator();
        }
        return new StandartCalculator();
    }
}
