package com.example.hotel;

public class HouseKeeping implements HotelService {
    @Override
    public String serviceName() {
        return "HouseKeeping Service";
    }

    public void cleanRoom(int roomNumber) {
        System.out.printf("[HouseKeeping] Cleaning room %d... completed.%n", roomNumber);
    }
}
