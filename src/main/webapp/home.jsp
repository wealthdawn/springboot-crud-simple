<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link rel="stylesheet" href="layui/css/layui.css" />
<script src="/layui/layui.js"></script>
</head>
<body>
	<table class="layui-table" lay-data="{height:500, url:'/wine/list', page:true, id:'test'}" lay-filter="test">
	  <thead>
	    <tr>
	      <th lay-data="{field:'id', width:80, sort: true}">ID</th>
	      <th lay-data="{field:'capacity', width:80}">容量</th>
	      <th lay-data="{field:'brand', width:130, sort: true}">品牌</th>
	      <th lay-data="{field:'price', width:80}">价格</th>
	      <th lay-data="{field:'type', width:177}">种类</th>
	    </tr>
	  </thead>
	</table>
	
	<script>
			layui.use('table', function(){
			  var table = layui.table;
			});
	</script>
</body>
</html>