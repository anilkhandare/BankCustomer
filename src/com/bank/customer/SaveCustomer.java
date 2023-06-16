package com.bank.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savecostumer")
public class SaveCustomer extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		//get data from ui
		int cust_id=Integer.parseInt(req.getParameter("cust_id"));
		String cust_name=req.getParameter("cust_name");
		String cust_email=req.getParameter("cust_email");
		String cust_contact=req.getParameter("cust_contact");
		String cust_address1=req.getParameter("cust_address1");
		String cust_address2=req.getParameter("cust_address2");
		String account_number=req.getParameter("account_number");
		
		Customer cust= new Customer();
		System.out.println("before set the data:"+cust.getAccount_number());
		cust.setCust_id(cust_id);
		cust.setCust_name(cust_name);
		cust.setCust_email(cust_email);
		cust.setCust_contact(cust_contact);
		cust.setCust_address1(cust_address1);
		cust.setCust_address2(cust_address2);
		cust.setAccount_number(account_number);
		System.out.println("after set the data:"+cust.getAccount_number());
		int result=CustomeDao.addCustomer(cust);
		

		
		super.doPost(req, resp);
	}

}
