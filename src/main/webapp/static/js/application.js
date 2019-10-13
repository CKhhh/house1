var app_allPn=0;
var app_nowPn=1;
$(function () {
    var formData = new FormData($("#uploadForm")[0]);
    $("#myapplication_paper .paper_up").click(function () {
        if (app_nowPn>1){
            app_nowPn=app_nowPn-1;
            selectOwnApplication();
        }
    });
    $("#myapplication_paper .paper_down").click(function () {
        if (app_nowPn<app_allPn){
            app_nowPn=app_nowPn+1;
            selectOwnApplication();
        }
    });
});
function ownApplication() {

}
function insertApplicationImgs() {
    $("#applicationImgs").click();
}
function selectOwnApplication() {
    alert($("#yuangong_id").val())
    $("#ownApplication").html("");
    $.ajax({
        url:"../Application/selectOwnApplication.html",
        type:"POST",
        dataType:"json",
        data:{"personId":$("#yuangong_id").val(),
            "pn":app_nowPn
        },
        success:function (data) {
            var list = eval(data);
            app_allPn=parseInt(list.pages);
            $("#myapplication_paper i").html("第"+app_nowPn+"页/共"+app_allPn+"页");
            if (list.length==0){
                $("#ownApplication").append("<text>未查询到数据</text>")
            } else {
                var myStatus="未处理";
                for (var m= 0;m<list.list.length;m++){
                    if (list.list[m].applicationStatus==1){
                        myStatus="未处理";
                    } else if (list.list[m].applicationStatus==2) {
                        myStatus="已通过";
                    }else if (list.list[m].applicationStatus==3) {
                        myStatus="未通过";
                    }
                    var qq1,qq2;
                    if (list.list[m].dealPerson==null){
                        qq1 = "/";
                    } else {
                        qq1 = list.list[m].dealPerson;
                    }
                    if (list.list[m].dealTime==null){
                        qq2 = "/";
                    } else {
                        qq2 = list.list[m].dealTime;
                    }
                    $("#ownApplication").append("<tr>"+
                        "<td>"+ list.list[m].applicationTime +"</td>"+
                        "<td>"+list.list[m].applicationPerson +"</td>"+
                        "<td>"+ list.list[m].applicationBranch+"</td>"+
                        "<td>"+ list.list[m].applicationDepa+"</td>"+
                        "<td>"+ list.list[m].applicationJob+"</td>"+
                        "<td>"+ list.list[m].applicationPro+"</td>"+
                        "<td>"+ list.list[m].applicationPrice+"</td>"+
                        "<td>"+ list.list[m].applicationReason+"</td>"+
                        "<td>"+ myStatus+"</td>"+
                        "<td>"+ qq1+"</td>"+
                        "<td>"+qq2+"</td>"+
                        "</tr>")
                }
            }

        },
        error:function (xhrl) {
            alert("添加失败，请稍候重试！");
        }
    });
}
function selectOwnApplication1() {
    app_nowPn=1;
    selectOwnApplication();
}
function insertApplication() {
    var formData = new FormData();
    for (var i = 0;i<$("#applicationImgs")[0].files.length;i++){
        formData.append("applicationPic", $("#applicationImgs")[0].files[i])
    }
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var shenqingtime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    formData.append("applicationTime",shenqingtime);
    formData.append("applicationPerson",$("#yuangong_name").val());
    formData.append("applicationBranch",$("#yuangong_fendian").find("option:selected").text());
    formData.append("applicationDepa",$("#yuangong_bumen").find("option:selected").text());
    formData.append("applicationJob",$("#yuangong_zhiwu").find("option:selected").text());
    formData.append("applicationPro",$("#applicationPro").val());
    formData.append("applicationPrice",$("#applicationPrice").val());
    formData.append("applicationBankCard",$("#applicationBankCard").val());
    formData.append("applicationReason",$("#applicationReason").val());
    formData.append("applicationStatus",1);
    formData.append("applicationPersonId",$("#yuangong_id").val());
    $.ajax({
        url: "/Application/insertApplication.html",
        type: "POST",
        dataType: "text",
        processData: false,
        contentType: false,
        data: formData,
        success: function (data) {
            alert("发起成功！");
            app_nowPn=1;
            selectOwnApplication();
            $("#applicationPro").val("");
            $("#applicationPrice").val("");
            $("#applicationBankCard").val("");
            $("#applicationReason").val("");
            $("#faqishenpitupian").html("");
        },
        error: function () {
            alert("发起失败！请稍后重试");
        }
    })
}
function yulanfaqishenpitupian() {
    var file = $("#applicationImgs");
    var yulan = $("#faqishenpitupian");
    yulan.html("");
    if (file[0].files.length<9) {
        for (var s = 0;s<file[0].files.length;s++) {
            if (file[0].files && file[0].files[s]) {
                var reader = new FileReader();
                reader.onload = function(evt) {
                    yulan.append('<img style="width:270px;height: 270px" src="' + evt.target.result + '" />') ;
                };
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
