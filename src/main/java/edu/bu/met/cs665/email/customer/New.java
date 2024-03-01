package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.templates.BusinessEmail;
import edu.bu.met.cs665.email.templates.NewEmail;

public class New extends Customer {
    public New() {
        super.emailTemplate = new NewEmail();
    }
}
