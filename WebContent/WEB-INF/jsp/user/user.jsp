<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Casa Magalhães - Estagiários Project</title>
    <jsp:include page="../common/jstl.jsp"/>
</head>
<body>
<span id="ctx" style="display: none">${ctx}</span>
<form >
    <h3>Cadastro de Usuário</h3>
    <label name="name">Nome</label>
    <input type="text" name="name" id="text_username" />
    <label name="birthday">Nascimento</label>
    <input type="text" name="birthday" id="text_birthday" /> <br>
    <label name="password">Senha</label>
    <input type="password" name="password" id="text_password" /> <br>

    <input type="button" id="btn_search" value="Pesquisar"/>
    <input type="button" id="btn_save" value="Salvar"/>
</form>
</body>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}js/user/user.js"></script>

</html>