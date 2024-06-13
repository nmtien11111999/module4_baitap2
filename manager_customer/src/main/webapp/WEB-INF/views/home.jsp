<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Client List</title>
</head>
<body>
<h2>Client List</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="customer" items="${customer}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td>
                <a href="${pageContext.request.contextPath}/admin/edit/${customer.id}">Edit</a>
                <form action="${pageContext.request.contextPath}/admin/delete/${customer.id}" method="post" style="display:inline">
                    <input type="submit" value="Delete"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/admin/create">Create New Client</a>
</body>
</html>