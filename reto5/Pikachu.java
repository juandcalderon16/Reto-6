
package com.mycompany.reto5;

public class Pikachu extends Pokemon{
    
    Pikachu(String nombre, int nivel, int salud){
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Raichu(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Pikachu!";
    }
    
}
