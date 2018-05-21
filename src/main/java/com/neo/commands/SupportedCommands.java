package com.neo.commands;

import com.neo.commands.adminCommands.*;
import com.neo.commands.commonCommands.*;
import com.neo.commands.studentCommands.FinishTestCommand;
import com.neo.commands.studentCommands.StartTestCommand;

public enum SupportedCommands {
    ADD_ADMIN("addAdmin"){{
        this.command = new AddAdminCommand();
    }},
    ADD_QUESTION("addQuestion"){{
        this.command = new AddQuestionCommand();
    }},
    DELETE_ADMIN("deleteAdmin"){{
        this.command = new DeleteAdminCommand();
    }},
    DELETE_QUESTION("deleteQuestion"){{
        this.command = new DeleteQuestionCommand();
    }},
    DELETE_STUDENT("deleteStudent"){{
        this.command = new DeleteStudentCommand();
    }},
    DELETE_TEST_BY_ID("deleteTestById"){{
        this.command = new DeleteTestByIdCommand();
    }},
    EDIT_ADMIN("editAdmin"){{
        this.command = new EditAdminCommand();
    }},
    EDIT_QUESTION("editQuestion"){{
        this.command = new EditQuestionCommand();
    }},
    SHOW_ALL_ADMINS("showAllAdmins"){{
        this.command = new ShowAllAdminsCommand();
    }},
    SHOW_ALL_QUESTIONS("showAllQuestions"){{
        this.command = new ShowAllQuestionsCommand();
    }},
    SHOW_ALL_STUDENTS("showAllStudents"){{
        this.command = new ShowAllStudentsCommand();
    }},
    SHOW_ALL_TESTS_BY_STUDENT("showAllTestByStudent"){{
        this.command = new ShowAllTestsByStudentCommand();
    }},
    SHOW_LAST_TESTS("showLastTests"){{
        this.command = new ShowLastTestsCommand();
    }},
    ADMIN_LOGIN("adminLogin"){{
        this.command = new AdminLoginCommand();
    }},
    EDIT_STUDENT("editStudent"){{
        this.command = new EditStudentCommand();
    }},
    LOGOUT("logout"){{
        this.command = new LogoutCommand();
    }},
    ADD_STUDENT("addStudent"){{
        this.command = new AddStudentCommand();
    }},
    STUDENT_LOGIN("studentLogin") {{
        this.command = new StudentLoginCommand();
    }},
    GO_TO_ADMIN_LOGIN_PAGE("goToAdminLoginPage"){{
        this.command = new GoToAdminLoginPage();
    }},
    GO_TO_STUDENT_LOGIN_PAGE("goToStudentLoginPage"){{
        this.command = new GoToStudentLoginPage();
    }},
    START_NEW_TEST("startNewTest"){{
        this.command = new StartTestCommand();
    }},
    FINISH_TEST("finishTest"){{
        this.command = new FinishTestCommand();
    }};

    private SupportedCommands(String commandName){
        this.commandName = commandName;
    }

    private String commandName;
    ICommand command;

    public String getCommandName(){
        return commandName;
    }

    public ICommand getCommand() {
        return command;
    }
}
