package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.OTTFormDAO;
import model.dto.OTTFormDTO;


@WebServlet("/controller")
public class Controller extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("controller");
		request.setCharacterEncoding("utf-8");
		
		String command = request.getParameter("btn");
		if(command.equals("submit")) {
			String result1 = request.getParameter("recommend1");
			String result2 = request.getParameter("recommend2");
			String result3 = request.getParameter("recommend3");
			String result4 = request.getParameter("recommend4");
			System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
			
			OTTFormDTO ottform = OTTFormDTO.builder().ottName(result1).ottReason(result2).ottGenre(result3).ottTime(result4).build();
			
			try {
				OTTFormDAO.addOTTForm(ottform);
				response.sendRedirect("insert.jsp");
			}catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				request.setAttribute("datas", OTTFormDAO.getDatas());
				request.getRequestDispatcher("result.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
