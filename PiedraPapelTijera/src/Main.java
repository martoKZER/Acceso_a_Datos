import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Introduce el número correspondiente al objeto que quieres sacar. \n1 - Piedra \n2-Papel\n3-Tijera");
            Scanner sc = new Scanner(System.in);
            int objeto = 0;
            final int PIEDRA = 1;
            final int PAPEL = 2;
            final int TIJERA = 3;
            int ia;

            if (objeto == PIEDRA){
                System.out.println("Has escogido piedra");
            }
            if (objeto == PAPEL){
                System.out.println("Has escogido papel");
            }
            if (objeto == TIJERA){
                System.out.println("Has escogido tijera");
            }
                ia = (int)(Math.random()* 3 + 1);
                if (ia == PIEDRA) System.out.println("El ordenador ha escogido piedra");
                if (ia == PAPEL) System.out.println("El ordenador ha escogido papel");
                if (ia == TIJERA) System.out.println("El ordenador ha escogido tijera");

        }catch (RuntimeException e){
            throw new RuntimeException();
        }


    }
}
