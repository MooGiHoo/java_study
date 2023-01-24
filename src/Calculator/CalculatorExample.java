package Calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.PowerON();
        int sum = c.plus(10, 20);
        double div = c.divide(20, 7);
        System.out.println("sum : " + sum + ", div : " + div);
        c.PowerOff();
    }
}
