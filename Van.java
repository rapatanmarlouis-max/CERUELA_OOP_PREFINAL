/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Van {
    private double dailyRate;
    private double driverFee;

    public Van(String vehicleID, String brand, String model,
               int year, int rentalDays,
               double dailyRate, double driverFee) {

        super(vehicleID, brand, model, year, rentalDays);

        this.dailyRate = dailyRate;
        this.driverFee = driverFee;
    }

    @Override
    public double calculateRentalFee() {
        return (getRentalDays() * dailyRate) + driverFee;
    }

    public void displayVehicleType() {
        System.out.println("Vehicle Type  : Van");
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }
}

