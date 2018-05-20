package com.neo.commands;

import com.neo.controller.SessionContent;
import com.neo.resource.MessageManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommandFactory.class);

    public ICommand defineCommand(SessionContent sessionRequestContent) {
        ICommand resultCommand = new DefaultCommand();

        String commandString = sessionRequestContent.getRequestParameter("command");
        LOGGER.debug("Command: " + commandString);

        if (commandString == null || commandString.isEmpty()) {
            return resultCommand;
        }

        try {
            for (SupportedCommands temp : SupportedCommands.values()) {
                if (temp.getCommandName().toUpperCase().equals(commandString.toUpperCase())) {
                    resultCommand = temp.getCommand();
                    break;
                }
            }
            LOGGER.debug("Command: " + resultCommand);
        } catch (IllegalArgumentException e) {
            LOGGER.error("Exception while command definition.", e);
            sessionRequestContent.setRequestAttribute("wrongCommand", commandString +
                    MessageManager.getProperty("message.wrongCommand"));
        }
        return resultCommand;
    }
}
