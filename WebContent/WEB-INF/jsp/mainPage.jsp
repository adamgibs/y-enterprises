<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %> 
<%@ page import="edu.edgewood.model.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="content">
				<%
					List<Posting> postings = (List)request.getAttribute("postings");
					if(postings == null || postings.isEmpty()){
				%>
						
						Nothing Found 
					
				<%	
					}else{
				%>
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
</body>
</html>