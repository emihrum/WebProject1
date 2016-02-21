package forum.database.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Thread thread;
	@ManyToOne
	private User user;
	private String content;
	private Date postTime;
	
	public Post() {
	}

	public Post(Thread thread, User user, String content, Date postTime) {
		this.thread = thread;
		this.user = user;
		this.content = content;
		this.postTime = postTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", thread=" + thread + ", user=" + user + ", content=" + content + ", postTime="
				+ postTime + "]";
	}
}
