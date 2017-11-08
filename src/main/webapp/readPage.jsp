<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import  = "java.util.*"%>
<%@page import  = "com.mayank.NoticeBoard.Notice"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NoticeBoard</title>
<style>
table{
     margin-top:23px;
     width:20%;
   }
table, th, td {
    border: 1px solid black;
}
th, td {
    padding: 15px;
    text-align: center;
}
tr:hover {background-color:  #33ff33}
tr:nth-child(even){background-color: #00ccff}
tr:nth-child(odd){background-color:  #3399ff}
</style>
</head>
<body>

<table align="center">
   <tr><th bgcolor="#00b300">NOTICE</th></tr>
 <%
   String[] list=null;
   try{
	   String str=request.getParameter("notice");	
	   list=str.substring(16).split("\\,");
	  
   }catch(Exception e){
	   System.out.println("Error handled !!"+e);
   }
%>

 <% for(int i=0;i<list.length;i++){ %>
   <tr><td><%= list[i] %></td></tr>
   <% } %> 
   
</table>
</body>
</html>