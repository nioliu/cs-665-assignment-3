package edu.bu.met.cs665.email.templates;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/1 10:51
 * File Name: EmailTemplate.java
 * Description: define the basic interface of email template
 * Apply Factory pattern
 */
public abstract class EmailTemplate {
    // return the real template for current customer
    public String Template() {
        return "This is default template";
    }
}
