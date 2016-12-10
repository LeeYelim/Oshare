$(function(){
	/* header + index */
	$(document).on("scroll",function(){
		console.log($(window).scrollTop())
		
		if($(window).scrollTop() > 0){	
			$(".headerNavaction").addClass("headerNavactionAdvice");
			$(".headerNavaction").css({"height":"65px","line-height":"45px","position":"fixed"})
		}else{
			$(".headerNavaction").removeClass("headerNavactionAdvice");
			$(".headerNavaction").css({"height":"85px","line-height":"65px","position":"relative"})
		}
	});
	
	$(document).on("click",".headerIconNavaction .headerSearchIcon",function(){
		if($(".HeaderSearchForm").is(":animated"))return;
		$(".HeaderSearchForm").animate({"opacity":"1"},500).show();
	});//HeaaderSearch Event End
	
	$(document).on("click",".HeaderSearchForm .HeaderSearchClose",function(){
		if($(".HeaderSearchForm").is(":animated"))return;
		$(".HeaderSearchForm").animate({"opacity":"0"},500).hide(10);
	});//HeaaderSearch Event Close End
	
	$(document).on("click",".mobileHeaderNavaction span",function(){
		if($(".mobileHeaderNavactionMenu").is(":animated"))return;
		$(".mobileHeaderNavactionMenu").css({"left":"100%"});
		$(".mobileHeaderNavactionMenu").show().animate({"opacity":"1","left":"0"},500);
		$("#contentTiles").hide();
		$("footer").hide();
	});//mobileMenu Click Event End
	
	$(document).on("click",".mobileHeaderNavactionMenu ul li .close",function(){
		if($(".mobileHeaderNavactionMenu").is(":animated"))return;
		$(".mobileHeaderNavactionMenu").animate({"opacity":"0","left":"-100%"},500).hide(10);
		$("#contentTiles").show();
		$("footer").show();
	});//mobileMenu Click Close Event End
	
	/* Sharing List Event */
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
	  
  	/* Rental List Event */
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
	  
	  /* goodsList Search */
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
	   
	  /* goodsList mobileSearch*/
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
		  
		  /* goodsDetail */
		  var index=0;
		  $(document).on("click",".goodsQuestionTitle",function(){	
			  if($(".goodsQuestionContent").is(":animated"))return;
			  if(index<=0){
				  $(".goodsQuestionContent").slideDown();
				  index=1;
			  }else{
				  $(".goodsQuestionContent").slideUp();		  
				  index=0;
				 
			  }
		  });
		  
		  /* goodsDetailChatting */
		  $(document).on("click",".goodsQuestionContent .goodsQuestionAdd",function(){
			//var str =$(this).parent().parent().children("td:first").next().text();
			 $(".goodsChattingForm").remove();
			  	
			 $(this).parent().append("<div class='goodsChattingForm'>" +
			 		"<p>cfrqw1234 에게 댓글 쓰기</p>" +
			 		"<form>" +
			 		"<textarea  name='goodsChatting'></textarea>" +
			 		"<input type='button' value='입력'>" +
			 		"</form><p>200자내외</p></div>");
		  	});
		  
		  $(document).on("click",".goodsChattingForm input[type=button]",function(){
			  $(this).parent().parent().parent().children("span:nth-child(1)").append("<h1>asd</h1>");
		  });
		  
		  $(document).on("click","#goodsQuestion .goodsQuestionPlus",function(){
		  $(".goodsQuestionPlusForm").remove();
		  
			$(".goodsQuestionForm").append("<div class='goodsQuestionPlusForm'>" +
	 		"<form action='' method=''><div class='goodsQuestionPlusFormTitle'>" +
			"<span>제목 : </span><input type='text' name=''></div>" +
			"<div class='goodsQuestionPlusFormContent'><span>내용 : </span>" +
			"<textarea ></textarea></div><input type='submit' value='전송'>" +
			"</form></div>");
		  });
		  
		  /* saleItemList */
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
		  
		  /* rentalItemList */
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
		  
		  
});