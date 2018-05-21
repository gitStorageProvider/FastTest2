package com.neo.commands.adminCommands;

import com.neo.commands.ICommand;
import com.neo.controller.SessionContent;
import com.neo.exceptions.DAOException;
import com.neo.exceptions.ServiceException;
import com.neo.service.iservice.IStudentService;
import com.neo.service.servicefactory.ServiceFactory;

import javax.servlet.ServletException;

public class ShowAllStudentsCommand implements ICommand {

    ServiceFactory serviceFactory = null;
    IStudentService studentService = null;

    public ShowAllStudentsCommand() {

        try {
            serviceFactory = ServiceFactory.getInstance();
            studentService = serviceFactory.getStudentsService();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    @Override
    //ToDo: realize method below
    public String execute(SessionContent sessionContent) throws ServletException {
        try {
            System.out.println(studentService.getAllStudents());
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return null;
    }
}
