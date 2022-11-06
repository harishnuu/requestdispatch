import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ValidateServlet extends HttpServlet
{ public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,
ServletException
{ res.setContentType("text/html");
PrintWriter out=res.getWriter();
String username=req.getParameter("un");
String password=req.getParameter("pw");
if(password.equals("Servlet"))
{
req.setAttribute("s1username",username);
req.setAttribute("s1password",password);
RequestDispatcher rd= req.getRequestDispatcher("/WelcomeServlet");
rd.forward(req, res);
}
else
{
out.print("Incorrect password");
RequestDispatcher rd= req.getRequestDispatcher("/index.html");
rd.include(req, res);
}
}
}