package com.neo.commands.commonCommands;

import com.neo.commands.ICommand;
import com.neo.controller.SessionContent;
import com.neo.resource.ConfigurationManager;

import javax.servlet.ServletException;

public class AdminLoginCommand implements ICommand {
    @Override
    //ToDo: change method below
    public String execute(SessionContent sessionContent) throws ServletException {
        return ConfigurationManager.getProperty("page.AdminMain");
    }
}
