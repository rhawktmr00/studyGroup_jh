package com.jh.abstractPattern01.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jh.common.LogicClass;

@WebServlet("/PizzaExServlet01")
public class PizzaExServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PizzaExServlet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.getWriter().append("Served at: ").append(request.getContextPath());
      request.getRequestDispatcher("abstractPattern01/pizzaEx.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("utf-8");
      String inputValue = request.getParameter("menu");
      LogicClass logicClass = new LogicPizzaClass();
      
      String printValue = logicClass.excute(inputValue);
      
      request.setAttribute("message", printValue);
      request.getRequestDispatcher("PrintServlet").forward(request, response);
	}

}
