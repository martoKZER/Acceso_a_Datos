import org.iesch.ad.modelo.Empleado;

import java.io.File;
import java.io.ObjectOutputStream;
import java.util.Stack;

public class FicheroBinario {
    public static void testEscribirFicheroBinario(){
        ObjectOutputStream f = null;
        File fichero = null;

        Empleado e1 = new Empleado("Juan", "Illo", 26,1600);
        Empleado e2 = new Empleado("Jose", "Rabadan", 21,900);

        Stack<Empleado> pila = new Stack<>();
        pila.add(e1);
        pila.add(e2);
    }
}
