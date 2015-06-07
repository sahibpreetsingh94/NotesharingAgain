/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import java.util.Date;

/**
 *
 * @author Sahib
 */
public class Notes {

    int noteid;
    String title, description, type;
    Date d;

    Notes(int noteid, String title, String description, String type, Date d) {
        this.noteid = noteid;
        this.description = description;
        this.title = title;
        this.type = type;
        this.d = d;
    }

    Object getMember(int i) {
        switch (i) {
            case 0:
                return this.noteid;
            case 1:
                return this.title;
            case 2:
                return this.description;
            case 3:
                return this.type;
            case 4:
                return this.d;
        }
        return "dummy";
    }
}