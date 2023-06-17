package com.bank.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer-list")
public class CustomerList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         resp.setContentType("text/html");
         PrintWriter out=resp.getWriter();
         List<Customer> list=CustomeDao.listCustomer();
         System.out.println("list:"+list);
         out.print("<html>");
         
         out.print("<head>");
         
         out.print("<style>");
         out.print("table{ font-family: arial, sans-serif border-collapse: collapse; width: 100%}");
         out.print("td,th{ border: 1px solid #dddddd; text-align: left; padding:8px}");
         out.print("tr:nth-child(even){background-color: #dddddd}");
         out.print("</style>");
         
         out.print("</head>");
         
         out.print("<body>");
         
         out.print("<table>");
         
         out.print("<tr>");
         out.print("<th>");
         out.print("name");
         out.print("</th>");
         out.print("<th>");
         out.print("email");
         out.print("</th>");
         out.print("<th>");
         out.print("contact");
         out.print("</th>");
         out.print("<th>");
         out.print("address1");
         out.print("</th>");
         out.print("<th>");
         out.print("address2");
         out.print("</th>");
         out.print("<th>");
         out.print("acount number");
         out.print("</th>");
         
         out.print("<th>");
         out.print("Edit");
         out.print("</th>");
         
         out.print("<th>");
         out.print("Delete");
         out.print("</th>");
         
         out.print("</tr>");
         for(Customer cust:list){
         out.print("<tr>");
         out.print("<td>");
         out.print(cust.getCust_name());
         out.print("</td>");
         out.print("<td>");
         out.print(cust.getCust_email());
         out.print("</td>");
         
         out.print("<td>");
         out.print(cust.getCust_contact());
         out.print("</td>");
         
         out.print("<td>");
         out.print(cust.getCust_address1());
         out.print("</td>");
         out.print("<td>");
         out.print(cust.getCust_address2());
         out.print("</td>");
         out.print("<td>");
         out.print(cust.getAccount_number());
         out.print("</td>");
         out.print("<td>");
         out.print("<a href='get-customer?cust_id="+cust.getCust_id()+"'>");
         out.print("edit");
         out.print("</a>");
         out.print("</td>");
         out.print("<td>");
         out.print("<a href='delete-customer?cust_id="+cust.getCust_id()+"'>");
         out.print("delete");
         out.print("</a>");
         out.print("</td>");
         out.print("</tr>");
         }
         out.print("</table>");
         out.print("</body>");
         out.print("</html>");
         
         
		
	}
	

}
