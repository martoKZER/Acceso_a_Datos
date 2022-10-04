import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public void run() {
        patronExacto("abc");
        contieneCadena("agfaggagwabct");
        empiezaPorCadena("abcasdbwfl");
        empiezaPorCadena2("Abcdjbcdsjbf");
        cadenaConLongitud("misco");
        soloA_o_B("ababababab");
        soloTiene1yNoSeguidoDe2("11111111335485754680");
    }

    private void soloTiene1yNoSeguidoDe2(String cadena) {
        Pattern pat = Pattern.compile(".*1(?!2).*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }

    private void soloA_o_B(String cadena) {
        Pattern pat = Pattern.compile("(a|b)+");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }

    private void cadenaConLongitud(String cadena) {
        Pattern pat = Pattern.compile("^[a-zA-Z]{5,10}");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }

    private void empiezaPorCadena2(String cadena) {
        Pattern pat = Pattern.compile("^[aA]bc*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }

    private void empiezaPorCadena(String cadena) {
        Pattern pat = Pattern.compile("^abc*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }

    private void contieneCadena(String cadena) {
        Pattern pat = Pattern.compile(".*abc*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }


    private void patronExacto(String cadena) {
        Pattern pat = Pattern.compile("abc");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else System.out.println("No");
    }
}
