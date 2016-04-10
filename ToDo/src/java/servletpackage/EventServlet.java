/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
@WebServlet(name = "EventServlet", urlPatterns = {"/EventServlet"})
public class EventServlet extends HttpServlet {

    //String username;
    //String password;
    String date;
    String month;
    String year;
    String event;
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
            out.println("<title>Servlet EventServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EventServlet at " + request.getContextPath() + "</h1>");
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

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
            //username=request.getParameter("username");
            //password=request.getParameter("password");
            date=request.getParameter("date");
            month=request.getParameter("month");
            year=request.getParameter("year");
            event=request.getParameter("event");
            //java.sql.date.SimpleDateFormat df=new SimpleDateFormat(yyyy-mm-dd);
            //java.sql.Date date=null;
           // DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
            //d=df.parse(c_date1);
            st.executeUpdate("insert into eventtable values('"+LoginServlet.username+"',"+"'"+LoginServlet.password+"',"+"'"+event+"',"+"'"+date+"',"+"'"+month+"',"+"'"+year+"')");
            out.print("<h1>Your Event is created...</h1>");
            out.print("<a href=home.jsp>Home</a>");
            
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
