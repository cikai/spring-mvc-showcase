$(function(){
	init();
})

function init(){
	initDemo2();
	initDemo3();
	initDemo4();
	initDemo5();
	initDemo6();
	initDemo7();
}

function initDemo2(){
	$("#submit2").on("click", function(){
		var contextPath = getContextPath();
		$.ajax({
			url: "/" + contextPath + "/demo2",
			method: "POST",
			data: $("#form2").serialize()
		})
	});

}

function initDemo3(){
	$("#submit3").on("click", function(){
		var name = $("#form3 [name='name']").val();
		var age = $("#form3 [name='age']").val();
		var contextPath = getContextPath();
		$.ajax({
			url: "/" + contextPath + "/demo3",
			method: "POST",
			data: {
				name: name,
				age: age
			}
		});
	});
}

function initDemo4(){
	$("#submit4").on("click", function(){
		var name = $("#form4 [name='name']").val();
		var age = $("#form4 [name='age']").val();
		var contextPath = getContextPath();
		$.ajax({
			url: "/" + contextPath + "/demo4",
			method: "POST",
			data: JSON.stringify({
				name: name,
				age: age
			}),
			contentType : "application/json"
		});
	});
}

function initDemo5(){
	$("#submit5").on("click", function(){
		var contextPath = getContextPath();
		$.ajax({
			url: "/" + contextPath + "/demo5",
			method: "POST",
			data: JSON.stringify({
				name: "demo5",
				age: "555",
				carList: [{
					name: "丰田霸道",
					pailiang: 4.4
				}, {
					name: "奥迪A8",
					pailiang: 8.0
				}]
			}),
			contentType : "application/json"
		}).done(function(returnData){
		    console.log(returnData.result);
		})
	});
}

function initDemo6(){
	$("#submit6").on("click", function(){
		var name = $("#form6 [name='name']").val();
		var age = $("#form6 [name='age']").val();
		var contextPath = getContextPath();
		$.ajax({
			url: "/" + contextPath + "/demo6/" + name + "/" + age,
			method: "GET"
		});
	});
}

function initDemo7(){
    var contextPath = getContextPath();
	$("#submit7").on("click", function(){
		$.ajax({
			url: "/" + contextPath + "/hello",
			method: "GET"
		}).done(function(returnHtml){
			$("#hello").hide();
			$("#hello").html(returnHtml);
			$("#hello").fadeIn(1000);
			setTimeout(function(){
				$("#hello").fadeOut(500);
			},3000)
		});
	});
}


function getContextPath() {
    var fullPath = window.location.pathname;
    var contextPath = fullPath.split("/")[1];
    return contextPath;
}