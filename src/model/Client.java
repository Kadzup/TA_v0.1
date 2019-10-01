package model;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.time.*;

public class Client {
    public static String fName;
    public static String lName;

    public static LocalDate bDay;

    public static String paymentInfo;

    public static String phone;
    public static String email;


    Client(){
        fName = "First";
        lName = "Last";

        bDay = LocalDate.of(2000, 01, 01);

        paymentInfo = "4174901952902378";

        phone = "+380-50-00-0000";
        email = "mail@email.com";
    }


    /**
     *  GETTERS / SETTERS   begin
     */
    public static String getfName() {
        return fName;
    }

    public static String getlName() {
        return lName;
    }

    public static LocalDate getbDay() {
        return bDay;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPhone() {
        return phone;
    }

    public static String getPaymentInfo() {
        return paymentInfo;
    }

    public static void setbDay(LocalDate bDay) {
        Client.bDay = bDay;
    }

    public static void setEmail(String email) {
        Client.email = email;
    }

    public static void setfName(String fName) {
        Client.fName = fName;
    }

    public static void setlName(String lName) {
        Client.lName = lName;
    }

    public static void setPaymentInfo(String paymentInfo) {
        Client.paymentInfo = paymentInfo;
    }

    public static void setPhone(String phone) {
        Client.phone = phone;
    }
    /**
     *  GETTERS / SETTERS end
     */



    public String getFullName(){
        return (getfName()+" "+getlName());
    }
    public String getClientContact(){
        return("Client: "+getFullName()+"\nContact: " + getPhone() + ", " + getEmail());
    }
}
