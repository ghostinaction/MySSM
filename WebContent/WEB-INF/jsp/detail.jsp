<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="">

</head>
<body>
	<form action="edit.do" method="post">
		地址:<input type="text" name="cpyinfo.address" value="${item.address }"/>
			<input type="hidden" name="cpyinfo.id" value="${item.id }" />
		<input type="submit" value="提交" />
	</form>
</body>
<script type="text/javascript">

</script>
</html>