 <%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/11/2023
  Time: 11:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
      <%
          String id = request.getParameter("id");

      %>
  </head>
  <body>
  <form  action="<%="controller?action=update&id="+id%>" method="post">
      <label>fullname</label><input type="text" name="fullname"><br/>
      <label>Password</label><input type="text" name="password"><br/>
      <label>Email</label><input type="text" name ="email"><br/>
      <label>Phone</label><input type="text" name = "phone"><br/>
      <label>Status</label>
      <select name="status">
          <option selected="true" label="ACTIVE">ACTIVE</option>
          <option  label="DEACTIVE">DEACTIVE</option>
          <option  label="XOA">XOA</option>
      </select>
      <button type="submit">Tao</button>
      <button type="reset">Reset</button>
  </form>
  </body>
</html>
