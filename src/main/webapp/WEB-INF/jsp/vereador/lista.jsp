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
		<div style="text-align: center;">
		<table>
			<thead>
				<tr>
					<th>Nome</th>
					<th>Projetos Aprovados</th>
					<th>Projetos Apresentados</th>
					<th>Opções</th>
				</tr>
			</thead>	
			<tbody>
				<c:forEach var="vereador" items="${lista}" >
					<tr>
						<td>${vereador.nome}</td>
						<td>${vereador.qntAprovada()}</td>
						<td>${vereador.qtdApresentada()}</td>
						<td><a href="visualizar/${vereador.codigo}">Editar</a></td>
					</tr>		
				</c:forEach>
			</tbody>			
		</table>
		</div>
	</body>
</html>