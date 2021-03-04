package com.company;

public class Passenger {
    private int id;
    private static int idCounter=0;
    private Address address;
    private Contact contact;

    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id=++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    private static class Address {
        public String street;
        public String city;
        public String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public void updateAddressDetails(String addressDetail){

        }

    }
    private static class Contact {
        public String name;
        public String phone;
        public String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }


        public void updateContactDetails(String contactDetail){

        }
    }
    public String getAddressDetails(){

        return("Street: "+address.street+" City: "+address.city+" State: "+address.state);
    }
    public String getContactDetails(){
        return ("Name: "+contact.name+" Phone: "+contact.phone+" email: "+contact.email);
    }
    public int getPassengerCount(){
        return idCounter;
    }
}
