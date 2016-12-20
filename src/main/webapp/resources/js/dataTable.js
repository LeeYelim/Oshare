$(function(){
	$("#wishListTable").DataTable({
		"autoWidth": false,
		"columns" : [
     {"targets":"0","width":"50%"},
     {"targets":"1","width":"50%"}
     ]
	});
	
	$("#saleItemTable").DataTable({
		"autoWidth": false,
		"order": [[ 4, "desc" ]],
		'bFilter': true,
		
		"columns" : [
         {"targets":"0","width":"17%"},
         {"targets":"1","width":"10%"},
         {"targets":"2","width":"10%"},
         {"targets":"3","width":"15%"},
         {"targets":"4","width":"10%"},
         {"targets":"5","width":"10%"}
         ]
	});
	
	$("#rentalItemTable").DataTable({
		"autoWidth": false,
		"order": [[ 4, "desc" ]],
		"columns" : [
		             {"targets":"0","width":"15%"},
		             {"targets":"1","width":"10%"},
		             {"targets":"2","width":"10%"},
		             {"targets":"3","width":"15%"},
		             {"targets":"4","width":"10%"},
		             {"targets":"5","width":"10%"}  
		             ]
	});
	
	$("#userManagementTable").DataTable({
		"autoWidth": false,
		"columns" : [
		             {"targets":"0","width":"1%"},
		             {"targets":"1","width":"10%"},
		             {"targets":"2","width":"10%"},
		             {"targets":"3","width":"10%"},
		             {"targets":"4","width":"10%"},
		             {"targets":"5","width":"10%"},
		             {"targets":"6","width":"10%"},
		             {"targets":"7","width":"10%"},
		             {"targets":"8","width":"10%"},
		             {"targets":"9","width":"10%"},
		             {"targets":"10","width":"10%"},
		             {"targets":"11","width":"10%"},
		             ]
	});
	
	$("#userManagementDeclarationTable").DataTable({
		"autoWidth": false,
		"columns" : [
		             {"targets":"0","width":"1%"},
		             {"targets":"1","width":"10%"},
		             {"targets":"2","width":"10%"},
		             {"targets":"3","width":"10%"},
		             {"targets":"4","width":"10%"},
		             {"targets":"5","width":"10%"},
		             {"targets":"6","width":"10%"},
		             {"targets":"7","width":"10%"},
		             {"targets":"8","width":"10%"},
		             {"targets":"9","width":"10%"},
		             {"targets":"10","width":"10%"},
		             {"targets":"11","width":"10%"},
		             ]
	});
	
	$("#userManagementStopTable").DataTable({
		"autoWidth": false,
		"columns" : [
		             {"targets":"0","width":"1%"},
		             {"targets":"1","width":"10%"},
		             {"targets":"2","width":"10%"},
		             {"targets":"3","width":"15%"},
		             {"targets":"4","width":"10%"},
		             {"targets":"5","width":"10%"},
		             {"targets":"6","width":"10%"},
		             {"targets":"7","width":"10%"},
		             {"targets":"8","width":"10%"},
		             {"targets":"9","width":"10%"},
		             {"targets":"10","width":"10%"},
		             {"targets":"11","width":"10%"},
		             ]
	});
	
	
	
	$("#saleProductTable").DataTable({
		"autoWidth": false,
		"columns" : [
             {"width":"25%"},
             {"width":"50%"},
             {"width":"25%"}
		]
		     		
	});
	
	
	
		
});