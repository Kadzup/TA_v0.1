package model;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Location {
    private static Country country;
    private static String name;
    private static float rating;
    private static String address;
    private static String phone;
    private static Boolean available;

    Location(){
        country = new Country();
        name = "NewLocation";
        rating = 5.0f;
        address = "new street";
        phone = "+380-50-00-0000";
        available = false;
    }

    /**
     * GETTER / SETTER
     */

    public Country getCountry(){
        return country;
    }
    public String getName(){
        return name;
    }
    public float getRating(){
        return rating;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public  Boolean isAvailable(){
        return available;
    }

    public void setCountry(Country _Country){
        country = _Country;
    }
    public void setName(String Name){
        name = Name;
    }
    public void setRating(float Rating){
        rating = Rating;
    }
    public void setAddress(String Address){
        address = Address;
    }
    public void  setPhone(String Phone){
        phone = Phone;
    }
    public void setAvailable(Boolean Available){
        available = Available;
    }


    public String getLocation(){
        return (getCountry().getCountry() + ", " + getName());
    }
    public String getFullAddress(){
        return(getCountry().getCountry() + ", " + getAddress() + ", " + getName());
    }
    public String getInfo(){
        return (
                "Name: " + getName() +
                "\nAddress: " + getCountry().getCountry() + ", " + getAddress() +
                "\nStatus (Available): " + isAvailable() +
                "\nRating: " + getRating() + " stars" +
                "\nPhone: " + getPhone()
                );
    }

}
