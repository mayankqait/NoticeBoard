<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Notice Board</title>
<style>
#noticeboard{
  margin-top:5%;
  border:3px solid #00b3b3;
  width:40%;
  height:15%;
  color:#00e6ac;
}
.outerdiv{
    
    margin-top:10%;
    width:40%;
    height:300px;
    border:3px solid #0099ff;
}
.buttondiv{
     margin-top:100px;
}
.readbutton {
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
.writebutton {
    background-color: white;
    border: 2px solid #f44336;
    color: #f44336;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 24px;
    
    cursor: pointer;
}
.readbutton:hover {
    background-color: #4CAF50;
    color: white;
}
.writebutton:hover {
    background-color: #f44336;
    color: white;
}
</style>
</head>
<body>

 <center>
    <div id="noticeboard">
      <h1>NOTICE BOARD</h1>  
    </div>
  </center> 
    <form method="get" action="http://localhost:8086/NoticeBoard/webapi/myresource/read"> 
 <center> 
    
      <div class="outerdiv"><div class="buttondiv">
      <button type="submit" class="readbutton">READ</button>
      &nbsp &nbsp &nbsp &nbsp 
      <a href="writePage.jsp"><button type="button" class="writebutton">WRITE</button></a>
    </div></div>
   
 </center>
   </form> 
</body>
</html>