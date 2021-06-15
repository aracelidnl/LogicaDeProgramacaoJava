package br.com.ChronosAcademy.LogicaProgramacao;

import java.util.LinkedHashMap;

public class MapTempo {
    public static void main(String[] args) {
        String tempo = "tempestade";
        LinkedHashMap<String, String> mapTempo = new LinkedHashMap<>();
        mapTempo.put("ensolarado", "ir pra praia");
        mapTempo.put("chovendo", "levar guarda chuva");
        mapTempo.put("nevando", "fica em casa");
        mapTempo.put("tempestade", "boa sorte");

        System.out.println(mapTempo.get("tempestade"));
        System.out.println(mapTempo);
        }

}
