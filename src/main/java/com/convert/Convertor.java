package com.convert;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Convertor  extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String Euro = req.getParameter("EURO");
		String Lei = req.getParameter("ron");
		
		int a= Integer.parseInt(Euro);
		int b = Integer.parseInt(Lei);
		req.setAttribute("nrEuro", b/a);

		
		req.getRequestDispatcher("afisare.jsp").forward(req, res);

		
	}

	
}