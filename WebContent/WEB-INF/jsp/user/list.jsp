<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <a href="/users/create/${user.id}" id="btn_edit" class="search"><i class="fa fa-pencil mx-1" aria-hidden="true"></i></a>
                    <a href="/users/delete/${user.id}" id="btn_delete" class="delete"><i class="fa fa-trash mx-1" aria-hidden="true"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
