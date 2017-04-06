<% 
String  uu = (String)session.getAttribute("mem_id");
if(uu==null){		
%>
	<script>
	location.href  = 'home'; 
	</script>
<%	
	}
%>
