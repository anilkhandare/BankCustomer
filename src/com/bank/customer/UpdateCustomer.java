package com.bank.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get-customer")
public class UpdateCustomer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h2> Update Customer</h2>");
		int cust_id = Integer.parseInt(req.getParameter("cust_id"));
		Customer cust=CustomeDao.getCustomerById(cust_id);
		out.print("<html>");
		out.print("<body>");
        out.print("<center>");
		out.print("<form action='editcustomer' method='post'>");
		out.print("<table>");

		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='hidden' name='cust_id' value='"+cust.getCust_id()+"'/>");
		out.print("</td>");

		out.print("</tr>");

		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='text' name='cust_name' value='"+cust.getCust_name()+"'/>");
		out.print("</td>");

		out.print("</tr>");

		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='text' name='cust_contact' value='"+cust.getCust_contact()+"'/>");
		out.print("</td>");

		out.print("</tr>");
		
		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='text' name='cust_email' value='"+cust.getCust_email()+"'/>");
		out.print("</td>");

		out.print("</tr>");
		
		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='text' name='cust_address1' value='"+cust.getCust_address1()+"'/>");
		out.print("</td>");

		out.print("</tr>");

		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='text' name='cust_address2' value='"+cust.getCust_address2()+"'/>");
		out.print("</td>");

		out.print("</tr>");
		out.print("<tr>");

		out.print("<td>");

		out.print("</td>");

		out.print("<td>");
		out.print("<input type='text' name='account_number' value='"+cust.getAccount_number()+"'/>");
		out.print("</td>");

		out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");

		out.print("</td>");
        out.print("<td>");
        out.print("<input type='submit' value='Edit Customer'/>");
        out.print("</td>");
        
        out.print("</tr>");
		out.print("</table>");
		out.print("</form>");
        out.print("<center>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
