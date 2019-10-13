var unapplicationId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var unbankcard=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var unpersonId=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
var unApp_allPn=0;
var unApp_nowPn=1;
var unApp_allData;
$(function () {
    $("#unapproval").click(function () {
        unApp_nowPn=1;
        unApplication_init();
    });
    $("#unapplication_paper .paper_up").click(function () {
        if (unApp_nowPn>1){
            unApp_nowPn=unApp_nowPn-1;
            unApplication_init();
        }
    });
    $("#unapplication_paper .paper_down").click(function () {
        if (unApp_nowPn<unApp_allPn){
            unApp_nowPn=unApp_nowPn+1;
            unApplication_init();
        }
    });
    var unapplication_tableIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
    for (var i in unapplication_tableIndex){
        $("#unapplication_table").on("click","#unapplication_btn_"+i,{index:i},unapplication_clickHandler);
    }
});
function unapp_handle1() {
    var applicationId=$("#unapp_appid").html();
    var applicationStatus="1";
    var dealPerson=$("#yuangong_name").val();
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var dealTime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    var dealNote=null;
    var applicationPersonId=$("#unapp_personid").html();
    var formdata=new FormData();
    formdata.append("applicationId",applicationId);
    formdata.append("dealPerson",dealPerson);
    formdata.append("dealTime",dealTime);
    for (var m = 0;m<$("#insertUnApplication")[0].files.length;m++){
        formdata.append("dealPic",$("#insertUnApplication")[0].files[m]);
    }     formdata.append("dealNote",dealNote);
    formdata.append("applicationPersonId",applicationPersonId);
    formdata.append("applicationStatus","2");
    $.ajax({
        url:"../Application/dealApplication.html",
        type:"POST",
        dataType:"text",
        processData: false,
        contentType: false,
        data:formdata,
        success:function (data) {
            alert("已通过审批！");
            unApp_nowPn=1;
            unApplication_init();
        },
        error:function (xhr) {
            alert("处理失败！请稍后重试！");
        }
    });
}
function unapp_handle2() {
    var applicationId=$("#unapp_appid").html();
    var applicationStatus="1";
    var dealPerson=$("#yuangong_name").val();
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var dealTime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    var dealNote=null;
    var applicationPersonId=$("#unapp_personid").html();
    var formdata=new FormData();
    for (var m = 0;m<$("#insertUnApplication")[0].files.length;i++){
        formdata.append("dealPic",$("#insertUnApplication"[0]).files[i]);
    }
    formdata.append("applicationId",applicationId);
    formdata.append("dealPerson",dealPerson);
    formdata.append("dealTime",dealTime);
    formdata.append("dealNote",dealNote);
    formdata.append("applicationPersonId",applicationPersonId);
    formdata.append("applicationStatus","3");
    $.ajax({
        url:"../Application/dealApplication.html",
        type:"POST",
        dataType:"text",
        processData: false,
        contentType: false,
        data:formdata,
        success:function (data) {
            alert("已拒绝审批！");
            unApplication_init();
        },
        error:function (xhr) {
            alert("处理失败！请稍后重试！");
        }
    });
}
function insertUnApplicationImgs() {
    $("#insertUnApplication").click();
}
function unApplication_init() {
    var power=$("#empType").html();
    var personId=$("#yuangong_id").val();
    var personArea=$("#yuangong_fendian").find("option:selected").text();
    var personPart=$("#yuangong_bumen").find("option:selected").text();
    var unapplicationJsoon={power:power,personId:personId,personArea:personArea,personPart:personPart,pn:unApp_nowPn};
    $("#unapplication_table tbody").html("");
    $.ajax({
        url:"../Application/waitDeal.html",
        type:"POST",
        dataType:"json",
        data:unapplicationJsoon,
        success:function (data) {
            unApp_allData = eval(data);
            var i = 0;
            if (data==null){
                $("#unapplication_table tbody").append("<text>未查询到数据</text>")
            }else{
                eval(data);
                unApp_allPn=parseInt(data.pages);
                $("#unapplication_paper i").html("第"+unApp_nowPn+"页/共"+unApp_allPn+"页");
                for (i;i<data.list.length;i++) {
                    unapplicationId[i]=data.list[i].id;
                    unbankcard[i]=data.list[i].applicationBankcard;
                    unpersonId[i]=data.list[i].applicationPersonId;
                    $("#unapplication_table tbody").append("<tr>"+"<td id='unapplication_time_"+i+"'>"+data.list[i].applicationTime+"</td>"+
                        "<td id='unapplication_person_"+i+"'>"+data.list[i].applicationPerson+"</td>"+
                        "<td id='unapplication_fendian_"+i+"'>"+data.list[i].applicationBranch+"</td>"+
                        "<td id='unapplication_bumen_"+i+"'>"+data.list[i].applicationDepa+"</td>"+
                        "<td id='unapplication_zhiwu_"+i+"'>"+data.list[i].applicationJob+"</td>"+
                        "<td id='unapplication_xiangmu_"+i+"'>"+data.list[i].applicationPro+"</td>"+
                        "<td id='unapplication_price_"+i+"'>"+data.list[i].applicationPrice+"</td>"+
                        "<td id='unapplication_reason_"+i+"'>"+data.list[i].applicationReason+"</td>"+
                        "<td><button type=\"button\" id='unapplication_btn_"+i+"' class=\"btn btn-primary\" data-toggle='modal' data-target='.m5'>处理</button></td>\n"+
                        "</tr>");
                }
            }
        },
        error:function (xhr) {
        }
    });
}
function unapplication_clickHandler(event) {
    var index=event.data.index;
    yulanchakanshenpi(index);
    $("#unapp_time").val($("#unapplication_time_"+index).html());
    $("#unapp_person").val($("#unapplication_person_"+index).html());
    $("#unapp_fendian").val($("#unapplication_fendian_"+index).html());
    $("#unapp_bumen").val($("#unapplication_bumen_"+index).html());
    $("#unapp_zhiwu").val($("#unapplication_zhiwu_"+index).html());
    $("#unapp_money").val($("#unapplication_price_"+index).html());
    $("#unapp_xiangmu").val($("#unapplication_xiangmu_"+index).html());
    $("#unapp_bankcard").val(unbankcard[index]);
    $("#unapp_reason").val($("#unapplication_reason_"+index).html());
    $("#unapp_personid").html(unpersonId[index]);
    $("#unapp_appid").html(unapplicationId[index]);
}
function yulanchakanshenpi(mmm) {
    $("#chulishenpitupian").html("");
    var pic = unApp_allData.list[mmm].applicationPic.split(";");
    for (var s = 0;s<pic.length-1;s++){
        $("#chulishenpitupian").append(('<img style="width:270px;height: 270px" src="' + pic[s] + '" />') );
    }
}