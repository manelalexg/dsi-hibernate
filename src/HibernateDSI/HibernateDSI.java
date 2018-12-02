/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateDSI;

import Entities.detalleUsuario;
import org.hibernate.Session;

/**
 *
 * @author danie
 */
public class HibernateDSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        detalleUsuario usuario1 = new detalleUsuario();
        usuario1.setNombre("Daniel");
        usuario1.setApellido("Perez");
        usuario1.setId(0);
        
        detalleUsuario usuario2 = new detalleUsuario();
        usuario2.setNombre("Manel-Alex");
        usuario2.setApellido("Garcia"); 
        usuario2.setId(1);
        
        detalleUsuario usuario3 = new detalleUsuario();
        usuario3.setNombre("Eloi");
        usuario3.setApellido("Roca");
        usuario3.setId(2);
        
        detalleUsuario usuario4 = new detalleUsuario();
        usuario4.setNombre("Albert");
        usuario4.setApellido("Ribera"); 
        usuario4.setId(3);
        
        Session session = hibernateUtil.getSessionFactory().getCurrentSession();
        
        session.beginTransaction();
        
        session.save(usuario1);
        session.save(usuario2);
        session.save(usuario3);
        session.save(usuario4);
        
        session.getTransaction().commit();
        /*
        ANTES DE CERRAR DEBEMOS REALIZAR LA ACTUALIZACIÓN QUE NOS DICE EL ENUNCIADO
        */
        hibernateUtil.getSessionFactory().close();
    }   
}

