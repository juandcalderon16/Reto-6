
package com.mycompany.reto5;

public abstract class Pokemon{

    protected String nombre;
    protected int nivel;
    protected int salud; 

    public Pokemon(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
   
    public abstract Pokemon evolucionar() throws NoEvolucionExeption;
    public abstract String gritar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    
}
