var reservationId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var reservation_allPn=0;
var reservation_nowPn=1;
$(function () {
    var s = "";
    $("#watchhouse").click(reservation1_1);
    $("#reservation_paper .paper_up").click(function () {
        if (reservation_nowPn>1){
            reservation_nowPn=reservation_nowPn-1;
            if ($("#reservation_table").attr("name")=="reservationUn"){
                reservation1();
            }else if ($("#reservation_table").attr("name")=="reservationDone") {
                reservation2();
            }else if($($("#reservation_table").attr("name")=="reservationSearch")){
                reservation3();
            }
        }
    });
    $("#reservation_paper .paper_down").click(function () {
        if (reservation_nowPn<reservation_allPn){
            reservation_nowPn=reservation_nowPn+1;
            if ($("#reservation_table").attr("name")=="reservationUn"){
                reservation1();
            }else if ($("#reservation_table").attr("name")=="reservationDone") {
                reservation2();
            }else if($($("#reservation_table").attr("name")=="reservationSearch")){
                reservation3();
            }
        }

    });
    var reservation_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in reservation_tableIndex){
        $("#reservation_table").on("click","#reservation_btn_"+i,{index:i},reservation_clickHandler);
    }
    $("#reservation_querenchuli").click(function () {
        var reservation_id=$("#reservation_id").html();
        var dealPerson=$("#reservation_person").val();
        var dealStatus=2;
        var dealNote=$("#reservation_beizhu").val();
        var now = new Date();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
        var reservationJson={id:reservation_id,dealPerson:dealPerson,dealStatus:dealStatus,dealTime:chulitime,dealNote:dealNote};
        $.ajax({
            url:"../Deal/reservation/dealReservation.html",
            type:"POST",
            dataType:"text",
            data:reservationJson,
            success:function () {
                reservation1_1();
                alert("处理成功！");
            },
            error:function () {
                alert("处理失败！请稍候重试！");
            }
        });
    });
    $("#yuyue_tijiao").click(function () {
        var ymd=$("#yuyue_time").val();
        var chulitime = ymd+" "+"00:00:00";
        var CCC = {
            "name":$("#yuyue_name").val(),
            "phone":$("#yuyue_tel").val(),
            "time":chulitime,
            "area":$("#yuyue_addr").val(),
            "note":$("#yuyue_info").val(),
            "dealStatus":1};
        $.ajax({
            url:"../Deal/reservation/insertReservation.html",
            type:"POST",
            dataType:"text",
            data:{"reservation":JSON.stringify(CCC)},
            success:function (data) {
                alert("添加成功！");
                reservation1_1();
            },
            error:function (xhrl) {
                alert("添加失败，请稍候重试！");
            }
        })
    });
});
function reservation1() {
    $("#reservation_table tbody").html("");
    $("#reservation_table").attr("name","reservationUn");
    $.ajax({
        url: "../Deal/reservation/selectByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:1,pn:reservation_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#reservation_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                reservation_allPn=parseInt(list.pages);
                $("#reservation_paper i").html("第"+reservation_nowPn+"页/共"+reservation_allPn+"页");
                for (i;i<list.list.length;i++) {
                    reservationId[i]=list.list[i].id;
                    $("#reservation_table tbody").append("<tr>"+"<td id='reservation_name_"+i+"'>"+list.list[i].name+"</td>"+
                        "<td id='reservation_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                        "<td id='reservation_yuyuetime_"+i+"'>"+list.list[i].time+"</td>"+
                        "<td id='reservation_address_"+i+"'>"+list.list[i].area+"</td>"+
                        "<td id='reservation_info_"+i+"'>"+list.list[i].note+"</td>"+
                        "<td><button type=\"button\" id='reservation_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m17'>处理</button></td>\n"+
                        "<td id='reservation_person_"+i+"'>"+"未处理</td>"+
                        "<td id='reservation_time_"+i+"'>"+"未处理</td>"+
                        "<td id='reservation_beizhu_"+i+"'>"+"未处理</td>"+
                        "</tr>");
                }
            }
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function reservation2() {
    $("#reservation_table tbody").html("");
    $("#reservation_table").attr("name","reservationDone");
    $.ajax({
        url: "../Deal/reservation/selectByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:2,pn:reservation_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#reservation_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                reservation_allPn=parseInt(list.pages);
                $("#reservation_paper i").html("第"+reservation_nowPn+"页/共"+reservation_allPn+"页");
                for (i;i<list.list.length;i++) {
                    $("#reservation_table tbody").append("<tr>"+"<td id='reservation_name_"+i+"'>"+list.list[i].name+"</td>"+
                        "<td id='reservation_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                        "<td id='reservation_yuyuetime_"+i+"'>"+list.list[i].time+"</td>"+
                        "<td id='reservation_address_"+i+"'>"+list.list[i].area+"</td>"+
                        "<td id='reservation_info_"+i+"'>"+list.list[i].note+"</td>"+
                        "<td><button type=\"button\" id='reservation_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m16'>查看</button></td>\n"+
                        "<td id='reservation_person_"+i+"'>"+list.list[i].dealPerson+"</td>"+
                        "<td id='reservation_time_"+i+"'>"+list.list[i].dealTime+"</td>"+
                        "<td id='reservation_beizhu_"+i+"'>"+list.list[i].dealNote+"</td>"+
                        "</tr>")
                }
            }
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function reservation3(s) {
        $("#reservation_table tbody").html("");
        $("#reservation_table").attr("name","reservationSearch");
        var blurry = s;
        $.ajax({
            url: "../Deal/reservation/selectBlurry.html",
            type: "POST",
            dataType: "json",
            data: {blurry:blurry,pn:reservation_nowPn},
            success: function (data) {
                var i = 0;
                if (data==null){
                    $("#reservation_table tbody").append("<text>未查询到数据</text>")
                }else {
                    var list = eval(data);
                    reservation_allPn=parseInt(list.pages);
                    $("#reservation_paper i").html("第"+reservation_nowPn+"页/共"+reservation_allPn+"页");
                    var l="",n="",m="";
                    for (i;i<list.list.length;i++) {
                        if (list.list[i].person==null){
                            l="未处理";
                            m="未处理";
                            n="未处理";
                            $("#reservation_table tbody").append("<tr>"+"<td id='reservation_name_"+i+"'>"+list.list[i].name+"</td>"+
                                "<td id='reservation_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                                "<td id='reservation_yuyuetime_"+i+"'>"+list.list[i].time+"</td>"+
                                "<td id='reservation_address_"+i+"'>"+list.list[i].area+"</td>"+
                                "<td id='reservation_info_"+i+"'>"+list.list[i].note+"</td>"+
                                "<td><button type=\"button\" id='reservation_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m17'>处理</button></td>\n"+
                                "<td id='reservation_person_"+i+"'>"+l+"</td>"+
                                "<td id='reservation_time_"+i+"'>"+m+"</td>"+
                                "<td id='reservation_beizhu_"+i+"'>"+n+"</td>"+
                                "</tr>");
                        }
                        else {
                            l = list.list[i].dealPerson;
                            m = list.list[i].dealTime;
                            n = list.list[i].dealNote;
                            $("#reservation_table tbody").append("<tr>"+"<td id='reservation_name_"+i+"'>"+list.list[i].name+"</td>"+
                                "<td id='reservation_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                                "<td id='reservation_yuyuetime_"+i+"'>"+list.list[i].time+"</td>"+
                                "<td id='reservation_address_"+i+"'>"+list.list[i].area+"</td>"+
                                "<td id='reservation_info_"+i+"'>"+list.list[i].note+"</td>"+
                                "<td><button type=\"button\" id='reservation_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m16'>查看</button></td>\n"+
                                "<td id='reservation_person_"+i+"'>"+l+"</td>"+
                                "<td id='reservation_time_"+i+"'>"+m+"</td>"+
                                "<td id='reservation_beizhu_"+i+"'>"+n+"</td>"+
                                "</tr>");
                        }
                    }
                }
            },
            error: function (xhrl) {
                alert("处理失败 请稍后重试。。。")
            }
        })
}
function reservation1_1() {
    reservation_nowPn=1;
    reservation1();
}
function reservation2_2() {
    reservation_nowPn=1;
    reservation2();
}
function reservation3_3() {
    var s = $("#reservationfind").val().trim();
    if (s===""){
        alert("请输入搜索值！")
    } else {
        reservation_nowPn=1;
        reservation3(s);
    }
}
function reservation_clickHandler(event){
    var index=event.data.index;
    if ($("#reservation_btn_"+index).html()=="处理"){
        var now = new Date();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate();
        $("#reservation_name").val($("#reservation_name_"+index).html());
        $("#reservation_phone").val($("#reservation_phone_"+index).html());
        $("#reservation_yuyuetime").val($("#reservation_yuyuetime_"+index).html());
        $("#reservation_addr").val($("#reservation_address_"+index).html());
        $("#reservation_info").val($("#reservation_info_"+index).html());
        $("#reservation_person").val($("#yuangong_name").val());
        $("#reservation_chulishijian").val(chulitime);
        $("#reservation_id").html(reservationId[index]);

    }else{
        $("#reservation1_name").val($("#reservation_name_"+index).html());
        $("#reservation1_phone").val($("#reservation_phone_"+index).html());
        $("#reservation1_yuyuetime").val($("#reservation_yuyuetime_"+index).html());
        $("#reservation1_addr").val($("#reservation_address_"+index).html());
        $("#reservation1_info").val($("#reservation_info_"+index).html());
        $("#reservation1_person").val($("#reservation_person_"+index).html());
        $("#reservation1_chulishijian").val($("#reservation_time_"+index).html());
        $("#reservation1_beizhu").val($("#reservation_beizhu_"+index).html());
    }
}
$("#reservationfind").on("click", ":button", function(event){
});