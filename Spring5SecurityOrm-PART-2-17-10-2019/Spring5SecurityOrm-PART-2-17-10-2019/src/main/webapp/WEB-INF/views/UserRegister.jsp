<html>
<body>
<h3>Welcome to User Register Page!!</h3>
<form action="save" method="post">
<pre>
NAME  : <input type="text" name="userName"/>
EMAIL : <input type="text" name="userEmail"/>
PWD   : <input type="password" name="userPwd"/>
ROLES : 
  <input type="checkbox" name="roles" value="ADMIN"> ADMIN
  <input type="checkbox" name="roles" value="EMPLOYEE"> EMPLOYEE
  <input type="submit" value="Register"/>
</pre>
</form>
${msg}
</body>
</html>