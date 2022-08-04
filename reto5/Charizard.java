
package com.mycompany.reto5;

public class Charizard extends Pokemon{
    
    Charizard(String nombre,int nivel, int salud){
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionExeption{
        throw new NoEvolucionExeption();
    }

    @Override
    public String gritar() {
        return "Charizard!";
    }


    
    
}
