package jmx.ad.rss;

import jmx.ad.rss.controler.RSSController;
import jmx.ad.rss.modelo.Noticia;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println("*** LECTOR DE NOTICIAS RSS ***");
        RSSController rssController = new RSSController();
        List<Noticia> noticias = rssController.getNoticias ("https://e00-marca.uecdn.es/rss/portada.xml");
        //https://elpais.com/rss/elpais/portada.xml
        //https://e00-elmundo.uecdn.es/elmundosalud/rss/portada.xml
        //https://e00-marca.uecdn.es/rss/portada.xml

        if(noticias.size()>0) {
            System.out.println("Ultimas noticias encontradas: " + noticias.size());
            noticias.forEach(System.out::println);
        }else{
            System.out.println("No se han encontrado noticias");
        }

    }
}
