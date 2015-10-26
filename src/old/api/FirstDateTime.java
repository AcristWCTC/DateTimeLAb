/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old.api;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Adam
 */
public class FirstDateTime {
    public static void main(String[] args) {
        Calendar date2 = Calendar.getInstance();
        date2.set(2050, Calendar.SEPTEMBER, 23);
        date2.add(Calendar.MONTH, -5);
        
        Date date1 = date2.getTime();
        Date date3 = new Date();
        
        long diff = Math.abs(date1.getTime() - date3.getTime());
        long minutes = diff/(1000 * 60);
        System.out.println(minutes);
        
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
        String fDate = sdf.format(date1);
        System.out.println(fDate);
        
        
        String date3String = "Jul 11, 1999";
        try {
           date1 = sdf.parse(date3String);
        } catch(ParseException pe) {
            System.out.println("cannot parse date string");
        }
        String qDate = sdf.format(date1);
        System.out.println(qDate);
        
        
        boolean isAfter = date3.after(date1);
        System.out.println(isAfter);
        
    }
    
}
