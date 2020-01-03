<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>您好Springboot</title>
<!-- 1.引入函数类库 -->
<script type="text/javascript" src="/js/jquery.min.js"></script>
<!-- 2.发起ajax请求 -->
<script type="text/javascript">
	$(function(){
		//初始化表格数据		//listUser
		$.get("/ajax",function(result){
			var trs;
			//index代表下标  obj 当前遍历对象
			$(result).each(function(index,obj){
				var id=obj.id;
				var name=obj.name;
				var age=obj.age;
				var sex=obj.sex;

				trs+="<tr align='center'><td>"+id+"</td><td>"+name+"</td><td>"+age+"</td><td>"+sex+"</td></tr>";
				$("#tab").append(trs);
				});
			});
		})

</script>

</head>
<body>
	<table id="tab" border="1px" width="65%" align="center">
		<tr>
			<td colspan="6" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th></th>
		</tr>
		
		
	</table>
</body>
</html>