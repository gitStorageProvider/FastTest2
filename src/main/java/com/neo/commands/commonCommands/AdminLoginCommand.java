package com.neo.commands.commonCommands;

import com.neo.beans.Admin;
import com.neo.commands.ICommand;
import com.neo.controller.SessionContent;
import com.neo.exceptions.DAOException;
import com.neo.exceptions.ServiceException;
import com.neo.resource.ConfigurationManager;
import com.neo.resource.MessageManager;
import com.neo.service.iservice.IAdminService;
import com.neo.service.servicefactory.ServiceFactory;

import javax.servlet.ServletException;

public class AdminLoginCommand implements ICommand {
    private static final String ADMIN_LOGIN_PARAMETER = "adminLogin";
    private static final String ADMIN_PASSWORD_PARAMETER = "adminLogin";
    ServiceFactory serviceFactory = null;
    IAdminService adminService = null;

    public AdminLoginCommand() {
        try {
            serviceFactory = ServiceFactory.getInstance();
            adminService = serviceFactory.getAdminsService();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    @Override
    //ToDo: change method below
    public String execute(SessionContent sessionContent) throws ServletException {
        String resultPage = null;
        String login = sessionContent.getRequestParameter(ADMIN_LOGIN_PARAMETER);
        String password = sessionContent.getRequestParameter(ADMIN_PASSWORD_PARAMETER);

        Admin admin = null;
        try {
            admin = adminService.login(login, password);
        } catch (ServiceException e) {
            throw new ServletException("Can't login admin with login: " + login + ", name: " + password + ".", e);
        }

        if (admin != null) {
            sessionContent.setSessionAttribute("user", admin);
            return ConfigurationManager.getProperty("page.AdminMain");
        } else {
            sessionContent.setSessionAttribute("error", MessageManager.getProperty("message.loginError"));
            return ConfigurationManager.getProperty("page.AdminLogin");
        }
    }
}
