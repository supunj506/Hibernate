/*
 * @author : Supun Jaysinghe
 * Date    : 28 March 2023
 * Time    : 4:35 PM
 * Project : App
 * Created by IntelliJ IDEA.
 */
package lk.ccns.hibernate.util;

import lk.ccns.hibernate.entity.Laptop;
import lk.ccns.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private final SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?factoryConfiguration=new FactoryConfiguration():
        factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
