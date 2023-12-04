<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.fontend.model.AccountModel" %>
<%@ page import="com.sun.jna.platform.win32.Advapi32Util" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account" %>
<%@ page import="com.example.lab01_week1_nguyendangduong_20117931.backend.models.Mess" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
<form action="controller?action=login" method="post">
    <label>Tài khoản</label><input type="text" name="id"><br/>
    <label>Mật khẩu</label><input type="password" name="password"><br/>
    <button type="submit">Đăng nhập</button>
    <button formaction="insertAccount.jsp">Đăng ký</button>
</form>

</body>
</html>
