package com.example.hotel;

public class Valet implements HotelService {
    @Override
    public String serviceName() {
        return "Valet Service";
    }

    public void parkVehicle(String plateNumber) {
        System.out.printf("[Valet] Parking vehicle with plate %s... done.%n", plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.printf("[Valet] Retrieving vehicle with plate %s... ready for guest.%n", plateNumber);
    }
}
