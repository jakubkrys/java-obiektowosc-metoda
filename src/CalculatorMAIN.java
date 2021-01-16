public class CalculatorMAIN {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("100 + 54 = "+c.sum2Arguments(100,54));
        System.out.println("5 + 6 + 8 + 99 + 3 = "+c.sum5Arguments(5,6,8,99,3));
    }
}
