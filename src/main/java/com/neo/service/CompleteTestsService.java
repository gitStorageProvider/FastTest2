package com.neo.service;

import com.neo.beans.CompleteTest;
import com.neo.beans.Student;
import com.neo.dao.idao.ICompleteTestsDAO;
import com.neo.exceptions.DAOException;
import com.neo.exceptions.ServiceException;
import com.neo.service.iservice.ICompletedTestsService;
import com.neo.service.iservice.IService;

import java.util.List;

public class CompleteTestsService implements ICompletedTestsService{
    private ICompleteTestsDAO iCompleteTestsDAO;

    public CompleteTestsService(ICompleteTestsDAO iCompleteTestsDAO) {
        this.iCompleteTestsDAO = iCompleteTestsDAO;
    }

    @Override
    public List<CompleteTest> getAllCompletedTests() throws ServiceException {
        try {
            return iCompleteTestsDAO.findAll();
        } catch (DAOException e) {
            throw new ServiceException("Cant extract all questions from DB.", e);
        }
    }

    @Override
    public List<CompleteTest> getAllCompletedTestsByStudent(Student student) throws ServiceException {
        try {
            return iCompleteTestsDAO.findAllCompletedTestsByStudent(student.getId());
        } catch (DAOException e) {
            throw new ServiceException("Cant extract all questions from DB.", e);
        }
    }

    @Override
    public boolean deleteComletedTest(CompleteTest completedTest) throws ServiceException {
        try {
            return iCompleteTestsDAO.deleteById(completedTest.getId());
        } catch (DAOException e) {
            throw new ServiceException("Cant extract all questions from DB.", e);
        }
    }

    @Override
    public boolean deleteAllCompletedTestsByStudent(Student student) throws ServiceException {
        //ToDo: realize method (including DAO layer)
        throw new UnsupportedOperationException("Method deleteAllCompletedTestsByStudent not realized in CompleteTestService");
    }
}
