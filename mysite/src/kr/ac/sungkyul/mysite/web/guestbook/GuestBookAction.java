package kr.ac.sungkyul.mysite.web.guestbook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sungkyul.mysite.dao.GuestBookDao;
import kr.ac.sungkyul.mysite.vo.GuestbookVo;
import kr.ac.sungkyul.mysite.web.Action;
import kr.ac.sungkyul.mysite.web.WebUtil;

public class GuestBookAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestBookDao dao = new GuestBookDao();
		List<GuestbookVo> list = dao.getList();
		
		request.setAttribute("i", list);
		
		WebUtil.forward("/WEB-INF/views/guestbook/list.jsp", request, response);
	}
}