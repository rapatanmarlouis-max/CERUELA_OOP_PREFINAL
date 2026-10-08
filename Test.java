/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Test {
     // Display program header
    public static void displayHeader() {
        System.out.println("==================================================");
        System.out.println("       DINA AND GAT RENT A RIDE SERVICE");
        System.out.println("             VEHICLE RENTAL SYSTEM");
        System.out.println("==================================================");
        System.out.println();
    }

    // Display individual vehicle
    public static void displayVehicle(Vehicle vehicle) {

        vehicle.displayVehicleInfo();

        if (vehicle instanceof Sedan) {
            ((Sedan) vehicle).displayVehicleType();
        } 
        else if (vehicle instanceof Van) {
            ((Van) vehicle).displayVehicleType();
        } 
        else if (vehicle instanceof Motorcycle) {
            ((Motorcycle) vehicle).displayVehicleType();
        }

        System.out.printf("Rental Fee    : PHP %,.2f%n",
                vehicle.calculateRentalFee());

        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    // Display summary
    public static void displaySummary(Vehicle[] vehicles) {

        double totalRentalFees = 0;

        for (Vehicle vehicle : vehicles) {
            totalRentalFees += vehicle.calculateRentalFee();
        }

        System.out.println("==================================================");
        System.out.println("Total Vehicles: " + Vehicle.getVehicleCount());
        System.out.printf("Total Rental Fees: PHP %,.2f%n",
                totalRentalFees);
        System.out.println("==================================================");
    }

    public static void main(String[] args) {

        displayHeader();

        // Create Sedan
        Sedan sedan = new Sedan(
                "SD001",
                "Toyota",
                "Vios",
                2024,
                3,
                1500.00,
                500.00
        );

        // Create Van
        Van van = new Van(
                "VN001",
                "Toyota",
                "HiAce",
                2023,
                2,
                3000.00,
                1000.00
        );

        // Create Motorcycle
        Motorcycle motorcycle = new Motorcycle(
                "MC001",
                "Honda",
                "Click 160",
                2024,
                4,
                600.00,
                200.00
        );

        // Vehicle array
        Vehicle[] vehicles = {
            sedan,
            van,
            motorcycle
        };

        // Display all vehicles
        for (Vehicle vehicle : vehicles) {
            displayVehicle(vehicle);
        }

        // Display summary
        displaySummary(vehicles);
    }
}

