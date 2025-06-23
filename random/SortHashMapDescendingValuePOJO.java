package random;

import java.util.HashMap;
import java.util.Objects;

public class SortHashMapDescendingValuePOJO {
    public static void main(String[] args) {
        HashMap<Student,Address>details=new HashMap<>();
    }
}

class Address{
    private long pincode;
    private String street;
    private String city;

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return pincode == address.pincode && Objects.equals(street, address.street) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pincode, street, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}//

class Student{
    long rollNo;
    String fname;
    String lname;
    int age;

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && age == student.age && Objects.equals(fname, student.fname) && Objects.equals(lname, student.lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, fname, lname, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}//