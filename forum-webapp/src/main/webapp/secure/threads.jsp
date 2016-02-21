<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Threads</title>
</head>
<body>

	<a href="<c:url value='/secure/logout'/>">Logout</a>

	<table>
		<c:forEach var="thread" items="${threads}">
			<tr>
				<td><c:out value="${thread.userEmail}" /></td>
				<td><c:out value="${thread.title}" /></td>
				<td><fmt:formatDate value="${thread.startTime}"
						dateStyle="SHORT" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>