package model;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.time.*;

public class Worker {
    /**
     * First name of Worker
     * */
    private static String fName;
    /**
     * Last name of Worker
     * */
    private static String lName;
    /**
     * Birth date of Worker
     * */
    private static LocalDate bDay;

    /**
     * Information about Worker Salary
     * */
    private static float salary;
    /**
     * Information about Worker Position
     * */
    private static String position;

    /**
     * Information about Worker Address
     * */
    private static  String address;
    /**
     * Information about Worker Phone
     * */
    private static  String phone;

    /**
     * Basic constructor of Worker object
     * */
    Worker(){
        fName = "John";
        lName = "Doe";
        bDay = LocalDate.of(1999,11,12);

        salary = 0.0f;
        position = "Tester";

        address = "Test Hometown";
        phone = "+38(05)08-83-4011";
    }

    /**
     * GETTER / SETTER
     */

    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public LocalDate getBirthDay(){
        return bDay;
    }
    public float getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }

    public void setSalary(float Salary){
        salary = Salary;
    }
    public void setPosition(String Position){
        position = Position;
    }
    public void setAddress(String Address){
        address = Address;
    }
    public  void setPhone(String Phone){
        phone = Phone;
    }



    public int getYear(){
        return this.bDay.getYear();
    }

    public void changeName(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }

    public float calculateSalary(float taxes){
        if(salary-taxes > 0){
            return salary-taxes;
        }
        else{
            return -1;
        }
    }
    public String getInfo(){
        return(
                "First Name: " + fName +
                "\nLast Name:" + lName +
                "\nBirth Day: " + bDay +
                "\nPosition: " + position +
                "\nSalary: " + salary
        );
    }

    public String howToFind(){
        return (
                "Location: " + address+
                "\nContact Phone: " + phone
        );
    }
}
