/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrick
 */
public class Seccion {
    
    private String nombre;
    private List<Noticia> noticias;
    
    public Seccion(){
        noticias=new ArrayList<>();
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void agregarNoticia(Noticia noticia){
        
        noticias.add(noticia);
    }

    @Override
    public String toString() {
        return "Seccion{" + "nombre=" + nombre + " \nNoticias=" + noticias + '}';
    }
    
    
    
}

