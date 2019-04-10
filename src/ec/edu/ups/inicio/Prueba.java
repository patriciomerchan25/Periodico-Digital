/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.inicio;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author patrick
 */
public class Prueba {
    public static void main(String [] args){
        
        
        RedSocial facebook=new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("facebook");
        facebook.setUrl("www.facebook.com");
        System.out.println(facebook);
        System.out.println("\n");
       
        //Agregamos datos a los atruvutos de la clase Multimedia
         SimpleDateFormat formato1= new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar fechaMul=new GregorianCalendar(2019, 1, 2);
        String mul=formato1.format(fechaMul.getTime());
        
        Multimedia multimedia=new Multimedia();
        multimedia.setNombre("Tiros Penal");
        multimedia.setFormato("mp4");
        multimedia.setTamanio("1MB");
        multimedia.setFechaModificacion(mul);
        System.out.println(multimedia);
            System.out.println("\n");
        
        //Creamos la noticia del club Bayer
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar fecha2=new GregorianCalendar(2019, 3, 4);
        String f1=formato.format(fecha2.getTime());
        
        Noticia bayer=new Noticia();
        bayer.setTitulo("Bayenr Munich");
        bayer.setAutor("lucas");
        bayer.setContenido("El Bayern tiene toda su plantilla para jugar la Champions");
        bayer.setFechaPublicacion(f1);
        bayer.agregarMultimedia(multimedia);
        System.out.println(bayer);
        
        System.out.println("\n ");
        Seccion futbol=new Seccion();
        futbol.setNombre("Deportes");
        futbol.agregarNoticia(bayer);
        System.out.println(futbol); 
        
          System.out.println("\n ");
          SimpleDateFormat formatoEst= new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar fechaEst=new GregorianCalendar(2019, 3, 5);
        String fest=formato.format(fechaEst.getTime());
        
          EstructuraPeriodico est=new EstructuraPeriodico();
          est.setNombrePeriodico("Extra");
          est.setEncabezado("La champions vuelve en abril");
          est.setUbicacion("Ecuador");
          est.setFecha(fest);
          est.agregarSeccion(futbol);
          est.agregarRedSocial(facebook);
          System.out.println(est); 
   }
}


