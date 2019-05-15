$(function(){
	$("#submitBtnId").on('click', function(event){
		event.preventDefault();
		var username = $("#userNameId").val();
		var password = $("#passwordId").val();
		
		if(username.trim().length == 0 || password.trim().length == 0 ){
			$("#errMessage").empty().append("Invalid Username or Password!!!")
			return;
		}
		
		$("#loginFormId").submit();
	});
	
	$("#cancelBtnId").on('click', function(event){
		event.preventDefault();
		window.location = '/y-enterprises';
	});
	
	
	
});