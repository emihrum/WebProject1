package forum.webapp.thread;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secure/threads")
public class ListThreads extends HttpServlet{
	
	public static ThreadView createDummyThread() {
		Random random = new Random();
		ThreadView thread = new ThreadView();
		thread.setId(Long.valueOf(random.nextInt(1000)));
		thread.setStartTime(new Date());
		thread.setTitle("title" + random.nextInt(1000));
		thread.setUserEmail("test" + random.nextInt(1000) + "@example.com");
		return thread;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List <ThreadView> threadList = Arrays.asList(createDummyThread(), createDummyThread(), createDummyThread());
		req.setAttribute("threads", threadList);
		req.getRequestDispatcher("/secure/threads.jsp").forward(req, resp);
	}
	
}
