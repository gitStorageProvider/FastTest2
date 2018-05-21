package com.neo.service.iservice;

import com.neo.beans.Admin;
import com.neo.exceptions.ServiceException;

public interface IAdminService extends IService{
    Admin login(String login, String password) throws ServiceException;
}
