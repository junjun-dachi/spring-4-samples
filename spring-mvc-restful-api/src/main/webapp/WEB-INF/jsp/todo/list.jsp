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

<title></title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>

	<div class="container" style="padding-top: 10%">



		<div class="row">
			<form:form class="form-horizontal" 
				modelAttribute="newToDo" method="post"
				action="${pageContext.request.contextPath}/todo/create">
				<div class="form-group">

					<div class="col-md-offset-2 col-md-6">
						<form:input id="todoContent" class="form-control" path="content"
							placeholder="" />
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
				<ul>
					<c:forEach items="${toDoList}" var="toDo">
						<li>${toDo.createdDateDisplay}&nbsp;:&nbsp;${toDo.content}</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		
		<input type="hidden" id="rest-url-create"
			value="${pageContext.request.contextPath}/rest/todo/create" />
	</div>

	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>