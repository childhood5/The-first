package com.ibsv.capitakpi.daoImpl;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ibsv.capitakpi.dao.CapitaDAO;
import com.ibsv.capitakpi.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class CapitaDAOImpl implements CapitaDAO{

	private static final Logger log = Logger.getLogger(CapitaDAOImpl.class);
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/database";
	static final String USER = "root";
	static final String PASS = "root";
	
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public String getModel(String model) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {

			Class.forName(JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee");

			while (rs.next()) {
				
				int id = rs.getInt("EMPLOYEE_ID");
				String name = rs.getString("NAME");
				String division = rs.getString("DIVISION");
				
				log.info(id+name+division);
			}
		} catch (ClassNotFoundException e) {
			log.error(e);
		} catch (SQLException e) {
			log.error(e);
		} catch (InstantiationException e) {
			log.error(e);
		} catch (IllegalAccessException e) {
			log.error(e);
		}
		return model;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getListEmployee() {
		
		Session session = this.sessionFactory.openSession();
		List<Employee> listEmployee = session.createQuery("from Employee").list();
        session.close();
        
        return listEmployee;
		
	}
}