package notesharingagain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Owner
 */
public class Department {

    public String name, description, hod, contact, email;

    Department(String name, String hod, String contact, String email, String description) {
        this.name = name;
        this.description = description;
        this.hod = hod;
        this.contact = contact;
        this.email = email;
    }

    Object getMember(int i) {
        switch (i) {
            case 0:
                return this.name;
            case 1:
                return this.hod;
            case 2:
                return this.contact;
            case 3:
                return this.email;
            case 4:
                return this.description;
        }
        return "dummy";
    }

}
