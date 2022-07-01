<%--
  Created by IntelliJ IDEA.
  User: abakar
  Date: 27/06/2022
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/WEB-INF/style.css">
</head>
<body>
<h1>CONNEXION</h1>
<style>
    body{
        background-color: #333333;
    }
    form{
        justify-content: center;
    }
    input{
        align-items: center;
        padding: 10px;
        margin-top: 20px;
    }

</style>
${ !empty err ? err : err }
<form action="" method="post">
    <input type="text" name="login" placeholder="Login"><br>
    <input type="password" name="passwd" placeholder="Passwd"><br>
    <button type="submit">DONE</button>
</form>
</body>e
</html>
