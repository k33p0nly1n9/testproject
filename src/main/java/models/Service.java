/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author bayan
 */
public class Service {
     private int id;
    private String title;
    private double price;


    public Service() {
    }

    public Service(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Service(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
