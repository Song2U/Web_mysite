<%@page import="java.util.List"%>
<%@page import="kr.ac.sungkyul.mysite.vo.GuestbookVo"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%
	List<GuestbookVo> list = (List<GuestbookVo>) request.getAttribute("i");
%>
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/guestbook.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<div id="content">
			<div id="guestbook">
				<form method="post" action="/mysite/user?a=gb">
					<input type="hidden" name="a" value="gb">
					<table>
						<tr>
							<td>이름</td>
							<td><input type="text" name="name"></td>
							<td>비밀번호</td>
							<td><input type="password" name="pass"></td>
						</tr>
						<tr>
							<td colspan=4><textarea name="content" id="content"></textarea></td>
						</tr>
						<tr>
							<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
						</tr>
					</table>
				</form>
				<ul>
					<li>
					<%for(GuestbookVo vo : list){ %>
						<table>
							<tr>
								<td>[4]</td>
								<td>안대혁</td>
								<td>2015-11-10 11:22:30</td>
								<td><a href="">삭제</a></td>
							</tr>
							<tr>
								<td colspan=4>안녕하세요. ^^;<br> 하하하하
								</td>
							</tr>
						</table>
						<%} %> <br>
					</li>
				</ul>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/include/navi.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
	</div>
</body>
</html>