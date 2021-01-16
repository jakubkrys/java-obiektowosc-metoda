public class CalculatorMAIN {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("100 + 54 = "+c.sum2Arguments(100,54));
        System.out.println("5 + 6 + 8 + 99 + 3 = "+c.sum5Arguments(5,6,8,99,3));

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        int[] values = {32,964,9,23,73,462,93,4};
        int sum = c.sumArray(values);
        System.out.println("Liczby w tablicy: 32,964,9,23,73,462,93,4");
        System.out.println("Wynik dodania liczb z tablicy: "+sum);

        System.out.println("Srednia: "+c.avg(values));
    }
}
