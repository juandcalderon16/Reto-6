
package com.mycompany.reto5;

public class Wartortle extends Pokemon{
    
    Wartortle(String nombre, int nivel, int salud){
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Blastoise(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }
    
}
