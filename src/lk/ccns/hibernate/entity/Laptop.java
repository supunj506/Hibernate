/*
 * @author : Supun Jaysinghe
 * Date    : 28 March 2023
 * Time    : 9:39 PM
 * Project : App
 * Created by IntelliJ IDEA.
 */
package lk.ccns.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "laptop")
public class Laptop {
    @Id
    private
    String id;
    private String brand;
    @OneToOne
    private
    Student student;

    public Laptop(String id, String brand, Student student) {
        this.id = id;
        this.brand = brand;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id='" + id + '\'' +
                ", Brand='" + brand + '\'' +
                ", student=" + student +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
