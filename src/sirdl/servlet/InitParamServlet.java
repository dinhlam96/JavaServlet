package sirdl.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
	
	private static final long serialVesionUID = 1L;
	private String emailSupport1;
	
	public InitParamServlet(){
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.emailSupport1 = config.getInitParameter("emailSupport1");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");
		
		ServletOutputStream out = resp.getOutputStream();
		
		out.println("<html>");
		out.println("<head><title> Init Param</title></head>");
		out.println("<body>");
		out.println("<h3>Init Param</h3>");
		out.println("<p>emailSupport1 =" + emailSupport1+"</p>");
		out.println("<p>emailSupport2 ="+ emailSupport2+"</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
