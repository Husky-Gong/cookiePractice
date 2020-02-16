<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
<form action="user.do" method="post">
<p>userName<input type="text" name="userName" value="${cookie.userName.value}"></p>
<p>password<input type="text" name="password" value="${cookie.password.value}"></p>
<p>remember me<input type="checkbox" name="remember" value="1"/></p>
<P><input type="submit" value="login"/></P>

</form>
</body>
</html>