<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#noticeboard{
  margin-top:5%;
  border:3px solid #00b3b3;
  width:40%;
  height:15%;
  color:#00e6ac;
}
.messagebox{
    
    margin-top:10%;
    margin-left:24%;
    width:50%;
    height:300px;
    border:3px solid #0099ff;
}
  .submitbutton {
    background-color: white;
    border: 2px solid #4CAF50;
    color: #4CAF50;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 24px;
    
    cursor: pointer;
}
.submitbutton:hover {
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>
<center>
    <div id="noticeboard">
      <h1>WRITE NOTICE</h1>  
    </div>
  </center> 
<form method="post" action="http://localhost:8086/NoticeBoard/webapi/myresource/write" >
   <div class="messagebox">
    <center> <p></p>
    <textarea rows="15" cols="70" name="notice" autofocus ></textarea>
     
     <button type="submit" class="submitbutton">ADD NOTICE</button>
    </center>
   </div>
</form>
</body>
</html>