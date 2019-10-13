var yuangongAccount_Password=[{account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},
    {account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},
    {account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},
    {account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0},{account:0,password:0}];
var employee_allPn=0;
var employee_nowPn=1;
var empType = $("#empType").html()
var branchh = null;
var allEmployee
var job = ["店长","经理","业务","文秘"]
$(function () {
    $("#staff").click(staff_init1);
    $.ajax({
        url:"../Find/selectAllDistBranch.html",
        type:"POST",
        dataType:"json",
        success:function (data) {
            branchh = eval(data);
            inputSearchBranch();
        },
        error:function(){
            alert("错误！")
        }
    });
    $("#yuangong_paper .paper_up").click(function () {
        if (employee_nowPn>1){
            employee_nowPn=employee_nowPn-1;
            if ($("#yuangong_table").attr("name")=="yuangongAll"){
                staff_init();
            }else if ($("#yuangong_table").attr("name")=="yuangongSearch") {
                searchyuangong_fun1();
            }
        }
    });
    $("#yuangong_paper .paper_down").click(function () {
        if (employee_nowPn<employee_allPn){
            employee_nowPn=employee_nowPn+1;
            if ($("#yuangong_table").attr("name")=="yuangongAll"){
                staff_init();
            }else if ($("#yuangong_table").attr("name")=="yuangongSearch") {
                searchyuangong_fun1();
            }
        }

    });
    $("#changeyuangong").click(function () {
        var changeyuangongJson={empId:$("#change_id").val(),empName:$("#change_name").val(),empPhone:$("#change_tel").val(),empBranch:$("#change_fendian").find("option:selected").text(),empPart:$("#change_bumen").find("option:selected").text(),
            empJob:$("#change_zhiwu").find("option:selected").text(),empArea:$("#change_fendian").find("option:selected").text(),empEntry:$("#change_entry").val(),empType:$("#empType").text(),
            uName:$("#change_account").val(),password:$("#change_password").val()};
        $.ajax({
            url: "updateEmployee.html",
            type: "POST",
            dataType: "text",
            data: changeyuangongJson,
            success: function (data) {
                $.ajax({
                    url:"../Login/outLogin.html",
                    type:"POST",
                    success:function (data) {
                        alert("修改成功！请重新登录！");
                    },
                    error:function (data) {
                        alert("失败！");
                    }
                });
            },
            error: function (xhrl) {
                alert("修改失败!请稍候重试！")
            }
        });
    });
    $("#addyuangong").click(function () {
        var et;
        switch ($("#add_zhiwu").find("option:selected").text()){
            case "管理员":et=4;break;
            case "店长":et=3;break;
            case "经理":et=2;break;
            case "财务":et=2;break;
            case "文秘":et=1;break;
            case "业务":et=1;break;
            default:break;
        }
        var addyuangongJson={empName:$("#add_name").val(),empPhone:$("#add_tel").val(),empBranch:$("#add_fendian").find("option:selected").text(),empPart:$("#add_bumen").find("option:selected").text(),
            empJob:$("#add_zhiwu").find("option:selected").text(),empArea:$("#add_fendian").find("option:selected").text(),empEntry:$("#add_entry").val(),empType:et,
            uName:$("#add_account").val(),password:$("#add_password").val()};
        $.ajax({
            url:"insertEmployee.html",
            type:"POST",
            dataType:"text",
            data:addyuangongJson,
            success:function (data) {
                if (data=="0"){
                    alert("添加失败！该账户名已存在！")
                } else {
                    alert("添加成功！");
                }
                staff_init1();
            },
            error:function (xhr1) {
                alert("添加失败！请稍候重试！")
            }
        });
    });
    $("#search_yuangong_btn").click(searchyuangong_fun1);

    var yuangong_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in yuangong_tableIndex){
        $("#yuangong_table").on("click","#yuangong_xiugai_"+i,{index:i},yuangong_clickHandler);
    }
    function yuangong_clickHandler(event) {
        var index=event.data.index;
        $("#change1_fendian").html("")
        $("#change1_bumen").html("")
        $("#change1_zhiwu").html("")
        $("#change1_id").val($("#yuangong_id_"+index).html());
        var s = 0;
        switch($("#empType").html()){
            case("4"):
                $("#change1_zhiwu").append("<option value='" + "0"  + "'>请选择职务</option>");
                for (s=0;s<job.length;s++ ){
                    $("#change1_zhiwu").append("<option value='" + job[s] + "'>"+job[s]+"</option>");
                }
                $("#change1_zhiwu").append("<option value='" + "财务" + "'>财务</option>");
                $("#change1_zhiwu").selectpicker("refresh");
                $("#change1_zhiwu").selectpicker("render");
                $("#change1_fendian").append("<option value='" + "0" + "'>请选择分店</option>")
                for (var m=0;m<branchh.length;m++){
                    $("#change1_fendian").append("<option value='" + branchh[m]+ "'>"+branchh[m]+"</option>")
                }
                $("#change1_fendian").selectpicker("refresh");
                $("#change1_fendian").selectpicker("render");
                break;
            case("3"):
                for (s=1;s<job.length;s++ ){
                    $("#change1_zhiwu").append("<option value='" + job[s] + "'>"+job[s]+"</option>");
                }
                $("#change1_zhiwu").append("<option value='" + "财务" + "'>财务</option>");
                $("#change1_zhiwu").selectpicker("refresh");
                $("#change1_zhiwu").selectpicker("render");
                $("#change1_fendian").append("<option value='" + $("#yuangong_fendian").find("option:selected").text()+
                    "'>"+$("#yuangong_fendian").find("option:selected").text()+"</option>");
                $("#change1_fendian").selectpicker("refresh");
                $("#change1_fendian").selectpicker("render");
                $.ajax({
                    url:"../Find/findDepa.html",
                    type:"POST",
                    dataType:"json",
                    data:{"branch":$("#yuangong_fendian").find("option:selected").text()},
                    success:function (data) {
                        var lll = eval(data);
                        for (var w = 0;w<lll.length;w++){
                            $("#change1_bumen").append("<option value='"+ lll[w].branchDepa+ "'>" + lll[w].branchDepa+"</option>")
                        }
                        $("#change1_bumen").selectpicker("refresh");
                        $("#change1_bumen").selectpicker("render");
                    },
                    error:function (xhr) {
                    }
                });
                break;
            case("2"):
                for (s=2;s<job.length;s++ ){
                    $("#change1_zhiwu").append("<option value='" + job[s] + "'>"+job[s]+"</option>");
                }
                $("#change1_fendian").append("<option value='" + $("#yuangong_fendian").find("option:selected").text()
                    + "'>"+$("#yuangong_fendian").find("option:selected").text()+"</option>");
                $("#change1_bumen").append("<option value='" + $("#yuangong_bumen").find("option:selected").text()
                    + "'>"+$("#yuangong_bumen").find("option:selected").text()+"</option>");
                $("#change1_fendian").selectpicker("refresh");
                $("#change1_fendian").selectpicker("render");
                $("#change1_bumen").selectpicker("refresh");
                $("#change1_bumen").selectpicker("render");
                break;
            default:break;
        }
        $("#change1_zhiwu").selectpicker("refresh");
        $("#change1_zhiwu").selectpicker("render");
        $("#change1_name").val($("#yuangong_id_"+index).html());
        $("#change1_tel").val($("#yuangong_tel_"+index).html());
        $("#change1_entry").val($("#yuangong_entry_"+index).html());
        $("#change1_account").val(yuangongAccount_Password[index].account);
        $("#change1_password").val(yuangongAccount_Password[index].password);
    }
    $("#changeyuangong1").click(function () {
        var et;
        switch ($("#change1_zhiwu").find("option:selected").text()){
            case "管理员":et=4;break;
            case "店长":et=3;break;
            case "经理":et=2;break;
            case "财务":et=2;break;
            case "文秘":et=1;break;
            case "业务":et=1;break;
            default:break;
        }
        var changeyuangong1Json={empId:$("#change1_id").val(),empName:$("#change1_name").val(),empPhone:$("#change1_tel").val(),empBranch:$("#change1_fendian").find("option:selected").text(),empPart:$("#change1_bumen").find("option:selected").text(),
            empJob:$("#change1_zhiwu").find("option:selected").text(),empArea:$("#change1_fendian").find("option:selected").text(),empEntry:$("#change1_entry").val(),empType:et,
            uName:$("#change1_account").val(),password:$("#change_password").val()};
        $.ajax({
            url: "updateEmployee.html",
            type: "POST",
            dataType: "text",
            data: changeyuangong1Json,
            success: function (data) {
                alert("成功");
                staff_init1();
            },
            error: function (xhrl) {
                alert("修改失败!请稍候重试！")
            }
        });
    });
});
function staff_init() {
    $("#yuangong_table tbody").html("");
    $("#yuangong_table").attr("name","yuangongAll");

    var empType=$("#empType").html();
    var empArea=$("#yuangong_fendian").find("option:selected").text();
    var empPart=$("#yuangong_bumen").find("option:selected").text();
    var init_yuangongJson={empType:empType,empArea:empArea,empPart:empPart,pn:employee_nowPn};
    $.ajax({
        url:"selectEmployee.html",
        type:"POST",
        dataType:"json",
        data:init_yuangongJson,
        success:function (data) {
            eval(data);
            allEmployee = eval(data);
            employee_allPn=parseInt(data.pages);
            $("#yuangong_paper i").html("第"+employee_nowPn+"页/共"+employee_allPn+"页");
            $("#yuangong_table tbody").html("");
            for (var i=0;i<data.list.length;i++){
                yuangongAccount_Password[i].account=data.list[i].empUname;
                yuangongAccount_Password[i].password=data.list[i].empPassword;
                $("#yuangong_table tbody").append(
                    "<tr>" +
                    "<td id='yuangong_id_"+i+"'>"+data.list[i].empId+"</td>"+
                    "<td id='yuangong_zhiwu_"+i+"'>"+data.list[i].empJob+"</td>"+
                    "<td id='yuangong_fendian_"+i+"'>"+data.list[i].empBranch+"</td>"+
                    "<td id='yuangong_bumen_"+i+"'>"+data.list[i].empPart+"</td>"+
                    "<td id='yuangong_name_"+i+"'>"+data.list[i].empName+"</td>"+
                    "<td id='yuangong_tel_"+i+"'>"+data.list[i].empPhone+"</td>"+
                    "<td id='yuangong_entry_"+i+"'>"+data.list[i].empEntry+"</td>"+
                    "<td>"+"<button type='button'"+" id='yuangong_xiugai_"+i+"'"+" class='btn btn-primary changeyuangong_btn'  data-toggle='modal' data-target='.m6'>修改</button>"+"</td>"+
                    "</tr>");
            }
        },
        error:function (xhr1) {
            alert("查询失败，请稍候重试！");
        }
    });
}
function search_yuangong_fun() {
    $("#yuangong_table tbody").html("");
    var empName=$("#search_yuangong_name").val();
    var empArea=$("#search_yuangong_fendian").find("option:selected").text();
    var empPart=$("#search_yuangong_bumen").find("option:selected").text();
    var empType=$("#empType").html();
    $("#yuangong_table").attr("name","yuangongSearch");
    var bbb ;
    if (empArea=="请选择分店"){
        bbb="";
    } else {
        bbb=empArea;
    }
    var searchyuangongJson={empName:empName,bbb:empArea,empPart:empPart,pn:employee_nowPn,empType:empType};
    $.ajax({
        url:"selectOneEmployee.html",
        type:"POST",
        dataType:"json",
        data:searchyuangongJson,
        success:function (data) {
            $("#yuangong_table tbody").html("");
            eval(data);
            employee_allPn=parseInt(data.pages);
            $("#yuangong_paper i").html("第"+employee_nowPn+"页/共"+employee_allPn+"页");
            for (var i=0;i<data.list.length;i++){
                yuangongAccount_Password[i].account=data.list[i].empUname;
                yuangongAccount_Password[i].password=data.list[i].empPassword;
                $("#yuangong_table tbody").append(
                    "<tr>" +
                    "<td id='yuangong_id_"+i+"'>"+data.list[i].empId+"</td>"+
                    "<td id='yuangong_zhiwu_"+i+"'>"+data.list[i].empJob+"</td>"+
                    "<td id='yuangong_fendian_"+i+"'>"+data.list[i].empBranch+"</td>"+
                    "<td id='yuangong_bumen_"+i+"'>"+data.list[i].empPart+"</td>"+
                    "<td id='yuangong_name_"+i+"'>"+data.list[i].empName+"</td>"+
                    "<td id='yuangong_tel_"+i+"'>"+data.list[i].empPhone+"</td>"+
                    "<td id='yuangong_entry_"+i+"'>"+data.list[i].empEntry+"</td>"+
                    "<td>"+"<button type='button'"+" id='yuangong_xiugai_"+i+"'"+" class='btn btn-primary changeyuangong_btn'  data-toggle='modal' data-target='.m6'>修改</button>"+"</td>"+
                    "</tr>");
            }
        },
        error:function (xhr1) {
            alert("查询失败，请稍候重试！");
        }
    });
}
function searchyuangong_fun1() {
    employee_nowPn=1;
    search_yuangong_fun();
}
function staff_init1() {
    employee_nowPn=1;
    staff_init();
}
function liandongBranch4(evt) {
    $("#search_yuangong_bumen").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#search_yuangong_bumen").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#search_yuangong_bumen").selectpicker("refresh");
                $("#search_yuangong_bumen").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function inputSearchBranch() {
    $("#search_yuangong_bumen").empty();
    $("#search_yuangong_fendian").empty();
    if (empType=="4"){
        $("#search_yuangong_fendian").append("<option value='"+ 0 +"'>"+ "请选择分店" +"</option>")
        for (var m = 0;m<branchh.length;m++){
            $("#search_yuangong_fendian").append("<option value='"+ branchh[m] +"'>"+ branchh[m] +"</option>" )
        }
        $("#search_yuangong_fendian").selectpicker("refresh");
        $("#search_yuangong_fendian").selectpicker("render");
    }
    if (empType==3){
        $("#search_yuangong_fendian").append("<option value='"+ $("#yuangong_fendian").find("option:selected").text() +"'>"
            + $("#yuangong_fendian").find("option:selected").text() +"</option>" )
        $("#search_yuangong_fendian").selectpicker("refresh");
        $("#search_yuangong_fendian").selectpicker("render");
        $.ajax({
            url:"../Find/findDepa.html",
            type:"POST",
            dataType:"json",
            data:{"branch":$("#yuangong_fendian").find("option:selected").text()},
            success:function (data) {
                var list = eval(data);
                for (var o = 0;o<list.length;o++){
                    $("#search_yuangong_bumen").append("<option>"+ list[o].branchDepa +"</option>" )
                    $("#search_yuangong_bumen").selectpicker("refresh");
                    $("#search_yuangong_bumen").selectpicker("render");
                }
            },
            error:function (xhr) {
            }
        });
    }
    if (empType==2){
        $("#search_yuangong_fendian").append("<option>"+ $("#yuangong_fendian").find("option:selected").text() +"</option>" )
        $("#search_yuangong_bumen").append("<option value='" + $("#yuangong_bumen").find("option:selected").text()
            +"'>"+ $("#yuangong_bumen").find("option:selected").text() +"</option>")
        $("#search_yuangong_fendian").selectpicker("refresh");
        $("#search_yuangong_fendian").selectpicker("render");
        $("#search_yuangong_bumen").selectpicker("refresh");
        $("#search_yuangong_bumen").selectpicker("render");
    }
}
function tianjiayuangong() {
    $("#add_fendian").html("")
    $("#add_zhiwu").html("")
    $("#add_bumen").html("")
    $("#add_entry").html("")
    $("#add_name").html("")
    $("#add_password").html("")
    $("#add_tel").html("")
    $("#add_account").html("")
    if (empType==4){
        $("#add_fendian").append("<option value='0'>" +  "请选择分店" +"</option>")
        for (var m =0;m<branchh.length;m++){
            $("#add_fendian").append("<option value='" + branchh[m]+ "'>" +  branchh[m] +"</option>")
            $("#add_fendian").selectpicker("refresh");
            $("#add_fendian").selectpicker("render");
        }
        for (var d= 0;d<job.length;d++){
            $("#add_zhiwu").append("<option value='"+ job[d]+ "'>" +  job[d] +"</option>")
        }
        $("#add_zhiwu").append("<option value='"+ "财务"+ "'>" +  "财务" +"</option>")
        $("#add_zhiwu").selectpicker("refresh");
        $("#add_zhiwu").selectpicker("render");
    }else if (empType ==3) {
        $("#add_fendian").append("<option value='" + $("#yuangong_fendian").find("option:selected").text()+"'>" +
            $("#yuangong_fendian").find("option:selected").text() +"</option>")
        $("#add_fendian").selectpicker("refresh");
        $("#add_fendian").selectpicker("render");
        $.ajax({
            url:"../Find/findDepa.html",
            type:"POST",
            dataType:"json",
            data:{"branch":$("#yuangong_fendian").find("option:selected").text()},
            success:function (data) {
                var lll = eval(data);
                for (var w = 0;w<lll.length;w++){
                    $("#add_bumen").append("<option value='"+ lll[w].branchDepa+ "'>" + lll[w].branchDepa+"</option>")
                }
                $("#add_bumen").selectpicker("refresh");
                $("#add_bumen").selectpicker("render");
            },
            error:function (xhr) {
            }
        });
        for (var d= 1;d<job.length;d++){
            $("#add_zhiwu").append("<option value='"+ job[d]+ "'>" +  job[d] +"</option>")
        }
        $("#add_zhiwu").append("<option value='"+ "财务"+ "'>" +  "财务" +"</option>")
        $("#add_zhiwu").selectpicker("refresh");
        $("#add_zhiwu").selectpicker("render");
    }else if (empType ==2){
        $("#add_fendian").append("<option value='" + $("#yuangong_fendian").find("option:selected").text()+"'>" +  $("#yuangong_fendian").find("option:selected").text() +"</option>")
        $("#add_bumen").append("<option value='"+ $("#yuangong_bumen").find("option:selected").text() +"'>" +  $("#yuangong_bumen").find("option:selected").text() +"</option>")
        $("#add_fendian").selectpicker("refresh");
        $("#add_fendian").selectpicker("render");
        $("#add_bumen").selectpicker("refresh");
        $("#add_bumen").selectpicker("render");
        for (var d= 2;d<job.length;d++){
            $("#add_zhiwu").append("<option value='"+ job[d]+ "'>" +  job[d] +"</option>")
        }
        $("#add_zhiwu").selectpicker("refresh");
        $("#add_zhiwu").selectpicker("render");
    }
}
function liandongBranch5(evt) {
    $("#add_bumen").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#add_bumen").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#add_bumen").selectpicker("refresh");
                $("#add_bumen").selectpicker("render");
            }
        },
        error:function (xhr) {
            alert("错误！")
        }
    });
}
function liandongBranch6(evt) {
    $("#change1_bumen").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#change1_bumen").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#change1_bumen").selectpicker("refresh");
                $("#change1_bumen").selectpicker("render");
            }
        },
        error:function (xhr) {
            alert("错误！")
        }
    });
}
function tianjiadianzhang(evt) {
    var b = evt.value;
    if (b=="店长")
    $("#change1_bumen").empty();
}
function xiugaidianzhang(evt) {
    var b = evt.value;
    if (b=="店长")
        $("#add_bumen").empty();
}