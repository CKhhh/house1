var complaintId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var complaint_allPn=0;
var complaint_nowPn=1;
$(function () {
    var s = "";
    $("#complaint").click(complaint1_1);
    $("#complaint_paper .paper_up").click(function () {
        if (complaint_nowPn>1){
            complaint_nowPn=complaint_nowPn-1;
            if ($("#complaint_table").attr("name")=="complaintUn"){
                complaint1();
            }else if ($("#complaint_table").attr("name")=="complaintDone") {
                complaint2();
            }else if($($("#complaint_table").attr("name")=="complaintSearch")){
                complaint3();
            }
        }
    });
    $("#complaint_paper .paper_down").click(function () {
        if (complaint_nowPn<complaint_allPn){
            complaint_nowPn=complaint_nowPn+1;
            if ($("#complaint_table").attr("name")=="complaintUn"){
                complaint1();
            }else if ($("#complaint_table").attr("name")=="complaintDone") {
                complaint2();
            }else if($($("#complaint_table").attr("name")=="complaintSearch")){
                complaint3();
            }
        }

    });
    var complaint_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in complaint_tableIndex){
        $("#complaint_table").on("click","#complaint_btn_"+i,{index:i},complaint_clickHandler);
    }
    $("#complaint_querenchuli").click(function () {
        var complaint_id=$("#complaint_id").html();
        var dealPerson=$("#complaint_person").val();
        var dealStatus=2;
        var dealNote=$("#complaint_beizhu").val();
        var now = new Date();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
        var complaintJson={complaintId:complaint_id,dealPerson:dealPerson,dealStatus:dealStatus,dealTime:chulitime,dealNote:dealNote};
        $.ajax({
            url:"../Deal/Complaint/dealComplaint.html",
            type:"POST",
            dataType:"text",
            data:complaintJson,
            success:function () {
                complaint1_1();
                alert("处理成功！");
            },
            error:function () {
                alert("处理失败！请稍候重试！");
            }
        });
    });
    $("#tousu_tijiao").click(function () {
        var now = new Date();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
        var CCC ={id:456456,
            "complaintName":$("#tousu_name").val(),
            "complaintPhone":$("#tousu_tel").val(),
            "complaintTime":chulitime,
            "roomAddress":$("#tousu_addr").val(),
            "complaintThing":$("#tousu_info").val(),
            "dealStatus":1}
        $.ajax({
            url:"../Deal/Complaint/insertComplaint.html",
            type:"POST",
            dataType:"text",
            data:{"complaint":JSON.stringify(CCC)},
            success:function (data) {
                alert("添加成功！");
                complaint1_1()
            },
            error:function (xhrl) {
                alert("添加失败，请稍候重试！");
            }
        });
    });
})
function complaint1() {
    $("#complaint_table tbody").html("");
    $("#complaint_table").attr("name","complaintUn");

    $.ajax({
        url: "../Deal/Complaint/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:1,pn:complaint_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#complaint_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                complaint_allPn=parseInt(list.pages);
                $("#complaint_paper i").html("第"+complaint_nowPn+"页/共"+complaint_allPn+"页");
                for (i;i<list.list.length;i++) {
                    complaintId[i]=list.list[i].id;
                    $("#complaint_table tbody").append("<tr>"+"<td id='complaint_name_"+i+"'>"+list.list[i].complaintName+"</td>"+
                        "<td id='complaint_phone_"+i+"'>"+list.list[i].complaintPhone+"</td>"+
                        "<td id='complaint_tousutime_"+i+"'>"+list.list[i].complaintTime+"</td>"+
                        "<td id='complaint_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                        "<td id='complaint_info_"+i+"'>"+list.list[i].complaintThing+"</td>"+
                        "<td><button type=\"button\" id='complaint_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m14'>处理</button></td>\n"+
                        "<td id='complaint_person_"+i+"'>"+"未处理</td>"+
                        "<td id='complaint_time_"+i+"'>"+"未处理</td>"+
                        "<td id='complaint_beizhu_"+i+"'>"+"未处理</td>"+
                        "</tr>");
                }
            }
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function complaint2() {
    $("#complaint_table tbody").html("");
    $("#complaint_table").attr("name","complaintDone");

    $.ajax({
        url: "../Deal/Complaint/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:2,pn:complaint_nowPn},
        success: function (data) {
            var i = 0
            if (data==null){
                $("#complaint_table tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                complaint_allPn=parseInt(list.pages);
                $("#complaint_paper i").html("第"+complaint_nowPn+"页/共"+complaint_allPn+"页");
                for (i;i<list.list.length;i++) {
                    $("#complaint_table tbody").append("<tr>"+"<td id='complaint_name_"+i+"'>"+list.list[i].complaintName+"</td>"+
                        "<td id='complaint_phone_"+i+"'>"+list.list[i].complaintPhone+"</td>"+
                        "<td id='complaint_tousutime_"+i+"'>"+list.list[i].complaintTime+"</td>"+
                        "<td id='complaint_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                        "<td id='complaint_info_"+i+"'>"+list.list[i].complaintThing+"</td>"+
                        "<td><button type=\"button\" id='complaint_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m13'>查看</button></td>\n"+
                        "<td id='complaint_person_"+i+"'>"+list.list[i].dealPerson+"</td>"+
                        "<td id='complaint_time_"+i+"'>"+list.list[i].dealTime+"</td>"+
                        "<td id='complaint_beizhu_"+i+"'>"+list.list[i].dealNote+"</td>"+
                        "</tr>")
                }
            }
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function complaint3(s) {
        $("#complaint_table tbody").html("");
        $("#complaint_table").attr("name","complaintSearch");
        var blurry = s;
        $.ajax({
            url: "../Deal/Complaint/selectBlurry.html",
            type: "POST",
            dataType: "json",
            data: {blurry:blurry,pn:complaint_nowPn},
            success: function (data) {
                var i = 0;
                if (data==null){
                    $("#complaint_table tbody").append("<text>未查询到数据</text>")
                }else {
                    var list = eval(data);
                    complaint_allPn=parseInt(list.pages);
                    $("#complaint_paper i").html("第"+complaint_nowPn+"页/共"+complaint_allPn+"页");
                    var l="",n="",m="";
                    for (i;i<list.list.length;i++) {
                        if (list.list[i].person==null){
                            l="未处理";
                            m="未处理";
                            n="未处理";
                            $("#complaint_table tbody").append("<tr>"+"<td id='complaint_name_"+i+"'>"+list.list[i].complaintName+"</td>"+
                                "<td id='complaint_phone_"+i+"'>"+list.list[i].complaintPhone+"</td>"+
                                "<td id='complaint_tousutime_"+i+"'>"+list.list[i].complaintTime+"</td>"+
                                "<td id='complaint_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                                "<td id='complaint_info_"+i+"'>"+list.list[i].complaintThing+"</td>"+
                                "<td><button type=\"button\" id='complaint_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m14'>处理</button></td>\n"+
                                "<td id='complaint_person_"+i+"'>"+l+"</td>"+
                                "<td id='complaint_time_"+i+"'>"+m+"</td>"+
                                "<td id='complaint_beizhu_"+i+"'>"+n+"</td>"+
                                "</tr>");
                        }
                        else {
                            l = list.list[i].dealPerson;
                            m = list.list[i].dealTime;
                            n = list.list[i].dealNote;
                            $("#complaint_table tbody").append("<tr>"+"<td id='complaint_name_"+i+"'>"+list.list[i].complaintName+"</td>"+
                                "<td id='complaint_phone_"+i+"'>"+list.list[i].complaintPhone+"</td>"+
                                "<td id='complaint_tousutime_"+i+"'>"+list.list[i].complaintTime+"</td>"+
                                "<td id='complaint_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                                "<td id='complaint_info_"+i+"'>"+list.list[i].complaintThing+"</td>"+
                                "<td><button type=\"button\" id='complaint_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m13'>查看</button></td>\n"+
                                "<td id='complaint_person_"+i+"'>"+l+"</td>"+
                                "<td id='complaint_time_"+i+"'>"+m+"</td>"+
                                "<td id='complaint_beizhu_"+i+"'>"+n+"</td>"+
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
function complaint1_1() {
    complaint_nowPn=1;
    complaint1();
}
function complaint2_2() {
    complaint_nowPn=1;
    complaint2();
}
function complaint3_3() {
    var s = $("#complaintfind").val().trim();
    if (s===""){
        alert("请输入搜索值！")
    } else {
        complaint_nowPn=1;
        complaint3(s);
    }
}
function complaint_clickHandler(event){
    var index=event.data.index;
    if ($("#complaint_btn_"+index).html()=="处理"){
        var now = new Date();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate();
        $("#complaint_name").val($("#complaint_name_"+index).html());
        $("#complaint_phone").val($("#complaint_phone_"+index).html());
        $("#complaint_tousutime").val($("#complaint_tousutime_"+index).html());
        $("#complaint_addr").val($("#complaint_address_"+index).html());
        $("#complaint_info").val($("#complaint_info_"+index).html());
        $("#complaint_person").val($("#yuangong_name").val());
        $("#complaint_chulishijian").val(chulitime);
        $("#complaint_id").html(complaintId[index]);

    }else{
        $("#complaint1_name").val($("#complaint_name_"+index).html());
        $("#complaint1_phone").val($("#complaint_phone_"+index).html());
        $("#complaint1_tousutime").val($("#complaint_tousutime_"+index).html());
        $("#complaint1_addr").val($("#complaint_address_"+index).html());
        $("#complaint1_info").val($("#complaint_info_"+index).html());
        $("#complaint1_person").val($("#complaint_person_"+index).html());
        $("#complaint1_chulishijian").val($("#complaint_time_"+index).html());
        $("#complaint1_beizhu").val($("#complaint_beizhu_"+index).html());
    }
}
$("#complaintfind").on("click", ":button", function(event){
    alert($(this).closest("tr").find("td").eq(0).text());
});