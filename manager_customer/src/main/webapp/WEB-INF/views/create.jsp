<html>
<head>
    <title>Create Client</title>
</head>
<body>
<h2>Create Client</h2>
<form action="${pageContext.request.contextPath}/admin/create" method="post">
    <p>Id: <input type="text" name="id"/></p>
    <p>Name: <input type="text" name="name"/></p>
    <p>Email: <input type="text" name="email"/></p>
    <p>Address: <input type="text" name="address"/></p>
    <p><input type="submit" value="Create"/></p>
</form>
<a href="${pageContext.request.contextPath}/admin/home">Back to List</a>
</body>
</html>
