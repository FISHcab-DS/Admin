package com.example.fishcab;

public class IO {

    private String driver;
    private String status;
    private String capacity;
    private String location;
    private String customer;

    public IO (String driver, String status, String capacity, String location, String customer) {
        this.driver = driver;
        this.status = status;
        this.capacity = capacity;
        this.location = location;
        this.customer = customer;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String title) {this.driver = driver;}

    public String getStatus() {
        return status;
    }

    public void setStatus(String synopsis) {
        this.status = status;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String date) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String cast) {
        this.location = location;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }


}
