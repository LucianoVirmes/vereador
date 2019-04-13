<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>	
		<h3>Novo vereador</h3>
		<fieldset>
			<form method="post">
				<label>Nome</label><input type="text" name="vereador.nome"/>
				
				
				<label>Partido</label>
				<select>
					<c:forEach var="partido" items="${partidos }">
						<option>${partido.nome}</option>
					</c:forEach>
				</select>
				<input type="hidden" value="${partido.codigo}">
				
				<button type="submit">Salvar</button>
			</form>
		</fieldset>
</body>
</html>