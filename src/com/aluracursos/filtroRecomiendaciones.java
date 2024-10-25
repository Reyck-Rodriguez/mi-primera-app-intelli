package com.aluracursos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class filtroRecomiendaciones {

    void filtra(Clasificacion Clasificacion) {
        if (Clasificacion.getClasificacion()>= 4) {
            System.out.println("muy bien evaluado esta semana");
        } else if (Clasificacion.getClasificacion() >= 3) {
            System.out.println("popular muy buena");
            } else {
            System.out.println("recuerda poner en favoritos");
        }

    }
}
