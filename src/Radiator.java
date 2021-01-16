public class Radiator {
    char[] color;
    double weight;
    int power;

    Radiator(char[] color, double weight, int power){
        this.color = color;
        this.weight = weight;
        this.power = power;
    }

    void display(){
        System.out.print("Color: ");
        for (char c : color){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Weight: "+weight);
        System.out.println("Power in W: "+power+" W");
        System.out.println("Power in kWh: "+powerInKWh()+" kWh");
        if (powerInKWh() >= 5){
            System.out.println("High-power radiator");
        } else if (powerInKWh() >= 1){
            System.out.println("Average-power radiator");
        } else {
            System.out.println("Low-power radiator");
        }
        System.out.println();
    }

    double powerInKWh(){
        return (double)power/1000;
    }
}
