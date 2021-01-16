package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

/*
Crear un sistema que permita almacenar el inventario de autos en una concesionaria.
De cada auto, necesito conocer la marca, año, modelo, precio.
Mostrar cantidad total de autos y el precio de cada uno.
 */
public class Main {

    public static void main(String[] args) {

        List<Auto> autos = new ArrayList<>();

        autos.add(new Auto("Ford", "Focus", 2018, 1234.56));
        autos.add(new Auto("Peugeot", "5008", 2019, 3214.87));
        autos.add(new Auto("Ford", "Fiesta", 2017, 34.87));
        autos.add(new Auto("Peugeot", "308", 2018, 34.84));
        autos.add(new Auto("Audi", "A3", 2020, 1454.37));

        System.out.println("Cantidad total: "+autos.size());
        for(int cont = 0; cont < autos.size(); cont++){
            System.out.println(autos.get(cont).getPrecio());
        }

        System.out.println(autos);

        for(int cont = 0; cont < autos.size(); cont++){
            System.out.println(autos.get(cont).fichaTecnica());
        }
    }
}
