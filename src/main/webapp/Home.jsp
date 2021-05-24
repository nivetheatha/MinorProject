<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Library Management System</h2>
<form action = AddUser.jsp align="center">
         <input type = "submit" value = "ADD NEW USER" />
 </form><br />
  <form action = ChangeUser.jsp align="center">
         <input type = "submit" value = "Change User Address" />
 </form><br />
 <form action =book align="center">
         <input type = "submit" value = "Book List" />
 </form><br />
 <form action =DeleteBook.jsp align="center">
         <input type = "submit" value = "Delete Book" />
 </form><br />
 <form action =event align="center">
         <input type = "submit" value = "Display all Events" />
 </form><br/>
 <form action =Event.jsp align="center">
         <input type = "submit" value = "Filter Event by Date" />
 </form>
</body>
</html>