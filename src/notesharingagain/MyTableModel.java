/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sahib
 */
public class MyTableModel extends AbstractTableModel {

    ArrayList<Object> al;
    Field f[];
    ArrayList<String> fields;

    public MyTableModel(ArrayList<Object> al) {
        this.al = al;
        //for (int i = 0; i < al.size(); i++) {
        ;
        //}
        String classtype = al.get(0).getClass().toString();
        String classtype_substring = classtype.substring(classtype.indexOf(".") + 1);
        f = al.get(0).getClass().getDeclaredFields();
        fields = new ArrayList<String>();
        for (int k = 0; k < f.length; k++) {
            String s = f[k].toString();
            fields.add(s.substring(s.indexOf(classtype_substring) + classtype_substring.length() + 1));
        }
    }

    @Override
    public int getRowCount() {
        return al.size();
    }

    @Override
    public int getColumnCount() {
        return al.get(0).getClass().getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        Object o = al.get(i);
        String type = al.get(i).getClass().toString().substring(23);
        switch (type) {
            case "Department":
                Department o1 = (Department) o;
                for (int k = 0; k < f.length; k++) {
                    if (j == k) {
                        return o1.getMember(j);
                    }
                }
                break;
            case "Faculty":
                Faculty o2 = (Faculty) o;
                for (int k = 0; k < f.length; k++) {
                    if (j == k) {
                        return o2.getMember(j);
                    }
                }
                break;
        }

        return "dummy";
    }

    @Override
    public String getColumnName(int i) {
        return fields.get(i);
    }

}
