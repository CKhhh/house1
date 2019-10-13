var onlineId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var online_allPn=0;
var online_nowPn=1;
var online_allData;
var allchakanWeituo
$(function () {
    var s = "";
    $("#entrust").click(online1_1());
    $("#online_paper .paper_up").click(function () {
        if (online_nowPn>1){
            online_nowPn=online_nowPn-1;
            if ($("#online_table").attr("name")=="onlineUn"){
                online1();
            }else if ($("#online_table").attr("name")=="onlineDone") {
                online2();
            }else if($($("#online_table").attr("name")=="onlineSearch")){
                online3();
            }
        }
    });
    $("#online_paper .paper_down").click(function () {
        if (online_nowPn<online_allPn){
            online_nowPn=online_nowPn+1;
            if ($("#online_table").attr("name")=="onlineUn"){
                online1();
            }else if ($("#online_table").attr("name")=="onlineDone") {
                online2();
            }else if($($("#online_table").attr("name")=="onlineSearch")){
                online3();
            }
        }

    });
    var online_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in online_tableIndex){
        $("#online_table").on("click","#online_btn_"+i,{index:i},online_clickHandler);
    }
    $("#online_querenchuli").click(function () {
        var id=$("#online_id").html();
        var dealPerson=$("#online_person").val();
        var dealStatus=2;
        var dealNote=$("#online_beizhu").val();
        var now = new Date();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
        var onlineJson={id:id,dealPerson:dealPerson,dealStatus:dealStatus,dealTime:chulitime,dealNote:dealNote};
        $.ajax({
            url:"../Deal/onlineComm/dealOnlineComm.html",
            type:"POST",
            dataType:"text",
            data:onlineJson,
            success:function () {
                online1_1();
                alert("处理成功！");
            },
            error:function () {
                alert("处理失败！请稍候重试！");
            }
        });
    });
})
function online1() {
    $("#online_table tbody").html("");
    $("#online_table").attr("name","onlineUn");
    $.ajax({
        url: "../Deal/onlineComm/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:1,pn: online_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#online_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                allchuliData = list;
                online_allPn=parseInt(list.pages);
                $("#online_paper i").html("第"+online_nowPn+"页/共"+online_allPn+"页");
                for (i;i<list.list.length;i++) {
                    onlineId[i]=list.list[i].id;
                    $("#online_table tbody").append("<tr>"+"<td id='online_name_"+i+"'>"+list.list[i].name+"</td>"+
                        "<td id='online_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                        "<td id='online_type_"+i+"'>"+list.list[i].type+"</td>"+
                        "<td id='online_address_"+i+"'>"+list.list[i].address+"</td>"+
                        "<td id='online_area_"+i+"'>"+list.list[i].area+"</td>"+
                        "<td id='online_year_"+i+"'>"+list.list[i].year+"</td>"+
                        "<td><button type=\"button\" id='online_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m12'>处理</button></td>\n"+
                        "<td id='online_person_"+i+"'>"+"未处理</td>"+
                        "<td id='online_time_"+i+"'>"+"未处理</td>"+
                        "<td id='online_beizhu_"+i+"'>"+"未处理</td>"+
                        "</tr>");
                }
            }
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function online2() {
    $("#online_table tbody").html("");
    $("#online_table").attr("name","onlineDone");
    $.ajax({
        url: "../Deal/onlineComm/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:2,pn:online_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#online_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                allchakanWeituo = list;
                online_allPn=parseInt(list.pages);
                $("#online_paper i").html("第"+online_nowPn+"页/共"+online_allPn+"页");
                for (i;i<list.list.length;i++) {
                    $("#online_table tbody").append("<tr>"+"<td id='online_name_"+i+"'>"+list.list[i].name+"</td>"+
                        "<td id='online_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                        "<td id='online_type_"+i+"'>"+list.list[i].type+"</td>"+
                        "<td id='online_address_"+i+"'>"+list.list[i].address+"</td>"+
                        "<td id='online_area_"+i+"'>"+list.list[i].area+"</td>"+
                        "<td id='online_year_"+i+"'>"+list.list[i].year+"</td>"+
                        "<td><button type=\"button\" id='online_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m11'>查看</button></td>\n"+
                        "<td id='online_person_"+i+"'>"+list.list[i].dealPerson+"</td>"+
                        "<td id='online_time_"+i+"'>"+list.list[i].dealTime+"</td>"+
                        "<td id='online_beizhu_"+i+"'>"+list.list[i].dealNote+"</td>"+
                        "</tr>")
                }
            }
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function online3(s) {
    $("#online_table tbody").html("");
    $("#online_table").attr("name","onlineSearch");
    var blurry = s;
    $.ajax({
        url: "../Deal/onlineComm/selectBlurry.html",
        type: "POST",
        dataType: "json",
        data: {blurry:blurry,pn:online_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#online_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                online_allPn=parseInt(list.pages);
                $("#online_paper i").html("第"+online_nowPn+"页/共"+online_allPn+"页");
                var l="",n="",m="";
                for (i;i<list.list.length;i++) {
                    if (list.list[i].person==null){
                        l="未处理";
                        m="未处理";
                        n="未处理";
                        $("#online_table tbody").append("<tr>"+"<td id='online_name_"+i+"'>"+list.list[i].name+"</td>"+
                            "<td id='online_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                            "<td id='online_type_"+i+"'>"+list.list[i].type+"</td>"+
                            "<td id='online_address_"+i+"'>"+list.list[i].address+"</td>"+
                            "<td id='online_area_"+i+"'>"+list.list[i].area+"</td>"+
                            "<td id='online_year_"+i+"'>"+list.list[i].year+"</td>"+
                            "<td><button type=\"button\" id='online_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m12'>处理</button></td>\n"+
                            "<td id='online_person_"+i+"'>"+l+"</td>"+
                            "<td id='online_time_"+i+"'>"+m+"</td>"+
                            "<td id='online_beizhu_"+i+"'>"+n+"</td>"+
                            "</tr>");
                    }
                    else {
                        l = list.list[i].dealPerson;
                        m = list.list[i].dealTime;
                        n = list.list[i].dealNote;
                        $("#online_table tbody").append("<tr>"+"<td id='online_name_"+i+"'>"+list.list[i].name+"</td>"+
                            "<td id='online_phone_"+i+"'>"+list.list[i].phone+"</td>"+
                            "<td id='online_type_"+i+"'>"+list.list[i].type+"</td>"+
                            "<td id='online_address_"+i+"'>"+list.list[i].address+"</td>"+
                            "<td id='online_area_"+i+"'>"+list.list[i].area+"</td>"+
                            "<td id='online_year_"+i+"'>"+list.list[i].year+"</td>"+
                            "<td><button type=\"button\" id='online_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m11'>查看</button></td>\n"+
                            "<td id='online_person_"+i+"'>"+l+"</td>"+
                            "<td id='online_time_"+i+"'>"+m+"</td>"+
                            "<td id='online_beizhu_"+i+"'>"+n+"</td>"+
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
function online1_1() {
    online_nowPn=1;
    online1();
}
function online2_2() {
    online_nowPn=1;
    online2();
}
function online3_3() {
    var s = $("#onlinefind").val().trim();
    if (s===""){
        alert("请输入搜索值！")
    } else {
        online_nowPn = 1;
        online3(s);
    }
}
function online_clickHandler(event){
    var index=event.data.index;
    if ($("#online_btn_"+index).html()=="处理"){
        var now = new Date();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate();
        $("#online_name").val($("#online_name_"+index).html());
        $("#online_phone").val($("#online_phone_"+index).html());
        $("#online_type").val($("#online_type_"+index).html());
        $("#online_addr").val($("#online_address_"+index).html());
        $("#online_area").val($("#online_area_"+index).html());
        $("#online_year").val($("#online_year_"+index).html());
        $("#online_person").val($("#yuangong_name").val());
        $("#online_chulishijian").val(chulitime);
        $("#online_id").htnl(onlineId[index]);
    }else{
        $("#online1_name").val($("#online_name_"+index).html());
        $("#online1_phone").val($("#online_phone_"+index).html());
        $("#online1_type").val($("#online_type_"+index).html());
        $("#online1_addr").val($("#online_address_"+index).html());
        $("#online1_area").val($("#online_area_"+index).html());
        $("#online1_year").val($("#online_year_"+index).html());
        $("#online1_person").val($("#online_person_"+index).html());
        $("#online1_chulishijian").val($("#online_time_"+index).html());
        $("#online1_beizhu").val($("#online_beizhu_"+index).html());

    }
}
$("#onlinefind").on("click", ":button", function(event){
});
function insertWeituo() {
    var json = {
        name:$("#weituoxingming").val(),
        phone:$("#weituodianhua").val(),
        type:$("#jutifangxing").val(),
        area:$("#fwmianji").val(),
        address:$("#fwdizhi").val(),
        year:$("#kezunianxian").val(),
        dealStatus:1
    }
    $.ajax({
        url: "../Deal/onlineComm/insertOnlineComm.html",
        type: "POST",
        dataType: "text",
        data: {
            onlineComm:JSON.stringify(json),
        },
        success: function (data) {
            $("#online_table tbody").html("")
            online1();
            alert("添加成功")
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function chuliWeituo(mmm) {
    var ddd = allchuliDatap.list[mmm].id;
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+
        "-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    $.ajax({
        url: "../Deal/onlineComm/dealOnlienComm.html",
        type: "POST",
        dataType: "json",
        data: {id:ddd,
            dealPerson:$("#yuangong_name").val(),
            dealStatus:2,
            dealTime:chulitime,
            dealNote:$("#online_addr").val()
        },
        success: function (data) {
            alert("处理成功")
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}