<%@ page import="java.net.URLDecoder" %>
<div id="header">
	<%
		
	
         
         if (session.getAttribute("name") != null) {
        	 String name=(String)session.getAttribute("name");
 					
 	%>
 					<%=name%>
 	<% 
 		}
      %>
</div>