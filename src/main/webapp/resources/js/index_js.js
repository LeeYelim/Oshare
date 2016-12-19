$(function(){
	
	 var index=0; //goodsDetail[Title]
	 
	 var hirtIndex=0; //index Wish
	 
	 var mobileHeaderMenuIndex =0; // mobile header menu
	 
	 rentalItemText();
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
		  
		  //별점 
		  $(".sellerStar").rateYo({
			  rating : 0,
		   	  readOnly : true
		  });//goodsDetail rateYo Evnet end
		  
		  
		
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
		  
		  //goodsDetail profile saleReview dataTable + ajax
		  function goodsDetailSaleReview(){
			  var boardNo = $(".sellerInformation ul input[name=goodsDetailBoardNo]").val()
			  
			  $.ajax({
				url: "/controller/board/boardSaleReview" , //서버요청이름
				type : "post" , //method방식 (get , post) 
				dataType : "json" , //요청결과타입 (text ,xml , html , json)
				data : "boardNo="+boardNo,
				success : function(result){
					if(result.length <=0 ){
						$(".outMessage table tr:nth-child(1)").parent().append("<tr><td colspan='4' style='width:100%; text-align:center; border:none;'>쪽지가 존재하지 않습니다</td></tr>");
					}
				} , //성공
				error : function(err){
					alert(err)
				} , //실패
			});
			  
			  $("#saleReviewTable").DataTable({
				  destroy: true,
		 	    	'ajax': {
		 	    	    "type"   : "POST",
		 	    	    "url"    : '/controller/board/boardSaleReview',
		 	    	    "data"   :{
		 	    	    	"boardNo" : boardNo 
		 	    	    },
		 	    	    "dataSrc": ""
		 	    	  },
		 	    	  
		 	    	  'columns': [
	    	            /*{"data" : ""}*/
		 	    	    {"data" : "content"},
		 	    	    {"data" : "receiver"},
		 	    	    {"data" : "sendingDate"}
		 	    	  ]
			  });
		  }//goodsDetail profile saleReview dataTable + ajax End
		  
		  
		  $(document).on("click",".sellerInformation .sellerSub span:nth-child(2)",function(){
			 if($(".saleMessage").is(":animated"))return;
			 $(".saleMessageRecipient input[type=text]").val("")
			 $(".saleMessageContent textarea").val("")
			 $(".saleMessage").css({"left":"60%"});
			 $(".dialogBlack").animate({"opacity":"0.7"},500).show();
			 $(".saleMessage").animate({"opacity":"1","left":"50%"},500).show();
		  });// goodsDetail saleMessage Open Event End
		  
		  $(document).on("click",".saleMessage .saleMessageTitle .saleMessageClose",function(){
				 if($(".saleMessage").is(":animated"))return;
				 $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
				 $(".saleMessage").animate({"opacity":"0","left":"40%"},500).hide(10);
			  });// goodsDetail saleMessage Close Event End
		  
		  
		  //상세보기 쪽지 보내기
		  $(document).on("click",".saleMessageBtn input[type=button]",function(){
				if($(".saleMessageRecipient input[type=text]").val() == ""){
					alert("받는이를 입력해주세요");
					$(".recipient input[type=text]").focus();
					
				}else if($(".saleMessageContent textarea").val() == ""){
					alert("쪽지내욤을 입력해주세요");
					$(".noteContent textarea").focus();		
				}else if(!receiverBoolean){
					alert("수신자가 존재하지 않습니다.");
				}else{
			  $.ajax({
					url: "/controller/mypage/DetailSendMessageInsert" , //서버요청이름
					type : "post" , //method방식 (get , post) 
					dataType :  "text" , //요청결과타입 (text ,xml , html , json)
					data : $(".saleMessage form").serialize(),
					success : function(result){
						if(result <= 0){
							alert("error")
						}else{
							alert("메세지 전송");
							 if($(".saleMessage").is(":animated"))return;
							 $(".dialogBlack").animate({"opacity":"0"},500).hide(10);
							 $(".saleMessage").animate({"opacity":"0","left":"40%"},500).hide(10);
						}
					}, //성공
					error : function(err){
						alert("err :"+err);
					} , //실패
				}); // ajax End
				}	
		  });//상세보기 message Event End
		  
		  //상세보기 수신자 유효성 검사
		  
		  var receiverBoolean = true;
		  $(document).on("keyup",".saleMessageRecipient input[name=receiver]",function(){			  
			  $.ajax({
					url: "/controller/member/receiverSelect" , //서버요청이름
					type : "post" , //method방식 (get , post) 
					dataType : "text" , //요청결과타입 (text ,xml , html , json)
					data : "receiver="+$(this).val(),
					success : function(result){
						if(result <=0){
							receiverBoolean = false;
						}else{
							receiverBoolean = true;
						}
					} , //성공
					error : function(err){
						alert("err :"+err)
						receiverBoolean = false;
					} , //실패
				});
			});
		  		  
		  
//상품후기
		  
		  //질문하기
		  $(document).on("click","#goodsReview .goodsReviewPlus",function(){
			  $(".goodsReviewPlusForm").remove();
			  
			  $(".goodsReviewFrame").append("<div class='goodsReviewPlusForm'>" +
					  "<form action='' method=''><div class='goodsReviewPlusFormTitle'>" +
					  "<span>제목 : </span><input type='text' name='sub3'></div>" +
					  "<div class='goodsReviewPlusFormContent'><span>내용 : </span>" +
					  "<textarea id='sub4'></textarea></div><input type='button' id='sub5' value='전송'>" +
			  "</form></div>");
			  
		  });
		  
		  $(document).on("click","#sub5",function(){
			  $.ajax({
				  type:'post',
				  dataType:'json',
				  data:'boardNo='+$(".sellerInformation input[name=goodsDetailBoardNo]").val()+'&contents='+$("#sub4").val()+'&subject='+$("input[name=sub3]").val(),
				  url:'/controller/board/rinsert',
				  success:function(re){
					  if(re > 0) ReviewSelect();
				  },
				  
				  error:function(err){
					  alert(err);
				  }
			});
			  
		  });
		  
		  //후기 리스트
			function ReviewSelect(){
				$(".goodsReviewFrame").html("");
				$.ajax({
	             	type:'post',
	             	dataType:'json',
	             	data:'boardNo='+$(".sellerInformation input[name=goodsDetailBoardNo]").val(),
	             	url:'/controller/board/rselect',
	             	success:function(re){
	             		var str="";
	             		$.each(re, function(index,item) {
		             		if(item.parentNo==0){
		             			str ='<div class="goodsReviewForm"><div class="goodsReviewTitle">'
		             			+"<input type='hidden' values="+item.reviewNo+">"
		    					+'<span>'+item.subject+''+item.memberId+''+item.regDate+'</span></div>'
		    					+'<div class="goodsReviewContent">'
		    					+'<span id="Review'+item.reviewNo+'"><div class="goodsProductReviewsForm"><div class="goodsProductReviews">'+item.contents+'</div>'
		    					+'<span class="goodsReviewAdd" name="insertReview" id="' + item.reviewNo + '">댓글달기 | <input type="button" id= "insertReviewDelete" name="'+item.reviewNo+'" value="삭제" ></span></div></span></div></div>'
		    					
		    					$(".goodsReviewFrame").append(str);
		             		}
		             	})
		             	
	             		$.each(re, function(index,item) {
	             			if(item.parentNo!=0){
	             				str =''
		    					+'<span id="Review'+item.reviewNo+'"><div class="goodsProductReviewsForm"><div class="goodsProductReviews">'+item.memberId+''+item.regDate+'<p>'+item.contents+'</div>'
		    					+'<span class="goodsReviewAdd" name="insertReview" id="' + item.reviewNo + '"><input type="button" id= "insertReviewDelete" name="'+item.reviewNo+'" value="삭제" ></span></div></span></div></div>'
 
		    					$("span[id=Review"+item.parentNo+"]").append(str);
	             			}
	             		})
	             	},
	             	error:function(err){
	             		alert(err);
	             	}
				})
			  }
			
			
			//상푸후기 댓글삭제
			$(document).on("click", "#insertReviewDelete", function(){
				$(this).attr('name');
				$.ajax({
					  type:'post',
					  dataType:'json',
					  data:'reviewNo='+$(this).attr('name')+'&memberId='+$(".sellerInformation input[name=user]").val(),
					  url:'/controller/board/rdelete',
					  success:function(re){
						  ReviewSelect();						  	 
					  },
					  error:function(err){
						  ReviewSelect();
					  }
					  
				  })	
				  $(".goodsReviewForm").remove();
				  $(".goodsReviewContent").remove();
				
			})
			
		  
			//상품후기 클릭
			$(document).on("click", "#ww", function() {
				  ReviewSelect();
				  $(".goodsReviewForm").remove();
				  $(".goodsReviewContent").remove();
			  })

			  
		  // 댓글달기 클릭
			  $(document).on("click",".goodsReviewContent .goodsReviewAdd",function(){
				  $(".goodsReviewChattingForm").remove();
				  
				  $(this).parent().append("<div class='goodsReviewChattingForm'>" +
						  "<form action=''id='f' method='post'>" +
						  "<textarea  name='goodsReviewChatting' id='goodsReviewChatting'></textarea>" +
						  "<input type='button' id='"+ $(this).attr('id') +"' name='rev' value='입력'>" +
				  "</form><p>200자내외</p></div>");
			  });
			  
			
			  
			//내용 입력버튼 클릭
			  $(document).on("click","input[name=rev]",function(){
				  
				  var str = $(this).attr('id'); // 첫번째 댓글 번호 가져오기
				  $.ajax({
					  type:'post',
					  dataType:'json',
					  data:'boardNo='+$(".sellerInformation input[name=goodsDetailBoardNo]").val()+'&contents='+$("#goodsReviewChatting").val()+'&parentNo='+str,
					  url:'/controller/board/rinsert',
					  success:function(re){
						  if(re > 0) ReviewSelect();
						  
					  },
					  error:function(err){
						  alert(err);
					  }
					  
				  })	
				  $(".goodsReviewForm").remove();
				  $(".goodsReviewContent").remove();
			  })
		  
		  
		   //goodsDetailChatting 
		  
		  $(document).on("click","#goodsQuestion .goodsQuestionPlus",function(){
			  $(".goodsQuestionPlusForm").remove();
			  
			  $(".goodsQuestionFrame").append("<div class='goodsQuestionPlusForm'>" +
					  "<form action='' method=''><div class='goodsQuestionPlusFormTitle'>" +
					  "<span>제목 : </span><input type='text' name='sub1'></div>" +
					  "<div class='goodsQuestionPlusFormContent'><span>내용 : </span>" +
					  "<textarea id='sub2'></textarea></div><input type='button' id='sub' value='전송'>" +
			  "</form></div>");
			  
		  });
		  
		  $(document).on("click","#sub",function(){
		  
			  $.ajax({
				  type:'post',
				  dataType:'json',
				  data:'boardNo='+$(".sellerInformation input[name=goodsDetailBoardNo]").val()+'&contents='+$("#sub2").val()+'&subject='+$("input[name=sub1]").val(),
				  url:'/controller/board/insert',
				  success:function(re){
					  if(re > 0) select();
				  },
				  
				  error:function(err){
					  alert(err);
				  }
			});
			  
		  });
		  
		  //댓글 리스트
			function select(){
				$(".goodsQuestionFrame").html("");
				$.ajax({
	             	type:'post',
	             	dataType:'json',
	             	data:'boardNo='+$(".sellerInformation input[name=goodsDetailBoardNo]").val(),
	             	url:'/controller/board/select',
	             	success:function(re){
	             		var str="";
	             		$.each(re, function(index,item) {
		             		if(item.parentCommentNo==0){
		             			str ='<div class="goodsQuestionForm"><div class="goodsQuestionTitle">'
		             			+"<input type='hidden' values="+item.commentNo+">"
		    					+'<span>'+item.subject+''+item.memberId+''+item.regDate+'</span></div>'
		    					+'<div class="goodsQuestionContent">'
		    					+'<span id="comment'+item.commentNo+'"><div class="goodsQuestionCommentsForm"><div class="goodsQuestionComments">'+item.contents+'</div>'
		    					+'<span class="goodsQuestionAdd" name="insertComm" id="' + item.commentNo + '">댓글달기 | <input type="button" id= "insertQuestionCommentsDelete" name="'+item.commentNo+'" value="삭제" ></span></div></span></div></div>'
		    					
		    					$(".goodsQuestionFrame").append(str);
		             			
		             		}
		             	})
		             	
	             		$.each(re, function(index,item) {
	             			if(item.parentCommentNo!=0){
	             				str ='<div class="goodsQuestionReContent">'
		    					+'<span id="comment'+item.commentNo+'"><div class="goodsQuestionCommentsForm"><div class="goodsQuestionComments"><span>'+item.memberId+'</span>&nbsp&nbsp&nbsp&nbsp'+item.regDate+'<p>'+item.memberPId+'님에게<p>'+item.contents+'</div>'
		    					+'<span class="goodsQuestionAdd" name="insertComm" id="' + item.commentNo + '">댓글달기 | <input type="button" id= "insertQuestionCommentsDelete" name="'+item.commentNo+'" value="삭제" ></span></div></span></div></div>'

		    					$("span[id=comment"+item.parentCommentNo+"]").append(str);

	             			}
	             			
	             		})
	             		
	             	},
	             	error:function(err){
	             		alert(err);
	             	}
			    })
			 }
			
			
			//질문 댓글삭제
			$(document).on("click", "#insertQuestionCommentsDelete", function(){
				$(this).attr('name');
				$.ajax({
					  type:'post',
					  dataType:'json',
					  data:'commentNo='+$(this).attr('name') +'&memberId='+$(".sellerInformation input[name=user]").val(),
					  url:'/controller/board/delete',
					  success:function(re){
						  select();
						  
					  },
					  error:function(err){
						  alert(33);
						  select();
					  }
					  
				  })	
				  $(".goodsQuestionForm").remove();
				  $(".goodsQuestionContent").remove();
				
			})
			
			
			// QnA 클릭
			  $(document).on("click", "#qq", function() {
				  select();
				  $(".goodsQuestionForm").remove();
				  $(".goodsQuestionContent").remove();
			  })
			 
			  
			  // 댓글달기 클릭
			  $(document).on("click",".goodsQuestionContent .goodsQuestionAdd",function(){
				  $(".goodsChattingForm").remove();
				  alert($(this).parent().children(".goodsQuestionComments").children("span").text());
				  $(this).parent().append("<div class='goodsChattingForm'>" +
						  "<form action=''id='f' method='post'>" +
						  "'"+$(this).parent().children(".goodsQuestionComments").children("span").text()+"'에게 댓글 쓰기<p>"+
						  "<textarea  name='goodsChatting' id='goodsChatting'></textarea>" +
						  "<input type='button' id='"+ $(this).attr('id') +"' name='comm' value='입력'>" +
				  "</form><p>200자내외</p></div>");
			  });

			
			  
			//내용 입력버튼 클릭
			  $(document).on("click","input[name=comm]",function(){
				  
				  var str = $(this).attr('id'); // 첫번째 댓글 번호 가져오기
				  $.ajax({
					  type:'post',
					  dataType:'json',
					  data:'boardNo='+$(".sellerInformation input[name=goodsDetailBoardNo]").val()+'&contents='+$("#goodsChatting").val()+'&parentCommentNo='+str, 
					  url:'/controller/board/insert',
					  success:function(re){
						  if(re > 0) select();
						  
					  },
					  error:function(err){
						  alert(err);
					  }
					  
				  })	
				  $(".goodsQuestionForm").remove();
				  $(".goodsQuestionContent").remove();
			  })
			  
		  
			  /* 결제 창에서 수량 변경 될 때 */
			    $(document).on("change", "input[name=productCount]", function() {
					/*alert($("#totalPrice").text()*$(this).val());*/
					$("#totPrice").text($("#price").text()*$(this).val()*$("#sharingDays").text());
					$("#paymentPrice").text($("#price").text()*$(this).val());
					$("#paymentTotal").text($("#paymentPrice").text()*$("#sharingDays").text());
					$("#totalPrice").val(($("#paymentPrice").text()*$("#sharingDays").text()));
				});
			    
			    /* 결제 버튼 누르기 */
			    $(document).on("click", "input[value=결제]", function() {
			    	payment();
				})
				
				/* 결제 API */
				function payment() {
			    	var IMP = window.IMP; // 생략가능
				 	IMP.init('imp18029594'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				 	/*	
				 	alert($("#productName").text());
				 	alert($("#totalPrice").val());
				 	alert($("#buyerName").text());
				 	alert($("#buyerPhone").text());*/
				 	
				 	IMP.request_pay({
					    pg : 'inicis', // version 1.1.0부터 지원.
					    pay_method : 'card',
					    merchant_uid : 'merchant_' + new Date().getTime(),
					    name : '주문명:' + $("#productName").text(),
					    amount : $("#totalPrice").val(),
					    buyer_name : $("#buyerName").text(),
					    buyer_tel : $("#buyerPhone").text(),
					    buyer_addr : $("#buyerAddr").text()
					}, function(rsp) {
					    if ( rsp.success ) {
					    	$('#paymentForm').submit();
					        var msg = '결제가 완료되었습니다.';
					        msg += '고유ID : ' + rsp.imp_uid;
					        msg += '결제 금액 : ' + rsp.paid_amount;
					        msg += '카드 승인번호 : ' + rsp.apply_num;
					    } else {
					        var msg = '결제에 실패하였습니다.';
					        msg += '에러내용 : ' + rsp.error_msg;
					    }
					    alert(msg);
					});
				}
		  
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
		  
		  
		  //rentalItem Text 
		  function rentalItemText(){
			  var rentalItemSpan = $(".rentalItemListTransactionStatus span");
			  var rentalItemBtn = $(".rentalItemListTransactionStatus input[type=button]");
			  
			  for(var retalItemNumber=0; retalItemNumber< rentalItemSpan.length ; retalItemNumber++ ){
				  if(rentalItemSpan.eq(retalItemNumber).text()=="대여대기"){
					  //예약취소
					  rentalItemBtn.eq(retalItemNumber).val("예약취소");
				  }else if(rentalItemSpan.eq(retalItemNumber).text() == "대여중"){
					  //반납신청
					  rentalItemBtn.eq(retalItemNumber).val("반납신청");
				  }else if(rentalItemSpan.eq(retalItemNumber).text()== "반납"){
					  //판매자한테 청구하기 버튼 생성
					  //판매자가 청구하기 할때 대여자도 청구하기 버튼이 생김
					  //대여자 버튼 사라짐
					  rentalItemSpan.eq(retalItemNumber).text("반납대기");
					  rentalItemSpan.eq(retalItemNumber).css({"line-height":"60px"});
					  rentalItemBtn.eq(retalItemNumber).hide();
				  }else if(rentalItemSpan.eq(retalItemNumber).text() == "추가금결제"){
					  rentalItemSpan.eq(retalItemNumber).css({"line-height":"30px"});
					  rentalItemBtn.eq(retalItemNumber).show().val("결제하기");
				  }else if(rentalItemSpan.eq(retalItemNumber).text() == "거래완료"){
					  rentalItemBtn.eq(retalItemNumber).remove();
					  //거래완료
				  }
			  }//rentalItemListFor End
		  }
		  
		  //saleItemList Text
		  function saleItemListText(){
			  var saleItemSpan = $(".saleItemListTransactionStatus span");
			  var saleItemBtn = $(".saleItemListTransactionStatus input[type=button]");
			  
			  for(var saleItemNumber = 0; saleItemNumber < saleItemSpan.length ; saleItemNumber++){
			  if(saleItemSpan.eq(saleItemNumber).text() == "대여대기"){
				  //예약취소
				  saleItemSpan.eq(saleItemNumber).css({"line-height":"74px"});
				  saleItemBtn.eq(saleItemNumber).hide();
			  } else if(saleItemSpan.eq(saleItemNumber).text() == "거래완료") {
				  saleItemSpan.eq(saleItemNumber).css({"line-height":"74px"});
				  saleItemBtn.eq(saleItemNumber).hide();
			  } else if(saleItemSpan.eq(saleItemNumber).text() == "대여중"){
				  //반납신청
				  saleItemSpan.eq(saleItemNumber).css({"line-height":"74px"});
				  saleItemBtn.eq(saleItemNumber).hide();
			  }else if(saleItemSpan.eq(saleItemNumber).text() == "반납"){
				  // 기본 반납
				  saleItemSpan.eq(saleItemNumber).text("반납신청");
				  saleItemSpan.eq(saleItemNumber).css({"line-height":"38px"});
				  saleItemBtn.eq(saleItemNumber).show().val("확인");
				  /*
				  
				  //판매자한테 청구하기 버튼 생성
				  saleItemSpan.eq(saleItemNumber).css({"line-height":"38px"});
				  saleItemBtn.eq(saleItemNumber).show().val("청구하기");		  
				  //판매자가 청구하기 할때 대여자도 청구하기 버튼이 생김
				  //대여자 버튼 사라짐
				  saleItemSpan.eq(saleItemNumber).css({"line-height":"74px"});
				  saleItemBtn.eq(saleItemNumber).remove();*/
			  }else if(saleItemSpan.eq(saleItemNumber).text() == "거래완료"){
				  //거래완료
			  }
     	    }//saleItemListFor end
		  }
	 
	  /*
	   * 구매자의 반납 신청 
	   * */
	  var sharingNo = 0;
	  $(document).on("click",".rentalItemListForm input[value=반납신청]",function(){
	 		if($(".rentalItemListDialog").is(":animated"))return;
	  		$(".rentalItemListDialog").css({"left":"60%"});
	  		$(".dialogBlack").animate({"opacity":"0.7"},500).show();
	  		$(".rentalItemListDialog").animate({"opacity":"1","left":"50%"},500).show();
	  		sharingNo = $(this).attr("id");
	  });//rentalItemListDialog Event End
	  
	  /*
	   * 버튼명 예약 취소=>클릭시 삭제
	   * */
	  $(document).on("click",".rentalItemListForm input[value=예약취소]",function(){
		  var result = confirm('예약 취소하시겠습니까');
		  var reservationNo = $(this).prev().val();
		  alert(reservationNo);
		  if(result) {
			  var form = $('<form></form>');
	    	  form.attr('action', "/controller/reservation/deleteReservation");
	    	  form.attr('method', 'post');
	    	  form.appendTo('body');
	    	  var inputSharing = $("<input type='hidden' value="+reservationNo+" name='reservationNo'>");
	    	  form.append(inputSharing);
	    	  form.submit();		    	  
		  } else {
		} 
	  })
	  
	  /*
	   * 반납 신청
	   * */
	  $(document).on("click",".rentalItemListDialog .rentalItemListBtn input[type=button]",function(){
		  if(rentalItemValidityCheck()) {/*
			  var rentalItemList = $(".rentalItemList select[name=rentalItemList]").val();*/
			  var inputSharingNo = $("<input type='hidden' value="+sharingNo+" name='sharingNo'>");
			  $('#returnForm').append(inputSharingNo);
			  alert(sharingNo);
			  $('#returnForm').submit();
		  } 
	  });
	  
	  $(document).on("click",".rentalItemListDialog .rentalItemListClose",function(){
		  		if($(".rentalItemListDialog").is(":animated"))return;
		  		$(".dialogBlack").animate({"opacity":"0"},500).hide(10);
		  		$(".rentalItemListDialog").animate({"opacity":"0","left":"40%"},500).hide(10);
	  });//rentalItemListDialog Close Event End

	  /*
	   * 구매자의 반납 확인(일반 반납시)
	   * */
	  $(document).on("click", ".saleItemListForm input[value='확인']", function() {
		  var sharingNum = $(this).parent().children().eq(1).val(); // sharingNo;
		  var responseState = $(this).val();
		  alert(responseState);
		  var form = $('<form></form>');
    	  form.attr('action', "/controller/reservation/responseReturn");
    	  form.attr('method', 'post');
    	  form.appendTo('body');
    	  var inputSharing = $("<input type='hidden' value="+sharingNum+" name='sharingNum'>");
    	  var inputResponseState = $("<input type='hidden' value="+responseState+" name='responseState'>");
    	  form.append(inputSharing);
    	  form.append(inputResponseState);
    	  form.submit();		   
	}) 
	  
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

