$(function() {
	
	$("#logout").on('click',function(){		
		bootbox.confirm({ 
			  size: "small",
			  message: "Are you sure?", 
			  callback: function(result){				  
			  if(result){				  
				  
				  bootbox.hideAll();	
							  
				  location.href="logout";
				  
			  }else{
				  
				  
				  
			  }
			  
			  /* result is a boolean; true = OK, false = Cancel*/ }
			})
		
	});
	
	
});