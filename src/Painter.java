public class Painter {
    int n;
    char s;

    Painter(int n, char s){
        this.n = n;
        this.s = s;
    }

    void squareDisplay(){
        int x = 0;
        while (x < n) {
            int y = 0;
            while (y < n) {
                System.out.print(s);
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
