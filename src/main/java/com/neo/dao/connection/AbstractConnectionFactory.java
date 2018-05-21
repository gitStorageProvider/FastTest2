package com.neo.dao.connection;

import com.neo.exceptions.DAOException;

public abstract class AbstractConnectionFactory {

    private static SupportedConnectionTypes currentType = SupportedConnectionTypes.JDBC;

    public static IConnectionFactory getConnectionFactory() throws DAOException {
        IConnectionFactory connectionFactory = null;
        try {
            switch (currentType) {
                case JDBC:
                    connectionFactory = JDBCConnectionFactory.getInstance();
                    break;
                default:
                    throw new RuntimeException("Connection type= " + currentType + " not supported");
            }
        }catch (Throwable t){
            throw new DAOException("Exception in connection servicefactory initialization.", t );
        }
        return connectionFactory;
    }
}
