<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    <title>Casa Magalhães - Estagiários Project</title>
    <jsp:include page="../common/jstl.jsp"/>
</head>
<body>
<span id="ctx" style="display: none">${ctx}</span>
<div class="container my-5">
    <div class="row">
        <h3>Gerenciar Usuarios</h3>
        <a href="/users/logout" class="ml-auto">Logout</a>
    </div>
    <form>
        <div class="form-row">
            <div class="form-group col-9">
                <label for="text_username">Nome</label>
                <input type="text" class="form-control" name="name" id="text_username" value=""/>
            </div>
            <div class="form-group col-3">
                <label for="text_birthday">Nascimento</label>
                <input type="text" class="form-control" name="birthday" id="text_birthday" value=""
                />
            </div>
        </div>
        <div class="form-row justify-content-end">
            <a class="btn btn-secondary mx-3" href="/users/create" role="button">Novo</a>
            <input type="button" class="btn btn-primary" id="btn_search" value="Pesquisar"/>
        </div>
    </form>
    <div id="result" class="my-3">
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.min.js"></script>
<script type="text/javascript" src="${ctx}js/user/user.js"></script>
</body>

</html>