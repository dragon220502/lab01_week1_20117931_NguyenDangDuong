<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/11/2023
  Time: 1:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="controller?action=login" method="post">
    <label>Tài khoản</label><input type="text" name="id"><br/>
    <label>Mật khẩu</label><input type="text" name="password"><br/>
    <button type="submit"  >Đăng nhập</button>
    <button src="controller?action=signup">Đăng ký</button>
</form>
<%
    if(request.getAttribute("Mess") != null){
        String mess = (String) request.getAttribute("Mess");
%>
<h1><%= mess %></h1>
<%
    }
%>
</body>
</html>
