package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.templates.BusinessEmail;
import edu.bu.met.cs665.email.templates.FrequentEmail;

public class Frequent extends Customer {
    public Frequent() {
        super.emailTemplate = new FrequentEmail();
    }
}
