/**
 *
 */

$(document).ready(function() {

	$('#accionar').on('click',function(){
/*		alert($('#miTexto').text());
		$('#miTexto').fadeIn();
		$("#miTexto").fadeOut();
		$('#miTexto').text("Cambia texto");
			$("#miTexto").animate({
				 width: [ "toggle", "swing" ],
				    height: [ "toggle", "swing" ],
				    opacity: "toggle"
				  });
*/
/*		var urll="https://randomuser.me/api/?results=5"
		$.getJSON( urll, function( json ) {
			$.each(json.results, function(index){
				$('#listado').append(json.results[index].name.first);
				$('#listado').append("<br>");
				
			});
		 });*/
		
		
			
			/*$.getJSON( "https://randomuser.me/api/?results=12", function( json ) {
				var indice=1;
				$("#listado").empty();
				$("#listado").append('<hr style ="border: 1px solid #eee;">');
		        $.each(json.results, function(index) {
		        	var newDiv=""
		        	newDiv += '<div class="col-md-4 text-center" style="height:380px">';
		            newDiv += '<a href="mailto:'+json.results[index].email+'">';
		            newDiv += '<img class="img-circle" src="'+ json.results[index].picture.large +'" alt="" /></a>';
		        	newDiv += '<h3>'+json.results[index].name.first + ' '+json.results[index].name.last + '  </h3>';
		        	newDiv += '<p><strong>Usuario:</strong>'+json.results[index].login.username+'</p>';
		        	newDiv += '<p><strong>Direcci&oacute;n:</strong>'+json.results[index].location.street+', ';
		        	newDiv += json.results[index].location.city+','+json.results[index].location.state+', ';
		        	newDiv += json.results[index].location.postcode+'</p>';
		        	newDiv += '<p><strong>Nacionalidad:</strong>'+json.results[index].nat+'</p>';
		        	newDiv += '<p><strong>Telefono:</strong>'+json.results[index].phone+'</p>';
		        	newDiv += '<p><strong>Movil:</strong>'+json.results[index].cell+'</p>';
		        	newDiv += '</div>';
		        	if ((indice % 3) == 0)
		        	{
		        		newDiv += '<hr style ="border: 1px solid #eee;">';
		        	}
		        	indice++;
		            $("#listado").append(newDiv);
		        });
		});*/
		
		$.getJSON( "https://randomuser.me/api/?results=12", function( json ) {
			$.each(json.results, function(index) {
		        
			var elem = $('#card').clone().removeAttr("id");
			$(elem).css("height","380px")
			$(elem).find("img").attr("src",json.results[index].picture.large)
			var nombreFin =json.results[index].name.first +" "+ json.results[index].name.last
			$(elem).find('.title a').text(nombreFin.toUpperCase())
			$(elem).find(".desc:eq(0)").text(json.results[index].name.first.toUpperCase() +" "+ json.results[index].name.last.toUpperCase())
			$(elem).find(".desc:eq(1)").html(json.results[index].phone +" "+ json.results[index].nat)		
			$(elem).find(".desc:eq(2)").html(json.results[index].email)		
			
			$(elem).find(".bottom").remove()
			if (json.results[index].gender== "male")
				{
				$(elem).css("background-color","#d6eef9")
				}
			else
				{
				$(elem).css("background-color","#f7d6f9")
				}
			$(elem).appendTo('#listado').show();
			});	
		});	
		
		
	});
})

