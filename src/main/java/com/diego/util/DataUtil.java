/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author diego
 */
public class DataUtil {
    
    public static Date convertDate(String input){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(input);
        } catch (ParseException e) {
            return null;
        }
    }
    
    public static String formatDateToString(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
    
    public static Boolean validateDate(String input){
        return Objects.isNull(convertDate(input));
    }
    
}
