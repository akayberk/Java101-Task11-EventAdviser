import java.util.Scanner;
public class Adviser {
    public static void main(String[] args) {
        int heat;
        boolean c0,c1,c2,c3,c4;
        Scanner input = new  Scanner(System.in);
        System.out.print("Insan insan soyle bana kac derecedir hava?  ");
        heat = input.nextInt();
        c0 = heat<0;
        c1 = heat<5&&heat>0;
        c2 = heat>=5 && heat<15;
        c3 = heat>15 && heat<25;
        c4 = heat>25;

        String a0 = c0? "Otur oturdugun yerde bu havada n'apcan disarida":"";
        String a1 = c1 ? "Kayak yapabilirsin moruk." : "";
        String a2 = c2 ? "Sinemaya gidebilirsin moruk.":"";
        String a3 = c3 ? "Piknik yapabilirsin moruk.":"";
        String a4 = c4 ? "Yuzebilirsin moruk.":"";
        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }
    }

