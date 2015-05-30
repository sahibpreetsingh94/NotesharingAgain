/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

/**
 *
 * @author Sahib
 */
public class Student {

    String rollno, name, email, contact, address;
    boolean photo;

    Student(String rollno, String name, String email, String contact, String address,boolean photo) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.photo = photo;
    }

    Object getMember(int i) {
        switch (i) {
            case 0:
                return this.rollno;
            case 1:
                return this.name;
            case 2:
                return this.email;
            case 3:
                return this.contact;
            case 4:
                return this.address;
            case 5:
                return photo;
        }
        return "dummy";
    }
}
