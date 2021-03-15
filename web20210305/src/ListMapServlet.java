
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class ListMapServlet
 */
@WebServlet("/ListMapServlet")
public class ListMapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListMapServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		Map author1 = new HashMap();
		author1.put("name", "A");
		author1.put("id", new Integer(1));
		list.add(author1);
		Map author2 = new HashMap();
		author2.put("name", "B");
		author2.put("id", new Integer(2));
		list.add(author2);
		Map author3 = new HashMap();
		author3.put("name", "C");
		author3.put("id", new Integer(3));
		list.add(author3);
		request.setAttribute("authors", list);
		RequestDispatcher rd = request.getRequestDispatcher("ELListView.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
