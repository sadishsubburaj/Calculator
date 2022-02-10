package com.serve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Operations;

public class ServletHome extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse response) {
		PrintWriter pw = null;
		int result = 0;
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int operations = Integer.parseInt(req.getParameter("operation"));
		Operations op = new Operations();
		try {
			pw = response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		switch(operations) {
		case 1 : result = op.add(num1, num2);
		         break;
		case 2 : result = op.sub(num1, num2);
        		 break;
		case 3 : result = op.multiply(num1, num2);
        		 break;
		case 4 : result = op.div(num1, num2);
         	     break;	
		}
		pw.println("The result is:");
		pw.println(result);
	}

}
