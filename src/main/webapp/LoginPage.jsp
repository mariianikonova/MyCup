<!doctype html public "-//w3c//dtd html 4.0 transitional//en">

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">

<head>
    <title>Login</title>
</head>
<body>
 <div style="margin-left: 10px; margin-top: 20px; margin-bottom: 20; margin-right: 10">
    <div style="float: left">
    <div> LoginPage<div>
    <div> Info</div>
    </div>

    <div style="float: left">
        <div style=" ">UserName</div>
        <form>
            UserName <input type="text" name="username"><br>
        </form>
        <div style="float: left">Password</div>
    <form>
         Password <input type="text" name="password">
    </form>

    <div>SingInButton</div>
    <div>RegistrationButton</div>
    <div>

    </div>
    </div>
 </div>

</body>
</html>


<div style="clear: both;"></div>
<div>
    <div style="margin-left: 10px; margin-top: 20px;">
        <div>
            <p style="font-weight: bold;">subscribe to macys.com emails:</p>
        </div>
        <p>
        <div>
            <div style="float: left; margin-right: 3px;">
                <input type="checkbox" name="subscription" style="width: auto"/>
            </div>
            <div style="margin-bottom: 8px;"> We'll let you know about exclusive sales and events, both online and in-store.
            </div>
        </div>
    </div>

    <div style="margin-left: 10px; margin-top: 20px;">
        <div>
            <p style="font-weight: bold">receive macys.com text messages:</p>
        </div>
        <p>
        <div style="float: left; margin-right: 3px;">
            <input type="checkbox" id="textoption" name="textoption">
        </div>
        <div style="margin-bottom: 12px;"> We'll let you know about exclusive
            sales and events, both online and in-store. We'll send your first text message within 48 hours.
        </div>
    </div>
</div>


<html>
<script>
    function validate(){
        var username=document.form.user.value;
        var password=document.form.pass.value;
        if(username==""){
            alert("Enter Username!");
            return false;
        }
        if(password==""){
            alert("Enter Password!");
            return false;
        }
        return true;
    }
</script>
<form name="form" method="post" action="http://localhost:8080/examples/Login" onsubmit="javascript:return validate();">
    <table>
        <tr><td>Username:</td><td><input type="text" name="user"></td></tr>
        <tr><td>Password:</td><td><input type="password" name="pass"></td></tr>
        <tr><td></td><td><input type="submit" value="Submit"></td></tr>
    </table>
</form>
</html>