<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<table>
			<thead>
				<tr>
					<th>Número</th>
					<th>Nome</th>
				</tr>
			</thead>	
			<tbody>
				<c:forEach var="partido" items="${lista }" >
					<tr>
						<td>${partido.numero }</td>
						<td>${partido.nome }</td>
					</tr>		
				</c:forEach>
			</tbody>			
		</table>
	</body>
</html>