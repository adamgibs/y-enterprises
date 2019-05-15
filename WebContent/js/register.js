$(function(){
	$("#saveBtnId").on('click', function(event){
		event.preventDefault();
		
		$("#registerFormId").submit();
	});
	
	$("#cancelBtnId").on('click', function(event){
		event.preventDefault();
		window.location = '/y-enterprises';
	});
	
	
});