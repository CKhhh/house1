$(function () {
    $("form").on('submit',function () {
        var name=$("#name").val().trim();
        var password=$("#password").val().trim();
        $.ajax({
            url: "Login/login.html",
            type: "POST",
            dataType: "text",
            data: {uName:name,password:password},
            success: function (data) {
                if (eval(data)==0){
                    /*window.location.href = "Employee/toEmployee.html";*/
                    $(window).attr('location','Employee/toEmployee.html');
                } else
                if (data==1){
                    alert("用户名或密码错误！")
                }
            },
            error: function (xhrl) {
                alert("登录失败！")
            }
        })
    });
});
