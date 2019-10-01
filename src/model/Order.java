package model;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.time.*;

public class Order {
    public static LocalDate departure;
    public static LocalDate arrival;

    public static Client client;
    public static Tour tour;
    public static float price;

    /**
     *  GETTERS / SETTERS begin
     */
    public static Client getClient() {
        return client;
    }

    public static float getPrice() {
        return price;
    }

    public static LocalDate getArrival() {
        return arrival;
    }

    public static LocalDate getDeparture() {
        return departure;
    }

    public static Tour getTour() {
        return tour;
    }

    public static void setArrival(LocalDate arrival) {
        Order.arrival = arrival;
    }

    public static void setClient(Client client) {
        Order.client = client;
    }

    public static void setDeparture(LocalDate departure) {
        Order.departure = departure;
    }

    public static void setPrice(float price) {
        Order.price = price;
    }

    public static void setTour(Tour tour) {
        Order.tour = tour;
    }
    /**
     *  GETTERS / SETTERS end
     */

}

