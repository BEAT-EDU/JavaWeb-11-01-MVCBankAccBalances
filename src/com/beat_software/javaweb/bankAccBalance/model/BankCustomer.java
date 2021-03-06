package com.beat_software.javaweb.bankAccBalance.model;

/** Bean to represent a bank customer. Immutable.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

public class BankCustomer {
  private final String id, firstName, lastName;
  private final double balance;

  public BankCustomer(String id,
                      String firstName,
                      String lastName,
                      double balance) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }
  
  public String getId() {
    return id;
  }

  public String getFirstName() {
    return(firstName);
  }

  public String getLastName() {
    return(lastName);
  }

  public double getBalance() {
    return(balance);
  }

  public double getBalanceNoSign() {
    return(Math.abs(balance));
  }
}
  
