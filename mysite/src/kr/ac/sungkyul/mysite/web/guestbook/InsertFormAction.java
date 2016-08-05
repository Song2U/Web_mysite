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

public class InsertFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		
		GuestBookDao dao = new GuestBookDao();
		GuestbookVo vo = new GuestbookVo();
		
		vo.setNo(Long.parseLong(no));
		vo.setName(name);
		vo.setContent(content);
		
		dao.insert(vo);
		
		WebUtil.redirect("/mysite/user?a=gb", request, response);
	}
}