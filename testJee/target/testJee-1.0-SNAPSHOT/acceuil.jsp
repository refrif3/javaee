<%--
  Created by IntelliJ IDEA.
  User: abakar
  Date: 27/06/2022
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <style>
      h1 {
          color: #fff;
          text-align: center;
          justify-content: center;
      }
      body{
          background-color: #333;
      }
  </style>
<h1>${ !empty sessionScope.login ? sessionScope.login : sessionScope.login }</h1>
  </body>
</html>
