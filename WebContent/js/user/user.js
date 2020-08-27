jQuery(document).ready(function(){

    $("#text_birthday").mask("99/99/9999")

    jQuery("#btn_search").click(function(){

    });

    $(".delete").on('click',function (event) {
        event.preventDefault()
        const url = $(this).attr("href")
        const row = $(this).closest("tr")
        $.ajax({
            url: url,
            type: 'DELETE',
            success: function(result) {
                row.remove()
            }
        });
    });
});