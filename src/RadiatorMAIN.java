public class RadiatorMAIN {
    public static void main(String[] args) {

        char[] red = {'r','e','d'};
        char[] blue = {'b','l','u','e'};
        char[] green = {'g','r','e','e','n'};
        Radiator r1 = new Radiator (red, 55, 1200);
        Radiator r2 = new Radiator (blue, 120, 5150);
        Radiator r3 = new Radiator (green, 15, 500);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        // Wyświetlenie danych za pomocą pętli for
        for(Radiator r : radiators){
            System.out.print("Color: ");
            for (char c : r.color){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Weight: "+r.weight);
            System.out.println("Power: "+r.power+"W");
            System.out.println();
        }

        // Wyświetlenie danych za pomocą metody display
        System.out.println("----------------------------");
        System.out.println();
        for (Radiator r : radiators){
            r.display();
        }

    }
}
