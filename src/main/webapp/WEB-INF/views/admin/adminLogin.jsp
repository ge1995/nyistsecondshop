<%--
  Created by IntelliJ IDEA.
  User: chao
  Date: 2018/5/12
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="<c:url value="/statics/bootstrap-3.3.0/css/bootstrap.css"/>">
    <link rel="stylesheet" href="<c:url value="/statics/css/style.css"/>">
</head>
<body style="background-color: #345bbb">
<div style="margin:20px auto">
    <div style="margin:100px auto; margin-bottom: 40px" align="center">
        <h1 style="font-size: 60px; color: #ffffff">管理员登录</h1>
    </div>
</div>
<div class="container" style="position: relative; margin: 80px auto;">
    <div class="col-md-6 login-back" style="position: absolute; left: 50%;transform: translateX(-50%);">
        <form action="<c:url value="/nyist-secondshop/admin/adminLogin"/>" method="post">
            <div class="form-group">
                <label for="email">邮箱</label>
                <input class="form-control" id="email" name="email" type="email"/>
            </div>
            <div class="form-group">
                <label for="password">密码</label>
                <input class="form-control" id="password" name="password" type="password"/>
            </div>
            <div>
                <output style="color: red">${message}</output>
            </div>
            <button style="width: 100%" type="submit" class="btn btn-primary">登录</button>
        </form>
        <a href="<c:url value="/nyist-secondshop/login"/>">用户登录</a>
    </div>
</div>
<script src="<c:url value="/statics/jquery-1.12.4/jquery-1.12.4.js"/>"></script>
<script src="<c:url value="/statics/bootstrap-3.3.0/js/bootstrap.js"/>"></script>
</body>
</html>
