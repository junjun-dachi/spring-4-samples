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

		<div class="col-md-6 col-md-offset-3">
			<div class="text-center">
				<h3>Login with User Name and Password</h3>
			</div>
			<div class="text-center">
				<c:if test="${param.error != null}">
					<font color="red">Your login attempt was not successful due
						to Bad credentials.</font>
				</c:if>
			</div>
			<div class="panel panel-info">
				<div class="panel-body ">
					<form method="post"
						action="${pageContext.request.contextPath}/login">
						<input name="${_csrf.parameterName}" type="hidden"
							value="${_csrf.token}">
						<fieldset>
							<div class="form-group">
								<input type="text" class="form-control input-lg" name="username"
									placeholder="user name" />
							</div>
							<div class="form-group">
								<input type="password" class="form-control input-lg"
									name="password" placeholder="password" />
							</div>
							<div class="row">
								<div class="col-sm-12 col-md-12">
									<button id="btn-login" class="btn btn-success btn-block">Login</button>
								</div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>