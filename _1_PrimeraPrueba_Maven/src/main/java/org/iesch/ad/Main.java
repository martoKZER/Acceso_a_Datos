package org.iesch.ad;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String prueba= "eres un tigre enderezao";

        String resultado = StringUtils.substringAfter(prueba, "un");
        String resultado2 = StringUtils.substringBefore(prueba, "un");
        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
