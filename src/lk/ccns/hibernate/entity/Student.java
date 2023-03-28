/*
 * @author : Supun Jaysinghe
 * Date    : 28 March 2023
 * Time    : 9:15 PM
 * Project : App
 * Created by IntelliJ IDEA.
 */
package lk.ccns.hibernate.entity;

import lk.ccns.hibernate.emberded.Name;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
    @Id
    private String id;
    @Embedded
    private Name name;
    private String address;

    public Student(String id, Name name, String address) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
