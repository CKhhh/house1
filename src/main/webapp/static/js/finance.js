var branchh;
var f_myListingId="";
var f_shouru=0;
var f_zhichu=0;
var f_jieyu=0;
var f_zongshouru=0;
var f_zongzhichu=0;
var f_zongjieyu=0;
$(function () {
    $("#financeBranch").append("<option value='"+ 0+"'>"+ "请选择分店"+"</option>");
    $.ajax({
        url:"../Find/selectAllDistBranch.html",
        type:"POST",
        dataType:"json",
        success:function (data) {
            branchh = eval(data);
            for (var ww = 0;ww<branchh.length;ww++){
                $("#financeBranch").append("<option value="+ branchh[ww] +">"+ branchh[ww] +"</option>")
            }
            $("#financeBranch").selectpicker("refresh");
            $("#financeBranch").selectpicker("render");
        },
        error:function (xhr) {
            alert("分店加载失败！请稍后重试！")
        }
    });
    if ($("#empType").html()!="1"){
        $("#finance_tip").css("display","none");
        $("#finance .row").css("display","block");
    } else{
        $("#finance_tip").css("display","block");
        $("#finance .row").css("display","none");
    }
});
function liandongBranch7(evt) {
    $("#financeDepa").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#financeDepa").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#financeDepa").selectpicker("refresh");
                $("#financeDepa").selectpicker("render");
            }
        },
        error:function (xhr) {
            alert("错误！")
        }
    });
}
function finance_tongji(){
    var branch=$("#financeBranch").find("option:selected").text();
    var department=$("#financeDepa").find("option:selected").text();
    if (branch=="请选择分店"){
        branch="";
    }
    var sartTime=$("#finance_start").val();
    var endTime="";
    if ($("#finance_end").val()!=""){
        var end0=$("#finance_end").val().replace("-","/");
        var end1=new Date(end0);
        end1.setDate(end1.getDate()+1);
        endTime = end1.getFullYear() + "-" +((end1.getMonth()+1)<10?"0":"")+(end1.getMonth()+1)+"-"+(end1.getDate()<10?"0":"")+end1.getDate();
    }
    $.ajax({
        url:"../Listing/selectAllListingIdByOther.html",
        type:"POST",
        dataType:"json",
        async:false,
        data:{
            branch:branch,
            department:department
        },
        success:function (data) {
            var list = eval(data);
            $("#finance-tbody").html("");
            $("#zongshouru").html("");
            $("#zongjieyu").html("");
            $("#zongzhichu").html("");
            f_zongshouru=0;
            f_zongzhichu=0;
            f_zongjieyu=0;
            for (var i=0;i<list.length;i++){
                f_myListingId=list[i];
                $.ajax({
                    url:"../Finance/selectPriceByListingId.html",
                    type:"POST",
                    dataType:"text",
                    async:false,
                    data:{
                        listingId:f_myListingId,
                        status:1,
                        startTime:sartTime,
                        endTime:endTime
                    },
                    success:function (data) {
                        f_shouru=parseInt(data);
                        f_zongshouru=f_zongshouru+f_shouru;
                        $.ajax({
                            url:"../Finance/selectPriceByListingId.html",
                            type:"POST",
                            dataType:"text",
                            async:false,
                            data:{
                                listingId:f_myListingId,
                                status:2,
                                startTime:sartTime,
                                endTime:endTime
                            },
                            success:function (data) {
                                f_zhichu=parseInt(data);
                                f_jieyu=f_shouru-f_zhichu;
                                f_zongzhichu=f_zongzhichu+f_zhichu;
                                f_zongjieyu=f_zongjieyu+f_jieyu;
                                $("#finance-tbody").append("<tr>" +
                                    "<td>"+f_myListingId+"</td>"+
                                    "<td>"+f_shouru+"</td>"+
                                    "<td>"+f_zhichu+"</td>"+
                                    "<td>"+f_jieyu+"</td>"+
                                    "</tr>");
                            },
                            error:function (xhr) {
                                alert("查询失败，请稍候重试！");
                            }
                        });
                    },
                    error:function (xhr) {
                        alert("查询失败，请稍候重试！");
                    }
                });
                $("#zongshouru").html(f_zongshouru);
                $("#zongjieyu").html(f_zongjieyu);
                $("#zongzhichu").html(f_zongzhichu);
            }
        },
        error:function (xhr) {
            alert("查询失败，请稍候重试！");
        }
    });
}