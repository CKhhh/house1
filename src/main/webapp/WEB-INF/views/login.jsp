<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .form-signin{
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
        input{
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
    <div class="container">
        <form class="form-signin" role="form" onsubmit="return false">
            <h2 class="form-signin-heading" style="text-align: center">登录</h2>
            <input id="name" type="text" class="form-control" placeholder="用户名" required autofocus>
            <input id="password" type="password" class="form-control" placeholder="密码" required>
            <button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
        </form>
    </div>
    <script src="../../static/js/login.js"></script>
</body>
</html>