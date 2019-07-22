package com.jh.decoratePattern01.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jh.decoratePattern01.OrderDatas;
import com.jh.common.LogicClass;

/**
 * Servlet implementation class StarbuckEx01
 */
@WebServlet("/StarbuckServlet")
public class StarbuckEx01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StarbuckEx01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("decoratePattern01/starbuckEx.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  request.setCharacterEncoding("utf-8");
      String coffeeMenu = request.getParameter("coffeeMenu");
      
      String[] toppringMenues = request.getParameterValues("ToppingMenues");
      OrderDatas orderDatas = new OrderDatas();
      orderDatas.setCoffee(coffeeMenu);
      
      if(null != toppringMenues ){
            ArrayList<String> toppingList = new ArrayList<>();
            for (String topping : toppringMenues) {
                toppingList.add(topping);
            }
            orderDatas.setToppings(toppingList);
      }
      
      LogicClass logicClass = new LogicStarbuckClass();
      
      String printValue = logicClass.excute(orderDatas);
      
      request.setAttribute("message", printValue);
      request.getRequestDispatcher("PrintServlet").forward(request, response);
	}

}
