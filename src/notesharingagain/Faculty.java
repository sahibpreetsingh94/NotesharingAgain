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
public class Faculty {

    public int id;
    String username, email, address, qualification, contact;
    Boolean photo;

    Faculty(int id, String username, String email, String contact, String address, String qualification, boolean photo) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.qualification = qualification;
        this.photo = photo;
    }

    Object getMember(int i) {
        switch (i) {
            case 0:
                return this.id;
            case 1:
                return this.username;
            case 2:
                return this.email;
            case 3:
                return this.contact;
            case 4:
                return this.address;
            case 5:
                return this.qualification;
            case 6:
                return this.photo;
        }
        return "dummy";
    }
}
