<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %> 
<%@ page import="edu.edgewood.model.*" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src='js/ext/jquery-3.3.1.min.js'></script>
<script src='js/mainPage.js'></script>
</head>
<body>
	<div id='container'>
		<%@ include file="include/headerLoggedIn.jsp" %>
		<a href='main' id='logout'>Logout</a>
		<div id="content">
						<%
							session.invalidate();
							List<Posting> postings = (List)request.getAttribute("postings");
							if(postings == null || postings.isEmpty()){
						%>
								
								Nothing Found 
							
						<%	
							}else{
						%>
						<a href='add'>Add New Post</a>
								
							<table>
								
						<%
								for(Posting posting : postings){
						%>
							<tr>
								<td><%=posting.getCreatedDate() %></td>
								<td><%=posting.getTitle() %></td>
								<td><%=posting.getShortDescription() %></td>
								<td>
									<a href='details?id=<%=posting.getId()%>'>Read more...</a>
									<a href='edit?id=<%=posting.getId()%>'>Edit</a>
									<a href='delete?id=<%=posting.getId()%>'>Delete</a>
									
								</td>
							</tr>
								
						
						<%			
								};
						%>
							</table>
						<%
							}
						%>
					</div>
			</div>
</body>
</html>