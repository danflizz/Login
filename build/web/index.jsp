<%-- 
    Document   : index
    Created on : 09-jul-2018, 14:10:31
    Author     : dflores
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <script src="js/script.js"> </script>
        <title>Login</title>
    </head>
    <body>
        <h1>Iniciar Sesión</h1>
        
        <div>
            <form action="Authentication" method="post">
                <p> <input type="text" name="user" id="user" /> </p>
                <p> <input type="password" name="pass" id="pass"/> </p>
                <p> <input type="submit" name="signin" id="signin" value="Sign In"/> </p>
                
            </form>
        </div>
        
        <input type="button" value="Hi" onclick="hi()" />
    </body>
</html>
