function outLogin() {
    $.ajax({
        url:"../Login/outLogin.html",
        type:"POST",
        dataType:"text",
        success:function (data) {
            alert("注销成功！请重新登录！")
            $(window).attr('location','../../');
        },
        error:function (xhr) {
        }
    });
}