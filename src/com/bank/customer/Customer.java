package com.bank.customer;

public class Customer {
  int cust_id;
  String cust_name;
  String cust_email;
  String cust_contact;
  String cust_address1;
  String cust_address2;
  String account_number;
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public String getCust_email() {
	return cust_email;
}
public void setCust_email(String cust_email) {
	this.cust_email = cust_email;
}
public String getCust_contact() {
	return cust_contact;
}
public void setCust_contact(String cust_contact) {
	this.cust_contact = cust_contact;
}
public String getCust_address1() {
	return cust_address1;
}
public void setCust_address1(String cust_address1) {
	this.cust_address1 = cust_address1;
}
public String getCust_address2() {
	return cust_address2;
}
public void setCust_address2(String cust_address2) {
	this.cust_address2 = cust_address2;
}
public String getAccount_number() {
	return account_number;
}
public void setAccount_number(String account_number) {
	this.account_number = account_number;
}
@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_email=" + cust_email
			+ ", cust_contact=" + cust_contact + ", cust_address1=" + cust_address1 + ", cust_address2=" + cust_address2
			+ ", account_number=" + account_number + "]";
}
  
  
  
}
