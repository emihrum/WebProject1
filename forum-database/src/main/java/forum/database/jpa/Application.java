package forum.database.jpa;

import java.util.Date;

import forum.database.domain.User;
import forum.database.domain.Post;
import forum.database.domain.Thread;

public class Application {
	public static void main(String[] args) {
		try (DataProvider provider = new DataProvider()) {
			User user = new User("Test1", "test1@example.com", "password");
			provider.addUser(user);
			System.out.println(provider.getUsers());
			//provider.removeUser(user);
			//System.out.println(provider.getUsers());
			
			System.out.println();
			Thread thread = new Thread(user, "title", new Date());
			provider.addThread(thread);
			System.out.println(provider.getThreads());
			
			System.out.println();
			Post post = new Post(thread, user, "content", new Date());
			provider.addPost(post);
			Post post2 = new Post(thread, user, "content2", new Date(0));
			provider.addPost(post2);
			System.out.println(provider.getPosts());
			
			System.out.println();
			System.out.println(provider.getPostsOfUsers(user));
			
			System.out.println();
			System.out.println(provider.getLastPostOfEachThread());
		}
	}
}
