package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket ticket=new RegularTicket("In123","Patna","Delhi",
                null,"2021-02-23T09:01:02","2021-02-23T11:01:02"
                ,null,"B1",
                5750.00f,false,"lunch");
        /*System.out.println(ticket.getDepartureDateTime());*/
        Passenger passenger=new Passenger(12,"wall street","Patna","Bihar","Sandeep",
                "9802458570","missme247@gmail.com");
        /*System.out.println(ticket.getPassenger());*/
        printTicketDetails(ticket);
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
