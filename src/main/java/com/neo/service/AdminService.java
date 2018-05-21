package com.neo.service;

import com.neo.beans.Admin;
import com.neo.dao.idao.IAdminsDAO;
import com.neo.exceptions.DAOException;
import com.neo.exceptions.ServiceException;
import com.neo.service.iservice.IAdminService;

public class AdminService implements IAdminService {

    IAdminsDAO adminsDAO;

    public AdminService(IAdminsDAO adminsDAO) {
        this.adminsDAO = adminsDAO;
    }

    @Override
    public Admin login(String login, String password) throws ServiceException{
        try {
            return adminsDAO.login(login,password);
        } catch (DAOException e) {
            throw new ServiceException("Can't login admin with username: "+login+", password: "+password+".", e);
        }
    }
}
