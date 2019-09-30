package model;
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

    public static String buildLocation(){
        return(name+", "+rating+", "+address+", "+phone+", "+available);
    }
}
