package com.amir.se.loose;

public class Travel implements TravelInterface {
    private Transport transport;


    public Travel(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void start() {
        transport.start();
    }
}
