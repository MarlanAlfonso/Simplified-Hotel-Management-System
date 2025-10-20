package com.example.hotel;

public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void checkInGuest(String guestName, int roomNumber, String plateNumber, int cartsNeeded) {
        System.out.printf("%n[FrontDesk] Checking in guest '%s' to room %d.%n", guestName, roomNumber);
        if (plateNumber != null && !plateNumber.isBlank()) {
            valet.parkVehicle(plateNumber);
        }
        if (cartsNeeded > 0) {
            cart.requestCart(cartsNeeded);
        }
        System.out.printf("[FrontDesk] Check-in completed for %s.%n", guestName);
    }

    public void checkOutGuest(String guestName, int roomNumber, String plateNumber) {
        System.out.printf("%n[FrontDesk] Checking out guest '%s' from room %d.%n", guestName, roomNumber);
        houseKeeping.cleanRoom(roomNumber);
        if (plateNumber != null && !plateNumber.isBlank()) {
            valet.pickUpVehicle(plateNumber);
        }
        System.out.printf("[FrontDesk] Check-out completed for %s.%n", guestName);
    }

    public void requestValetPickUp(String plateNumber) {
        System.out.printf("%n[FrontDesk] Requesting valet pick-up for %s.%n", plateNumber);
        valet.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeeping(int roomNumber) {
        System.out.printf("%n[FrontDesk] Requesting housekeeping for room %d.%n", roomNumber);
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        System.out.printf("%n[FrontDesk] Requesting %d cart(s).%n", numberOfCarts);
        cart.requestCart(numberOfCarts);
    }
}
