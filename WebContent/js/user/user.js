jQuery(document).ready(function(){

    jQuery("#btn_save").click(function(){

        console.log($("#text_username").val())
        console.log($("#text_birthday").val())
        console.log($("#text_password").val())

        var data = {
            "user.name": $("#text_username").val().toString(),
            "user.birthday": $("#text_birthday").val().toString(),
            "user.password": $("#text_password").val().toString()
        }
        var url = '/users/save';
        $.post(url, data, function (data, textStatus, jqXHR) {
            jQuery("#resposta").append("Bem vindo, " + data.estagiario.nome + "! Tá salvo!");
        })
    });
});