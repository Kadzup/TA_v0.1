package model;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Country {
    public static String name;
    public static long population;
    public static double area;
    public static String capital;

    Country(){
        name = "CountryName";
        population = 100000;
        area = 767676;
        capital = "Capital City";
    }

    /**
     * GETTER / SETTER
     */

    public String getName(){
        return name;
    }
    public long getPopulation(){
        return population;
    }
    public double getArea(){
        return area;
    }
    public String getCapital(){
        return capital;
    }

    public void setName(String Name){
        name = Name;
    }
    public void setPopulation(long Population){
        population = Population;
    }
    public void setArea(double Area){
        area = Area;
    }
    public void setCapital(String Capital){
        capital = Capital;
    }



    public String getInfo(){
        return (
                "Name: " + name +
                ", Capital: " + capital +
                "\nArea: " + area +
                "\nPopulation: " + population
                );
    }
    public String getCountry(){
        return (name+", "+capital);
    }
}