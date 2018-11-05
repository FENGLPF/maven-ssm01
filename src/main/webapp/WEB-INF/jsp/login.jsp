<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
   + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath%>js/jquery-3.2.0.min.js"></script>
</head>
<body>
1212314
<p id="name"></p>
<p></p>
</body>
<script type="text/javascript">
	$(function() {
		var p={
			"userName":"张三",
			"userPassword":"123456"
		}
		$.ajax({
			url:"<%=basePath%>user/login",
			type:"post",
			datatype:"json",
			contenType:"application/json;charset=utf-8",
			data:p,
			success:function(data){
				console.log(data)
				$("#name").html(data.user_name);
			}
		})
	});
	
</script>
</html>