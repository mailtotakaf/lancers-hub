//https://agohack.com/getting-checkbox-with-map-and-each-in-jquery/
//https://tokkan.net/spring/json.html
$("#searchButton").on("click", function(){
	
	var chks = $('input[class="dptClass"]:checked').map(function(){
		//$(this).prop('disabled', true);
		return $(this).val();
	}).get();
	
	var forms={}
	forms["empId"]=chks;
	forms["empName"]=2;
	
	var formJson = JSON.stringify( forms );
	
	$.ajax({
		   type: "POST",
		   url: "/empSearch",
		   data: "formJson="+formJson,
		   dataType:"HTML",
		   success: function(res){
			   alert( "Data Saved: " + res );
			   $("#fromModalEmpList").html(res);
		   },
		   error: function(res){
			   alert( "error" + res );
		   },
	 });
});
