package com.neo.commands;

import com.neo.controller.SessionContent;

import javax.servlet.ServletException;

public interface ICommand {
    String execute (SessionContent sessionContent) throws ServletException;
}
