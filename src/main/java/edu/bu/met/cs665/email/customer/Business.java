package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.templates.BusinessEmail;

public class Business extends Customer {
    public Business() {
        super.emailTemplate = new BusinessEmail();
    }
}
