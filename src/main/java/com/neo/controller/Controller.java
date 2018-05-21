package com.neo.controller;


import com.neo.commands.CommandFactory;
import com.neo.commands.ICommand;
import com.neo.resource.ConfigurationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/",
        loadOnStartup = 0)
public class Controller extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {


//        LOGGER.info("Try to go on page = " + request.getContextPath() + "/WEB-INF/views/@@login.jsp");
//        response.sendRedirect(request.getContextPath() + "/WEB-INF/views/@@login.jsp");


        CommandFactory commandFactory = new CommandFactory();
        LOGGER.info("command servicefactory created");
        SessionContent sessionContent = new SessionContent(request, response);
        LOGGER.info("sessionContent created");
        ICommand command = commandFactory.defineCommand(sessionContent);
        LOGGER.info("defined command: " + command.getClass().getName());
        String page = command.execute(sessionContent);

        if (page != null) {
            LOGGER.info("Computed page = " + page);
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(page);
            dispatcher.forward(request, response);
        } else {
            page = ConfigurationManager.getProperty("page.StudentLogin");
//            request.getSession().setAttribute("nullPage",
//                    MessageManager.getProperty("message.nullpage"));


            response.sendRedirect(request.getContextPath() + page);
        }
    }
}
