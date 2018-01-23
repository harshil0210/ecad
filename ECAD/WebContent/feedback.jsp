	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="document.register.en.focus()" >

<form name="feedback" action="FeedbackServlet" method="post">
<center>
<b><u>Feedback Form:</u></b>
<table>
<tr>
<td><input type="text" name="enroll" placeholder="Enter Enrollment no" maxlength="11"></td></tr>
<tr><td><input type="text" name="name" placeholder="Enter Student name" ></td></tr>
<tr><td><select name="branch">
<option value="cba">CBA</option>
<option value="bda">BDA</option>
<option value="ma">MA</option>

</select>
</td></tr>
<tr><td><input type="text" name="subject" placeholder="Enter subject"></td></tr>
<tr><td><textarea name="message" placeholder="Enter FeedBack"></textarea></td></tr>




</table>
<input type="submit" value="Submit">

</center>

</form>


</body>
</html>