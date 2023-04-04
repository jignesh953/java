<%@page import="com.bean.Employee"%>
<%@page import="com.dao.EmployeeDao"%>
<%@page import="antlr.collections.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="5" width="100%" cellpadding="10px" cellspacing="10px">
		<tr>
			<th>EINFO</th>
			<th>FNAME</th>
			<th>LNAME</th>
			<th>EMAIL</th>
			<th>EID</th>
			<th>UNAME</th>
			<th>PASSWORD</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
		<%
		List<Employee> list = EmployeeDao.getAllEmployee();
		for (Employee e : list) {
		%>
		<tr>
			<td><%=e.getEinfo().getEinfo()%></td>
			<td><%=e.getEinfo().getFname()%></td>
			<td><%=e.getEinfo().getLname()%></td>
			<td><%=e.getEinfo().getEmail()%></td>
			<td><%=e.getEid()%></td>
			<td><%=e.getUname()%></td>
			<td><%=e.getPassword()%></td>
			<td>
				<form action="edit" method="post" action="EmployeeController">
					<input type="hidden" name="eid" value="<%=e.getEid()%>"> 
					<input type="submit" name="action" value="EDIT">
				</form>
			</td>
				<td>
				<form action="edit" method="post" action="EmployeeController">
					<input type="hidden" name="eid" value="<%=e.getEid()%>"> <input
						type="submit" name="action" value="DELETE">
				</form>
			</td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="insert.jsp">Add New Employee</a>
</body>
</html>