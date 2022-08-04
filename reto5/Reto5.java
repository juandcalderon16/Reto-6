
package com.mycompany.reto5;

public class Reto5 {

    public static void main(String[] args) {
        
        Pokemon p = new Charmander("Antonio",4,40);
        System.out.println(p.gritar());
        try {
            p = p.evolucionar();
        } catch (NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(p.gritar());
        try {
            p = p.evolucionar();
        } catch (NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(p.gritar());

        Pokemon d = new Pikachu("Geronimo",7,200);
        System.out.println(d.gritar());
        try {
            d = d.evolucionar();
        } catch (NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(d.gritar());
        
        Pokemon f = new Squirtle("Fabinno",5,50);
        System.out.println(f.gritar());
        try {
            f = f.evolucionar();
        } catch (NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(f.gritar());
        try {
            f = f.evolucionar();
        } catch (NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        try {
            f = f.evolucionar();
        } catch (NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        
        
        System.out.println(f.gritar());
        
        
        Pokebola poke1 = new Pokebola("grande");
        poke1.setPokemon(d);
        System.out.println(poke1.getPokemon().getNombre());
        
        
    }
}
