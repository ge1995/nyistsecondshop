<%--
  Created by IntelliJ IDEA.
  User: chao
  Date: 2018/5/12
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="cn">
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="/statics/bootstrap-3.3.0/css/bootstrap.css"/>">
    <link rel="stylesheet" href="<c:url value="/statics/css/style.css"/>">
</head>
<body>

<jsp:include page="../home/header.jsp"/>

<div class="container">
    <div class="col-md-12" align="center" style="height: 560px; padding-top: 60px">
        <h1>商品不存在</h1>
        <p><img src="<c:url value="/statics/image/logo/yihan.png"/>" height="300px" width="300px"></p>
        <p>商品好像已被下架，信息已记录，请联系系统管理人员。</p>
    </div>
</div>

<jsp:include page="../home/footer.jsp"/>

<script src="<c:url value="/statics/jquery-1.12.4/jquery-1.12.4.js"/>"></script>
<script src="<c:url value="/statics/bootstrap-3.3.0/js/bootstrap.js"/>"></script>
</body>
</html>
