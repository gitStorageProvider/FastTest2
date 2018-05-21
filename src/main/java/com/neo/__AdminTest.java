package com.neo;

import com.neo.exceptions.DAOException;
import com.neo.exceptions.ServiceException;
import com.neo.service.servicefactory.ServiceFactory;

public class __AdminTest {
    public static void main(String[] args) {
        ServiceFactory serviceFactory = null;
        try {
            serviceFactory = ServiceFactory.getInstance();
            serviceFactory.getStudentsService();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (DAOException e) {
            e.printStackTrace();
        }


//        String url = "jdbc:mysql://localhost:3306/fast_test";
//        String user = "root";
//        String pass = "root";
//        Properties prop = new Properties();
//        prop.put("user", user);
//        prop.put("password", pass);
//
//        WrappedConnection wrappedConnection = null;
//        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            Connection connection = DriverManager.getConnection(url, prop);
//            wrappedConnection = new WrappedConnection(connection);
//
//            IAdminsDAO iAdminsDAO = AbstractDAOFactory.getDAOFactory().getAdminsDAO(wrappedConnection);
//
//            List<Admin> adminsList = iAdminsDAO.findAll();
//            System.out.println(adminsList);
//            Admin admin = adminsList.get(2);
//            System.out.println("Deleted: " + admin);
//            iAdminsDAO.deleteById(admin.getId());
//            adminsList = iAdminsDAO.findAll();
//            System.out.println(adminsList);
//            admin = adminsList.get(0);
//            admin.setName("ololo");
//            admin.setPassword("ololo");
//            System.out.println("Admin 0 changed to: " + admin);
//            iAdminsDAO.update(admin);
//            System.out.println(iAdminsDAO.findAll());
//        } catch (Exception e) {
//            System.err.println("properties file is missing " + e);
//        } finally {
//            try {
//                wrappedConnection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }
}