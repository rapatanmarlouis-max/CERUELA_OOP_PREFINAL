/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vechiclerentaldays;

/**
 *
 * @author User
 */
public class VechicleRentalDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public abstract class Vehicle {

    private String vehicleID;
    private String brand;
    private String model;
    private int year;
    private int rentalDays;

    private static int vehicleCount = 0;

    // Default constructor
    public Vehicle() {
        vehicleCount++;
    }

    // Parameterized constructor
    public Vehicle(String vehicleID, String brand, String model,
                   int year, int rentalDays) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalDays = rentalDays;

        vehicleCount++;
    }

    // Getters and Setters
    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Abstract method
    public abstract double calculateRentalFee();

    // Regular method
    public void displayVehicleInfo() {
        System.out.println("Vehicle ID    : " + vehicleID);
        System.out.println("Brand         : " + brand);
        System.out.println("Model         : " + model);
        System.out.println("Year          : " + year);
        System.out.println("Rental Days   : " + rentalDays);
    }

    // Method overloading
    public void displayVehicleInfo(boolean showRentalFee) {
        displayVehicleInfo();

        if (showRentalFee) {
            System.out.printf("Rental Fee    : PHP %,.2f%n",
                    calculateRentalFee());
        }
    }

    // Static method
    public static int getVehicleCount() {
        return vehicleCount;
    }
}

