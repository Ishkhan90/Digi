package plane;

import java.util.Objects;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private  int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;
//getterSetter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>=1903 && year<=2023)
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours>=0 && hours<=10000)
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(String military)
    {if (Objects.equals(military, "military"))
        this.military = true;
        else
            this.military=false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight>=10000 && weight<=160000)
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan>=10 && wingspan<=45)
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed>=0 && topSpeed<=1000)
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats>=0)
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost>=0)
        this.cost = cost;
    }
    public void printInfo(){
        System.out.println("model "+this.model);
        System.out.println("country "+this.country);
        System.out.println("year "+this.year);
        System.out.println("hours "+this.hours);
        System.out.println("military "+this.military);
        System.out.println("weight "+this.weight);
        System.out.println("wingspan "+this.wingspan);
        System.out.println("topSpeed "+this.topSpeed);
        System.out.println("seats "+this.seats);
        System.out.println("cost "+this.cost);
    }
}
