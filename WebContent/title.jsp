<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
 <head>
    <base href="<%=basePath%>">
     
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
       <style> 
html{width:100%;height:100%;} 
body{background:#fff;font-size:18px;font-family:"Arial", "Tahoma", "微软雅黑", "雅黑";
line-height:18px;padding:0px;margin:0px;text-align:center} 
div{padding:18px} 
img{border:0px;vertical-align:middle;padding:0;margin:0} 
input, button{font-family:"Arial", "Tahoma", "微软雅黑", "雅黑";border:0;
vertical-align:middle;margin:8px;line-height:18px;font-size:18px} 
.btn{width:140px;height:36px;line-height:18px;font-size:18px;
background:url("8.jpg") no-repeat left top;color:#FFF;padding-bottom:4px} 
</style>
  <style type="text/css"> 
  <!-- 
   .STYLE1 {  
   color: #990033;  
   font-weight: bold;
   padding-top:15px;
   } 
   --> 
   </style> 
   <style>  
   a{TEXT-DECORATION:none}a:hover{TEXT-DECORATION:underline}.STYLE2 
   {color: #000000} 
   </style>
   
   </head> 
<title>该作者所著所有书籍</title>
<style type="text/css">
table {
border: 1px solid black;
border-collapse: collapse;
margin: 10px auto;
}
table thead tr th {
border: 1px solid black;
padding: 3px;
background-color: #cccccc;
}
table tbody tr td {
border: 1px solid black;
padding: 3px;
}
</style>
</head>
<body> 
<body style="background:url('photos/10.jpg') no-repeat; width:100%">
  
 
  <tr>     
  <td width="480" height="50" bgcolor="#CCFF00">
  <div align="center">
  <span class="STYLE1">该作者所作所有书籍</span></div></td>


<table cellspacing="0">
<thead>
<tr>

<th>ISBN</th>
<th>Title</th>
<th>Price</th>
<th>Publisher</th>
<th>PublishDate</th>
<th>AuthorID</th>
<th>Name</th>
<th>Country</th>
<th>Age</th>
<th>Delete</th>

</tr>
</thead>
<tbody>
    <ul>
    <s:iterator value="srst" >
    <tr>
     <td>  <s:property value="Isbn"/></td>
       
<td><s:a href="Information?BookTitle=%{Title}"> 
<s:property value="Title"/></td> 
</s:a>
      <td> <s:property value="Price"/></td>
      <td><s:property value="Publisher"/></td>
      <td><s:property value="PublishDate"/></td>
       <td><s:property value="AuthorID"/></td>
            <td> <s:property value="Name"/></td>
            <td><s:property value="Country"/></td>
             <td><s:property value="Age"/></td>
              <td><s:a href="Delete?AbanISBN=%{Isbn}">delete</s:a></td>
    
    </s:iterator>
  </ul>
  </body>
</html>