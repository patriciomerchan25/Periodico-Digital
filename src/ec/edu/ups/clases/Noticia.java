/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author patrick
 */
public class Noticia {
    
    private String titulo ;
    private String autor ;
    private String contenido;
    private String fechaPublicacion;
    private List<Multimedia> multimedias;
    
    public Noticia(){
        multimedias=new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

   
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    
    
  public void agregarMultimedia(Multimedia multimedia){
      multimedias.add(multimedia);
      
  }

    @Override
    public String toString() {
        return "Noticia{" + "titulo=" + titulo + ", autor=" + autor + "\n contenido=" + contenido + ", fechaPublicacion=" + fechaPublicacion + "\n Multimedias=" + multimedias + '}';
    }

    
  
}

