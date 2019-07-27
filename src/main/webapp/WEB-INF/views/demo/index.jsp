<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demonstração de Internacionalização</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/demo?lang=en" >English</a> |
	<a href="${pageContext.request.contextPath }/demo?lang=fr" >Francês</a> |
	<a href="${pageContext.request.contextPath }/demo?lang=de" >Alemão</a>
	<br>
	<s:message code="greeting"></s:message>	
</body>
</html>