public class Amber {
    char[] variant;
    char[] color;
    double hardness;
    double density;
    double meltingPoint;

    Amber(char[] variant, char[] color, double hardness, double density, double meltingPoint){
        this.variant = variant;
        this.color = color;
        this.hardness = hardness;
        this.density = density;
        this.meltingPoint = meltingPoint;
    }

    void display(){
        System.out.println("----------------------");
        System.out.print("Name: ");
        for (char v : variant){
            System.out.print(v);
        }
        System.out.println();
        System.out.print("Color: ");
        for (char c : color){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Hardness: "+hardness);
        System.out.println("Density: "+density);
        System.out.println("Melting point (in C): "+meltingPoint);
    }

    void changeToF(){
        System.out.println("Melting point (in F): "+(((meltingPoint*9)/5)+32));
    }

    void densityIncrease(double increaseValue){
        System.out.println("Increased density: "+(density+increaseValue));
    }
}
