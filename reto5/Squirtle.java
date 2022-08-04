
package com.mycompany.reto5;

public class Squirtle extends Pokemon{
    
    Squirtle(String nombre, int nivel, int salud){
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Wartortle(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Squirtle!";
    }
    
}
