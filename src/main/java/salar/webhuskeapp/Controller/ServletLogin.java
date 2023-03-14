package salar.webhuskeapp.Controller;

import salar.webhuskeapp.Controller.Entity.Person;
import salar.webhuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, Person> personMap = Facade.getAllPersons();

        request.setAttribute("personer", personMap);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String navn = request.getParameter("uName");
        String kode = request.getParameter("passW");
        System.out.println(navn+" "+kode);

        Person person = Facade.getPerson(navn);

        if (person == null) {
            request.setAttribute("besked", "Brugeren findes ikke!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if (!person.getKode().equalsIgnoreCase(kode)) {
            request.setAttribute("besked", "Forkert kodeord!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }


    }
}
