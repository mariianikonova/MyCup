<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <style type="text/css">
    .mainFontRules {
        font-family: verdana, arial, sans-serif;
        font-size: 16px;
    }
    .smallerFontRules {
        font-family: verdana, arial,
        sans-serif; font-size: 14px;
    }
    .leftsection {
        background-color: #90EE90;
        float:left; width: 40%;
        padding: 30px;
        height:90%
    }
    .rightSection {
        background-color: #E6E6FA;
        float:left;
        padding: 20px;
        height:90%;
        width:50%
    }
    .buttons {
        font-family: verdana, arial, sans-serif;
        font-size: 14px;
    }
    #footer {
        bottom: 0;
        height: 4%;
        float:left;
        background-color: #33cccc;
        width:100%
    }
    </style>

    <title>LoginPage</title>
</head>
<body>

    <form method="post" action="/LoginServlet">
<div class="leftSection">
     <div class="mainFontRules" style="align:center; margin:3px">
  User Info
      </div>
</div>
<div class="rightSection">
    <div style="height: 30%"></div>
    <div class="mainFontRules" style="margin:3px; width:230">
        &nbsp;User Id <br>
        <input type="text" name="userId" size="24" style="; margin:3px;"/>    <br>
    </div>
    <div class="mainFontRules" style="margin:3px; width:230">
        &nbsp;Password<br>
        <input type="password" name="password" size="24" minlength="6" style="margin:3px;"/>
    <div>
        <input type="submit" name="submitButton" value="Login"  style="margin:5px; float:right;" class="buttons"/>
    </div>
    </div>
    <p>
    <div class="smallerFontRules" style="margin:3px,5px" >
    &nbsp;Remember Me
    <input type="checkbox" name="rememberMe" value="remembered"/>
    </div>
    <p>
    <p>
    <div class="mainFontRules">
        <input type="submit" name="submitButton" value="Create User" style="margin:3px;" class="buttons"/>
        <input type="submit" name="forgotPassword" value="Forgot Password" style="margin:3px;" class="buttons"/>
    </div>
    </div>
</div>
   <div id="footer">
   </div>
</form>
</body>
</html>