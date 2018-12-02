/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateDSI;

/**
 *
 * @author danie
 */
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class hibernateUtil {
    
private static final SessionFactory sessionFactory = buildSessionFactory();
        
private static SessionFactory buildSessionFactory() {
        
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();                    
            SessionFactory sessionfactory = configuration.buildSessionFactory(serviceregistry);
            return sessionfactory;
        } catch (Throwable e) {
            System.out.println("La creación de Session Factory a fallado "+e) ;
            throw new ExceptionInInitializerError();
        }        
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
