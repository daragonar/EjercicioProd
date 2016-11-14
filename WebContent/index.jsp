<jsp:include page="pages/header.jsp"/>

<%
String pag="";
if(request.getAttribute("page")!=null)
{
	pag= request.getAttribute("page").toString();
}
switch (pag) {
case "prod":
	pag= new String("pages/detalles.jsp");
break;
case "listado":
	pag= new String("pages/home.jsp");
	break;
default:
	pag= new String("pages/login.jsp");
break;
}
%>
<jsp:include page="<%= pag %>" />
<jsp:include page="pages/footer.jsp"/>