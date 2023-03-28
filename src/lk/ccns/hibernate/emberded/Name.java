/*
 * @author : Supun Jaysinghe
 * Date    : 28 March 2023
 * Time    : 9:24 PM
 * Project : App
 * Created by IntelliJ IDEA.
 */
package lk.ccns.hibernate.emberded;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Name {
    private String fName;
    private String mName;
    private String lName;

    public Name() {
    }

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
