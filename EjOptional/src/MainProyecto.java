public class MainProyecto {
    public static void main(String[] args) {
//        try{
//            UncheckedTwoExceptions(false);
//        }catch (ArithmeticException | NullPointerException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Siempre se ejecuta, hay error o no?");
//        }
        try {
            throw new MiExcepcion("La opción 4 no está disponible");
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
    }

    //Checked Exceptions
    //
    private static void checkedTwoExceptions(boolean flag) throws Exception {
        if (flag) {
            throw new Exception("Excepción común");
        } else throw new RuntimeException();
    }

    //
    private static void checkedException() {
        try {
            throw new Exception("mensaje");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // aqui hay que hacer cosas, no solo un mensaje
        }
    }

    //Checked Exception 2
    private static void checkedException2() throws Exception {
        throw new Exception("Excepción lanzada");
    }

    //Unchecked Exceptions
    public static void exampleArithmeticException() {
        double numero = 10 / 0;
        System.out.println(numero);
    }

    public static void finallyExample() throws Exception {
        try {
            checkedException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        } finally {
            System.out.println("End");
        }
    }

    private static void UncheckedTwoExceptions(boolean flag) throws RuntimeException {
        if (flag) {
            throw new ArithmeticException("Arithmethic Exception");
        } else throw new NullPointerException("Null Pointer Exception");
    }
}
