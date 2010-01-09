package allegro.dbAgent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import allegro.DBSpecification;

import com.tilab.wade.commons.AgentInitializationException;
import com.tilab.wade.commons.AgentType;
import com.tilab.wade.performer.WorkflowEngineAgent;

public class DBAgent extends WorkflowEngineAgent {

	public static final String DBAgentType = "db-agent";
	/**
	 * Agent initialization
	 */
	protected void agentSpecificSetup() throws AgentInitializationException {
		super.agentSpecificSetup();
		Connection conn = getConnection();
		if(conn==null || !checkDatabases(conn)) this.takeDown();
	}
	/**
	 * Agent clean-up
	 */
	@Override
	protected void takeDown() {
		super.takeDown();
	}

	public static Connection getConnection(){
		Connection conn = null;
		String protocol="jdbc:mysql"; 
		String host="localhost";
		String base="allegro";
		String user="root";
		String password="root";
		String url=protocol +"://"+host+"/"+base;
		if (user!=null) {
			url+="?user="+user+"&password="+password;
		}
		try {
			conn= DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * Return the type of this agent. This will be 
	 * inserted in the default DF description
	 */
	public AgentType getType() {
		AgentType type = new AgentType();
		type.setDescription(DBAgentType);
		return type;
	}

	public boolean checkDatabases(Connection conn){
		try {
			java.sql.DatabaseMetaData dbmd = conn.getMetaData();
			ResultSet rs = dbmd.getTables(conn.getCatalog(), null, null, null);
			boolean users = false;
			boolean items = false;
			boolean prices = false;
			while(rs.next()){
				if(rs.getString("TABLE_NAME").equals(DBSpecification.UsersTable)) users = true;
				if(rs.getString("TABLE_NAME").equals(DBSpecification.ItemsTable)) items = true;
				if(rs.getString("TABLE_NAME").equals(DBSpecification.PriceDataTable)) prices = true;
			}
			if(!users){
				Statement stm = conn.createStatement();
				stm.executeUpdate("CREATE TABLE `"+conn.getCatalog()+"`.`"+DBSpecification.UsersTable+"` (" +
						"`id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT," +
						"`"+DBSpecification.LoginColumn+"` VARCHAR(32) UNSIGNED NOT NULL," +
						"`"+DBSpecification.PasswordColumn+"` VARCHAR(32) UNSIGNED NOT NULL," +
						"PRIMARY KEY (`id`)" +
						")" +
				"ENGINE = InnoDB;");

			}
			if(!items){
				Statement stm = conn.createStatement();
				stm.executeUpdate("CREATE TABLE `"+conn.getCatalog()+"`.`"+DBSpecification.ItemsTable+"` (" +
						"`id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT," +
						"`"+DBSpecification.ItemNameColumn+"` VARCHAR(32) UNSIGNED NOT NULL," +
						"`"+DBSpecification.OwnersLogin+"` VARCHAR(32) UNSIGNED NOT NULL," +
						"`"+DBSpecification.TrackedFormColumn+"` DATE," +
						"`"+DBSpecification.TrackedToColumn+"` DATE," +
						"PRIMARY KEY (`id`)" +
						")" +
				"ENGINE = InnoDB;");

			}
			if(!prices){
				Statement stm = conn.createStatement();
				stm.executeUpdate("CREATE TABLE `"+conn.getCatalog()+"`.`"+DBSpecification.PriceDataTable+"` (" +
						"`id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT," +
						"`"+DBSpecification.ItemIDColumn+"` INTEGER UNSIGNED NOT NULL," +
						"`"+DBSpecification.DateColumn+"` DATE," +
						"`"+DBSpecification.Price+"` DECIMAL," +
						"PRIMARY KEY (`id`)" +
						")" +
				"ENGINE = InnoDB;");

			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
