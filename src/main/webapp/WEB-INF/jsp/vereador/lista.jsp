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
					<th>Nome</th>
					<th>Desempenho</th>
				</tr>
			</thead>	
			<tbody>
				<c:forEach var="pessoa" items="${lista}" >
					<tr>
						<td>${pessoa.nome }</td>
					</tr>		
				</c:forEach>
			</tbody>			
		</table>
	</body>
</html>