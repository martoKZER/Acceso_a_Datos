import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;
        // Escoge la persona
        try{
            System.out.println("Introduce el número correspondiente al objeto que quieres sacar. \n1 - Piedra \n2 - Papel\n3 - Tijera");
            Scanner sc = new Scanner(System.in);
            int persona = sc.nextInt();
            if (persona == PIEDRA) {
                System.out.println("Has escogido piedra");
            }
            if (persona == PAPEL) {
                System.out.println("Has escogido papel");
            }
            if (persona == TIJERA) {
                System.out.println("Has escogido tijera");
            }
            // Escoge la IA
            int ia;
            if (persona >= 1 && persona <= 3) {
                ia = (int) (Math.random() * 3 + 1);
                if (ia == PIEDRA) {
                    System.out.println("El ordenador ha escogido piedra");
                    if (persona == PAPEL){
                        System.out.println("Has ganado!!!");
                    } else if (persona == TIJERA) {
                        System.out.println("Oh no! has perdido");
                    }else{
                        System.out.println("Empate");
                    }
                }
                else if (ia == PAPEL) {
                    System.out.println("El ordenador ha escogido papel");
                    if (persona == TIJERA){
                        System.out.println("Has ganado!!!");
                    } else if (persona == PIEDRA) {
                        System.out.println("Oh no! has perdido");
                    }else{
                        System.out.println("Empate");
                    }
                }
                else if (ia == TIJERA) {
                    System.out.println("El ordenador ha escogido tijera");
                    if (persona == PIEDRA){
                        System.out.println("Has ganado!!!");
                    } else if (persona == PAPEL) {
                        System.out.println("Oh no! has perdido");
                    }else{
                        System.out.println("Empate");
                    }
                }
                else System.out.println("Algo no haces bien");
            }else{
                JOptionPane.showMessageDialog(null, "No es un número válido. Vuelve a introducirlo.");
                sc.nextLine();
            }
            sc.close();
        }catch (InputMismatchException mismatchException){
            System.out.println("No has introducido un dato correcto "+mismatchException);
        }

    }
}
