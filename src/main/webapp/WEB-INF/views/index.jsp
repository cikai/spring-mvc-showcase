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

  <h3>【demo1】表单数据提交（submit） x-www-form-urlencoded</h3>
  <form action="${baseUrl}demo1" method="post">
    name:
    <input type="text" name="name" value="demo1" />
    <br>
    age:
    <input type="text" name="age" value="111" />
    <br>
    <button type="submit">submit</button>
  </form>

  <h3>【demo2】表单数据提交（js） x-www-form-urlencoded</h3>
  <form action="" method="post" id="form2">
    name:
    <input type="text" name="name" value="demo2" />
    <br>
    age:
    <input type="text" name="age" value="222" />
    <br>
    <input type="button" id="submit2" value='submit'>
  </form>

  <h3>【demo3】数据提交 (js object) x-www-form-urlencoded</h3>
  <form action="" method="post" id="form3">
    name:
    <input type="text" name="name" value="demo3" />
    <br>
    age:
    <input type="text" name="age" value="333" />
    <br>
    <input type="button" id="submit3" value='submit'>
  </form>

  <h3>【demo4】数据提交 json</h3>
  <form action="" method="post" id="form4">
    name:
    <input type="text" name="name" value="demo4" />
    <br>
    age:
    <input type="text" name="age" value="444" />
    <br>
    <input type="button" id="submit4" value='submit'>
  </form>

  <h3>【demo5】数据提交 复杂json</h3>
  <input type="button" id="submit5" value='submit'>

  <h3>【demo6】数据提交 路径参数</h3>
  <form action="" method="post" id="form6">
    name:
    <input type="text" name="name" value="demo6" />
    <br>
    age:
    <input type="text" name="age" value="666" />
    <br>
    <input type="button" id="submit6" value='submit'>
  </form>

  <h3>【demo7】html 取得</h3>
  <div id="hello"></div>
  <input type="button" id="submit7" value='submit'>

</body>
</html>