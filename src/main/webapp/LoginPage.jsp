<!doctype html public "-//w3c//dtd html 4.0 transitional//en">

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">


<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <style type="text/css">

    .mainFontRules
    {font-family: verdana, arial, sans-serif; font-size: 16px;}
        .smallerFontRules
        {font-family: verdana, arial, sans-serif; font-size: 14px;}
    .leftsection
    {background-color: #90EE90; float:left; width: 40%; padding: 30px; height:90%}
    .rightSection
    {background-color: #E6E6FA; float:left; padding: 20px; height:90%; width:40%}
    .buttons {font-family: verdana, arial, sans-serif; font-size: 14px;}
    #footer {bottom: 0; height: 4%; float:left; background-color: #33cccc; width:100% }
    </style>


    <title>LoginPage</title>

</head>
<body>
<form method="post" action="LoginPageChecker.jsp">
<div class="leftSection">
     <div class="mainFontRules" style="align:center; margin:3px">
  User Info
      </div>
</div>
<div class="rightSection">
    <div style="height: 30%"></div>
    <div class="mainFontRules" style="float:left; margin:3px">
        User Id <br>
        Password<br>
    </div>
    <div class="mainFontRules" style="margin:3px; float:left">

        <input type="text" name="userId" size="24" style="float:right; margin:3px;">    <br>

        <input type="text" name="password" size="24" minlength="6" style="float:right; margin:3px;">
    <p>
    <div>
        <input type="submit" name="submitButton" value="Login"  style="float:right; margin:3px; margin-left:5px" class="buttons">
    </div>
    <p>
    <div class="smallerFontRules" style="margin:3px; margin-top:5" >
        <input type="checkbox" name="rememberMe" value="remembered">
        Remember Me
    <p>
    <p>
    </div>
    <div class="mainFontRules">
        <input type="submit" name="submitButton" value="Create User" style="margin:3px; float:left" class="buttons">

        <input type="submit" name="forgotPassword" value="Forgot Password" style="margin:3px; float:left" class="buttons">
    </div>
    </div>
</div>
   <div id="footer">
   </div>
</form>
</body>
</html>

















<%--<head>--%>
    <%--<title>Login</title>--%>
    <%--<style type="text/css">--%>
        <%--body {color: red;}--%>
        <%--input {weigth: 250px}--%>
    <%--</style>--%>
    <%--<style type="">--%>

    <%--</style>--%>
<%--</head>--%>
<%--<body>--%>
 <%--<div style="margin-left: 10px; margin-top: 20px; margin-bottom: 20; margin-right: 10">--%>
    <%--<div style="float: left">--%>
    <%--<div> LoginPage<div>--%>
    <%--<div> Info</div>--%>
    <%--</div>--%>

    <%--<div style="float: left">--%>
        <%--<div style=" ">UserName</div>--%>
        <%--<form>--%>
            <%--UserName <input type="text" name="username"><br>--%>
        <%--</form>--%>
        <%--<div style="float: left">Password</div>--%>
    <%--<form>--%>
         <%--Password <input type="text" name="password">--%>
    <%--</form>--%>

    <%--<div>SingInButton</div>--%>
    <%--<div>RegistrationButton</div>--%>
    <%--<div>--%>

    <%--</div>--%>
    <%--</div>--%>
 <%--</div>--%>

<%--</body>--%>
<%--</html>--%>


<%--<div style="clear: both;"></div>--%>
<%--<div>--%>
    <%--<div style="margin-left: 10px; margin-top: 20px;">--%>
        <%--<div>--%>
            <%--<p style="font-weight: bold;">subscribe to macys.com emails:</p>--%>
        <%--</div>--%>
        <%--<p>--%>
        <%--<div>--%>
            <%--<div style="float: left; margin-right: 3px;">--%>
                <%--<input type="checkbox" name="subscription" style="width: auto"/>--%>
            <%--</div>--%>
            <%--<div style="margin-bottom: 8px;"> We'll let you know about exclusive sales and events, both online and in-store.--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>

    <%--<div style="margin-left: 10px; margin-top: 20px;">--%>
        <%--<div>--%>
            <%--<p style="font-weight: bold">receive macys.com text messages:</p>--%>
        <%--</div>--%>
        <%--<p>--%>
        <%--<div style="float: left; margin-right: 3px;">--%>
            <%--<input type="checkbox" id="textoption" name="textoption">--%>
        <%--</div>--%>
        <%--<div style="margin-bottom: 12px;"> We'll let you know about exclusive--%>
            <%--sales and events, both online and in-store. We'll send your first text message within 48 hours.--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>


<%--<html>--%>
<%--<script>--%>
    <%--function validate(){--%>
        <%--var username=document.form.user.value;--%>
        <%--var password=document.form.pass.value;--%>
        <%--if(username==""){--%>
            <%--alert("Please, Enter Username!");--%>
            <%--return false;--%>
        <%--}--%>
        <%--if(password==""){--%>
            <%--alert("Please, Enter Password!");--%>
            <%--return false;--%>
        <%--}--%>
        <%--return true;--%>
    <%--}--%>
<%--</script>--%>
<%--<form name="form" method="post" action="http://localhost:8080/examples/Login" onsubmit="javascript:return validate();">--%>
    <%--<table>--%>
        <%--<tr><td>Username:</td><td><input type="text" name="user"></td></tr>--%>
        <%--<tr><td>Password:</td><td><input type="password" name="pass"></td></tr>--%>
        <%--<tr><td></td><td><input type="submit" value="Submit"></td></tr>--%>
    <%--</table>--%>
<%--</form>--%>
<%--</html>--%>