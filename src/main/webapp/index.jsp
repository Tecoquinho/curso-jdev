<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Curso JSP</title>
</head>
<body>
	<h2> Let them cook</h2>
	
	
	 <form action="ServletLogin" method="post">
		
		<table>
			<tr>
				<td>
					<label>Login</label>   <!-- Login em linha separada do input -->
				</td>
			</tr>
			<tr>
				<td>
					<input name="login" type="text">	<!--  -->		
				</td>
			</tr>
			<tr>
				<td>
					<label>Senha</label>   <!-- Login na mesma linha -->
					<input name="senha" type="password">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Enviar">
				</td>
			</tr>
		</table>
		
		
	</form>
	
	<h4> ${ msg } </h4> <!-- request.setAttribute(msg, "texto") -->
	
</body>
</html>