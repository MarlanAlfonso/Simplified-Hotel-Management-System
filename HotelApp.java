package com.example.hotel;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Guest A checks in with a vehicle and needs 1 cart
        frontDesk.checkInGuest("Alice Reyes", 101, "ABC-1234", 1);

        // Guest B checks in without a vehicle and doesn't need cart
        frontDesk.checkInGuest("Ben Cruz", 202, "", 0);

        // Housekeeping request during stay
        frontDesk.requestHouseKeeping(101);

        // Guest A checks out - ask valet to pick up vehicle
        frontDesk.checkOutGuest("Alice Reyes", 101, "ABC-1234");

        // Guest B checks out - no vehicle
        frontDesk.checkOutGuest("Ben Cruz", 202, null);

        frontDesk.requestCart(2);
    }
}
