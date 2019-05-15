window.onLoad = function(){ 

	var logout = document.getElementById("logout");
	logout.onClick = function() {
		clearCookie("name");
		//document.cookie = "name=AdamGibson; expires=Thu, 18 Dec 1970 12:00:00 UTC; path=/";
		console.log(document.cookie);
		window.location = '/y-enterprises';
	};
	
	function clearCookie(name, domain, path){
	    var domain = domain || document.domain;
	    var path = path || "/";
	    document.cookie = name + "=; expires=" + +new Date + "; domain=" + domain + "; path=" + path;
	};
};

