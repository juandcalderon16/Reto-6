
package com.mycompany.reto5;

public class Charmaleon extends Pokemon{

    public Charmaleon(String nombre, int nivel, int salud) {
        super(nombre,nivel, salud);
    }


    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Charizard(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmaleon!";
    }
    
}
