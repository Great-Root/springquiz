<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>index.jsp<br>
<a href="<%=request.getContextPath()%>/member/join">회원가입</a> &nbsp; 
<a href="<%=request.getContextPath()%>/member/show">모든 회원보기</a><br>
<h3>${msg}</h3> 
</body>
</html>