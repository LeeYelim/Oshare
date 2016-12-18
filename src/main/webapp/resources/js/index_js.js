$(function(){
	
	 var index=0; //goodsDetail[Title]
	 
	 var hirtIndex=0; //index Wish
	 
	 var mobileHeaderMenuIndex =0; // mobile header menu
	 
	 retalItemText();
	 saleItemListText();
	 
	/* header + index */
	$(document).on("scroll",function(){
		
		if($(window).scrollTop() > 65){	
			
			$(".headerNavaction").addClass("headerNavactionAdvice");
			$(".headerNavaction").css({"height":"65px","line-height":"45px","position":"fixed"})
		}else{
			
			$(".headerNavaction").removeClass("headerNavactionAdvice");
			$(".headerNavaction").css({"height":"85px","line-height":"65px","position":"relative"})
		
		}
		
		//$(window).scrollTop()
	});
	
	$(document).on("click",".headerIconNavaction .headerSearchIcon",function(){
		if($(".HeaderSearchForm").is(":animated"))return;
		$(".HeaderSearchForm").animate({"opacity":"1"},500).show();
	});//HeaaderSearch Event End
	
	$(document).on("click",".HeaderSearchForm .HeaderSearchClose",function(){
		if($(".HeaderSearchForm").is(":animated"))return;
		$(".HeaderSearchForm").animate({"opacity":"0"},500).hide(10);
	});//HeaaderSearch Event Close End
	
	$(document).on("click",".heartWish",function(){
		if($(this).css('color') == 'rgb(0, 0, 0)' == true){
			$(this).css({"color":"#ff0000"});
		}else{
			$(this).css({"color":"#000"});
		}	
	});//wish Event End
	
	$(document).on("click",".mobileHeaderNavaction .mobileHeaderNavactionBtn",function(){
		if($(".mobileHeaderNavactionMenu").is(":animated"))return;
		$(this).toggleClass('active-9');
		if(mobileHeaderMenuIndex <=0){
			mobileHeaderMenuIndex =1;
			$(".mobileHeaderNavactionMenu").animate({"left":"0"},500);
		}else{
			mobileHeaderMenuIndex =0;
			$(".mobileHeaderNavactionMenu").animate({"left":"-100%"},500);
		}
	});
	
	
	
	 //Sharing List Event 
	 var owl = $(".indexSharingList");	
	 owl.owlCarousel({
	      items : 4, //10 items above 1000px browser width
	      loop:true,
	      margin:10,
	      responsive:{
	          0:{
	              items:1
	          },
	          600:{
	              items:3
	          },
	          1000:{
	              items:4
	          }
	      },
	      autoplay:true,
	      autoplayTimeout:3000,
	      autoplayHoverPause:false,      
	  });
	 
	  // Custom Navigation Events
	  $(".SharingNext").click(function(){
	    owl.trigger('next.owl');
	  })
	  $(".SharingPrev").click(function(){
	    owl.trigger('prev.owl');
	  })//Sharing List Event End
	  
  	 //Rental List Event 
	 var owl2 = $(".indexRentalList");	
	 owl2.owlCarousel({
	      items : 4, //10 items above 1000px browser width
	      loop:true,
	      margin:10,
	      responsive:{
	          0:{
	              items:1
	          },
	          600:{
	              items:3
	          },
	          1000:{
	              items:4
	          }
	      },
	      autoplay:true,
	      autoplayTimeout:3000,
	      autoplayHoverPause:false,      
	  });
	 
	  // Custom Navigation Events
	  $(".RentalNext").click(function(){
	    owl2.trigger('next.owl');
	  })
	  $(".RentalPrev").click(function(){
	    owl2.trigger('prev.owl');
	  })//Rental List Event End
	  
	  // goodsList Search 
	  $(document).on("click",".goodsListDetailSearch,.goodsListDetailSearch2",function(){
	  if($("#goodsListDetailSearchDialog").is(":animated"))return;
	  	$("#goodsListDetailSearchDialog").css({"left":"60%"});
		 $(".dialogBlack").animate({"opacity":"0.7"},500).show();
		 $("#goodsListDetailSearchDialog").animate({"opacity":"1","left":"50%"},500).show();
	  }); //goodsListDetailSearch Dialog Event end
	  
	  $(document).on("click","#goodsListDetailSearchDialog .goodsCategory .goodsListDialogClose",function(){
		  if($("goodsListDetailSearchDialog").is(":animated"))return;
			 $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
			 $("#goodsListDetailSearchDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
	  }); //goodsListDetailSearch Close Dialog Event end 
	   
	   //goodsList mobileSearch
	  if($(window).width()<=992 && $(window).width() >=768 ){
		  $(".mobileDetailSearch span").addClass("goodsListDetailSearch2");
		  $(".mobileDetailSearch span").removeClass("mobilegoodsListDetailSearch");
	  }else{
		  $(".mobileDetailSearch span").addClass("mobilegoodsListDetailSearch");
		  $(".mobileDetailSearch span").removeClass("goodsListDetailSearch2");
	  }
	  
	  var owl3 = $(".mobileGoodsListCategory>ul");	
		 owl3.owlCarousel({
		      items : 4, //10 items above 1000px browser width
		      autoplay:false,
		      autoplayHoverPause:false,     
		      responsive:{
		          0:{
		              items:1
		          },
		          600:{
		              items:3
		          },
		          1000:{
		              items:4
		          }
		      }
		  }); 
		 
		  // Custom Navigation Events
		  $(".goodsListNext").click(function(){
		    owl3.trigger('next.owl');
		  })
		  
		  $(".goodsListPrev").click(function(){
		    owl3.trigger('prev.owl');
		  })//mobileGoodsListCategory  Event End
		  
		  $(document).on("click",".mobilegoodsListDetailSearch",function(){
			  if($("#mobileGoodsListDetailSearchDialog").is(":animated"))return;
			  	$("#mobileGoodsListDetailSearchDialog").css({"left":"60%"});
				 $(".dialogBlack").animate({"opacity":"0.7"},500).show();
				 $("#mobileGoodsListDetailSearchDialog").animate({"opacity":"1","left":"50%"},500).show();
		  });//mobilegoodsListDetailSearch Dialog Event End 
		  
		  $(document).on("click","#mobileGoodsListDetailSearchDialog .mobileGoodsCategory .mobileGoodsListDialogClose",function(){
			  if($("goodsListDetailSearchDialog").is(":animated"))return;
				 $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
				 $("#mobileGoodsListDetailSearchDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
		  });//mobilegoodsListDetailSearch Close Dialog Event End   
		  
		  //goodsDetail 
		  $(document).on("click",".goodsReviewTitle",function(){	
			  if($(".goodsReviewContent").is(":animated"))return;
			  if(  $(this).next().is(':hidden'))index = 0;
			  if(  $(this).next().is(':visible'))index = 1;
			  
			 if(index<=0){
				  $(this).next().slideDown();
			  }else{
				  $(this).next().slideUp();		  			 
			  }
		  });//review slide  
		  
		  
		
		  $(document).on("click",".goodsQuestionTitle",function(){	
			  if($(".goodsQuestionContent").is(":animated"))return;
			  if(  $(this).next().is(':hidden'))index = 0;
			  if(  $(this).next().is(':visible'))index = 1;
			  
			 if(index<=0){
				  $(this).next().slideDown();
			  }else{
				  $(this).next().slideUp();		  			 
			  }
		  });// q & a slide  
		  
		  $(document).on("click",".sellerInformation .sellerSub span:nth-child(1)",function(){
			  if($(".saleProfile").is(":animated"))return;
			  $(".saleProfile").css({"left":"60%"});
			  $(".dialogBlack").animate({"opacity":"0.7"},500).show();
			  $(".saleProfile").animate({"opacity":"1","left":"50%"},500).show(); 
		  });// goodsDetail Profile open Event End
		  
		  $(document).on("click",".saleProfile .saleProfileTitle .saleProfileClose",function(){
			  if($(".saleProfile").is(":animated"))return;
			  $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
			  $(".saleProfile").animate({"opacity":"0","left":"40%"},500).hide(10); 
		  });// goodsDetail Profile Close Event End
		 
		  
		  $(document).on("click",".sellerInformation .sellerSub span:nth-child(2)",function(){
			 if($(".saleMessage").is(":animated"))return;
			 $(".saleMessage").css({"left":"60%"});
			 $(".dialogBlack").animate({"opacity":"0.7"},500).show();
			 $(".saleMessage").animate({"opacity":"1","left":"50%"},500).show();
		  });// goodsDetail saleMessage Open Event End
		  
		  $(document).on("click",".saleMessage .saleMessageTitle .saleMessageClose",function(){
				 if($(".saleMessage").is(":animated"))return;
				 $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
				 $(".saleMessage").animate({"opacity":"0","left":"40%"},500).hide(10);
			  });// goodsDetail saleMessage Close Event End
		  
		  
		   //goodsDetailChatting  q & a
		  $(document).on("click",".goodsQuestionContent .goodsQuestionAdd",function(){
			//var str =$(this).parent().parent().children("td:first").next().text();
			 $(".goodsQuestionChattingForm").remove();
			  	
			 $(this).parent().append("<div class='goodsQuestionChattingForm'>" +
			 		"<p>cfrqw1234 에게 댓글 쓰기</p>" +
			 		"<form>" +
			 		"<textarea  name='goodsChatting'></textarea>" +
			 		"<input type='button' value='입력'>" +
			 		"</form><p>200자내외</p></div>");
		  	});
		  
		  $(document).on("click",".goodsQuestionChattingForm input[type=button]",function(){
			  $(this).parent().parent().parent().children("span:nth-child(1)").append("<h1>asd</h1>");
		  });
		  
		  $(document).on("click","#goodsQuestion .goodsQuestionPlus",function(){
		  $(".goodsQuestionPlusForm").remove();
		  
			$(".goodsQuestionFrame").append("<div class='goodsQuestionPlusForm'>" +
	 		"<form action='' method=''><div class='goodsQuestionPlusFormTitle'>" +
			"<span>제목 : </span><input type='text' name=''></div>" +
			"<div class='goodsQuestionPlusFormContent'><span>내용 : </span>" +
			"<textarea ></textarea></div><input type='submit' value='전송'>" +
			"</form></div>");
		  });
		  
		  //goodsDetailChatting  review
		  $(document).on("click",".goodsReviewContent .goodsReviewAdd",function(){
				//var str =$(this).parent().parent().children("td:first").next().text();
				 $(".goodsReviewChattingForm").remove();
				  	
				 $(this).parent().append("<div class='goodsReviewChattingForm'>" +
				 		"<p>cfrqw1234 에게 댓글 쓰기</p>" +
				 		"<form>" +
				 		"<textarea  name='goodsReviewChatting'></textarea>" +
				 		"<input type='button' value='입력'>" +
				 		"</form><p>200자내외</p></div>");
			  	});
			  
			  $(document).on("click",".goodsReviewChattingForm input[type=button]",function(){
				  $(this).parent().parent().parent().children("span:nth-child(1)").append("<h1>asd2</h1>");
			  });
			  
			  $(document).on("click","#goodsReview .goodsReviewPlus",function(){
			  $(".goodsReviewPlusForm").remove();
			  
				$(".goodsReviewFrame").append("<div class='goodsReviewPlusForm'>" +
		 		"<form action='' method=''><div class='goodsReviewPlusFormTitle'>" +
				"<span>제목 : </span><input type='text' name=''></div>" +
				"<div class='goodsReviewPlusFormContent'><span>내용 : </span>" +
				"<textarea ></textarea></div><input type='submit' value='전송'>" +
				"</form></div>");
			  });
		  
		  
		  
		   //saleItemList 
		  $(document).on("click",".saleItemListForm input[value=비용청구]",function(){
			 		if($(".saleItemListDialog").is(":animated"))return;
			  		$(".saleItemListDialog").css({"left":"60%"});
			  		$(".dialogBlack").animate({"opacity":"0.7"},500).show();
			  		$(".saleItemListDialog").animate({"opacity":"1","left":"50%"},500).show();
		  });//saleItemListDialog Event End
		  
		  $(document).on("click",".saleItemListDialog .saleItemListClose",function(){
			  		if($(".saleItemListDialog").is(":animated"))return;
			  		$(".dialogBlack").animate({"opacity":"0"},500).hide(10);
			  		$(".saleItemListDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
		  });//saleItemListDialog Close Event End
		  
		  $(document).on("click",".saleItemListDialog .saleItemBtn input[value=취소]",function(){
		  		if($(".saleItemListDialog").is(":animated"))return;
		  		$(".dialogBlack").animate({"opacity":"0"},500).hide(10);
		  		$(".saleItemListDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
	  	  });//saleItemListDialog Close Event End
		  
		  
		   //rentalItemList 
		  $(".rentalItemEvaluation #rateYo").rateYo().on("rateyo.set", function (e, data) {
              alert("The rating is set to " + data.rating + "!");
           });//rentalItemEvaluation Event End		
		  
		  $(document).on("click",".rentalItemListForm input[value=반납신청]",function(){
		 		if($(".rentalItemListDialog").is(":animated"))return;
		  		$(".rentalItemListDialog").css({"left":"60%"});
		  		$(".dialogBlack").animate({"opacity":"0.7"},500).show();
		  		$(".rentalItemListDialog").animate({"opacity":"1","left":"50%"},500).show();
		  });//rentalItemListDialog Event End
		  
		  $(document).on("click",".rentalItemListDialog .rentalItemListClose",function(){
			  		if($(".rentalItemListDialog").is(":animated"))return;
			  		$(".dialogBlack").animate({"opacity":"0"},500).hide(10);
			  		$(".rentalItemListDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
		  });//rentalItemListDialog Close Event End
		  
		  $(document).on("click",".rentalItemListDialog .rentalItemListBtn input[value=취소]",function(){
		  		if($(".rentalItemListDialog").is(":animated"))return;
		  		$(".dialogBlack").animate({"opacity":"0"},500).hide(10);
		  		$(".rentalItemListDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
		  });//rentalItemListDialog Close Event End
		  
		  //rentalItem Text 
	  function retalItemText(){
		  if($(".rentalItemListTransactionStatus span").text() == "대여대기"){
			  //예약취소
			  $(".rentalItemListTransactionStatus input[type=button]").val("예약취소");
		  }else if($(".rentalItemListTransactionStatus span").text() == "대여중"){
			  //반납신청
			  $(".rentalItemListTransactionStatus input[type=button]").val("반납신청");
		  }else if($(".rentalItemListTransactionStatus span").text() == "반납신청 중"){
			  //판매자한테 청구하기 버튼 생성
			  //판매자가 청구하기 할때 대여자도 청구하기 버튼이 생김
			  //대여자 버튼 사라짐
			  $(".rentalItemListTransactionStatus span").css({"height":"60px","line-height":"60px"});
			  $(".rentalItemListTransactionStatus input[type=button]").hide();
		  }else if($(".rentalItemListTransactionStatus span").text() == "추가금결제"){
			  $(".rentalItemListTransactionStatus span").css({"line-height":"30px"});
			  $(".rentalItemListTransactionStatus input[type=button]").show().val("결제하기");
		  }else if($(".rentalItemListTransactionStatus span").text() == "거래완료"){
			  $(".rentalItemListTransactionStatus input[type=button]").remove();
			  //거래완료
		  }
	  }
	  //saleItemList Text
	  function saleItemListText(){
		  if($(".saleItemListTransactionStatus span").text() == "대여대기"){
			  //예약취소
			  $(".saleItemListTransactionStatus span").css({"line-height":"78px"});
			  $(".saleItemListTransactionStatus input[type=button]").hide();
		  }else if($(".saleItemListTransactionStatus span").text() == "대여중"){
			  //반납신청
			  $(".saleItemListTransactionStatus span").css({"line-height":"78px"});
			  $(".saleItemListTransactionStatus input[type=button]").hide();
		  }else if($(".saleItemListTransactionStatus span").text() == "반납신청 중"){
			  //판매자한테 청구하기 버튼 생성
			  $(".saleItemListTransactionStatus span").css({"line-height":"38px"});
			  $(".saleItemListTransactionStatus input[type=button]").show().val("반납완료");		  
			  //판매자가 청구하기 할때 대여자도 청구하기 버튼이 생김
			  //대여자 버튼 사라짐
			  $(".saleItemListTransactionStatus span").css({"line-height":"78px"});
			  $(".saleItemListTransactionStatus input[type=button]").remove();
		  }else if($(".saleItemListTransactionStatus span").text() == "거래완료"){
			  //거래완료
		  }
	  }
	 
		  //declaration
		  $(document).on("click",".declaration img",function(){
			  if($(".declarationDialog").is(":animated"))return;
			  $(".declarationDialog").css({"left":"60%"});
			  $(".dialogBlack").animate({"opacity":"0.7"},500).show();
			  $(".declarationDialog").animate({"opacity":"1","left":"50%"},500).show()
		  });//declarationDialog Open Event End
		  
		  $(document).on("click",".declarationDialog .declarationTitle .declarationClose",function(){
			  if($(".declarationDialog").is(":animated"))return;
			  $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
			  $(".declarationDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
		  });//declarationDialog Close Event End
		  
		  $(document).on("click",".declarationDialog .declarationBtn input[value=취소] ",function(){
			  if($(".declarationDialog").is(":animated"))return;
			  $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
			  $(".declarationDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
		  });//declarationDialog Close Event End
		  		
		 //wishList 
	    $(document).on("click",".wishListClose",function(){
	    	$(this).parent().parent().remove();
	    });
	    
	     //userManagement
	    $(document).on("click","#userManagement ul li a",function(){
	    	if($(this).text() == "전체회원")$(".userManagementBtn input").val("정지");
    		if($(this).text() == "신고당한 회원")$(".userManagementBtn input").val("정지");
			if($(this).text() == "정지회원")$(".userManagementBtn input").val("정지해제");
	    });
	   
	    //sendMessage
	    //받은 쪽지함
	    function sendInMessage(){
	    	var user = $(".sendMessageTabForm input[name=sender]").val();
	    	$(".inMessage table tr:gt(0)").remove();
	    	$.ajax({
				url: "/controller/mypage/sendMessageSelect" , //서버요청이름
				type : "post" , //method방식 (get , post) 
				dataType :  "json" , //요청결과타입 (text ,xml , html , json)
				data : "posts=receiver&division="+user,
				success : function(result){
					if(result.length <=0){
						$(".inMessage table tr:nth-child(1)").parent().append("<tr><td colspan='4' style='width:100%; text-align:center; border:none;'>쪽지가 존재하지 않습니다</td></tr>");
					}	
				}, //성공
				error : function(err){
					alert("err :"+err);
				} , //실패
			});
	    	 $("#inMessageTable").DataTable({
	    		  destroy: true,
		 	    	'ajax': {
		 	    	    "type"   : "POST",
		 	    	    "url"    : '/controller/mypage/sendMessageSelect',
		 	    	    "data"   :{
		 	    	    	"posts" : "receiver",
		 	    	    	"division" : user
		 	    	    },
		 	    	    "dataSrc": ""
		 	    	  },
		 	    	  
		 	    	  'columns': [
	    	            {"data" : "messageNo",render: function ( data, type, row ) {
	                      return '<input type="checkbox" name="inMessageCheckbox" value='+data+'>';
	    	            }},
		 	    	    {"data" : "content"},
		 	    	    {"data" : "sender"},
		 	    	    {"data" : "sendingDate"}
		 	    	  ]
		 	    }); 	
	    	
	    	
	    }
	   
	    
		
	    $(document).on("click",".sendMessageForm .receiverMessage",function(){
	    	sendInMessage();
	    }); //받은 쪽지함 Event end
	    
	    //받은 쪽지함 check all
	    $(document).on("click",".inMessage .allCheck",function(){
	    	if($(".inMessage .allCheck").prop("checked")){
	    		$(".inMessage table tr td input[type=checkbox]").prop("checked",true);
	    	}else{
	    		$(".inMessage table tr td input[type=checkbox]").prop("checked",false);
	    	}
	    });
	    
	    //받은 쪽지함 삭제
	    $(document).on("click",".inSendMessageBtn input[type=button]",function(){
	    	var inSendMessageCheckBoxVal = [];
	    	$(".inMessage table tr td input[name=inMessageCheckbox]:checked").each(function(index){
	    		inSendMessageCheckBoxVal.push($(this).val());
	    	});
	    	$.ajax({
				url: "/controller/mypage/sendMessageDelete" , //서버요청이름
				type : "post" , //method방식 (get , post) 
				dataType : "text" , //요청결과타입 (text ,xml , html , json)
				data : "messageNo="+inSendMessageCheckBoxVal,
				success : function(result){
					if(result <=0){
						alert("삭제할 항목을 선택해 주십시오")
					}
					sendInMessage();
				} , //성공
				error : function(err){
					alert("err :"+err)
				} , //실패
			});
	    	
	    });
	        
	  //보낸 쪽지함
	    function sendOutMessage(){
	    	var user = $(".sendMessageTabForm input[name=sender]").val();
	    	$(".outMessage table tr:gt(0)").remove();
	    	$.ajax({
				url: "/controller/mypage/sendMessageSelect" , //서버요청이름
				type : "post" , //method방식 (get , post) 
				dataType : "json" , //요청결과타입 (text ,xml , html , json)
				data : "posts=sender&division="+user,
				success : function(result){
					if(result.length <=0 ){
						$(".outMessage table tr:nth-child(1)").parent().append("<tr><td colspan='4' style='width:100%; text-align:center; border:none;'>쪽지가 존재하지 않습니다</td></tr>");
					}
				} , //성공
				error : function(err){
					alert(err)
				} , //실패
			});
	    	
	    	 $("#outMessageTable").DataTable({
	    		  destroy: true,
		 	    	'ajax': {
		 	    	    "type"   : "POST",
		 	    	    "url"    : '/controller/mypage/sendMessageSelect',
		 	    	    "data"   :{
		 	    	    	"posts" : "sender",
		 	    	    	"division" : user
		 	    	    },
		 	    	    "dataSrc": ""
		 	    	  },
		 	    	  
		 	    	  'columns': [
	    	            {"data" : "messageNo",render: function ( data, type, row ) {
	                      return '<input type="checkbox" name="outMessageCheckbox" value='+data+'>';
	    	            }},
		 	    	    {"data" : "content"},
		 	    	    {"data" : "receiver"},
		 	    	    {"data" : "sendingDate"}
		 	    	  ]
		 	    }); 
	    }
	    
	    $(document).on("click",".sendMessageForm .senderMessage",function(){
	    	sendOutMessage();
	    }); //보낸 쪽지함 Event end
	    
	    //보낸 쪽지함 check all
	    $(document).on("click",".outMessage .allCheck",function(){
	    	if($(".outMessage .allCheck").prop("checked")){
	    		$(".outMessage table tr td input[type=checkbox]").prop("checked",true);
	    	}else{
	    		$(".outMessage table tr td input[type=checkbox]").prop("checked",false);
	    	}
	    });
	    
	    //보낸 쪽지함 삭제
	    $(document).on("click",".outSendMessageBtn input[type=button]",function(){
	    	var outSendMessageCheckBoxVal = [];
	    	$(".outMessage table tr td input[name=outMessageCheckbox]:checked").each(function(index){
	    		outSendMessageCheckBoxVal.push($(this).val());
	    	});
	    	
	    	$.ajax({
				url: "/controller/mypage/sendMessageDelete" , //서버요청이름
				type : "post" , //method방식 (get , post) 
				dataType : "text" , //요청결과타입 (text ,xml , html , json)
				data : "messageNo="+outSendMessageCheckBoxVal,
				success : function(result){
					if(result <=0){
						alert("삭제할 항목을 선택해 주십시오")
					}
					sendOutMessage();
				} , //성공
				error : function(err){
					alert("err :"+err)
				} , //실패
			});
	    	
	    });
	   
	});

