/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *This class is a Utility class for the new JDK 8+ 
 * it contains 5 methods 2 that use a date to create a String 2 that use a string to create a date object
 * it also contains a method to add or subtract hours from a date.
 * @author Adam
 */
public class DateUtilityNew {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M-d-yyyy HH:mm");
    LocalDate date = null;
    LocalDateTime dateTime = null;
    String stringDate = null;
    String stringDateFormatted = null;

    /**
     * This Method takes a String that is passed into it in the format of
     * month-day-year Hours:Minutes and parses it to a Date Time object
     *
     * @param string
     * @return
     */
    private LocalDateTime StringToDateTime(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("String input can not be null");
        }
        LocalDateTime dateTime = LocalDateTime.parse(string, formatter);
        return dateTime;
    }

    /**
     * This Method takes a String that is passed into it in the format of
     * month-day-year and parses it to a Date object
     *
     * @param string
     * @return
     */
    private LocalDate StringToDate(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("String input can not be null");
        }
        LocalDate date = LocalDate.parse(string, formatter);
        return date;
    }

    /**
     * This Method takes a LocalDateTime Object that is passed into it in the
     * format of month-day-year Hours:Minutes and parses it to a string
     *
     * @param dateTime
     * @return
     */
    private String DateTimeToString(LocalDateTime dateTime) throws IllegalArgumentException {
        if (dateTime == null) {
            throw new IllegalArgumentException("String input can not be null");
        }
        try {
            DateTimeFormatter stringDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            stringDateFormatted = stringDate.format(dateTime);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sorry That date is not acceptable");
        }
        return stringDateFormatted;
    }

    /**
     * This Method takes a LocalDate Object that is passed into it in the format
     * of month-day-year and parses it to a string
     *
     * @param date
     * @return
     */
    private String DateToString(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("String input can not be null");
        }
        try {
            DateTimeFormatter stringDate = DateTimeFormatter.ISO_LOCAL_DATE;
            stringDateFormatted = stringDate.format(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sorry That date is not acceptable");
        }
        return stringDateFormatted;
    }

    /**
     * This Method takes a date and adds hour an input amount of hours to that
     * date then displays the new date.
     *
     * @param hours
     * @param hoursToAdd
     * @return
     */
    private LocalDateTime addHours(LocalDateTime hours, long hoursToAdd) {
        if (hours == null) {
            throw new IllegalArgumentException("String input can not be null");
        }
        try {

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Sorry That date is not acceptable");
        }
        return hours.plusHours(hoursToAdd);
    }

    public static void main(String[] args) {
        DateUtilityNew date = new DateUtilityNew();
        System.out.println(date.StringToDate("04-19-2008 12:30"));
        System.out.println("");
        System.out.println(date.StringToDateTime("04-17-2008 12:30"));
        System.out.println("");
        System.out.println(date.DateTimeToString(LocalDateTime.now()));
        System.out.println("");
        System.out.println(date.DateToString(LocalDate.now()));
        System.out.println("");
        System.out.println(date.addHours(LocalDateTime.now(), 5));

    }
}
