<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="spring">
<meta name="keywords" content="spring">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<title></title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<header class="navbar navbar-default navbar-fixed-top bs-docs-nav"
		role="banner">
		<div class="container">
			<nav class="collapse navbar-collapse bs-navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a id="link-logout" href="javascript:;"> Logout </a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div class="container" style="padding-top: 10%">
		<div class="row">
			<form:form id="form-todo" class="form-horizontal"
				modelAttribute="newToDo" action="">
				<input name="${_csrf.parameterName}" type="hidden"
					value="${_csrf.token}">
				<div class="form-group">

					<div class="col-md-offset-2 col-md-6">
						<form:input id="todoContent" class="form-control" path="content"
							placeholder="" />
					</div>
					<div class="col-md-2">
						<button id="rest-create-btn" class="btn btn-success btn-block">Create</button>
					</div>
					<label for="todoContent" class="col-md-4 control-label"
						style="text-align: left;"><spring:bind path="content">
							<c:if test="${status.error}">
								<form:errors path="content" class="text-danger" />
							</c:if>
						</spring:bind></label>
				</div>


			</form:form>

		</div>
		<div class="row">
			<div class="col-md-offset-2 col-md-10">
				<ul id="ul-todo-list">
					<c:forEach items="${toDoList}" var="toDo">
						<li>${toDo.createdDateDisplay}&nbsp;:&nbsp;${toDo.content}</li>
					</c:forEach>
				</ul>
			</div>
		</div>

		<input type="hidden" id="rest-url-create"
			value="${pageContext.request.contextPath}/api/todo/create" />
	</div>

	<form id="form-logout"
		action="${pageContext.request.contextPath}/logout" method="post">
		<input name="${_csrf.parameterName}" type="hidden"
			value="${_csrf.token}">
	</form>

	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/todo/rest/list.js"></script>
</body>
</html>