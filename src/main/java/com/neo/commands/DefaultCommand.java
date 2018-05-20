package com.neo.commands;

import com.neo.controller.SessionContent;
import com.neo.resource.ConfigurationManager;


import javax.servlet.ServletException;

public class DefaultCommand implements ICommand {
    @Override
    public String execute(SessionContent sessionContent) throws ServletException {
        return ConfigurationManager.getProperty("page.StudentLogin");
    }
}
