import java.io.*;
import java.lang.*;
import java.util.*;

public class Location {
    private static int country_id;
    private static String name;
    private static float rating;
    private static String address;
    private static String phone;
    private static Boolean available;

    public static String buildLocation(){
        return this->name+", "+this->rating+", "+this->address+", "+this->phone+", "+this->available;
    }
    Location(){
        name = "none";
        rating = 0.0f;
        address = "none st."
        phone = "none";
        available = false;
    }
}
