<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Fund transfer</h1>
<table>
 		<form:form action="fundtrans" method="get"  modelAttribute="customer">
 				<tr>
					<td>Your Mobile Number:</td>
					<td><input name="mno"  size="30" /></td>
					<td><form:errors name="mno" cssClass="error" /></td>
				</tr>
						<tr>
					<td>Target Mobile Number:</td>
					<td><input name="mno1" size="30" /></td>
					<td><form:errors name="mno1" cssClass="error" /></td>
				</tr>
					<tr>
					<td>Enter Amount :</td>
					<td><input name="bal" size="30" /></td>
					<td><form:errors name="bal" cssClass="wallet.balance" /></td>
				</tr>
					<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
 		</form:form>
</table>
</body>
</html>