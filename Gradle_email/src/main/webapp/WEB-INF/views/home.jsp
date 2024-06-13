<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Email validate</h1>
<h2>${message}</h2>
<form action="/admin/result" method="post">
    <label for="email">Email</label>
    <input type="text" id="email" name="email">
    <br>
    <input type="submit" value="result">
</form>
</body>
</html>