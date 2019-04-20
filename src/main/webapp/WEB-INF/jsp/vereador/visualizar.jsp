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
		<form method="post" action="atualizaprojeto">
			<table>
				<caption>Projetos</caption>
				<thead>
					<tr>
						<th>Nome</th>
					</tr>	
				</thead>
				<tbody>
					<c:forEach var="projeto" items="${projetos}" varStatus="loop">
						<tr>
							<td><input name="projetos[${loop.index}].nome" value="${projeto.nome}"/></td>
							<td><input type="checkbox" name="projetos[${loop.index}].aprovado" <c:if test="${projeto.aprovado}">checked="checked"</c:if>/> Apresentado</td>
							<td><input type="checkbox" name="projetos[${loop.index}].apresentado" <c:if test="${projeto.apresentado}">checked="checked"</c:if>/> Aprovado</td>
							<td><input type="hidden" name="projetos[${loop.index}].codigo" value="${projeto.codigo}"/></td>
						</tr>
						</c:forEach>
				</tbody>
			</table>
			<button type="submit">salvar</button>
		</form>
</body>
</html>