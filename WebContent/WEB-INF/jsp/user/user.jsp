<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="container">
            <h3>Gerenciar Usuarios</h3>
            <form>
                <div class="form-row">
                    <div class="form-group col-9">
                        <label for="text_username">Nome</label>
                        <input type="text" class="form-control" name="name" id="text_username" />
                    </div>
                    <div class="form-group col-3">
                        <label for="text_birthday">Nascimento</label>
                        <input type="text" class="form-control" name="birthday" id="text_birthday" />
                    </div>
                </div>
                <div class="form-row justify-content-end">
                    <a class="btn btn-secondary mx-3" href="/users/create" role="button">Novo</a>
                    <input type="button" class="btn btn-primary" id="btn_search" value="Pesquisar"/>
                </div>
            </form>
            <div class="my-3">
                <c:if test="${empty usuarios }">
                    <div class="alert alert-secondary" role="alert">
                        Nenhum usuário encontrado.
                    </div>
                </c:if>
                <c:if test="${not empty usuarios }">
                    <table class="table table-hover">
                        <thead>
                        <th>#</th>
                        <th>Nome</th>
                        <th>Data de Nascimento</th>
                        <th></th>
                        </thead>
                        <tbody>
                        <c:forEach items="${usuarios}" var="user">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.name}</td>
                                <td>${user.birthday}</td>
                                <td>
                                    <a href="#"><i class="fa fa-pencil mx-1" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-trash mx-1" aria-hidden="true"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.min.js"></script>
    <script type="text/javascript" src="${ctx}js/user/user.js"></script>

</html>