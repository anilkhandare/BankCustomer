package com.bank.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete-customer")
public class DeleteCustomer extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cust_id=Integer.parseInt(req.getParameter("cust_id"));
        CustomeDao.deleteCustomer(cust_id);		
		resp.sendRedirect("customer-list");
	}

}
