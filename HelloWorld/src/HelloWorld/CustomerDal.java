package HelloWorld;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import HelloWorld.Database;


public class CustomerDal extends Database implements IDataAccessLayer<Customer>{

	@Override
	public void insert(Customer contract) {
		
		Connection connection = getConnection();
		try {
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("INSERT customer (id,adi,soyadi) VALUES('"+contract.getId()+"'"
					+ ",'"+contract.getName()+"',"
							+ ""+ "'"+contract.getSurname()+"')");
			
			
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Customer contract) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer contract) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getList(Customer contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
