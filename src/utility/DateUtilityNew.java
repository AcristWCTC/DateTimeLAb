/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Adam
 */
public class DateUtilityNew {
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M-d-yyyy H:mm");

    /**
     * This Method takes a String that is passed into it in the format of month-day-year Hours:Minutes
     * and parses it to a Date Time object
     * @param string
     * @return 
     */
public LocalDateTime StringToDateTime(String string){
    LocalDateTime dateTime = LocalDateTime.parse(string, formatter);
    return dateTime;
   }

    /**
     * This Method takes a String that is passed into it in the format of month-day-year
     * and parses it to a Date object
     * @param string
     * @return 
     */
public LocalDate StringToDate(String string){
    LocalDate date = LocalDate.parse(string, formatter);
    return date;
   }


/**
 * This Method takes a LocalDateTime Object that is passed into it in the format of month-day-year Hours:Minutes
 * and parses it to a string
 * @param dateTime
 * @return 
 */
public String DateTimeToString(LocalDateTime dateTime){
    DateTimeFormatter stringDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    return stringDate.format(dateTime);
}


/**
 * This Method takes a LocalDate Object that is passed into it in the format of month-day-year
 * and parses it to a string
 * @param date
 * @return 
 */
public String DateToString(LocalDate date){
    DateTimeFormatter stringDate = DateTimeFormatter.ISO_LOCAL_DATE;
    return stringDate.format(date);
}


/**
 * This Method takes a date and adds hour an input amount of hours to that date then displays the new date.
 * @param hours
 * @param hoursToAdd
 * @return 
 */
   public LocalDateTime addHours(LocalDateTime hours,long hoursToAdd){
       return hours.plusHours(hoursToAdd);
   }


    public static void main(String[] args) {
        DateUtilityNew date = new DateUtilityNew();
        System.out.println(date.StringToDate("04-19-2008 12:30"));
        System.out.println(date.StringToDateTime("04-17-2008 12:30"));
        System.out.println(date.DateTimeToString(LocalDateTime.now()));
        System.out.println(date.DateToString(LocalDate.now()));
        System.out.println(date.addHours(LocalDateTime.now(), 5));

    }
        }