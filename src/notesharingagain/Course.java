/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

/**
 *
 * @author Owner
 */
public class Course {

    int SNo;
    String course;
    String description;

    Course(int s,String c, String des) {
        SNo=s;
        course = c;
        description = des;
    }

    Object getMember(int i) {
        switch (i) {
            case 0:
                return this.SNo;
            case 1:
                return this.course;
            case 2:
                return this.description;

        }
        return "dummy";
    }
}
