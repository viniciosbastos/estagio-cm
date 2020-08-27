jQuery(document).ready(function(){

    $("#text_birthday").mask("99/99/9999")

    $("#btn_search").click(function(){
        $.get("/users/search", 'user.name='+$("#text_username").val() + '&user.birthday='+$("#text_birthday").val(), function (result) {
            $("#result").empty()
            $("#result").append(result)
            setUpDeleteEventHandler()
        })
    });
});