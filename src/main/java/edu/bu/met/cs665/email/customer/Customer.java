package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.templates.Default;
import edu.bu.met.cs665.email.templates.EmailTemplate;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/1 11:42
 * File Name: Customer.java
 * Description: customers template
 */

public class Customer {
    protected EmailTemplate emailTemplate;

    public String getEmailTemplate() {
        if (emailTemplate == null) {
            return new Default().Template();
        } else {
            return emailTemplate.Template();
        }
    }
}

