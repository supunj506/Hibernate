package lk.ccns.hibernate;/*
 * @author : Supun Jaysinghe
 * Date    : 28 March 2023
 * Time    : 7:11 PM
 * Project : App
 * Created by IntelliJ IDEA.
 */

import lk.ccns.hibernate.emberded.Name;
import lk.ccns.hibernate.entity.Laptop;
import lk.ccns.hibernate.entity.Student;
import lk.ccns.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Demo {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student("S001", new Name("Supun", "Madu", "Jayasinghe"), "Kaluthara");
        session.save(student);
        session.save(new Laptop("L001","Dell",student));
        transaction.commit();
        session.close();


    }
}
