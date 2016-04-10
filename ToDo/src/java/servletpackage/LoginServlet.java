/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elcot
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    public static String username;
    public static String password;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
             username=request.getParameter("username");
             password=request.getParameter("password");
            
            out.println(username + "  "+password);
            //doPost(request,response);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            //HttpSession session=request.getSession();
            PrintWriter out=response.getWriter();
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //String myDb="jdbc:derby://localhost:1527/ToDoUser/USERTAB";
            //Connection con=DriverManager.getConnection(myDb,"root","root");
            //Statement st=con.createStatement();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root", "root");
            Statement st = con.createStatement();
            username=request.getParameter("username");
            password=request.getParameter("password");
            //out.println("<input type=\"hidden\" name=\"username\" value=\""+username+"\">");
            //out.println("<input type=\"hidden\" name=\"password\" value=\""+password+"\">");
            //session.setAttribute("username",username);
            //session.setAttribute("password",password);
            boolean result=false;
            ResultSet rs=st.executeQuery("select * from useridpassword where userid='"+username+"'");
            while(rs.next())
            {
                if(rs.getString("userid").equals(username)&&rs.getString("password").equals(password))
                {
                    result=true;
                    response.setContentType("text/javascript");
                    String site = "home.jsp";

                  response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
                    response.setHeader("Location", site);
                    break;
                }
            }
            
            if(!result)
            {
                    out.print("<h1> Hi , "+username+" </h1><br>");
                    out.print("<h2>Your UserName or Password is incorrect...</h2>");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
