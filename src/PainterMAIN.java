public class PainterMAIN {

    public static void main(String[] args) {

        Painter p1 = new Painter(5, '$');
        p1.squareDisplay();
        System.out.println();

        Painter p2 = new Painter(100, 'K');
        p2.squareDisplay();
        System.out.println();

        Painter p3 = new Painter(59, 't');
        p3.squareDisplay();
        System.out.println();

    }
}
