<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Welcome to JSP</h1>
	<br/>
	This is template text
	<!-- This is HTML Comment  -->
	<%----This is JSP comment----%>
	
	<% int n=0;
	out.println("Value of n : "+(n++));	%>
	
	<%=  Calendar.getInstance().getTime()   %>
	<br/>
	
	<%! int nVar; %>
	<%= "Value of nVar: "+(++nVar) %>

</body>
</html>