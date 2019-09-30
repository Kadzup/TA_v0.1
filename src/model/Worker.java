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
     * Second name of Worker
     * */
    private static String sName;
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
        sName = "Doe";
        bDay = LocalDate.of(1999,11,12);

        salary = 0.0f;
        position = "Tester";

        address = "Test Hometown";
        phone = "+38(05)08-83-4011";
    }

}
