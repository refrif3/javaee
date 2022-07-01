<%--
  Created by IntelliJ IDEA.
  User: abakar
  Date: 01/07/2022
  Time: 02:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CONNEXION</title>
    <link rel="stylesheet" href="./style.css">
    <link rel="stylesheet" href="style2.css">
</head>
<body>
<style>
    *{
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    }
    body{
        background-color: #003366;
    }
    .container{
        margin: auto;
        display: flex;
        flex-direction: row;
        justify-content: space-around;
        margin-top: 10%;
    }
    .btn{
        text-decoration: none;
        color: #4291EF;
        padding: 10px;
        background-color: #fff;
        border-radius: 5px;
        display: inline;
    }
    .div1{
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        text-align: center;
    }
    .titre{
        color: #fff;
        font-size: 35px;
        text-transform: uppercase;
    }
    .aide{
        margin-top: 20px;
    }

    .container2{
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
    .divcentre{
        background-color: #fff;
        padding: 50px;
        border-radius: 6px;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        margin-top: 120px;
    }
    input{
        padding: 15px;
        margin-top: 15px;
        font-size: 15px;
    }
    .btn-now{
        display: inline-block;
        padding-top: 15px;
        text-align: center;
        align-items: center;
        padding: 10px;
        background-color: #4291EF;
        border-radius: 5px;
        margin-top: 25px;
        color: #fff;
        text-decoration: none;
        font-size: 20px;
    }
</style>
<div class="container2">
    <div class="divcentre">
        <h2>Sing In</h2>
        <form action="" method="post">
            <input type="email" name="id" placeholder="email"><br>
            <input type="password" name="passwd" placeholder="passwd"><br>
        </form>
        <button type="submit">DONE</button>
        <div class="aide">
            Mot de passe oublie ? <br> Veuillez contacter le <a href="">root</a>
        </div>
    </div>
</div>
</body>
</html>
