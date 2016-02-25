<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/" var="baseUrl" />
<!DOCTYPE html>
<html lang="zh_cn">
<head>
  <meta charset="UTF-8">
  <title>Spring MVC showcase - index</title>
  <link rel="stylesheet" href="${baseUrl}resources/css/index.css">
  <script src="${baseUrl}resources/js/lib/jquery-1.11.0.js"></script>
  <script src="${baseUrl}resources/js/index.js"></script>
</head>
<body>
  <h3>表单提交数据 x-www-form-urlencoded</h3>
  <form action="${baseUrl}form1" method="post">
  	name: <input type="text" name="name" value=""/><br>
  	age: <input type="text" name="age" value=""/><br>
	<button type="submit">submit</button>
  </form>
</body>
<script>
</script>
</html>