$(function() {

    $("#sendMsg").on("click", function(){
            // get values from FORM
            var subject = $("input#subject").val();
            var email = $("input#email").val();
            var message = $("textarea#message").val();

            // Check for white space in values for Success/Fail message

            if(subject!=""||email!=""||message!=""){
            $.ajax({
                url: "contactme",
                type: "POST",
                data: {
                	subject: subject,
                    email: email,
                    message: message
                },
                success: function(data) {
                    // Enable button & show success message
                	console.log(data);
                    $("#btnSubmit").attr("disabled", false);
                    $('#success').html("<div class='alert alert-success'>");
                    $('#success > .alert-success').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
                        .append("</button>");
                    $('#success > .alert-success')
                        .append("<strong>Your message has been sent. </strong>");
                    $('#success > .alert-success')
                        .append('</div>');

                    //clear all fields
                    $('#contactForm').trigger("reset");
                },
                error: function(request,status,error){
                        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
                        // Fail message
                        $('#success').html("<div class='alert alert-danger'>");
                        $('#success > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
                        .append("</button>");
                        $('#success > .alert-danger').append("<strong>Sorry " + subject + ", it seems that my mail server is not responding. Please try again later!");
                        $('#success > .alert-danger').append('</div>');
                        //clear all fields
                        $('#contactForm').trigger("reset");
                }
            });
	}
    });

    $("a[data-toggle=\"tab\"]").click(function(e) {
        e.preventDefault();
        $(this).tab("show");
    });
});

// When clicking on Full hide fail/success boxes
$('#subject').focus(function() {
    $('#success').html('');
});
$(function() {

    $("#sendMsg").on("click", function(){
            // get values from FORM
            var subject = $("input#subject").val();
            var email = $("input#email").val();
            var message = $("textarea#message").val();

            // Check for white space in values for Success/Fail message

            if(subject!=""||email!=""||message!=""){
            $.ajax({
                url: "contactme",
                type: "POST",
                data: {
                	subject: subject,
                    email: email,
                    message: message
                },
                success: function(data) {
                    // Enable button & show success message
                	console.log(data);
                    $("#btnSubmit").attr("disabled", false);
                    $('#success').html("<div class='alert alert-success'>");
                    $('#success > .alert-success').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
                        .append("</button>");
                    $('#success > .alert-success')
                        .append("<strong>Your message has been sent. </strong>");
                    $('#success > .alert-success')
                        .append('</div>');

                    //clear all fields
                    $('#contactForm').trigger("reset");
                },
                error: function(request,status,error){
                        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
                        // Fail message
                        $('#success').html("<div class='alert alert-danger'>");
                        $('#success > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
                        .append("</button>");
                        $('#success > .alert-danger').append("<strong>Sorry " + subject + ", it seems that my mail server is not responding. Please try again later!");
                        $('#success > .alert-danger').append('</div>');
                        //clear all fields
                        $('#contactForm').trigger("reset");
                }
            });
	}
    });

    $("a[data-toggle=\"tab\"]").click(function(e) {
        e.preventDefault();
        $(this).tab("show");
    });
});

// When clicking on Full hide fail/success boxes
$('#subject').focus(function() {
    $('#success').html('');
});
