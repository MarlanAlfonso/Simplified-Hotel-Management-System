package com.example.hotel;

public class Cart implements HotelService {
    @Override
    public String serviceName() {
        return "Cart Service";
    }

    public void requestCart(int numberOfCarts) {
        System.out.printf("[Cart] Requesting %d luggage cart(s)... delivered.%n", numberOfCarts);
    }
}
