<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<form action="#" method="post">
    <table width="1000px" cellpadding="0px" cellspacing="0px"
   		 border="1px" style="border: 1px solid gray;
   		 border-collapse:collapse;">
    	<tr align="center">
    		<th>commodityID</th>
    		<th>commodityName</th>
    		<th>commodityType</th>
    		<th>commodityCover</th>
    		<th>action</th>

    	</tr>
    	<c:forEach items="${list}" var="CommodityExpand">
    		<tr align="center">	
				<td>${CommodityExpand.commodityId}</td>
    			<td>${CommodityExpand.commodityName}</td>
    			<td>${CommodityExpand.commodityType}</td>
    			<td>${CommodityExpand.commodityCover}</td>
    			<td>
    			<a href="#">编辑 </a>| 
    			<a href="#">删除</a></td>
    		</tr>
    	</c:forEach>
    		<tr align="right">
   			<td colspan="9">
   				<a href="#">首页</a>
   				<a href="#">上一页</a>
   				<a href="#">下一页</a>
   				<a href="#">尾页</a>
   			</td>
   		</tr>
    </table>
	</form>
  </body>
</html>