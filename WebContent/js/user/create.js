jQuery(document).ready(function(){

    $("#text_birthday").mask("99/99/9999")

    jQuery("#btn_save").click(function(){

        var data = {
            "user.id": $("#text_id").val(),
            "user.name": $("#text_username").val().toString(),
            "user.birthday": $("#text_birthday").val().toString(),
            "user.password": $("#text_password").val().toString(),
            "user.confirmPassword": $("#text_confirm_password").val().toString()
        }
        var url = '/users/create';
        $.post(url, data, function (data, textStatus, jqXHR) {
            if (Array.isArray(data)) {
                $("#errors").empty()
                data.forEach(function (error) {
                    const card = createAlert(error)
                    $("#errors").append(card)
                })
            } else {
                window.location.replace(data)
            }
        })
    });

    function createAlert(error) {
        const div = $('<div class="alert alert-danger" role="alert"></div>').text(error)
        return div
    }
});