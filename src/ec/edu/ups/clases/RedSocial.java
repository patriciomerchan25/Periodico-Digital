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
public class RedSocial {
    
    private int codigo;
    private String nombre;
    private String url;
    private List<String> publicaciones;
    
    public RedSocial(){
        publicaciones=new ArrayList<>();
    }
    
    public void setCodigo( int codigo){
        this.codigo=codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setUrl(String url){
        this.url=url;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getUrl(){
        return this.url;
    }

    public void setPublicaciones(List<String> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<String> getPublicaciones() {
        return publicaciones;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "codigo=" + codigo + ", nombre=" + nombre + ", url=" + url + "\n publicaciones=" + publicaciones + '}';
    }

    
    
    public void compartir(){
        
    }
    
    
    
}

