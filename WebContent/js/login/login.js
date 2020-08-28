jQuery(document).ready(function(){

    console.log($("#error").val())

    $("#btn_login").click(function() {
        var data = {
            "user.name": $("#text_username").val().toString(),
            "user.password": $("#text_password").val().toString(),
        }
        $.post("/login", data, function (result) {
            window.location.replace(result)
        })
    });
});