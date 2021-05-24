<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books List</title>
</head>
<body>
<table>
<thead>
<tr><th>BID</th><th>BAUTHOR</th><th>BAVAILABLITY></th><th>BNAME</th></tr>
</thead>
<tbody>
<c:forEach items="${listofbooks}" var="Book">
<tr>
<td>${Book.bid }</td>
<td>${Book.bauthor}</td>
<td>${Book.bavailablity }</td>
<td>${Book.bname }</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>