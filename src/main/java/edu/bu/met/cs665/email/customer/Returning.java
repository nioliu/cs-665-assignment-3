package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.templates.NewEmail;
import edu.bu.met.cs665.email.templates.ReturningEmail;

public class Returning extends Customer {
    public Returning() {
        super.emailTemplate = new ReturningEmail();
    }
}
