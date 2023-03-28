/*
 * @author : Supun Jaysinghe
 * Date    : 28 March 2023
 * Time    : 9:15 PM
 * Project : App
 * Created by IntelliJ IDEA.
 */
package lk.ccns.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private
    String id;
    private String name;
    private String address;

    public Student(String id, String name, String address) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
