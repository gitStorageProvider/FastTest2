package com.neo.controller;


import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/",
        loadOnStartup = 0)
public class Controller extends HttpServlet {



    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
            throws IOException, ServletException {
        String page = null;



//            PrintWriter pw = response.getWriter();
//            pw.write("controller works");
//            pw.flush();
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        rd.forward(request,response);
    }
}
