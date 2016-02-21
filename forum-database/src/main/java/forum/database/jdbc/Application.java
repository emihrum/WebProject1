package forum.database.jdbc;

import java.sql.SQLException;

import forum.database.domain.User;

public class Application {
	public static void main(String[] args) throws SQLException {
		try (DataProvider provider = new DataProvider()) {
			provider.createUserTable();
			provider.addUser(new User("Test1", "test1@eaxamples.com", "password"));
			provider.addUser(new User("Test2", "test2@eaxamples.com", "password"));
			provider.addUser(new User("Test3", "test3@eaxamples.com", "password"));
			System.out.println(provider.getUsers());
		}
	}
}
