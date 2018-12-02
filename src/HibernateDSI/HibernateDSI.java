/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateDSI;

import Entities.usuari;
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
        
        usuari usuari1 = new usuari();
        usuari1.setNom("Daniel");
        usuari1.setCognom("Perez");
        usuari1.setId(0);
        
        usuari usuari2 = new usuari();
        usuari2.setNom("Manel-Alex");
        usuari2.setCognom("Garcia"); 
        usuari2.setId(1);
        
        usuari usuari3 = new usuari();
        usuari3.setNom("Eloi");
        usuari3.setCognom("Roca");
        usuari3.setId(2);
        
        usuari usuari4 = new usuari();
        usuari4.setNom("Albert");
        usuari4.setCognom("Ribera");
        usuari4.setId(3);
        
        Session session = hibernateUtil.getSessionFactory().getCurrentSession();
        
        session.beginTransaction();
        
        session.save(usuari1);
        session.save(usuari2);
        session.save(usuari3);
        session.save(usuari4);
        
        session.getTransaction().commit();
        /*
        ANTES DE CERRAR DEBEMOS REALIZAR LA ACTUALIZACIÓN QUE NOS DICE EL ENUNCIADO
        */
        hibernateUtil.getSessionFactory().close();
    }   
}

