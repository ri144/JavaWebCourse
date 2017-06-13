

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchSublet
 */
@WebServlet("/SearchSublet")
public class SearchSublet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchSublet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		DBconnect d = new DBconnect("myNewDB");
		String nextURL = "/results.jsp";
		String custId = request.getParameter("lName");
		ArrayList<ArrayList<String>> results = d.getData("customers", "LastName", custId, "FullName", "Title", "Company", "Position", "StreetAddress", 
				"ZipCode", "State", "City", "EmailAddress");
		String msg = "";//Customer.fetchCustomer(custId, new Scanner(System.in));
		
		System.out.printf("%s\n", results.get(0).get(0));
		for(int i = 0; i<results.size();i++){
			msg += results.get(i).get(1) + " " + results.get(i).get(0) + "<br>" + results.get(i).get(4) + "<br>" + results.get(i).get(7) + ", " + results.get(i).get(6)
					+ " " + results.get(i).get(5) + "<br>" + results.get(i).get(8) + "<br>" + results.get(i).get(3) + " at " + results.get(i).get(2) + "<br><br>";
		}
		request.setAttribute("message", msg);
		
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
		
		
	}
	/*"Customer Number: 9
	Mr. Robert Dupree
	4101 Pickens Way
	Longview, TX 75601
	RobertODupree@einrot.com
	Mapping technician at Irving's Sporting Goods"*/
	
}
