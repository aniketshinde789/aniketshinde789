

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String Firstname=request.getParameter("Fname");
		String Lastname=request.getParameter("Lname");
		String Email=request.getParameter("email");
		String Number=request.getParameter("phone");
		String Gender=request.getParameter("gender");
		String Department=request.getParameter("department");
		
	
		String Date=request.getParameter("dob");
		
		pw.println("<body style=font-size:20px; background-color:DarkSlatePink;>");
		
		pw.println("<h2 style=background-color:Darkcyan;color:white;text-align:center;>Employee Information</h2>");
		pw.println("<center>");
		
		pw.println("<table style=border:outset;height:400px;width:800;background-color:power Blue;text-align:center");
		
		pw.println("<tr style=border:2px;>");
		pw.println("<td style=border:2px;background-color:white;>Employee Name: </td>");
		pw.println("<td style=border:2px;background-color:white;>" +Firstname+"  "+Lastname+ "</td>");
		pw.println("</tr>");
		
		pw.println("<tr style=border:2px;>");
		pw.println("<td style=border:2px;background-color:white;>Email Id: </td>");
		pw.println("<td style=border:2px;background-color:white;>" +Email + "</td>");
		pw.println("</tr>");
		
		pw.println("<tr style=border:2px;>");
		pw.println("<td style=border:2px;background-color:white;>Phone Number: </td>");
		pw.println("<td style=border:2px;background-color:white;>" +Number + "</td>");
		pw.println("</tr>");
		
		pw.println("<tr style=border:2px;>");
		pw.println("<td style=border:2px;background-color:white;>Gender: </td>");
		pw.println("<td style=border:2px;background-color:white;>" +Gender + "</td>");
		pw.println("</tr>");
		
		pw.println("<tr style=border:2px;>");
		pw.println("<td style=border:2px;background-color:white;>Department: </td>");
		pw.println("<td style=border:2px;background-color:white;>" +Department + "</td>");
		pw.println("</tr>");
	
		pw.println("<tr style=border:2px;>");
		pw.println("<td style=border:2px;background-color:white;>Date: </td>");
		pw.println("<td style=border:2px;background-color:white;>" +Date + "</td>");
		pw.println("</tr>");
		
		pw.println("</table>");
		pw.println("</center>");
		pw.println("</body>");
		pw.close();
		

		

	}

}
