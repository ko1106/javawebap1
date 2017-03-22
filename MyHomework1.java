

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyHomework1")
public class MyHomework1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("name");
		String num1=request.getParameter("value1");
		String num2=request.getParameter("value2");

		int value1=Integer.parseInt(num1);
		int value2=Integer.parseInt(num2);
		int ans=value1+value2;

		MyHomeworkBean bean=new MyHomeworkBean(name, value1, value2,ans);
		request.setAttribute("plus", bean);

		RequestDispatcher rd=request.getRequestDispatcher("/ShowMyHomeWork1a.jsp");
		rd.forward(request, response);
	}

}
