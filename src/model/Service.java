package model;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Service {
    private String name;
    private double price;
    private String providerCompany;
    private boolean riskCover;

    Service(){
        name = "New Service";
        price = 0.0;
        providerCompany = "New Provider";
        riskCover = false;
    }

    /**
     * GETTER / SETTER
     */

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getProviderCompany(){
        return providerCompany;
    }
    public boolean isRiskCover(){
        return riskCover;
    }

    public void setName(String Name){
        name = Name;
    }
    public void setPrice(double Price){
        price = Price;
    }
    public void setProviderCompany(String Provider){
        providerCompany = Provider;
    }
    public void setRiskCover(boolean Risk){
        riskCover = Risk;
    }
}