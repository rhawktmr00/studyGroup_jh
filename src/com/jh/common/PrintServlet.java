package com.jh.common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrintServlet")
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrintServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.getWriter().append("Served at: ").append(request.getContextPath());
      request.setCharacterEncoding("utf-8");
      String a = (String) request.getAttribute("message");
      request.setAttribute("message", a);
      request.getRequestDispatcher("print.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
