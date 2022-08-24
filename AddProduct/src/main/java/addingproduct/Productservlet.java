package addingproduct;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class StudentDAO
 */
@WebServlet("/Productservlet")
public class Productservlet extends HttpServlet {
private static final long serialVersionUID = 1L;


protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

// reading form values
int price = Integer.parseInt(request.getParameter("txtprice"));
String name = request.getParameter("txtname");
// put values in Object
product p = new product();
p.setPrice(price);
p.setName(name);

SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();
int i = (Integer) session.save(p);
session.getTransaction().commit();

session.close();

PrintWriter out = response.getWriter();
if (i > 0)
out.println("Record inserted");
else
out.println("Record not inserted");

}

}

