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
	<a href="detail.do">增加</a>
	<table border="1">
		<c:forEach items="${list }" var="item">
			<tr>
				<td>${item.id }</td>
				<td>${item.address}</td>
				<td><a href="detail.do?id=${item.id }">修改</a></td>
				<td><a href="delete.do?id=${item.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
<script type="text/javascript">

</script>
</html>