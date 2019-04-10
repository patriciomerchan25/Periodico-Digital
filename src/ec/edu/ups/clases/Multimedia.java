/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author patrick
 */
public class Multimedia {
    
    private String nombre;
    private String formato;
    private String tamanio;
    private List <Byte> archivo;
    private String fechaModificacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setArchivo(List<Byte> archivo) {
        this.archivo = archivo;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFormato() {
        return formato;
    }

    public String getTamanio() {
        return tamanio;
    }

    public List<Byte> getArchivo() {
        return archivo;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "nombre=" + nombre + ", formato=" + formato + "\n tamanio=" + tamanio + ", fecha Modificacion=" + fechaModificacion + '}';
    }
    
    
    
    public void subirArchivo(){
        
    }
    
    public void buscarArchivo(){
        
    }
    
}

