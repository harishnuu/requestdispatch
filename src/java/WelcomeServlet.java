import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,
IOException
{
res.setContentType("text/html");
try (PrintWriter out = res.getWriter()) {
String s2username = (String)req.getAttribute("s1username");
String s2password = (String)req.getAttribute("s2password");
out.println("Welcome "+s2username);
}
} 
}
