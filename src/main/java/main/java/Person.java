package main.java;

public class Person {
    private int tickets;
    private String name;
    private String surName;

    public Person(String name, String surName, int tickets) {
        this.name = name;
        this.surName = surName;
        this.tickets = tickets;
    }

    public int useTicket() {
        tickets = tickets - 1;
        return tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}




