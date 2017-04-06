$(function() {
	var flag_my_menu = true;
	var flag_timeline = true;
	var flag_contact = true;

	$('#menu-home').click(function() {
		if (flag_timeline) {
		} else {
			flag_timeline = true;
			$('#pollSlider-button').animate({
				"margin-right" : '-=500'
			});
			$('.pollSlider').animate({
				"margin-right" : '-=500'
			});
		}
		flag_contact = true;
	});

	$('#menu-contact').click(function() {
		if (flag_timeline) {
		} else {
			flag_timeline = true;
			$('#pollSlider-button').animate({
				"margin-right" : '-=500'
			});
			$('.pollSlider').animate({
				"margin-right" : '-=500'
			});
		}
		
		if (flag_my_menu) {
		} else {
			flag_my_menu = true;
			$('.menu-slider').animate({
				"margin-left" : '-=500'
			});
			$('.map-control').animate({
				"margin-left" : '-=300'
			});
		}
		
		flag_contact = false;		
	});

	$('#menu-my-menu').click(function() {
		var mem_id = $("#mem_id").val();
		if (flag_contact) {
			if (flag_my_menu) {
				$.ajax({
					type : "POST",
					url : "mymenu",
					data : {
						mem_id : mem_id
					},
					success : function(data) {
						var myMenu = document.getElementById("myMenu2");
						var follow = '';
						follow += "<p>follower : " + data.fol_follower + "</p>";
						follow += "<p>following : " + data.fol_following + "</p>";
						myMenu.innerHTML = follow;
					},
					error : function(e) {
						console.log(e);
					}
				});
				flag_my_menu = false;
				$('.menu-slider').animate({
					"margin-left" : '+=500'
				});
				$('.map-control').animate({
					"margin-left" : '+=300'
				});
			} else {
				flag_my_menu = true;
				$('.menu-slider').animate({
					"margin-left" : '-=500'
				});
				$('.map-control').animate({
					"margin-left" : '-=300'
				});
			}
		}
	});

	$('#pollSlider-button').click(function() {
		if (flag_contact) {
			if (flag_timeline) {
				flag_timeline = false;
				$('#pollSlider-button').animate({
					"margin-right" : '+=600'
				});
				$('.pollSlider').animate({
					"margin-right" : '+=600'
				});
				
				$('.searchClass').animate({					
					"margin-right" : '+=600'
				});
				
				
				
			} else {
				flag_timeline = true;
				$('#pollSlider-button').animate({
					"margin-right" : '-=600'
				});
				$('.pollSlider').animate({
					"margin-right" : '-=600'
				});
				
				$('.searchClass').animate({					
					"margin-right" : '-=600'
				});
				
			}
		}
	});
});