var repairId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var mmm;
var repair_allPn=0;
var repair_nowPn=1;
$(function () {
    var s = "";
    $("#repair_paper .paper_up").click(function () {
        if (repair_nowPn>1){
            repair_nowPn=repair_nowPn-1;
            if ($("#repair_table").attr("name")=="repairUn"){
                repair1();
            }else if ($("#repair_table").attr("name")=="repairDone") {
                repair2();
            }else if($($("#repair_table").attr("name")=="repairSearch")){
                repair3();
            }
        }
    });
    $("#repair_paper .paper_down").click(function () {
        if (repair_nowPn<repair_allPn){
            repair_nowPn=repair_nowPn+1;
            if ($("#repair_table").attr("name")=="repairUn"){
                repair1();
            }else if ($("#repair_table").attr("name")=="repairDone") {
                repair2();
            }else if($($("#repair_table").attr("name")=="repairSearch")){
                repair3();
            }
        }

    });
    $("#fixmanage").click(repair1_1);
    var repair_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in repair_tableIndex){
        $("#repair_table").on("click","#repair_btn_"+i,{index:i},repair_clickHandler);
    }
    $("#repair_querenchuli").click(function () {
        var id=$("#repair_id").html();
        var status=2;
        var person=$("#repair_person").val();
        var note=$("#repair_beizhu").val();
        var now = new Date();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
        var repairJson={id:id,status:status,person:person,note:note,time:chulitime};
        $.ajax({
            url:"../Deal/repair/dealRepair.html",
            type:"POST",
            dataType:"text",
            data:repairJson,
            success:function () {
                repair1_1();
                alert("处理成功！");
            },
            error:function () {
                alert("处理失败！请稍候重试！");
            }
        });
    });
})
function insertRepairImgs() {
    $("#insertRepairImgs").click()
}
function repair1() {
    $("#repair-tbody").html("");
    $("#repair_table").attr("name","repairUn");
    $.ajax({
        url: "../Deal/repair/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:1,pn:repair_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#repair-tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                repair_allPn=parseInt(list.pages);
                $("#repair_paper i").html("第"+repair_nowPn+"页/共"+repair_allPn+"页");
                for (i;i<list.list.length;i++) {
                    repairId[i]=list.list[i].id;
                    $("#repair-tbody").append("<tr>"+"<td id='repair_name_"+i+"'>"+list.list[i].tenantName+"</td>"+
                        "<td id='repair_phone_"+i+"'>"+list.list[i].tenantPhone+"</td>"+
                        "<td id='repair_baoxiutime_"+i+"'>"+list.list[i].repairTime+"</td>"+
                        "<td id='repair_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                        "<td id='repair_xiangmu_"+i+"'>"+list.list[i].repairThing+"</td>"+
                        "<td id='repair_miaoshu_"+i+"'>"+list.list[i].repairDescr+"</td>"+
                        "<td><button type=\"button\" id='repair_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m8'>处理</button></td>\n"+
                        "<td id='repair_person_"+i+"'>"+"未处理</td>"+
                        "<td id='repair_time_"+i+"'>"+"未处理</td>"+
                        "<td id='repair_beizhu_"+i+"'>"+"未处理</td>"+
                        "</tr>");
                }
            }
            mmm = eval(data).list
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function repair2() {
    $("#repair-tbody").html("");
    $("#repair_table").attr("name","repairDone");
    $.ajax({
        url: "../Deal/repair/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {dealStatus:2,pn:repair_nowPn},
        success: function (data) {
            var i = 0
            if (data==null){
                $("#repair-tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                repair_allPn=parseInt(list.pages);
                $("#repair_paper i").html("第"+repair_nowPn+"页/共"+repair_allPn+"页");
                for (i;i<list.list.length;i++) {
                    $("#repair-tbody").append("<tr>"+"<td id='repair_name_"+i+"'>"+list.list[i].tenantName+"</td>"+
                        "<td id='repair_phone_"+i+"'>"+list.list[i].tenantPhone+"</td>"+
                        "<td id='repair_baoxiutime_"+i+"'>"+list.list[i].repairTime+"</td>"+
                        "<td id='repair_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                        "<td id='repair_xiangmu_"+i+"'>"+list.list[i].repairThing+"</td>"+
                        "<td id='repair_miaoshu_"+i+"'>"+list.list[i].repairDescr+"</td>"+
                        "<td><button type=\"button\" id='repair_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m7'>查看</button></td>\n"+
                        "<td id='repair_person_"+i+"'>"+list.list[i].person+"</td>"+
                        "<td id='repair_time_"+i+"'>"+list.list[i].time+"</td>"+
                        "<td id='repair_beizhu_"+i+"'>"+list.list[i].note+"</td>"+
                        "</tr>")
                }
            }
            mmm = eval(data).list
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function repair3(s) {

    $("#repair-tbody").html("");
    $("#repair_table").attr("name","repairSearch");
    var blurry = s;
    $.ajax({
        url: "../Deal/repair/selectBlurry.html",
        type: "POST",
        dataType: "json",
        data: {blurry:blurry,pn:repair_nowPn},
        success: function (data) {
            var i = 0;
            if (data==null){
                $("#repair-tbody").append("<text>未查询到数据</text>")
            }else {
                var list = eval(data);
                repair_allPn=parseInt(list.pages);
                $("#repair_paper i").html("第"+repair_nowPn+"页/共"+repair_allPn+"页");
                var l="",n="",m="";
                for (i;i<list.list.length;i++) {
                    if (list.list[i].person==null){
                        l="未处理";
                        m="未处理";
                        n="未处理";
                        $("#repair-tbody").append("<tr>"+"<td id='repair_name_"+i+"'>"+list.list[i].tenantName+"</td>"+
                            "<td id='repair_phone_"+i+"'>"+list.list[i].tenantPhone+"</td>"+
                            "<td id='repair_baoxiutime_"+i+"'>"+list.list[i].repairTime+"</td>"+
                            "<td id='repair_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                            "<td id='repair_xiangmu_"+i+"'>"+list.list[i].repairThing+"</td>"+
                            "<td id='repair_miaoshu_"+i+"'>"+list.list[i].repairDescr+"</td>"+
                            "<td><button type=\"button\" id='repair_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m8'>处理</button></td>\n"+
                            "<td id='repair_person_"+i+"'>"+l+"</td>"+
                            "<td id='repair_time_"+i+"'>"+m+"</td>"+
                            "<td id='repair_beizhu_"+i+"'>"+n+"</td>"+
                            "</tr>");
                    }
                    else {
                        l = list.list[i].person;
                        m = list.list[i].time;
                        n = list.list[i].note;
                        $("#repair-tbody").append("<tr>"+"<td id='repair_name_"+i+"'>"+list.list[i].tenantName+"</td>"+
                            "<td id='repair_phone_"+i+"'>"+list.list[i].tenantPhone+"</td>"+
                            "<td id='repair_baoxiutime_"+i+"'>"+list.list[i].repairTime+"</td>"+
                            "<td id='repair_address_"+i+"'>"+list.list[i].roomAddress+"</td>"+
                            "<td id='repair_xiangmu_"+i+"'>"+list.list[i].repairThing+"</td>"+
                            "<td id='repair_miaoshu_"+i+"'>"+list.list[i].repairDescr+"</td>"+
                            "<td><button type=\"button\" id='repair_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m7'>查看</button></td>\n"+
                            "<td id='repair_person_"+i+"'>"+l+"</td>"+
                            "<td id='repair_time_"+i+"'>"+m+"</td>"+
                            "<td id='repair_beizhu_"+i+"'>"+n+"</td>"+
                            "</tr>");
                    }
                }
            }
            mmm = eval(data).list
        },
        error: function (xhrl) {
            alert("处理失败 请稍后重试。。。")
        }
    })
}
function repair1_1() {
    repair_nowPn=1;
    repair1();
}
function repair2_2() {
    repair_nowPn=1;
    repair2();
}
function repair3_3() {
    var s = $("#repairfind").val().trim();
    if (s===""){
        alert("请输入搜索值！")
    } else {
        repair_nowPn = 1;
        repair3(s);
    }
}
function repair_clickHandler(event){
    $("#repair_picddd").html("")
    var index=event.data.index;
    var sss = mmm[index].repairPic.split(";");
    if ($("#repair_btn_"+index).html()=="处理"){
        var now = new Date();
        var chulitime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate();
        $("#repair_name").val($("#repair_name_"+index).html());
        $("#repair_phone").val($("#repair_phone_"+index).html());
        $("#repair_baoxiutime").val($("#repair_baoxiutime_"+index).html());
        $("#repair_addr").val($("#repair_address_"+index).html());
        $("#repair_xiangmu").val($("#repair_xiangmu_"+index).html());
        $("#repair_miaoshu").val($("#repair_miaoshu_"+index).html());
        $("#repair_person").val($("#yuangong_name").val());
        $("#repair_chulishijian").val(chulitime);
        $("#repair_picccc").html("");
        for (var s = 0;s<sss.length-1;s++){
            $("#repair_picccc").append(('<img style="width:270px;height: 270px" src="' + sss[s] + '" />') );
        }
        $("#repair_id").html(repairId[index]);

    }else{
        $("#repair1_name").val($("#repair_name_"+index).html());
        $("#repair1_phone").val($("#repair_phone_"+index).html());
        $("#repair1_baoxiutime").val($("#repair_baoxiutime_"+index).html());
        $("#repair1_addr").val($("#repair_address_"+index).html());
        $("#repair1_xiangmu").val($("#repair_xiangmu_"+index).html());
        $("#repair1_miaoshu").val($("#repair_miaoshu_"+index).html());
        $("#repair1_person").val($("#repair_person_"+index).html());
        $("#repair1_chulishijian").val($("#repair_time_"+index).html());
        $("#repair1_beizhu").val($("#repair_beizhu_"+index).html());
        $("#repair_picddd").html("")
        for (var s = 0;s<sss.length-1;s++){
            $("#repair_picddd").append(('<img style="width:270px;height: 270px" src="' + sss[s] + '" />') );
        }
    }
}
$("#repairfind").on("click", ":button", function(event){
});
function querentijiao() {
    var formData = new FormData();
    for (var i = 0;i<$("#insertRepairImgs")[0].files.length;i++){
        formData.append("repairPic2",$("#insertRepairImgs")[0].files[i])
    }
    var ccc = {
        "tenantName":$("#repairName").val().trim(),
        "tenantPhone":$("#repairPhone").val().trim(),
        "repairTime":$("#add_entry12").val().trim(),
        "roomAddress":$("#repairAddress").val().trim(),
        "repairThing":$("#repairPro").val().trim(),
        "repairDescr":$("#repairDesc").val().trim(),
        "status":"1"
    }
    formData.append("repair",JSON.stringify(ccc))
    $.ajax({
        url: "../Deal/repair/insertRepair.html",
        type: "POST",
        dataType: "text",
        processData: false,
        contentType: false,
        data: formData,
        success: function (data) {
            alert("添加成功！")
        },
        error: function () {
            alert("添加失败！请稍后重试！")
        }
    })
}
function yulantijiaobaoxiu() {
    var file = $("#insertRepairImgs");
    var yulan = $("#tianjiabaoxiutupian");
    yulan.html("")
    if (file[0].files.length<9) {
        for (var s = 0;s<file[0].files.length;s++) {
            if (file[0].files && file[0].files[s]) {
                var reader = new FileReader();
                reader.onload = function(evt) {
                    yulan.append('<img style="width:270px;height: 270px" src="' + evt.target.result + '" />') ;
                }
                reader.readAsDataURL(file[0].files[s]);
            } else {
                prevDiv.innerHTML = '<div class="img" style="filter:progid:' +
                    'DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';21
            }
        }
    }else {
        alert("最多上传9张图片");
    }

}

