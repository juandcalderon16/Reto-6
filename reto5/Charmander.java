
package com.mycompany.reto5;

public class Charmander extends Pokemon{
    

    Charmander(String nombre, int nivel, int salud) {
        super(nombre,nivel,salud);
    }
    

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Charmaleon(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }
    
    
}
