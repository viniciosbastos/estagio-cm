jQuery(document).ready(function(){

    $("#btn_login").click(function() {
        var data = {
            "user.name": $("#text_username").val().toString(),
            "user.password": $("#text_password").val().toString(),
        }
        $.post("/login", data, function (result) {
            console.log(result)
        })
    });
});