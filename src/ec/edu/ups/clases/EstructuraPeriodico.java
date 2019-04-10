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
public class EstructuraPeriodico {
    
    private  String nombrePeriodico;
    private  String ubicacion;
    private  String fecha;
    private String encabezado;
    private List<Seccion> secciones;
    private List<RedSocial> redesSociales;
    
    public EstructuraPeriodico(){
        
        secciones=new ArrayList<>();
        redesSociales=new ArrayList<>();
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getNombrePeriodico() {
        return nombrePeriodico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEncabezado() {
        return encabezado;
    }
    
    public void agregarSeccion(Seccion seccion){
        
       secciones.add(seccion);
    }
    
    public void agregarRedSocial(RedSocial redsocial){
        
        redesSociales.add(redsocial);
    }

    @Override
    public String toString() {
        return "EstructuraPeriodico{" + "nombrePeriodico=" + nombrePeriodico + ", ubicacion=" + ubicacion + "\n fecha=" + fecha + ", encabezado=" + encabezado + "\n secciones=" + secciones + "\n redesSociales=" + redesSociales + '}';
    }

   
  
    
    
    
}

