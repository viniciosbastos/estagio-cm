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
		It works!! Se apresente ${variable}
		<input type="text" id="nome" name="estagiario.nome" />
		<input id="btn_vai" type="button" value="Vai!" />
		<br/>
		<div id="resposta"></div>

	</form>
</body>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}js/index/index.js"></script>

</html>