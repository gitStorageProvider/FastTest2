package com.neo.service.servicefactory;

import com.neo.dao.connection.AbstractConnectionFactory;
import com.neo.dao.connection.IConnectionFactory;
import com.neo.dao.connection.WrappedConnection;
import com.neo.dao.daofactory.AbstractDAOFactory;
import com.neo.dao.daofactory.IDAOFactory;
import com.neo.dao.idao.ICompleteTestsDAO;
import com.neo.exceptions.DAOException;
import com.neo.exceptions.ServiceException;
import com.neo.service.AdminService;
import com.neo.service.CompleteTestsService;
import com.neo.service.StudentService;
import com.neo.service.iservice.IAdminService;
import com.neo.service.iservice.IQuestionService;
import com.neo.service.iservice.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

public class ServiceFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceFactory.class);
    private static ServiceFactory serviceFactoryInstance;
    private IDAOFactory daoFactory;

    private ServiceFactory() throws ServiceException {
        try {
            daoFactory = AbstractDAOFactory.getDAOFactory();
        } catch (DAOException e) {
            throw new ServiceException("Error while daoFactoryCreating", e);
        }
    }

    public ServiceFactory(IDAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public static synchronized ServiceFactory getInstance() throws ServiceException {
        if (serviceFactoryInstance == null){
            serviceFactoryInstance = new ServiceFactory();
        }
        return serviceFactoryInstance;
    }

    public IStudentService getStudentsService() throws DAOException{
        WrappedConnection wrappedConnection = AbstractConnectionFactory.getConnectionFactory().getConnection();
        return (IStudentService) new StudentService(
                AbstractDAOFactory.getDAOFactory().getStudentsDAO(wrappedConnection),
                AbstractDAOFactory.getDAOFactory().getCompleteTestsDAO(wrappedConnection));
    }

    public IAdminService getAdminsService() throws DAOException{
        WrappedConnection wrappedConnection = AbstractConnectionFactory.getConnectionFactory().getConnection();
        return (IAdminService) new AdminService(
                AbstractDAOFactory.getDAOFactory().getAdminsDAO(wrappedConnection)
        );
    }
    //ToDo: realize all other ServiceFactory methods
}
