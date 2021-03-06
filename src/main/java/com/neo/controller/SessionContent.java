package com.neo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionContent {
    //ToDo: add logger
    //ToDo: think is response field needed or not

    private HttpServletRequest request;
    private HttpServletResponse response;

    public SessionContent(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public String getRequestParameter(String name) {
        return request.getParameter(name);
    }

    public Object getRequestAttribute(String name) {
        return request.getAttribute(name);
    }

    public String[] getRequestParameterValues(String name) {
        return request.getParameterValues(name);
    }

    public Object getSessionAttribute(String name) {
        HttpSession session = request.getSession(false);
        if(session != null) {
            return session.getAttribute(name);
        }
        return null;
    }

    public void setSessionAttribute(String name, Object value, boolean create) {
        HttpSession session = request.getSession(create);
        if (session != null) {
            session.setAttribute(name, value);
        }
    }

    public void setSessionAttribute(String name, Object value) {
        setSessionAttribute(name, value, false);
    }

    public void removeSessionAttribute(String name) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(name);
        }
    }

    public void setRequestAttribute(String name, Object value) {
        request.setAttribute(name, value);
    }

    public void invalidateSession() {
        HttpSession session = request.getSession(false);
        if(session != null) {
            session.invalidate();
        }
    }
}
