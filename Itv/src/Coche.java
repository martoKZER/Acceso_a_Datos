import java.util.Date;

public class Coche {


    public Coche(String matricula, String modelo, String combustible, String titular, String fechaCaducidad, int problemas) {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getProblemas() {
        return problemas;
    }

    public void setProblemas(int problemas) {
        this.problemas = problemas;
    }
    public String getFechaCaducidad(String fechaCaducidad) {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public String matricula;
    public String modelo;
    public String combustible;
    public String titular;
    private String fechaCaducidad;
    public int problemas;


}
