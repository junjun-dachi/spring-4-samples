(function() {

	$(document).ready(function() {
		
		var token = $("meta[name='_csrf']").attr("content");
		var header = $("meta[name='_csrf_header']").attr("content");
		
		$(document).ajaxSend(function(e, xhr, options) {
			xhr.setRequestHeader(header, token);
		});
		
		$.fn.serializeObject = function()
		{
		    var o = {};
		    var a = this.serializeArray();
		    $.each(a, function() {
		        if (o[this.name] !== undefined) {
		            if (!o[this.name].push) {
		                o[this.name] = [o[this.name]];
		            }
		            o[this.name].push(this.value || "");
		        } else {
		            o[this.name] = this.value || "";
		        }
		    });
		    return o;
		};
		
		$(document).on("#form-todo").submit(function(event) {
			event.preventDefault();
			return false;
		});
		
		$(document).on("click", "#link-logout", function(event) {
			 event.preventDefault()
			 $("#form-logout")[0].submit();
		});

		$(document).on("click", "#rest-create-btn", function() {

			var form = $("#form-todo");
			var url = $("#rest-url-create").val();
			var data = JSON.stringify(form.serialize());
			data = JSON.stringify(form.serializeObject());
			$.ajax({
				type : "POST",
				url : url,
				data : data,
	            contentType: "application/json; charset=utf-8",
	            dataType: "json",
				success : function(response) {
		            var output="<li>" + response.date + " : " +response.content + "</li>";
		            $("#ul-todo-list").append(output);
		            $("#todoContent").val("");
				}
			});

		});

	});

})();