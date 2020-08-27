<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Casa Magalhães - Estagiários Project</title>
        <jsp:include page="../common/jstl.jsp"/>
    </head>
    <body>
        <span id="ctx" style="display: none">${ctx}</span>
        <div class="container">
            <h3>Gerenciar Usuarios</h3>
            <form>
                <div class="form-row">
                    <div class="form-group col-9">
                        <label for="text_username">Nome</label>
                        <input type="text" class="form-control" name="name" id="text_username" />
                    </div>
                    <div class="form-group col-md-3">
                        <label for="text_birthday">Nascimento</label>
                        <input type="text" class="form-control" name="birthday" id="text_birthday" />
                    </div>
                </div>
                <div class="form-row justify-content-end">
                    <input type="button" class="btn btn-secondary mx-3" id="btn_new" value="Novo"/>
                    <input type="button" class="btn btn-primary" id="btn_search" value="Pesquisar"/>
                </div>
            </form>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script type="text/javascript" src="${ctx}js/user/user.js"></script>

</html>