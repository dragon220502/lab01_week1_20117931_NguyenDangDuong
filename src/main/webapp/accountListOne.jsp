<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/11/2023
  Time: 5:48 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(request.getAttribute("acc") == null) {
        String mess = (String) request.getAttribute("mess");
%>
<h1><%= mess %></h1>

<%} else if(request.getAttribute("acc")!=null){
    Account account = (Account) request.getAttribute("acc");
%>
<table>
    <tr>
        <td>ID</td>
        <td>Họ và tên</td>
        <td>Email</td>
        <td>Điện thoại</td>
        <td>Trạng thái</td>
        <td>Mật khẩu</td>
    </tr>

    <tr>
        <td><%= account.getAccountId() %></td>
        <td><%= account.getFullName() %></td>
        <td><%= account.getEmail() %></td>
        <td><%= account.getPhone() %></td>
        <td><%= account.getStatus() %></td>
        <td><%= account.getPassWord() %></td>
    </tr>
</table>
<%}
%>


</body>
</html>
