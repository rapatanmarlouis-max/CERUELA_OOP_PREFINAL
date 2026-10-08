/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Sedan {
    private double dailyRate;
    private double insuranceFee;

    public Sedan(String vehicleID, String brand, String model,
                 int year, int rentalDays,
                 double dailyRate, double insuranceFee) {

        super(vehicleID, brand, model, year, rentalDays);

        this.dailyRate = dailyRate;
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateRentalFee() {
        return (getRentalDays() * dailyRate) + insuranceFee;
    }

    public void displayVehicleType() {
        System.out.println("Vehicle Type  : Sedan");
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
}

