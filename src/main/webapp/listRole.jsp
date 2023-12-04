<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.service.AccountService" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.service.RoleService" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.Role" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.GrantAccess" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/11/2023
  Time: 1:41 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="controller?action=list" method="post">
    <label>Nhap role</label><input name="enum" type="text" value="123">
    <button type="submit" >Tìm kiếm</button>
</form>

<table>
    <%

        List<Account> list = (List<Account>) request.getAttribute("listAccount");

    %>
    <%
        if(list != null){%>
        <tr>
            <td>ID</td>
        </tr>
        <% for (Account g:list){%>
        <tr>
            <td><%=g.getAccountId()%></td>
        </tr>
        <%}%>
    <%}
    %>
</table>

</body>
</html>
