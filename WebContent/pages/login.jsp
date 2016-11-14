<div class="container">
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<h1>Login</h1>
			<form action="Login" method="post">
			<div class="form-group">
      <label for="usuario">Usuario:</label>
      <input type="text" name="usu" class="form-control" id="usuario" placeholder="Introduce Usuario">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" name="pass" class="form-control" id="pwd" placeholder="Introduce Contraseña">
    </div>
    <input type="submit" name="log" class="btn btn-default" value="Enviar">
	
			</form>			
		<%
	String error="";
	if(request.getAttribute("error")!=null)
	{
		error =request.getAttribute("error").toString();
	}%>
	<%= error %>
		
		</div>
	
		<div class="col-md-4"></div>
	</div>
</div>