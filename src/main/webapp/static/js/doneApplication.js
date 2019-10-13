var doneapplicationId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var donebankcard=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var donepersonId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var doneApp_allPn=0;
var doneApp_nowPn=1;
var doneApp_allData;
$(function () {
    $("#doneapproval").click(function () {
        doneApp_nowPn=1;
        doneApplication_init();
    });
    $("#doneapplication_paper .paper_up").click(function () {
        if (doneApp_nowPn>1){
            doneApp_nowPn=doneApp_nowPn-1;
            if ($("#doneapplication_table").attr("name")=="doneapplication") {
                doneApplication_init();
            }else if ($("#doneapplication_table").attr("name")=="searchapplication") {
                doneApplication_search();
            }
        }
    });
    $("#doneapplication_paper .paper_down").click(function () {
        if (doneApp_nowPn<doneApp_allPn){
            doneApp_nowPn=doneApp_nowPn+1;
            if ($("#doneapplication_table").attr("name")=="doneapplication") {
                doneApplication_init();
            }else if ($("#doneapplication_table").attr("name")=="searchapplication") {
                doneApplication_search();
            }
        }
    });
    var doneapplication_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in doneapplication_tableIndex){
        $("#doneapplication_table").on("click","#doneapplication_btn_"+i,{index:i},doneapplication_clickHandler);
    }
});
function doneApplication_init() {
    var power=$("#empType").html();
    var personId=$("#yuangong_id").val();
    var personArea=$("#yuangong_fendian").find("option:selected").text();
    var personPart=$("#yuangong_bumen").find("option:selected").text();
    var doneapplicationJson={power:power,personId:personId,personArea:personArea,personPart:personPart,pn:doneApp_nowPn};
    $("#doneapplication_table tbody").html("");
    $("#doneapplication_table").attr("name","doneapplication");
    $.ajax({
        url:"../Application/haveDeal.html",
        type:"POST",
        dataType:"json",
        data:doneapplicationJson,
        success:function (data) {
            var i = 0;
            doneApp_allData = eval(data)
            if (data==null){
                $("#doneapplication_table tbody").append("<text>未查询到数据</text>")
            }else{
                eval(data);
                doneApp_allPn=parseInt(data.pages);
                $("#doneapplication_paper i").html("第"+doneApp_nowPn+"页/共"+doneApp_allPn+"页");
                var mystatus="已通过";
                for (i;i<data.list.length;i++) {
                    doneapplicationId[i]=data.list[i].id;
                    donebankcard[i]=data.list[i].applicationBankcard;
                    donepersonId[i]=data.list[i].applicationPersonId;
                    if (data.list[i].applicationStatus=="2"){
                        mystatus="已通过";
                    } else{
                        mystatus="未通过";
                    }
                    $("#doneapplication_table tbody").append("<tr>"+"<td id='doneapplication_time_"+i+"'>"+data.list[i].applicationTime+"</td>"+
                        "<td id='doneapplication_person_"+i+"'>"+data.list[i].applicationPerson+"</td>"+
                        "<td id='doneapplication_fendian_"+i+"'>"+data.list[i].applicationBranch+"</td>"+
                        "<td id='doneapplication_bumen_"+i+"'>"+data.list[i].applicationDepa+"</td>"+
                        "<td id='doneapplication_zhiwu_"+i+"'>"+data.list[i].applicationJob+"</td>"+
                        "<td id='doneapplication_xiangmu_"+i+"'>"+data.list[i].applicationPro+"</td>"+
                        "<td id='doneapplication_price_"+i+"'>"+data.list[i].applicationPrice+"</td>"+
                        "<td id='doneapplication_reason_"+i+"'>"+data.list[i].applicationReason+"</td>"+
                        "<td id='doneapplication_zhuangtai_"+i+"'>"+mystatus+"</td>"+
                        "<td id='doneapplication_chuliperson_"+i+"'>"+data.list[i].dealPerson+"</td>"+
                        "<td id='doneapplication_chulitime_"+i+"'>"+data.list[i].dealTime+"</td>"+
                        "<td><button type=\"button\" id='doneapplication_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m4'>查看</button></td>\n"+
                        "</tr>");
                }
            }
        },
        error:function (xhr) {
        }
    });
}
function doneApplication_search() {
    var searchInfo=$("#donapp_searchInfo").val();
    var doneapplicationJson={blurry:searchInfo,pn:doneApp_nowPn};
    $("#doneapplication_table tbody").html("");
    $("#doneapplication_table").attr("name","searchapplication")
    $.ajax({
        url:"../Application/selectBlurry.html",
        type:"POST",
        dataType:"json",
        data:doneapplicationJson,
        success:function (data) {
            var i = 0;
            doneApp_allData = eval(data)
            if (data==null){
                $("#doneapplication_table tbody").append("<text>未查询到数据</text>")
            }else{
                eval(data);
                doneApp_allPn=parseInt(data.pages);
                $("#doneapplication_paper i").html("第"+doneApp_nowPn+"页/共"+doneApp_allPn+"页");
                var mystatus="已通过";
                for (i;i<data.list.length;i++) {
                    doneapplicationId[i]=data.list[i].id;
                    donebankcard[i]=data.list[i].applicationBankcard;
                    donepersonId[i]=data.list[i].applicationPersonId;
                    if (data.list[i].applicationStatus=="2"){
                        mystatus="已通过";
                    } else{
                        mystatus="未通过";
                    }
                    $("#doneapplication_table tbody").append("<tr>"+"<td id='doneapplication_time_"+i+"'>"+data.list[i].applicationTime+"</td>"+
                        "<td id='doneapplication_person_"+i+"'>"+data.list[i].applicationPerson+"</td>"+
                        "<td id='doneapplication_fendian_"+i+"'>"+data.list[i].applicationBranch+"</td>"+
                        "<td id='doneapplication_bumen_"+i+"'>"+data.list[i].applicationDepa+"</td>"+
                        "<td id='doneapplication_zhiwu_"+i+"'>"+data.list[i].applicationJob+"</td>"+
                        "<td id='doneapplication_xiangmu_"+i+"'>"+data.list[i].applicationPro+"</td>"+
                        "<td id='doneapplication_price_"+i+"'>"+data.list[i].applicationPrice+"</td>"+
                        "<td id='doneapplication_reason_"+i+"'>"+data.list[i].applicationReason+"</td>"+
                        "<td id='doneapplication_zhuangtai_"+i+"'>"+mystatus+"</td>"+
                        "<td id='doneapplication_chuliperson_"+i+"'>"+data.list[i].dealPerson+"</td>"+
                        "<td id='doneapplication_chulitime_"+i+"'>"+data.list[i].dealTime+"</td>"+
                        "<td><button type=\"button\" id='doneapplication_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m4'>查看</button></td>\n"+
                        "</tr>");
                }
            }
        },
        error:function (xhr) {
        }
    });
}
function doneApplication_search1() {
    doneApp_nowPn=1;
    doneApplication_search();
}
function doneapplication_clickHandler(event) {
    var index=event.data.index;
    yulanchulishenpi(index);
    $("#doneapp_time").val($("#doneapplication_time_"+index).html());
    $("#doneapp_person").val($("#doneapplication_person_"+index).html());
    $("#doneapp_fendian").val($("#doneapplication_fendian_"+index).html());
    $("#doneapp_bumen").val($("#doneapplication_bumen_"+index).html());
    $("#doneapp_zhiwu").val($("#doneapplication_zhiwu_"+index).html());
    $("#doneapp_money").val($("#doneapplication_price_"+index).html());
    $("#doneapp_xiangmu").val($("#doneapplication_xiangmu_"+index).html());
    $("#doneapp_bankcard").val(donebankcard[index]);
    $("#doneapp_reason").val($("#doneapplication_reason_"+index).html());
    $("#doneapp_personid").html(donepersonId[index]);
    $("#doneapp_appid").html(doneapplicationId[index])
}
function yulanchulishenpi(mmm) {
    $("#chankanshenpitupian").html("")
    var pic = doneApp_allData.list[mmm].applicationPic.split(";");
    for (var s = 0;s<pic.length-1;s++){
        $("#chankanshenpitupian").append(('<img style="width:270px;height: 270px" src="' + pic[s] + '" />') );
    }
}

