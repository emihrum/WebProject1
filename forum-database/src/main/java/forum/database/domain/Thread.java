package forum.database.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Thread {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private User user;
	private String title;
	private Date startTime;
	
	public Thread() {
	}

	public Thread(User user, String title, Date startTime) {
		this.user = user;
		this.title = title;
		this.startTime = startTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "Thread [id=" + id + ", user=" + user + ", title=" + title + ", startTime=" + startTime + "]";
	}
}
