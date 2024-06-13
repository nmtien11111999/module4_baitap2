<html>
<head>
    <title>Edit Client</title>
</head>
<body>
<h2>Edit Client</h2>
<form action="${pageContext.request.contextPath}/admin/edit/${client.id}" method="post">
    <p>Name: <input type="text" name="name" value="${client.name}"/></p>
    <p>Email: <input type="text" name="email" value="${client.email}"/></p>
    <p>Address: <input type="text" name="address" value="${client.address}"/></p>
    <p><input type="submit" value="Update"/></p>
</form>
<a href="${pageContext.request.contextPath}/admin/home">Back to List</a>
</body>
</html>