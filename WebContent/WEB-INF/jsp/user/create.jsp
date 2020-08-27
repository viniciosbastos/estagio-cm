<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<input type="hidden" id="text_id" value="${user.id}" />
<div class="container">
    <h3>Cadastrar Usuario</h3>
    <form>
        <div class="form-row">
            <div class="form-group col-9">
                <label for="text_username">Nome</label>
                <input type="text" class="form-control" name="name" id="text_username" value="${user.name}" />
            </div>
            <div class="form-group col-3">
                <label for="text_birthday">Nascimento</label>
                <input type="text" class="form-control" name="birthday" id="text_birthday" value="${user.birthday}" />
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-6">
                <label for="text_password">Senha</label>
                <input type="password" class="form-control" name="name" id="text_password" value="${user.password}" />
            </div>
            <div class="form-group col-6">
                <label for="text_confirm_password">Confirmar Senha</label>
                <input type="password" class="form-control" name="birthday" id="text_confirm_password" value="${user.password}" />
            </div>
        </div>
        <div class="form-row justify-content-end">
            <input type="button" class="btn btn-primary" id="btn_save" value="Salvar"/>
        </div>
    </form>
    <div id="errors"></div>

</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.min.js"></script>

<script type="text/javascript" src="${ctx}/js/user/create.js"></script>

</html>