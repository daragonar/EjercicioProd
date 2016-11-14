<%@page import="servlet.Producto"%>
<div class="container">
	<div class="row">
		<div class="col-md-12 text-center">
		<jsp:useBean id="producto" class="servlet.Producto" scope="request"/>
			<h1><jsp:getProperty property="prodName" name="producto" /></h1>
			<img src="<jsp:getProperty name="producto" property="prodImg"/>" alt="" height="300" />
			<p class="text-center"><jsp:getProperty name="producto" property="prodDesc"/></p>
			<p class="text-center"><a href="/EjProd/" class="btn btn-lg btn-default">Volver	</a></p>
		</div>
	</div>
</div>