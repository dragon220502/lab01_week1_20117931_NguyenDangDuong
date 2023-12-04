<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.service.AccountService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/11/2023
  Time: 1:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        AccountService accountService = new AccountService();
        List<Account> accounts = accountService.getAllAccountByStatus();

    %>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>Fullname</td>
        <td>Email</td>
        <td>Phone</td>
        <td>Status</td>
        <td>Password</td>
    </tr>
    <% for (Account account:accounts){%>
    <tr>
        <td><%=account.getAccountId()%></td>
        <td><%=account.getFullName()%></td>
        <td><%=account.getEmail()%></td>
        <td><%=account.getPhone()%></td>
        <td><%=account.getStatus()%></td>
        <td><%=account.getPassWord()%></td>
        <td>
            <a href=<%="updateAccount.jsp?id="+account.getAccountId()%>>update</a>
            <a href=<%="controller?action=delete&id="+ account.getAccountId()%>>delete</a>
        </td>
    </tr>
    <%}%>
</table>

</body>
</html>
