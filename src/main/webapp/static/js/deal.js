var dealPn=1;
var dealAllPn;
var unDealPn=1;
var unDealAllPn;
var undealData;
var dealData;
var idid;
$(function () {
    for (var i=0;i<8;i++){
        (function (i) {
            $("#daiban-tbody").on("click","#undeal-"+i,function () {
                $("#shixiang_chuliren").val($("#yuangong_name").val());
                idid = undealData.list[i].id;
            })
        })(i);
    }

});
function getData() {
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var nowTime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    var person = $("#yuangong_name").val();
    var note = $("#shixiangbeizhu").val();
    dealDeal(idid,person,nowTime,note);
}
function selectUnDeal() {
    $("#daiban-tbody").html("")
    $.ajax({
        url: "../Deal/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {status:1,
            pn:unDealPn},
        success: function (data) {
            var list = eval(data);
            undealData = list;
            unDealAllPn = list.pages;
            var ri;
            $("#daichulishixiang_paper i").html("第"+unDealPn+"页/共"+unDealAllPn+"页");
            for (var i = 0;i<list.list.length;i++){
                if (list.list[i].roomId==null) {
                    ri = "/";
                }else {
                    ri = list.list[i].roomId;
                }
                $("#daiban-tbody").append("<tr>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ ri+"</td>"+
                    "<td>"+list.list[i].rommAddress +"</td>"+
                    "<td>"+list.list[i].thing +"</td>"+
                    "<td>"+list.list[i].thingTime +"</td>"+
                    "<td>"+"<button  class='btn btn-primary' id='undeal-"+i+"'data-toggle='modal' data-target='.m26'+"+">"+"处理"+"</button>" +"</td>"+
                    +"</tr>"
                );
            }
        },
        error: function (xhrl) {
            alert("获取待办失败！请稍后重试！")
        }
    })
}
function dealDeal(a,b,c,d) {
    var json ={
        "id":a,
        "person":b,
        "time:":c,
        "note":d,
        "status":2
    };
    $.ajax({

        url: "../Deal/updateDeal.html",
        type: "POST",
        dataType: "text",
        data: {
            "deal":JSON.stringify(json),
            "timer":c
        },
        success: function (data) {
            selectUnDeal();
            alert("处理成功！");
            $("#shixiangbeizhu").val("");
        },
        error: function (xhrl) {
            alert("处理失败！请稍后重试！")
        }
    })
}
function selectDeal() {
    $("#yiban-tbody").html("");
    $.ajax({
        url: "../Deal/selectAllByStatus.html",
        type: "POST",
        dataType: "json",
        data: {status:2,
            pn:dealPn},
        success: function (data) {
            var list = eval(data);
            dealAllPn = list.pages;
            $("#yiban-tbody").attr("name","all");
            $("#yichulishixiang_paper i").html("第"+dealPn+"页/共"+dealAllPn+"页");
            for (var i = 0;i<list.list.length;i++){
                if (list.list[i].roomId==null) {
                    ri = "/"
                }else {
                    ri = list.list[i].roomId
                }
                $("#yiban-tbody").append("<tr>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ ri+"</td>"+
                    "<td>"+list.list[i].rommAddress +"</td>"+
                    "<td>"+list.list[i].thing +"</td>"+
                    "<td>"+list.list[i].thingTime +"</td>"+
                    "<td>"+list.list[i].person +"</td>"+
                    "<td>"+list.list[i].time +"</td>"+
                    "<td>"+list.list[i].note +"</td>"+
                    +"</tr>"
                )
            }
        },
        error: function (xhrl) {
            alert("获取已办失败！请稍后重试！")
        }
    })
}
function dealshangyiye() {
    if (dealPn-1<=0){
        alert("没有上一页了")
    } else {
        $("#yiban-tbody").html("");
        dealPn = dealPn-1;
        if ($("#yiban-tbody").attr("name")=="all"){
            selectDeal();
        }else{
            selectBlurry();
        }
    }
}
function dealxiayiye() {
    if (dealPn+1>dealAllPn){
        alert("没有下一页了")
    } else {
        $("#listing-tbody").html("");
        dealPn = dealPn+1;
        if ($("#yiban-tbody").attr("name")=="all"){
            selectDeal();
        }else{
            selectBlurry();
        }
    }
}
function undealshangyiye() {
    if (unDealPn-1<=0){
        alert("没有上一页了")
    } else {
        $("#listing-tbody").html("");
        unDealPn = unDealPn-1;
        selectUnDeal();
    }
}
function undealxiayiye() {
    if (unDealPn+1>unDealAllPn){
        alert("没有下一页了")
    } else {
        $("#listing-tbody").html("");
        unDealPn = unDealPn+1;
        selectUnDeal();
    }
}
function selectBlurry() {
    $.ajax({
        url:"../Deal/selectBlurry.html",
        type: "POST",
        dataType: "json",
        data:{
            blurry:$("#sousuoyichuli").val(),
            pn:1
        },
        success:function (data) {
            $("#yiban-tbody").html("");
            var list = eval(data);
            dealAllPn = list.pages;
            $("#yiban-tbody").attr("name","select")
            $("#yichulishixiang_paper i").html("第"+dealPn+"页/共"+dealAllPn+"页");
            for (var i = 0;i<list.list.length;i++){
                if (list.list[i].roomId==null) {
                    ri = "/"
                }else {
                    ri = list.list[i].roomId
                }
                $("#yiban-tbody").append("<tr>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ ri+"</td>"+
                    "<td>"+list.list[i].rommAddress +"</td>"+
                    "<td>"+list.list[i].thing +"</td>"+
                    "<td>"+list.list[i].thingTime +"</td>"+
                    "<td>"+list.list[i].person +"</td>"+
                    "<td>"+list.list[i].time +"</td>"+
                    "<td>"+list.list[i].note +"</td>"+
                    +"</tr>"
                )
            }
        },
        error:function () {
            alert("搜索失败！请稍后重试！")
        }
    })
}