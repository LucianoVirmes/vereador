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
		<fieldset>
			<form method="post">
				<c:set var ="vereador" value="${vereador}"/> 
				<label>Nome</label><input type="text" name="vereador.nome" value="${vereador.nome}"/>
				
				
				<label>Partido</label>
				<select>
					<c:forEach var="partido" items="${partidos }">
						<option value="${partido.nome}"></option>
					</c:forEach>
				</select>
				<input type="hidden" value="${partido.codigo}">
				
				<button type="submit">Salvar</button>
			</form>
		</fieldset>
		<a href="cadastroProjeto/${vereador.codigo}">Cadastrar projeto</a>
		<table>
			<caption>Projetos</caption>
			<thead>
				<tr>
					<th>Nome</th>
				</tr>	
			</thead>
			<tbody>
				<c:forEach var="projeto" items="${projetos}">
					<tr>
						<td> <input name="projetos.projeto.nome" value="${projeto.nome}"/></td>
						<td><input type="checkbox"/> Apresentado</td>
						<td><input type="checkbox"/> Aprovado</td>
					</tr>
					</c:forEach>
			</tbody>
		</table>
</body>
</html>