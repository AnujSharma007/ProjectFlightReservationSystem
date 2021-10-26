package com.company;

public class Address {
    String name;
    String state;
    String city;

    public Address(String name, String state, String city) {
        this.name = name;
        this.state = state;
        this.city = city;
    }

    public String Address(){
        String str = "Passenger details"+name+state+city;
        return str;
    }
}
