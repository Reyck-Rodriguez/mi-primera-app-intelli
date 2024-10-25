package com.aluracursos.screenmacth.calculos;

public class filtroRecomiendacion {

    void filtra (Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("muy bien evaluado");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("popular esta semana");

        }else {
            System.out.println("colocalo en tu lista, para verlo despues ");
        }
    }
}
