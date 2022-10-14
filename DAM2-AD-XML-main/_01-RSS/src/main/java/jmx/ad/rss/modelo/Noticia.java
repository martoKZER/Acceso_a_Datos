package jmx.ad.rss.modelo;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Noticia {
    private String titulo;
    private String link;
    private String descripcion;
    private String contenido;
    private String fecha;
    private String imagen;
}
