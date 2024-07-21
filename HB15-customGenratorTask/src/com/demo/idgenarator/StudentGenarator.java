package com.demo.idgenarator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentGenarator implements IdentifierGenerator {
	
	Connection connection=null;
	

	@Override
	public Serializable generate(SharedSessionContractImplementor arg, Object arg1) throws HibernateException {
    
		 connection = arg.connection();
		 //Statement statement=null;
		 try {
			 
			  connection.prepareStatement("insert into gen(id) values(?)");
			 
				/*
				 * statement = connection.createStatement();
				 * statement.executeUpdate("insert into gen values()") ResultSet resultSet =
				 * statement.executeQuery("select id from gen"); int id = resultSet.getInt(1);
				 */
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return " ";
	}

}
