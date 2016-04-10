/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elcot
 */
@WebServlet(name = "ViewServlet", urlPatterns = {"/ViewServlet"})
public class ViewServlet extends HttpServlet {

    String date;
    String month;
    String year;
    //String event;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ViewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
            try {
                response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root", "root");
            Statement st = con.createStatement();
            ResultSet rs;
            date=request.getParameter("date");
            month=request.getParameter("month");
            year=request.getParameter("year");
            rs=st.executeQuery("select * from eventtable where userid='"+LoginServlet.username+"'");
             //and password='"+LoginServlet.password+"' and dt='"+date+"' and dy='"+month+"' and year='"+year+"'
            response.setContentType("text/html");
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Servlet ViewServlet</title>");            
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Event Details...</h1>");
            while(rs.next())
            {
            if(rs!=null)
            {
            
            out.print("<h2>The Event is "+rs.getString("event")+"</h2>");
            //Date:"+rs.getInt("dt")+"Month:"+rs.getInt("dy")+"Year:"+rs.getInt("yr")+"
            }
            else
            {
                out.print("<h2>No Events</h2>");
            }
            out.print("<a href=\"home.jsp\">Home</a>");
            out.print("</body>");
            out.print("</html>");
            }
            }
        catch (ClassNotFoundException ex) {
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
