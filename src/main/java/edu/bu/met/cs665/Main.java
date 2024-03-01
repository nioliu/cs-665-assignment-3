package edu.bu.met.cs665;


import edu.bu.met.cs665.email.customer.New;

public class Main {
    public static void main(String[] args) {
        New aNew = new New();
        System.out.println(aNew.getEmailTemplate());
    }
}
