package jmax.ad.sax.controler;

import jmax.ad.sax.modelo.User;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class SAXController {
    private static SAXController controller;
    private final String uri;
    private List<User> userList;

    public SAXController(String uri) {
        this.uri = uri;
    }
    public void loadData() throws ParserConfigurationException, IOException, SAXException, ParserConfigurationException, SAXException {
        // Creamos el parseador
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        // Indicamos cómo vamos a detectar los eventos
        UserHandler handler = new UserHandler();
        // Parseamos el fichero, con nuestro manejador de eventos
        saxParser.parse(this.uri, handler);
        // Obtenemos la lista de usuarios
        this.userList = handler.getUsers();
    }

    public List<User> getUsers() {
        return this.userList;
    }

}

