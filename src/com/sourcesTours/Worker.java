package com.sourcesTours;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Worker {
    /**
     * First name of com.sourcesTours.Worker
     * */
    private static String f_name;
    /**
     * Second name of com.sourcesTours.Worker
     * */
    private static String s_name;
    /**
     * Birth date of com.sourcesTours.Worker
     * */
    private static Date b_day;

    /**
     * Information about com.sourcesTours.Worker Salary
     * */
    private static float salary;
    /**
     * Information about com.sourcesTours.Worker Position
     * */
    private static String position;

    /**
     * Information about com.sourcesTours.Worker Address
     * */
    private static  String address;
    /**
     * Information about com.sourcesTours.Worker Phone
     * */
    private static  String phone;

    /**
     * Basic constructor of com.sourcesTours.Worker object
     * */
    Worker(){
        f_name = "John";
        s_name = "Doe";
        b_day = new Date(1999,11,12);

        salary = 0.0f;
        position = "Tester";

        address = "Test Hometown";
        phone = "+38(05)08-83-4011";
    }


}
