package feedback;

import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FeedbackServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enroll=request.getParameter("enroll");
		String name=request.getParameter("name");
		String branch=request.getParameter("branch");
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		String page="";
		
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CBA27","root","Hm_100298");
	
	PreparedStatement ps=con.prepareStatement("insert into feedback values('"+enroll+"','"+name+"','"+branch+"','"+subject+"','"+message+"')");
	System.out.println("conncted");
	int i=ps.executeUpdate();
	//i can be 0 or 1
	if(i!=0)
	{
		page="feedback.jsp?msg=success";
	}
	else
	{
		page="feedback.jsp?msg=failed";
	}}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}
	
}
