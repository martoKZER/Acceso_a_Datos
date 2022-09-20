public class MainArgs {
    public static void main(String[] args) {
        String[] lista = new String[]{"coche", "amoto", "helicotero"};
        doSomething(lista);
        doSomething2("camello", "cerdo", "caballo", "perro");
    }
    private static void doSomething(String[] args){// primero ejemplo
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    private static void doSomething2(String ...args){// segundo ejemplo
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
