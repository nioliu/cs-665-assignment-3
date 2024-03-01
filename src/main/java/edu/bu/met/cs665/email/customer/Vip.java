package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.templates.VipEmail;

public class Vip extends Customer {
    public Vip() {
        super.emailTemplate = new VipEmail();
    }
}
