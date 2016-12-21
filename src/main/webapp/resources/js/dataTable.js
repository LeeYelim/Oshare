$(function(){
	$("#wishListTable").DataTable({
		"autoWidth": false,
		"language": {
		    "zeroRecords": "위시리스트가 존재하지 않습니다."
		  },
		"columns" : [
     {"targets":"0","width":"50%"},
     {"targets":"1","width":"50%"}
     ]
	});
	
	$("#saleItemTable").DataTable({
		"autoWidth": false,
		"order": [[ 4, "desc" ]],
		"language": {
		    "zeroRecords": "판매물품이 존재하지 않습니다."
		  },
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
		"language": {
		    "zeroRecords": "대여물품이 존재 하지 않습니다."
		  },
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
		"language": {
		    "zeroRecords": "회원이 존재하지 않습니다."
		  },	
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
		"language": {
		    "zeroRecords": "신고회원이 존재하지 않습니다."
		  },	
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
		             {"targets":"12","width":"10%"},
		             ]
	});//신고회원 table
	
	$("#userManagementStopTable").DataTable({
		"autoWidth": false,
		"language": {
		    "zeroRecords": "정지회원 존재하지 않습니다."
		  },	
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
		             {"targets":"12","width":"10%"}
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