public class AmberMAIN {

    public static void main(String[] args) {
        // odmiany
        char[] burmit = {'b','u','r','m','i','t'};
        char[] aikait = {'a','i','k','a','i','t'};
        char[] cyberyt = {'c','y','b','e','r','y','t'};
        char[] keuperyt = {'k','e','u','p','e','r','y','t'};
        char[] rumenit = {'r','u','m','e','n','i','t'};

        // barwy
        char[] jasnożółta = {'j','a','s','n','o','ż','ó','ł','t','a'};
        char[] żółta = {'ż','ó','ł','t','a'};
        char[] ciemnożółta = {'c','i','e','m','n','o','ż','ó','ł','t','a'};
        char[] jasnobrązowa = {'j','a','s','n','o','b','r','ą','z','o','w','a'};
        char[] ciemnobrązowa = {'c','i','e','m','n','o','b','r','ą','z','o','w','a'};

        Amber a1 = new Amber (burmit, jasnożółta, 2.1, 1.06, 289);
        Amber a2 = new Amber (rumenit, żółta, 2.5, 1.07, 300);
        Amber a3 = new Amber (cyberyt, ciemnobrązowa, 2.4, 1.09, 298);
        Amber a4 = new Amber (keuperyt, ciemnożółta, 2.2, 1.08, 287);
        Amber a5 = new Amber (aikait, jasnobrązowa, 2.3, 1.06, 290);

        Amber[] ambers = new Amber[5];
        ambers[0] = a1;
        ambers[1] = a2;
        ambers[2] = a3;
        ambers[3] = a4;
        ambers[4] = a5;

        for(Amber a : ambers){
            a.display();
            a.changeToF();
        }
    }
}
