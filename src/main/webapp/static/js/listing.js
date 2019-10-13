var xiuListingtupian = "";
var xiuOwnertupian = "";
var areaa;
var branchh = null;
var allData= null;
var fufeifangshi1=["预付费","后付费","物业收"];
var fufeifangshi2 = ["每月","单月","双月"];
var kuandai = ["有宽带","无宽带"];
var leixing = ["整租","合租"];
var huxing = ["单室套","两室套","三室套","四室套","五室套及以上"];
var dangqianzhuangtai =["空置","收定","违约","正常"];
var fukuanfangshi = ["月付","二月付","季付","半年付","年付","全额付","其他"];
var xingbienannv = ["男","女"];
var hetongzhuangtai1 = ["新签","续签"];
var listingPn = 1;
var roomPn=1;
var listingAllPn=0;
var roomAllPn=0;
var room_listing_id="";
var allRoom=null;
var nowListing=null;
var nowRoom=null;
var shouruPn=1;
var shouruAllPn=0;
var zhichuPn=1;
var zhichuAllPn=0;
var idid =0;
$(function () {
    $.ajax({
        url:"../Find/selectAllDistArea.html",
        type:"POST",
        dataType:"json",
        success:function (data) {
            areaa = eval(data);
            for (var g=0;g<areaa.length;g++){
                $("#area").append("<option value="+ areaa[g] +">"+ areaa[g] +"</option>")
            }
            $("#area").selectpicker("refresh");
            $("#area").selectpicker("render");
            for (var dd = 0;dd<areaa.length;dd++){
                $("#areal").append("<option value="+ areaa[dd] +">"+ areaa[dd] +"</option>")
            }
            $("#areal").selectpicker("refresh");
            $("#areal").selectpicker("render");
        },
        error:function (xhr) {
            alert("区域加载失败！请稍后重试！")
        }
    });
    tianjiaWenMi();
    tianjiaHouseManager();
    $.ajax({
        url:"../Find/selectAllDistBranch.html",
        type:"POST",
        dataType:"json",
        success:function (data) {
            branchh = eval(data);
            for (var gg = 0;gg<branchh.length;gg++){
                $("#branch").append("<option value="+ branchh[gg] +">"+ branchh[gg] +"</option>")
            }
            $("#branch").selectpicker("refresh");
            $("#branch").selectpicker("render");
            for (var ww = 0;ww<branchh.length;ww++){
                $("#branchl").append("<option value="+ branchh[ww] +">"+ branchh[ww] +"</option>")
            }
            $("#branchl").selectpicker("refresh");
            $("#branchl").selectpicker("render");

        },
        error:function (xhr) {
            alert("区域加载失败！请稍后重试！")
        }
    });
    selectAllListing(1);
    for (var i=0;i<10;i++){
        (function (i) {
            $("#listing-tbody").on("click","#listing_"+i,function () {
                $("#listing-tbody tr").css("background","none");
                $("#listing-tbody tr").css("color","black");
                $("#listing_"+i).css("background","#357bb7");
                $("#listing_"+i).css("color","white");
                nowListing=allData.list[i];
                nowRoom=null;
                selectRoom(i,1);
                inputListing2(i);
                fangyuantupian(i);
                zukeziliaotupian(i);
                xiugaiHWenMi(i);
                xiugaiHouseManager(i);
                $("#shouzhi_start").val("");
                $("#shouzhi_end").val("");
                shouzhichaxun(1,1);
                $("#listing_"+i).contextMenu("myMenu1",{
                    bindings:
                        {
                            "youjian_xiugaifangyuan":function () {
                                if ($("#empType").html()=="4"){
                                    inputListing(allData.list[i].id);
                                    $(".m21").modal("show");
                                }else if ($("#yuangong_zhiwu").find("option:selected").text()!="财务" && $("#yuangong_zhiwu").find("option:selected").text()!="业务"){
                                    if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
                                        if ($("#yuangong_zhiwu").find("option:selected").text()=="店长") {
                                            inputListing(allData.list[i].id);
                                            $(".m21").modal("show");
                                        }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department){
                                            inputListing(allData.list[i].id);
                                            $(".m21").modal("show");
                                        }else{
                                            alert("您没有权限修改该房源！");
                                        }
                                    } else{
                                        alert("您没有权限修改该房源！");
                                    }
                                }else{
                                    alert("您没有权限修改该房源！");
                                }
                            },
                            "youjian_tianjiafangyuan":function () {
                                if($("#yuangong_zhiwu").find("option:selected").text()!="财务" && $("#yuangong_zhiwu").find("option:selected").text()!="业务"){
                                    $(".m20").modal("show");
                                }else{
                                    alert("您没有权限添加房源！");
                                }
                            }
                        }
                });
            });
        })(i);
    }
    for (var i=0;i<6;i++){
        (function (i) {
            $("#room-tbody").on("click","#room_"+i,function () {
                $("#room-tbody tr").css("background","none");
                $("#room-tbody tr").css("color","black");
                $("#room_"+i).css("background","#357bb7");
                $("#room_"+i).css("color","white");
                nowRoom=allRoom.list[i];
                inputFangjian1(i);
                zukeziliaotupian(i);
                $("#room_"+i).contextMenu("myMenu2",{
                    bindings:
                        {
                            "youjian_xiugaifangjian":function () {
                                if ($("#empType").html()=="4") {
                                    inputFangjian(allRoom.list[i].id);
                                    $(".m23").modal("show");
                                }else if($("#yuangong_zhiwu").find("option:selected").text()!="财务" && $("#yuangong_zhiwu").find("option:selected").text()!="业务"){
                                    if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
                                        if ($("#yuangong_zhiwu").find("option:selected").text()=="店长") {
                                            inputFangjian(allRoom.list[i].id);
                                            $(".m23").modal("show");
                                        }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department){
                                            inputFangjian(allRoom.list[i].id);
                                            $(".m23").modal("show");
                                        }else {
                                            alert("您没有权限修改该房间！");
                                        }
                                    }else {
                                        alert("您没有权限修改该房间！");
                                    }
                                }else{
                                    alert("您没有权限修改该房间！");
                                }

                            },
                            "youjian_tianjiafangjian":function () {
                                if ($("#empType").html()=="4") {
                                    $(".m22").modal("show");
                                }else if($("#yuangong_zhiwu").find("option:selected").text()!="财务" && $("#yuangong_zhiwu").find("option:selected").text()!="业务"){
                                    if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
                                        if ($("#yuangong_zhiwu").find("option:selected").text()=="店长") {
                                            $(".m22").modal("show");
                                        }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department){
                                            $(".m22").modal("show");
                                        }else {
                                            alert("您没有权限添加房间！");
                                        }
                                    }else {
                                        alert("您没有权限添加房间！");
                                    }
                                }else{
                                    alert("您没有权限添加房间！");
                                }
                            }
                        }
                });
            });
        })(i);
    }
    $("#room_table_head").contextMenu("myMenu3",{
        bindings:
            {
                "youjian_tianjiafangjian1":function () {
                    if ($("#empType").html()=="4") {
                        $(".m22").modal("show");
                    }else if($("#yuangong_zhiwu").find("option:selected").text()!="财务" && $("#yuangong_zhiwu").find("option:selected").text()!="业务"){
                        if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
                            if ($("#yuangong_zhiwu").find("option:selected").text()=="店长") {
                                $(".m22").modal("show");
                            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department){
                                $(".m22").modal("show");
                            }else {
                                alert("您没有权限添加房间！");
                            }
                        }else {
                            alert("您没有权限添加房间！");
                        }
                    }else{
                        alert("您没有权限添加房间！");
                    }
                }
            }
    });
    $("#shouru_table").contextMenu("myMenu4",{
        bindings:
            {
                "youjian_tianjiashouru":function () {
                    $("#shouru_luruyuan").val($("#yuangong_name").val());
                    $(".m27").modal("show");
                }
            }
    });
    $("#zhichu_table").contextMenu("myMenu5",{
        bindings:
            {
                "youjian_tianjiazhichu":function () {
                    $("#zhichu_luruyuan").val($("#yuangong_name").val());
                    $(".m28").modal("show");
                }
            }
    });
    $("#yeji_table" ).contextMenu("myMenu4",{
        bindings:
            {
                "youjian_tianjiashouru":function () {
                    $("#yeji_luruyuan").val($("#yuangong_name").val());
                    $(".m29").modal("show");
                }
            }
    });
});
function selectAllListing(lPn) {
    $.ajax({
        url:"../Listing/selectAll.html",
        type:"POST",
        dataType:"json",
        data:{pn:lPn},
        success:function (data) {
            var list = eval(data);
            allData = list;
            listingAllPn = parseInt(list.pages);
            listingPn=lPn;
            nowListing=null;
            nowRoom=null;
            $("#listing_paper i").html("第"+lPn+"页/共"+listingAllPn+"页");
            $("#listing-tbody").html("");
            $("#listing-tbody").attr("name","allListing");
            for (var i = 0;i<list.list.length;i++){
                $("#listing-tbody").append("<tr id='listing_"+i+"'>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ list.list[i].branch +"</td>"+
                    "<td>"+ list.list[i].department +"</td>"+
                    "<td>"+ list.list[i].area +"</td>"+
                    "<td>"+ list.list[i].address +"</td>"+
                    "<td>"+ list.list[i].houseType +"</td>"+
                    "<td>"+ list.list[i].borrowType +"</td>"+
                    "<td>"+ list.list[i].acreage+"</td>"+
                    "<td>"+ list.list[i].housePrice +"</td>"+
                    "<td>"+ list.list[i].listingStatus +"</td>"+
                    "<td>"+ list.list[i].deposit +"</td>"+
                    "<td>"+ list.list[i].secretarial +"</td>"+
                    "<td>"+ list.list[i].endTime.split(" ")[0] +"</td>"+
                    "<td>"+ list.list[i].listingNote +"</td>"+
                    +"</tr>");
            }
        },
        error:function (xhr) {
            alert("处理失败！请稍候重试！");
        }
    });
}
function inputListing2(mmm) {
    var a = mmm;
    $("#listingIdl-2").val(allData.list[a].listingId);
    $("#constractIdl-2").val(allData.list[a].contractId);
    $("#branchl-2").val(allData.list[a].branch);
    $("#departmentl-2").val(allData.list[a].department);
    $("#areal-2").val(allData.list[a].area);
    $("#communityl-2").val(allData.list[a].community);
    $("#houseManagel-2").val(allData.list[a].houseManage);
    $("#secretariall-2").val(allData.list[a].secretarial);
    $("#houseTypel-2").val(allData.list[a].houseType);
    $("#floorl-2").val(allData.list[a].floor);
    $("#elevatorl-2").val(allData.list[a].elevator);
    $("#acreagel-2").val(allData.list[a].acreage);
    $("#borrowTypel-2").val(allData.list[a].borrowType);
    $("#addressl-2").val(allData.list[a].address);
    $("#startTimel-2").val(allData.list[a].startTime.split(" ")[0]);
    $("#endTimel-2").val(allData.list[a].endTime.split(" ")[0]);
    $("#freeRentMsgl-2").val(allData.list[a].freeRentMsg);
    $("#housePricel-2").val(allData.list[a].housePrice);
    $("#depositl-2").val(allData.list[a].deposit);
    $("#ownerNamel-2").val(allData.list[a].ownerName);
    $("#ownerPhonel-2").val(allData.list[a].ownerPhone);
    $("#ownerCardl-2").val(allData.list[a].ownerCard);
    $("#paymentStyle1l-2").val(allData.list[a].paymentStyle1);
    $("#paymentMsgl-2").val(allData.list[a].paymentMsg);
    $("#waterCardl-2").val(allData.list[a].waterCard);
    $("#paymentCycleElectricityl1-2").val(allData.list[a].paymentCycleElectricity.split(";")[0]);
    $("#paymentCycleElectricityl2-2").val(allData.list[a].paymentCycleElectricity.split(";")[1]);
    $("#paymentCycleWaterl1-2").val(allData.list[a].paymentCycleWater.split(";")[0]);
    $("#paymentCycleWaterl2-2").val(allData.list[a].paymentCycleWater.split(";")[1]);
    $("#waterDayl-2").val(allData.list[a].waterDay);
    $("#electricityCardl-2").val(allData.list[a].electricityCard);
    $("#electricityDayl-2").val(allData.list[a].electricityDay);
    $("#gasCardl-2").val(allData.list[a].gasCard);
    $("#paymentCycleGasl1-2").val(allData.list[a].paymentCycleGas.split(";")[0]);
    $("#paymentCycleGasl2-2").val(allData.list[a].paymentCycleGas.split(";")[1]);
        $("#gasDayl-2").val(allData.list[a].gasDay);
    $("#tBWl-2").val(allData.list[a].transferBaseWater);
    $("#tBEl-2").val(allData.list[a].transferBaseElectricity);
    $("#tBGl-2").val(allData.list[a].transferBaseGas);
    $("#tBEHl-2").val(allData.list[a].transferBaseEleHigh);
    $("#tBEHLl-2").val(allData.list[a].transferBaseEleLow);
    var m = allData.list[a].listingConfig.split(";");
    if (m[0]==1) $("#aa").attr("checked", true);else $("#aa").removeAttr("checked");
    if (m[1]==1) $("#bb").attr("checked", true);else $("#bb").removeAttr("checked");
    if (m[2]==1) $("#cc").attr("checked", true);else $("#cc").removeAttr("checked");
    if (m[3]==1) $("#dd").attr("checked", true);else $("#dd").removeAttr("checked");
    if (m[4]==1) $("#ee").attr("checked", true);else $("#ee").removeAttr("checked");
    if (m[5]==1) $("#ff").attr("checked", true);else $("#ff").removeAttr("checked");
    if (m[6]==1) $("#gg").attr("checked", true);else $("#gg").removeAttr("checked");
    if (m[7]==1) $("#hh").attr("checked", true);else $("#hh").removeAttr("checked");
    if (m[8]==1) $("#ii").attr("checked", true);else $("#ii").removeAttr("checked");
    $("#contractNotel-2").val(allData.list[a].contractNote);
    $("#houseNotel-2").val(allData.list[a].listingNote);
    $("#financeNotel-2").val(allData.list[a].financeNote);
    $("#listingDesclrl-2").val(allData.list[a].listingDescription);
    // "paymentPlan":null;
    if (allData.list[a].broadbandMsg!=null) {
        $("#listingKuandail-2").val(allData.list[a].broadbandMsg.split(";")[0]);
        if (allData.list[a].broadbandMsg.split(";")[0]=="有宽带"){
            $("#listingKuandaiidl-2").val(allData.list[a].broadbandMsg.split(";")[1]);
            $("#listingKuandairiqil-2").val(allData.list[a].broadbandMsg.split(";")[2]);
        }
    }

    $("#listingStatusl-2").val(allData.list[a].listingStatus);
}
function inputListing(myId) {
    idid = myId;
    $.ajax({
        url:"../Listing/selectOne.html",
        type:"POST",
        dataType:"json",
        data:{listingId:myId},
        success:function (data) {
            var list = eval(data);
            xiuListingtupian = list.listingPic.split(";");
            $("#xiugaitupian").html("");
            $("#xiugaitupian2").html("");
            for (var q = 0;q<xiuListingtupian.length-1;q++){
                $("#xiugaitupian").append('<img style="width:270px;height: 270px" src="' + xiuListingtupian[q] + '" />')
            }
            xiuOwnertupian = list.ownerPic.split(";");
            for (var n=0;n<xiuOwnertupian.length-1;n++){
                $("#xiugaitupian2").append('<img style="width:270px;height: 270px" src="' + xiuOwnertupian[n] + '" />')
            }
            $("#listingIdl-1").val(list.listingId)
            $("#constractIdl-1").val(list.contractId);
            var branchOpt = $("#branchl-1");
            var areaOpt = $("#areal-1");
            areaOpt.html("");
            branchOpt.html("");
            for (var h = 0;h<areaa.length;h++){
                if (areaa[h]==list.area){
                    areaOpt.append("<option selected='selected' value="+ areaa[h] +">"+ areaa[h] +"</option>")
                }else {
                    areaOpt.append("<option value="+ areaa[h] +">"+ areaa[h] +"</option>")
                }
            }
            areaOpt.selectpicker("refresh");
            areaOpt.selectpicker("render");
            for (var hh = 0;hh<branchh.length;hh++){
                if (branchh[hh]==list.branch){
                    branchOpt.append("<option selected='selected' value="+ branchh[hh] +">"+ branchh[hh] +"</option>")
                }else {
                    branchOpt.append("<option value="+ branchh[hh] +">"+ branchh[hh] +"</option>")
                }
            }
            branchOpt.selectpicker("refresh");
            branchOpt.selectpicker("render");
            $("#departmentl-1").html("");
            $.ajax({
                url:"../Find/findDepa.html",
                type:"POST",
                dataType:"json",
                data:{"branch":list.branch},
                success:function (data) {
                    var lll = eval(data);
                    for (var o = 0;o<lll.length;o++){
                        if(lll[0].branchDepa==list.department){
                            $("#departmentl-1").append("<option selected='selected' value="+ lll[o].branchDepa +">"+ lll[o].branchDepa +"</option>");
                        }else {
                            $("#departmentl-1").append("<option value="+ lll[o].branchDepa +">"+ lll[o].branchDepa +"</option>");

                        }
                        $("#departmentl-1").selectpicker("refresh");
                        $("#departmentl-1").selectpicker("render");
                    }
                },
                error:function (xhr) {
                }
            });
            $("#communityl-1").html("");
            $.ajax({
                url:"../Find/findComm.html",
                type:"POST",
                dataType:"json",
                data:{"area":list.area},
                success:function (data) {
                    var ddd = eval(data);
                    console.log(ddd);
                    for (var o = 0;o<ddd.length;o++){
                        if (ddd[o].community==list.community) {
                            $("#communityl-1").append("<option selected='selected' value="+ ddd[o] +">"+ ddd[o] +"</option>");
                        }else {
                            $("#communityl-1").append("<option value="+ ddd[o] +">"+ ddd[o] +"</option>");
                        }
                        $("#communityl-1").selectpicker("refresh");
                        $("#communityl-1").selectpicker("render");
                    }
                },
                error:function (xhr) {
                }
            });
            $("#houseManagel-1").val(list.houseManage);
            $("#secretariall-1").val(list.secretarial);
            var houseType = $("#houseTypel-1");
            houseType.html("");
            for (var ii=0;ii<leixing.length;ii++){
                if (leixing[ii]==list.houseType) {
                    houseType.append("<option selected='selected' value="+ leixing[ii] +">"+ leixing[ii] +"</option>")
                }else {
                    houseType.append("<option value="+ leixing[ii] +">"+ leixing[ii] +"</option>")
                }
            }
            houseType.selectpicker("refresh");
            houseType.selectpicker("render");
            $("#floorl-1").val(list.floor);
            $("#elevatorl-1").val(list.elevator);
            $("#acreagel-1").val(list.acreage);
            var borrowType = $("#borrowTypel-1");
            borrowType.html("");
            for (var oo=0;oo<huxing.length;oo++){
                if (huxing[oo]==list.borrowType) {
                    borrowType.append("<option selected='selected' value="+ huxing[oo] +">"+ huxing[oo] +"</option>")
                }else {
                    borrowType.append("<option value="+ huxing[oo] +">"+ huxing[oo] +"</option>")
                }
            }
            borrowType.selectpicker("refresh");
            borrowType.selectpicker("render");
            $("#addressl-1").val(list.address);
            $("#startTimel-1").val(list.startTime.split(" ")[0]);
            $("#endTimel-1").val(list.endTime.split(" ")[0]);
            $("#freeRentMsgl-1").val(list.freeRentMsg);
            $("#housePricel-1").val(list.housePrice);
            $("#depositl-1").val(list.deposit);
            $("#ownerNamel-1").val(list.ownerName);
            $("#ownerPhonel-1").val(list.ownerPhone);
            $("#ownerCardl-1").val(list.ownerCard);
            $("#paymentStyle1l-1").val(list.paymentStyle1);
            $("#paymentMsgl-1").val(list.paymentMsg);
            $("#waterCardl-1").val(list.waterCard);
            var pCE =  $("#paymentCycleElectricityl1-1");
            var pCE2 = $("#paymentCycleElectricityl2-1");
            pCE.html("");
            pCE2.html("");
            var z = list.paymentCycleElectricity;
            for (var zzz=0;zzz<fufeifangshi1.length;zzz++){
                if (fufeifangshi1[zzz]==z.split(";")[0]) {
                    pCE.append("<option selected='selected' value="+ fufeifangshi1[zzz] +">"+ fufeifangshi1[zzz] +"</option>")
                }else {
                    pCE.append("<option value="+ fufeifangshi1[zzz] +">"+ fufeifangshi1[zzz] +"</option>")
                }
            }
            pCE.selectpicker("refresh");
            pCE.selectpicker("render");
            for (var zzz1=0;zzz1<fufeifangshi2.length;zzz1++){
                if (fufeifangshi2[zzz1]==z.split(";")[1]) {
                    pCE2.append("<option selected='selected' value="+ fufeifangshi2[zzz1] +">"+ fufeifangshi2[zzz1] +"</option>")
                }else {
                    pCE2.append("<option value="+ fufeifangshi2[zzz1] +">"+ fufeifangshi2[zzz1] +"</option>")
                }
            }
            pCE2.selectpicker("refresh");
            pCE2.selectpicker("render");
            var pCW1 = $("#paymentCycleWaterl1-1");
            var pCW2 = $("#paymentCycleWaterl2-1");
            pCW1.html("");
            pCW2.html("");
            var pCW = list.paymentCycleWater;
            for (var zzz=0;zzz<fufeifangshi1.length;zzz++){
                if (fufeifangshi1[zzz]==pCW.split(";")[0]) {
                    pCW1.append("<option selected='selected' value="+ fufeifangshi1[zzz] +">"+ fufeifangshi1[zzz] +"</option>")
                }else {
                    pCW1.append("<option value="+ fufeifangshi1[zzz] +">"+ fufeifangshi1[zzz] +"</option>")
                }
            }
            pCW1.selectpicker("refresh");
            pCW1.selectpicker("render");
            for (var zzz1=0;zzz1<fufeifangshi2.length;zzz1++){
                if (fufeifangshi2[zzz1]==pCW.split(";")[1]) {
                    pCW2.append("<option selected='selected' value="+ fufeifangshi2[zzz1] +">"+ fufeifangshi2[zzz1] +"</option>")
                }else {
                    pCW2.append("<option value="+ fufeifangshi2[zzz1] +">"+ fufeifangshi2[zzz1] +"</option>")
                }
            }
            pCW2.selectpicker("refresh");
            pCW2.selectpicker("render");
            $("#waterDayl-1").val(list.waterDay);
            $("#electricityCardl-1").val(list.electricityCard);
            $("#electricityDayl-1").val(list.electricityDay);
            $("#gasCardl-1").val(list.gasCard);
            var pCG1 = $("#paymentCycleGasl1-1");
            var pCG2 = $("#paymentCycleGasl2-1");
            pCG1.html("");
            pCG2.html("");
            var pCG = list.paymentCycleGas;
            for (var zzz=0;zzz<fufeifangshi1.length;zzz++){
                if (fufeifangshi1[zzz]==pCG.split(";")[0]) {
                    pCG1.append("<option selected='selected' value="+ fufeifangshi1[zzz] +">"+ fufeifangshi1[zzz] +"</option>")
                }else {
                    pCG1.append("<option value="+ fufeifangshi1[zzz] +">"+ fufeifangshi1[zzz] +"</option>")
                }
            }
            pCG1.selectpicker("refresh");
            pCG1.selectpicker("render");
            for (var zzz1=0;zzz1<fufeifangshi2.length;zzz1++){
                if (fufeifangshi2[zzz1]==pCG.split(";")[1]) {
                    pCG2.append("<option selected='selected' value="+ fufeifangshi2[zzz1] +">"+ fufeifangshi2[zzz1] +"</option>")
                }else {
                    pCG2.append("<option value="+ fufeifangshi2[zzz1] +">"+ fufeifangshi2[zzz1] +"</option>")
                }
            }
            pCG2.selectpicker("refresh");
            pCG2.selectpicker("render");
            $("#gasDayl-1").val(list.gasDay);
            $("#tBWl-1").val(list.transferBaseWater);
            $("#tBEl-1").val(list.transferBaseElectricity);
            $("#tBGl-1").val(list.transferBaseGas);
            $("#tBEHl-1").val(list.transferBaseEleHigh);
            $("#tBEHLl-1").val(list.transferBaseEleLow);
            var ddddd =list.listingConfig.split(";");
            if (ddddd[0]=="1") $("#11").attr("checked", "true");else $("#11").removeAttr("checked");
            if (ddddd[1]=="1") $("#22").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[2]=="1") $("#33").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[3]=="1") $("#44").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[4]=="1") $("#55").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[5]=="1") $("#66").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[6]=="1") $("#77").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[7]=="1") $("#88").attr("checked", "true");else $("#22").removeAttr("checked");
            if (ddddd[8]=="1") $("#99").attr("checked", "true");else $("#22").removeAttr("checked");
            $("#contractNotel-1").val(list.contractNote);
            $("#houseNotel-1").val(list.listingNote);
            $("#financeNotel-1").val(list.financeNote);
            $("#listingDesclrl-1").val(list.listingDescription);
            // "paymentPlan":null; 详细付款计划
            $("#xiugaifangyuan_day").val("");
            $("#xiugaifangyuan_month1").val("");
            $("#xiugaifangyuan_month2").val("");
            $("#xiugaifangyuan_piliang_money").val("");
            $("#xiugaifangyuan_tianjiayitiao_money").val("");
            $("#xiugaifangyuan_tianjiayitiao_shijian").val("");
            $("#fukuanjihua1").html("");
            if (list.paymentPlan==null){
            } else {
                var pmp=list.paymentPlan.split("%");
                var yifu="";
                for (var n=0;n<pmp.length-1;n++){
                    if (pmp[n].split(";")[0]!="undefined"){
                        if (pmp[n].split(";")[2]=="2"){
                            yifu=" checked='true'";
                            $("#fukuanjihua1").append( "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\""+yifu+"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>") ;
                        }else{
                            yifu=" checked='false'";
                            $("#fukuanjihua1").append( "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>") ;
                        }
                    }
                }
            }
            if (list.broadbandMsg!=null) {
                var kuandaixinxi=list.broadbandMsg.split(";");
                if (kuandaixinxi[0]=="有宽带"){
                    $("#broadBandMsgl-1").val("1");
                    $("#kuandai1_1").val(kuandaixinxi[1]);
                    $("#kuandairiqi1_1").val(kuandaixinxi[2]);
                }else{
                    $("#broadBandMsgl-1").val("2");
                }
            }
            // $("#listingStatusl-1").html(listingStatus);房源状态
        },
        error:function (xhr) {
            alert("查询失败！请稍后重试！")
        }
    })
}
function updateListing(){
    var formData = new FormData();
    for (var k = 0;k<$("#xiugaishangchuantupian")[0].files.length;k++){
        formData.append("listingPic",$("#xiugaishangchuantupian")[0].files[k])
    }
    for (var p = 0;p<$("#xiugaishangchuantupian2")[0].files.length;p++){
        formData.append("ownerPic",$("#xiugaishangchuantupian2")[0].files[p])
    }
    var www;
    var a,b,c,d,e,f,g,h,i,j;
    if ($("#11").is(':checked')) a=1;else a=2;
    if ($("#22").is(':checked')) b=1;else b=2;
    if ($("#33").is(':checked')) c=1;else c=2;
    if ($("#44").is(':checked')) d=1;else d=2;
    if ($("#55").is(':checked')) e=1;else e=2;
    if ($("#66").is(':checked')) f=1;else f=2;
    if ($("#77").is(':checked')) g=1;else g=2;
    if ($("#88").is(':checked')) h=1;else h=2;
    if ($("#99").is(':checked')) i=1;else i=2;
    www = a+";"+b+";"+c+";"+d+";"+e+";"+f+";"+g+";"+h+";"+i;
    var paymentPlan="";
    var jihua_checked=1;
    for (var n=0;n<$("#fukuanjihua1 .col-md-6").length;n++){
        jihua_checked=1;
        if ($("#fukuanjihua1 .col-md-6 .checkbox-inline .yifu_check").eq(n).prop("checked")==true){
            jihua_checked=2;
        }
        paymentPlan=paymentPlan+$("#fukuanjihua1 .col-md-6 .shijian").eq(n).val()+";"+$("#fukuanjihua1 .col-md-6 .money").eq(n).val()+";"+jihua_checked+"%";
    }
    var json = {
        "id":idid,
        "listingId":$("#listingIdl-1").val(),
        "contractId":$("#constractIdl-1").val(),
        "branch":$("#branchl-1").find("option:selected").text(),
        "department":$("#departmentl-1").find("option:selected").text(),
        "area":$("#areal-1").find("option:selected").text(),
        "community":$("#communityl-1").find("option:selected").text(),
        "houseManage":$("#houseManagel-1").find("option:selected").text(),
        "secretarial":$("#secretariall-1").find("option:selected").text(),
        "houseType":$("#houseTypel-1").find("option:selected").text(),
        "floor":$("#floorl-1").val(),
        "elevator":$("#elevatorl-1").val(),
        "acreage":$("#acreagel-1").val(),
        "borrowType":$("#borrowTypel-1").find("option:selected").text(),
        "address":$("#addressl-1").val(),
        "startTime":$("#startTimel-1").val()+" "+"00:00:00",
        "endTime":$("#endTimel-1").val()+" "+"00:00:00",
        "freeRentMsg":$("#freeRentMsgl-1").val(),
        "housePrice":$("#housePricel-1").val(),
        "deposit":$("#depositl-1").val(),
        "ownerName":$("#ownerNamel-1").val(),
        "ownerPhone":$("#ownerPhonel-1").val(),
        "ownerCard":$("#ownerCardl-1").val(),
        "paymentStyle1":$("#paymentStyle1l-1").val(),
        "paymentMsg":$("#paymentMsgl-1").val(),
        "waterCard":$("#waterCardl-1").val(),
        "paymentCycleElectricity":$("#paymentCycleElectricityl1-1").find("option:selected").text()+";"+$("#paymentCycleElectricityl2-1").find("option:selected").text(),
        "paymentCycleWater":$("#paymentCycleWaterl1-1").find("option:selected").text()+";"+$("#paymentCycleWaterl2-1").find("option:selected").text(),
        "waterDay":$("#waterDayl-1").val(),
        "electricityCard":$("#electricityCardl-1").val(),
        "electricityDay":$("#electricityDayl-1").val(),
        "gasCard":$("#gasCardl-1").val(),
        "paymentCycleGas":$("#paymentCycleGasl1-1").find("option:selected").text()+";"+$("#paymentCycleGasl2-1").find("option:selected").text(),
        "gasDay":$("#gasDayl-1").val(),
        "transferBaseWater":$("#tBWl-1").val(),
        "transferBaseElectricity":$("#tBEl-1").val(),
        "transferBaseGas":$("#tBGl-1").val(),
        "transferBaseEleHigh":$("#tBEHl-1").val(),
        "transferBaseEleLow":$("#tBEHLl-1").val(),
        "listingConfig":www,
        "contractNote":$("#contractNotel-1").val(),
        "listingNote":$("#houseNotel-1").val(),
        "financeNote":$("#financeNotel-1").val(),
        "listingDescription":$("#listingDesclrl-1").val(),
        "paymentPlan":paymentPlan,
        "broadbandMsg":$("#broadBandMsgl-1").find("option:selected").text()+";"+$("#kuandai1_1").val()+";"+$("#kuandairiqi1_1").val(),
        "listingStatus":1
    };
    formData.append("listing",JSON.stringify(json));
    $.ajax({
        url:"../Listing/updateListing.html",
        type:"POST",
        dataType:"text",
        processData: false,
        contentType: false,
        data:formData,
        success:function (data) {
            alert("修改成功");
        },
        error:function (xhr) {
            alert("修改失败！请稍后重试！");
        }
    });
    $("#listing-tbody").html("");
    if ($("#listing-tbody").attr("name")=="allListing") {
        selectAllListing(listingPn);
    }else if ($("#listing-tbody").attr("name")=="shaixuanListing") {
        quedingshaixuan(listingPn);
    }else if ($("#listing-tbody").attr("name")=="sousuoListing"){
        sousuofangyuan(listingPn);
    }
}
function yulanPic() {
    var file = $("#insertListingImgs")
    var yulan = $("#yulanListingImgs");
    yulan.html("");
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
function yulanPic2() {
    $("#yulanOwnerImgs").html("");
    var file = $("#insertOwnerImgs")
    var yulan = $("#yulanOwnerImgs");
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
                    'DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
            }
        }
    }else {
        alert("最多上传9张图片");
    }
}
function xiugaitupian() {
    $("#xiugaitupian").html("");
    var file = $("#xiugaishangchuantupian")
    var yulan = $("#xiugaitupian");

    if (file[0].files.length-xiuListingtupian.length<9) {
        for (var s = 0;s<file[0].files.length;s++) {
            if (file[0].files && file[0].files[s]) {
                var reader = new FileReader();
                reader.onload = function(evt) {
                    yulan.append('<img style="width:270px;height: 270px" src="' + evt.target.result + '" />') ;
                }
                reader.readAsDataURL(file[0].files[s]);
            } else {
                prevDiv.innerHTML = '<div class="img" style="filter:progid:' +
                    'DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
            }
        }
    }else {
        alert("最多上传9张图片");
    }
}
function xiugaitupian2() {
    $("#xiugaitupian2").html("");
    var file = $("#xiugaishangchuantupian2")
    var yulan = $("#xiugaitupian2");

    if (file[0].files.length-xiuOwnertupian.length<9) {
        for (var s = 0;s<file[0].files.length;s++) {
            if (file[0].files && file[0].files[s]) {
                var reader = new FileReader();
                reader.onload = function(evt) {
                    yulan.append('<img style="width:270px;height: 270px" src="' + evt.target.result + '" />') ;
                }
                reader.readAsDataURL(file[0].files[s]);
            } else {
                prevDiv.innerHTML = '<div class="img" style="filter:progid:' +
                    'DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
            }
        }
    }else {
        alert("最多上传9张图片");
    }
}
function insertListing() {
    var www ;
    var url1;
    var formData  = new FormData();
    var mmm = $("#insertListingImgs");
    for (var k = 0;k<mmm[0].files.length;k++){
        formData.append("listingPic",mmm[0].files[k])
    }
    for (var p = 0;p<$("#insertOwnerImgs")[0].files.length;p++){
        formData.append("ownerPic",$("#insertOwnerImgs")[0].files[p])
    }

    var a,b,c,d,e,f,g,h,i,j;
    if ($("#1111").is(':checked')) a=1;else a=2;
    if ($("#2222").is(':checked'))  b=1;else b=2;
    if ($("#3333").is(':checked')) c=1;else c=2;
    if ($("#4444").is(':checked')) d=1;else d=2;
    if ($("#5555").is(':checked')) e=1;else e=2;
    if ($("#6666").is(':checked')) f=1;else f=2;
    if ($("#7777").is(':checked')) g=1;else g=2;
    if ($("#8888").is(':checked')) h=1;else h=2;
    if ($("#9999").is(':checked')) i=1;else i=2;
    www = a+";"+b+";"+c+";"+d+";"+e+";"+f+";"+g+";"+h+";"+i;
    var paymentPlan="";
    var jihua_checked=1;
    for (var n=0;n<$("#fukuanjihua .col-md-6").length;n++){
        jihua_checked=1;
        if ($("#fukuanjihua.col-md-6 .checkbox-inline .yifu_check").eq(n).prop("checked")==true){
            jihua_checked=2;
        }
        paymentPlan=paymentPlan+$("#fukuanjihua .col-md-6 .shijian").eq(n).val()+";"+$("#fukuanjihua .col-md-6 .money").eq(n).val()+";"+jihua_checked+"%";
    }
    var json = {
        "listingId":$("#listingIdl").val(),
        "contractId":$("#constractIdl").val(),
        "branch":$("#branchl").find("option:selected").text(),
        "department":$("#departmentl").find("option:selected").text(),
        "area":$("#areal").find("option:selected").text(),
        "community":$("#communityl").find("option:selected").text(),
        "houseManage":$("#houseManagel").val(),
        "secretarial":$("#secretariall").val(),
        "houseType":$("#houseTypel").find("option:selected").text(),
        "floor":$("#floorl").val(),
        "elevator":$("#elevatorl").val(),
        "acreage":$("#acreagel").val(),
        "borrowType":$("#borrowTypel").find("option:selected").text(),
        "address":$("#addressl").val(),
        "startTime":$("#startTimel").val()+" "+"00:00:00",
        "endTime":$("#endTimel").val()+" "+"00:00:00",
        "freeRentMsg":$("#freeRentMsgl").val(),
        "housePrice":$("#housePricel").val(),
        "deposit":$("#depositl").val(),
        "ownerName":$("#ownerNamel").val(),
        "ownerPhone":$("#ownerPhonel").val(),
        "ownerCard":$("#ownerCardl").val(),
        "paymentStyle1":$("#paymentStyle1l").val(),
        "paymentMsg":$("#paymentMsgl").val(),
        "waterCard":$("#waterCardl").val(),
        "paymentCycleElectricity":$("#paymentCycleElectricityl1").find("option:selected").text()+";"+$("#paymentCycleElectricityl2").find("option:selected").text(),
        "paymentCycleWater":$("#paymentCycleWaterl1").find("option:selected").text()+";"+$("#paymentCycleWaterl2").find("option:selected").text(),
        "waterDay":$("#waterDayl").val(),
        "electricityCard":$("#electricityCardl").val(),
        "electricityDay":$("#electricityDayl").val(),
        "gasCard":$("#gasCardl").val(),
        "paymentCycleGas":$("#paymentCycleGasl1").find("option:selected").text()+";"+$("#paymentCycleGasl2").find("option:selected").text(),
        "gasDay":$("#gasDayl").val(),
        "transferBaseWater":$("#tBWl").val(),
        "transferBaseElectricity":$("#tBEl").val(),
        "transferBaseGas":$("#tBGl").val(),
        "transferBaseEleHigh":$("#tBEHl").val(),
        "transferBaseEleLow":$("#tBEHLl").val(),
        "listingConfig":www,
        "contractNote":$("#contractNotel").val(),
        "listingNote":$("#houseNotel").val(),
        "financeNote":$("#financeNotel").val(),
        "listingDescription":$("#listingDescriptionl").val(),
        "paymentPlan":paymentPlan,
        "broadbandMsg":$("#broadBandMsgl").find("option:selected").text()+";"+$("#kuandai1").val()+";"+$("#kuandairiqi1").val(),
        "listingStatus":1
    };
    formData.append("listing",JSON.stringify(json));
    console.log($("#contractNotel").val());
    var ppp = $("#listingIdl").val();
    $.ajax({
        url: "/Listing/insertListing.html",
        type: "POST",
        dataType: "text",
        processData: false,
        contentType: false,
        data: formData,
        success: function (data) {
            alert("添加成功！");
            $.ajax({
                url:"/Room/selectRoomForListing.html",
                type:"POST",
                async:false,
                dataType:"json",
                data:{
                    listingId:$("#listingIdl").val()
                },
                success:function (data2) {
                    if (data2==0){
                        $.ajax({
                            url:"Listing/updateListingStatus.html",
                            type:"POST",
                            async:false,
                            dataType:"text",
                            data:{
                                status:2,
                                id:nowListing.id
                            },
                            success:function () {

                            },
                            error:function () {

                            }
                        })
                    }else {
                        $.ajax({
                            url:"Listing/updateListingStatus.html",
                            type:"POST",
                            dataType:"text",
                            async:false,
                            data:{
                                status:1,
                                id:nowListing.id
                            },
                            success:function () {

                            },
                            error:function () {

                            }
                        })
                    }
                },
                error:function (xhr) {

                }
            })

            $("#listing-tbody").html("");
            $("#fukuanjihua").html("");
            $("#yulanListingImgs").html("");
            $("#yulanOwnerImgs").html("");
            for (var k=1;k<=9;k++){
                $("#"+k+""+k+""+k+""+k).removeAttr("checked");
            }
                $("#listingIdl").val("");
                $("#constractIdl").val("");
                $("#houseManagel").val("");
                $("#secretariall").val("");
                $("#floorl").val("");
                $("#elevatorl").val("");
                $("#acreagel").val("");
                $("#addressl").val("");
                $("#startTimel").val("");
                $("#endTimel").val("");
                $("#freeRentMsgl").val("");
                $("#housePricel").val("");
                $("#depositl").val("");
                $("#ownerNamel").val("");
                $("#ownerPhonel").val("");
                $("#ownerCardl").val("");
                $("#paymentStyle1l").val("");
                $("#paymentMsgl").val("");
                $("#waterCardl").val("");
                $("#waterDayl").val("");
                $("#electricityCardl").val("");
                $("#electricityDayl").val("");
                $("#gasCardl").val("");
                $("#gasDayl").val("");
                $("#tBWl").val("");
                $("#tBEl").val("");
                $("#tBGl").val("");
                $("#tBEHl").val("");
                $("#tBEHLl").val("");
                $("#contractNotel").val("");
                $("#houseNotel").val("");
                $("#financeNotel").val("");
                $("#listingDescriptionl").val("");
                $("#kuandai1").val("");
                $("#kuandairiqi1").val("");
                $("#tianjiafangyuan_month1").val("");
                $("#tianjiafangyuan_month2").val("");
                $("#tianjiafangyuan_piliang_money").val("");
                $("#tianjiafangyuan_day").val("");
                $("#tianjiafangyuan_tianjiayitiao_shijian").val("");
                $("#tianjiafangyuan_tianjiayitiao_money").val("");
            if ($("#listing-tbody").attr("name")=="allListing") {
                selectAllListing(listingPn);
            }else if ($("#listing-tbody").attr("name")=="shaixuanListing") {
                quedingshaixuan(listingPn);
            }else if ($("#listing-tbody").attr("name")=="sousuoListing"){
                sousuofangyuan(listingPn);
            }
        },
        error: function () {
            alert("添加失败！请稍后重试")
        }
    });

}
function removeOwnPic() {
    if(window.confirm('您确定要清空图片吗？')){
        var l  = $("#insertOwnerImgs")[0];
        if(l.outerHTML){
            l.outerHTML = l.outerHTML;
        }else{
            l.value = '';
        }
        $("#yulanListingImgs").html("");
        return true;
    }else{
        return false;
    }
}
function removeListingPic() {
    if(window.confirm('您确定要清空图片吗？')){
        var l  = $("#insertListingImgs")[0];
        if(l.outerHTML){
            l.outerHTML = l.outerHTML;
        }else{
            l.value = '';
        }
        $("#yulanListingImgs").html("");
        return true;
    }else{
        return false;
    }

}
function removeOwnPic2() {
    if(window.confirm('您确定要清空图片吗？')){
        var l  = $("#xiugaishangchuantupian2")[0];
        if(l.outerHTML){
            l.outerHTML = l.outerHTML;
        }else{
            l.value = '';
        }
        $("#xiugaitupian2").html("");
        return true;
    }else{
        return false;
    }
}
function removeListingPic2() {
    if(window.confirm('您确定要清空图片吗？')){
        var l  = $("#xiugaishangchuantupian")[0];
        if(l.outerHTML){
            l.outerHTML = l.outerHTML;
        }else{
            l.value = '';
        }
        $("#xiugaitupian").html("");
        return true;
    }else{
        return false;
    }

}
function liandongArea(evt) {
    $("#comm1").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findComm.html",
        type:"POST",
        dataType:"json",
        data:{"area":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#comm1").append("<option value='"+ list[o]+"'>"+ list[o]+"</option>")
                $("#comm1").selectpicker("refresh");
                $("#comm1").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function liandongBranch (evt) {
    $("#depa1").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#depa1").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#depa1").selectpicker("refresh");
                $("#depa1").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function selectComm111() {
    var fff = $("#areal")
    var area = fff.options[fff.selectedIndex].value;
}
function liandongArea2(evt) {
    $("#communityl-1").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findComm.html",
        type:"POST",
        dataType:"json",
        data:{"area":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#communityl-1").append("<option value='"+ list[o]+"'>"+ list[o]+"</option>")
                $("#communityl-1").selectpicker("refresh");
                $("#communityl-1").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function liandongBranch2(evt) {
    $("#departmentl-1").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#departmentl-1").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#departmentl-1").selectpicker("refresh");
                $("#departmentl-1").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function liandongArea3(evt) {
    $("#communityl").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findComm.html",
        type:"POST",
        dataType:"json",
        data:{"area":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#communityl").append("<option value='"+ list[o]+"'>"+ list[o]+"</option>")
                $("#communityl").selectpicker("refresh");
                $("#communityl").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function liandongBranch3(evt) {
    $("#departmentl").empty();
    var b = evt.value;
    $.ajax({
        url:"../Find/findDepa.html",
        type:"POST",
        dataType:"json",
        data:{"branch":b},
        success:function (data) {
            var list = eval(data);
            for (var o = 0;o<list.length;o++){
                $("#departmentl").append("<option value='"+ o+"'>"+ list[o].branchDepa+"</option>")
                $("#departmentl").selectpicker("refresh");
                $("#departmentl").selectpicker("render");
            }
        },
        error:function (xhr) {
        }
    });
}
function selectDepa111() {
    var branch = $("#branchl").find("option:selected").text();
    $.ajax({
        url: "../Find/findDepa.html",
        type: "POST",
        dataType: "json",
        data: {"branch": branch},
        success: function (data) {
            var list = eval(data);
            for (var o = 0; o < list.length; o++) {
                $("#communityddd").append("<option value='" + o + "'>" + list.branchDepa + "</option>")
            }
        },
        error: function (xhr) {
        }
    });
}
function tianjiafangyuan_yitiao_btn_fun() {
    var shijian=$("#tianjiafangyuan_tianjiayitiao_shijian").val();
    var money=$("#tianjiafangyuan_tianjiayitiao_money").val();
    if (shijian==""){
        alert("请选择日期！");
    } else if (money==""){
        alert("请输入金额！");
    } else{
        $("#fukuanjihua").append(
            "<div class=\"col-md-6\">\n" +
            "                                    <div style=\"margin-top: 5px\">\n" +
            "                                        <input type=\"text\" class=\"form-control shijian\" value='"+shijian+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
            "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
            "                                        元\n" +
            "                                        <label class=\"checkbox-inline\">\n" +
            "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
            "                                        </label>\n" +
            "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
            "                                    </div>\n" +
            "</div>"
        );
        $("#tianjiafangyuan_tianjiayitiao_shijian").val("");
        $("#tianjiafangyuan_tianjiayitiao_money").val("");
    }
}
function tianjiafangyuan_piliang_btn_fun() {
    var month1=$("#tianjiafangyuan_month1").val();
    var month2=$("#tianjiafangyuan_month2").val();
    var day=$("#tianjiafangyuan_day").val();
    var money=$("#tianjiafangyuan_piliang_money").val();
    if (month1==""){
        alert("请选择起始月份！");
    } else if(month2==""){
        alert("请选择截止月份！");
    }else if(day==""){
        alert("请输入日期！")
    }else if (money==""){
        alert("请输入金额！");
    }else if (parseInt(day)<1||parseInt(day)>31){
        alert("请输入正确的日期！");
    } else{
        if (day<10){
            day="0"+day;
        }
        var month1_year=parseInt(month1.split("-")[0]);
        var month1_month=parseInt(month1.split("-")[1]);
        var month2_year=parseInt(month2.split("-")[0]);
        var month2_month=parseInt(month2.split("-")[1]);
        if (month1_year>month2_year){
            alert("第一个日期要比第二个小！");
        } else if (month1_year==month2_year && month1_month>month2_month){
            alert("第一个日期要比第二个小！");
        }else{
            for (month1_year;month1_year<=month2_year;month1_year++){
                if (month1_year<month2_year){
                    for (month1_month;month1_month<=12;month1_month++){
                        if (month1_month<10){
                            $("#fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                    if (month1_month==13){
                        month1_month=1;
                    }
                }
                if (month1_year==month2_year){
                    for (month1_month;month1_month<=month2_month;month1_month++){
                        if (month1_month<10){
                            $("#fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                }
            }
        }
    }
}
function tianjiafangyuan_deleteall() {
    $("#fukuanjihua").html("");
}
function tianjiafangyuan_delete(e) {
    e.closest("div").closest("div").remove();
}
function tianjiafangyuan_yitiao() {
    if ($("#tianjiafangyuan_piliangtianjia").css("display")!="none"){
        $("#tianjiafangyuan_piliangtianjia").toggle();
        $("#tianjiafangyuan_tianjiayitiao").toggle();
    }else{
        $("#tianjiafangyuan_tianjiayitiao").toggle();
    }
}
function tianjiafangyuan_piliang() {
    if ($("#tianjiafangyuan_tianjiayitiao").css("display")!="none"){
        $("#tianjiafangyuan_tianjiayitiao").toggle();
        $("#tianjiafangyuan_piliangtianjia").toggle();
    }else{
        $("#tianjiafangyuan_piliangtianjia").toggle();
    }
}
function xiugaifangyuan_yitiao() {
    if ($("#piliangtianjia1").css("display")!="none"){
        $("#piliangtianjia1").toggle();
        $("#tianjiayitiao1").toggle();
    }else{
        $("#tianjiayitiao1").toggle();
    }
}
function xiugaifangyuan_piliang() {
    if ($("#tianjiayitiao1").css("display")!="none"){
        $("#tianjiayitiao1").toggle();
        $("#piliangtianjia1").toggle();
    }else{
        $("#piliangtianjia1").toggle();
    }
}
function xiugaifangyuan_yitiao_btn_fun() {
    var shijian=$("#xiugaifangyuan_tianjiayitiao_shijian").val();
    var money=$("#xiugaifangyuan_tianjiayitiao_money").val();
    if (shijian==""){
        alert("请选择日期！");
    } else if (money==""){
        alert("请输入金额！");
    } else{
        $("#fukuanjihua1").append(
            "<div class=\"col-md-6\">\n" +
            "                                    <div style=\"margin-top: 5px\">\n" +
            "                                        <input type=\"text\" class=\"form-control shijian\" value='"+shijian+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
            "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
            "                                        元\n" +
            "                                        <label class=\"checkbox-inline\">\n" +
            "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
            "                                        </label>\n" +
            "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
            "                                    </div>\n" +
            "</div>"
        );
        $("#xiugaifangyuan_tianjiayitiao_shijian").val("");
        $("#xiugaifangyuan_tianjiayitiao_money").val("");
    }
}
function xiugaifangyuan_piliang_btn_fun() {
    var month1=$("#xiugaifangyuan_month1").val();
    var month2=$("#xiugaifangyuan_month2").val();
    var day=$("#xiugaifangyuan_day").val();
    var money=$("#xiugaifangyuan_piliang_money").val();
    if (month1==""){
        alert("请选择起始月份！");
    } else if(month2==""){
        alert("请选择截止月份！");
    }else if(day==""){
        alert("请输入日期！")
    }else if (money==""){
        alert("请输入金额！");
    }else if (parseInt(day)<1||parseInt(day)>31){
        alert("请输入正确的日期！");
    } else{
        if (day<10){
            day="0"+day;
        }
        var month1_year=parseInt(month1.split("-")[0]);
        var month1_month=parseInt(month1.split("-")[1]);
        var month2_year=parseInt(month2.split("-")[0]);
        var month2_month=parseInt(month2.split("-")[1]);
        if (month1_year>month2_year){
            alert("第一个日期要比第二个小！");
        } else if (month1_year==month2_year && month1_month>month2_month){
            alert("第一个日期要比第二个小！");
        }else{
            for (month1_year;month1_year<=month2_year;month1_year++){
                if (month1_year<month2_year){
                    for (month1_month;month1_month<=12;month1_month++){
                        if (month1_month<10){
                            $("#fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                    if (month1_month==13){
                        month1_month=1;
                    }
                }
                if (month1_year==month2_year){
                    for (month1_month;month1_month<=month2_month;month1_month++){
                        if (month1_month<10){
                            $("#fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                }
            }
        }
    }
}
function xiugaifangyuan_deleteall() {
    $("#fukuanjihua1").html("");
}
function tianjiafangjian_yitiao() {
    if ($("#fangjian_piliangtianjia").css("display")!="none"){
        $("#fangjian_piliangtianjia").toggle();
        $("#fangjian_tianjiayitiao").toggle();
    }else{
        $("#fangjian_tianjiayitiao").toggle();
    }
}
function tianjiafangjian_piliang() {
    if ($("#fangjian_tianjiayitiao").css("display")!="none"){
        $("#fangjian_tianjiayitiao").toggle();
        $("#fangjian_piliangtianjia").toggle();
    }else{
        $("#fangjian_piliangtianjia").toggle();
    }
}
function tianjiafangjian_deleteall() {
    $("#fangjian_fukuanjihua").html("");
}
function tianjiafangjian_yitiao_btn_fun() {
    var shijian=$("#tianjiafangjian_tianjiayitiao_shijian").val();
    var money=$("#tianjiafangjian_tianjiayitiao_money").val();
    if (shijian==""){
        alert("请选择日期！");
    } else if (money==""){
        alert("请输入金额！");
    } else{
        $("#fangjian_fukuanjihua").append(
            "<div class=\"col-md-6\">\n" +
            "                                    <div style=\"margin-top: 5px\">\n" +
            "                                        <input type=\"text\" class=\"form-control shijian\" value='"+shijian+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
            "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
            "                                        元\n" +
            "                                        <label class=\"checkbox-inline\">\n" +
            "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
            "                                        </label>\n" +
            "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
            "                                    </div>\n" +
            "</div>"
        );
        $("#tianjiafangjian_tianjiayitiao_shijian").val("");
        $("#tianjiafangjian_tianjiayitiao_money").val("");
    }
}
function tianjiafangjian_piliang_btn_fun() {
    var month1=$("#tianjiafangjian_month1").val();
    var month2=$("#tianjiafangjian_month2").val();
    var day=$("#tianjiafangjian_day").val();
    var money=$("#tianjiafangjian_piliang_money").val();
    if (month1==""){
        alert("请选择起始月份！");
    } else if(month2==""){
        alert("请选择截止月份！");
    }else if(day==""){
        alert("请输入日期！")
    }else if (money==""){
        alert("请输入金额！");
    }else if (parseInt(day)<1||parseInt(day)>31){
        alert("请输入正确的日期！");
    } else{
        if (day<10){
            day="0"+day;
        }
        var month1_year=parseInt(month1.split("-")[0]);
        var month1_month=parseInt(month1.split("-")[1]);
        var month2_year=parseInt(month2.split("-")[0]);
        var month2_month=parseInt(month2.split("-")[1]);
        if (month1_year>month2_year){
            alert("第一个日期要比第二个小！");
        } else if (month1_year==month2_year && month1_month>month2_month){
            alert("第一个日期要比第二个小！");
        }else{
            for (month1_year;month1_year<=month2_year;month1_year++){
                if (month1_year<month2_year){
                    for (month1_month;month1_month<=12;month1_month++){
                        if (month1_month<10){
                            $("#fangjian_fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fangjian_fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                    if (month1_month==13){
                        month1_month=1;
                    }
                }
                if (month1_year==month2_year){
                    for (month1_month;month1_month<=month2_month;month1_month++){
                        if (month1_month<10){
                            $("#fangjian_fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fangjian_fukuanjihua").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                }
            }
        }
    }
}
function xiugaifangjian_yitiao() {
    if ($("#fangjian_piliangtianjia1").css("display")!="none"){
        $("#fangjian_piliangtianjia1").toggle();
        $("#fangjian_tianjiayitiao1").toggle();
    }else{
        $("#fangjian_tianjiayitiao1").toggle();
    }
}
function xiugaifangjian_piliang() {
    if ($("#fangjian_tianjiayitiao1").css("display")!="none"){
        $("#fangjian_tianjiayitiao1").toggle();
        $("#fangjian_piliangtianjia1").toggle();
    }else{
        $("#fangjian_piliangtianjia1").toggle();
    }
}
function xiugaifangjian_deleteall() {
    $("#fangjian_fukuanjihua1").html("");
}
function xiugaifangjian_yitiao_btn_fun() {
    var shijian=$("#xiugaifangjian_tianjiayitiao_shijian").val();
    var money=$("#xiugaifangjian_tianjiayitiao_money").val();
    if (shijian==""){
        alert("请选择日期！");
    } else if (money==""){
        alert("请输入金额！");
    } else{
        $("#fangjian_fukuanjihua1").append(
            "<div class=\"col-md-6\">\n" +
            "                                    <div style=\"margin-top: 5px\">\n" +
            "                                        <input type=\"text\" class=\"form-control shijian\" value='"+shijian+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
            "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
            "                                        元\n" +
            "                                        <label class=\"checkbox-inline\">\n" +
            "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
            "                                        </label>\n" +
            "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
            "                                    </div>\n" +
            "</div>"
        );
        $("#xiugaifangjian_tianjiayitiao_shijian").val("");
        $("#xiugaifangjian_tianjiayitiao_money").val("");
    }
}
function xiugaifangjian_piliang_btn_fun() {
    var month1=$("#xiugaifangjian_month1").val();
    var month2=$("#xiugaifangjian_month2").val();
    var day=$("#xiugaifangjian_day").val();
    var money=$("#xiugaifangjian_piliang_money").val();
    if (month1==""){
        alert("请选择起始月份！");
    } else if(month2==""){
        alert("请选择截止月份！");
    }else if(day==""){
        alert("请输入日期！")
    }else if (money==""){
        alert("请输入金额！");
    }else if (parseInt(day)<1||parseInt(day)>31){
        alert("请输入正确的日期！");
    } else{
        if (day<10){
            day="0"+day;
        }
        var month1_year=parseInt(month1.split("-")[0]);
        var month1_month=parseInt(month1.split("-")[1]);
        var month2_year=parseInt(month2.split("-")[0]);
        var month2_month=parseInt(month2.split("-")[1]);
        if (month1_year>month2_year){
            alert("第一个日期要比第二个小！");
        } else if (month1_year==month2_year && month1_month>month2_month){
            alert("第一个日期要比第二个小！");
        }else{
            for (month1_year;month1_year<=month2_year;month1_year++){
                if (month1_year<month2_year){
                    for (month1_month;month1_month<=12;month1_month++){
                        if (month1_month<10){
                            $("#fangjian_fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fangjian_fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                    if (month1_month==13){
                        month1_month=1;
                    }
                }
                if (month1_year==month2_year){
                    for (month1_month;month1_month<=month2_month;month1_month++){
                        if (month1_month<10){
                            $("#fangjian_fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-0"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                        else{
                            $("#fangjian_fukuanjihua1").append(
                                "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+month1_year+"-"+month1_month+"-"+day+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+money+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>"
                            );
                        }
                    }
                }
            }
        }
    }
}
function insertFangjian()   {
    var formData = new FormData();
    var mmm = $("#zukeziliao");
    for (var k = 0;k<mmm[0].files.length;k++){
        formData.append("tenantPic",mmm[0].files[k])
    }
    var listingConfig="";
    if ($("#modal_inlineCheckbox3_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox4_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox5_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox6_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox7_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox8_3").is(":checked")){
        listingConfig=listingConfig+"1";
    } else {
        listingConfig=listingConfig+"2";
    }
    var paymentPlan="";
    var jihua_checked=1;
    for (var n=0;n<$("#fangjian_fukuanjihua .col-md-6").length;n++){
        jihua_checked=1;
        if ($("#fangjian_fukuanjihua.col-md-6 .checkbox-inline .yifu_check").eq(n).prop("checked")==true){
            jihua_checked=2;
        }
        paymentPlan=paymentPlan+$("#fangjian_fukuanjihua .col-md-6 .shijian").eq(n).val()+";"+$("#fangjian_fukuanjihua .col-md-6 .money").eq(n).val()+";"+jihua_checked+"%";
    }
    var json={
        "listingId":$("#tianjiafangjian_fangyuanid").val(),
        "roomId":$("#tianjiafangjian_fangjianid").val(),
        "status":$("#tianjiafangjian_zhuangtai").find("option:selected").text(),
        "statusDate":$("#tianjiafangjian_zhuangtairiqi").val()+" "+"00:00:00",
        "contractId":$("#tianjiafangjian_hetongid").val(),
        "pricing":$("#tianjiafangjian_dingjia").val(),
        "business":$("#tianjiafangjian_qiandanyewu").val(),
        "payRoomPrice":$("#tianjiafangjian_chufangjia").val(),
        "diposit":$("#tianjiafangjian_yajin").val(),
        "servicePrice":$("#tianjiafangjian_fuwufei").val(),
        "paymentStyle":$("#tianjiafangjian_fukuanfangshi").find("option:selected").text(),
        "tenantName":$("#tianjiafangjian_zukexingming").val(),
        "tenantPhone":$("#tianjiafangjian_zukedianhua").val(),
        "tenantCard":$("#tianjiafangjian_shenfenzhenghao").val(),
        "tenantSex":$("#tianjiafangjian_xingbie").find("option:selected").text(),
        "tenantImName":$("#tianjiafangjian_jinjilianxiren").val(),
        "tenantImPhone":$("#tianjiafangjian_jinjilianxirendianhua").val(),
        "startTime":$("#tianjiafangjian_qizuriqi").val()+" "+"00:00:00",
        "endTime":$("#tianjiafangjian_jiezhiriqi").val()+" "+"00:00:00",
        "arrears":$("#tianjiafangjian_qiankuan").val(),
        "arrearsEndTime":$("#tianjiafangjian_zuichihuankuanri").val()+" "+"00:00:00",
        "contractType":$("#tianjiafangjian_hetongzhuangtai").find("option:selected").text(),
        "transferBaseWater":$("#tianjiafangjian_shuibiao").val(),
        "transferBaseElectricity":$("#tianjiafangjian_dianzong").val(),
        "transferBaseGas":$("#tianjiafangjian_ranqi").val(),
        "transferBaseEleHigh":$("#tianjiafangjian_dianfeng").val(),
        "transferBaseEleLow":$("#tianjiafangjian_diangu").val(),
        "transferBaseEleForm":$("#tianjiafangjian_dulidianbiao").val(),
        "listingConfig":listingConfig,
        "contractNote":$("#tianjiafangjian_hetongbeizhu").val(),
        "roomNote":$("#tianjiafangjian_fangjianbeizhu").val(),
        "financeNote":$("#tianjiafangjian_caiwubeizhu").val(),
        "paymentPlan":paymentPlan,
        "acreage":$("#tianjiafangjian_mianji").val(),
        "face":$("#tianjiafangjian_face").val()
    };
    formData.append("room",JSON.stringify(json));
    $.ajax({
        url: "/Room/insertRoom.html",
        type: "POST",
        dataType: "text",
        processData: false,
        contentType: false,
        data: formData,
        success: function (data) {
            alert("添加成功！");
            for (var k=3;k<=8;k++){
                $("#modal_inlineCheckbox"+k+"_3").removeAttr("checked");
            }
            $("#yulanshangchuantupian2").html("");
            $("#tianjiafangjian_fangyuanid").val("");
                $("#tianjiafangjian_fangjianid").val("");
                $("#tianjiafangjian_zhuangtairiqi").val("");
                $("#tianjiafangjian_hetongid").val("");
                $("#tianjiafangjian_dingjia").val("");
                $("#tianjiafangjian_qiandanyewu").val("");
                $("#tianjiafangjian_chufangjia").val("");
                $("#tianjiafangjian_yajin").val("");
                $("#tianjiafangjian_fuwufei").val("");
                $("#tianjiafangjian_zukexingming").val("");
                $("#tianjiafangjian_zukedianhua").val("");
                $("#tianjiafangjian_shenfenzhenghao").val("");
                $("#tianjiafangjian_jinjilianxiren").val("");
                $("#tianjiafangjian_jinjilianxirendianhua").val("");
                $("#tianjiafangjian_qizuriqi").val("");
                $("#tianjiafangjian_jiezhiriqi").val("");
                $("#tianjiafangjian_qiankuan").val("");
                $("#tianjiafangjian_zuichihuankuanri").val("");
                $("#tianjiafangjian_shuibiao").val("");
                $("#tianjiafangjian_dianzong").val("");
                $("#tianjiafangjian_ranqi").val("");
                $("#tianjiafangjian_dianfeng").val("");
                $("#tianjiafangjian_diangu").val("");
                $("#tianjiafangjian_dulidianbiao").val("");
                $("#tianjiafangjian_hetongbeizhu").val("");
                $("#tianjiafangjian_fangjianbeizhu").val("");
                $("#tianjiafangjian_caiwubeizhu").val("");
                $("#tianjiafangjian_mianji").val("");
                $("#tianjiafangjian_tianjiayitiao_money").val("");
                $("#tianjiafangjian_tianjiayitiao_shijian").val("");
                $("#tianjiafangjian_month1").val("");
                $("#tianjiafangjian_month2").val("");
                $("#tianjiafangjian_day").val("");
            selectRoom(nowListing.listingId,nowRoom);
        },
        error: function () {
            alert("添加失败！请稍后重试")
        }
    })
}
function yulanshangchuantupian2() {
    $("#yulanshangchuantupian2").html("");
    var file = $("#zukeziliao")
    var yulan = $("#yulanshangchuantupian2");
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
                    'DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
            }
        }
    }else {
        alert("最多上传9张图片");
    }
}
function yulanzukeziliaotupian() {
    $("#yulanzukeziliaotupian").html("");
    var file = $("#zukeziliaotupian")
    var yulan = $("#yulanzukeziliaotupian");
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
                    'DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
            }
        }
    }else {
        alert("最多上传9张图片");
    }
}
function removezukeziliao2() {
    if(window.confirm('您确定要清空图片吗？')){
        var l  = $("#zukeziliao")[0];
        if(l.outerHTML){
            l.outerHTML = l.outerHTML;
        }else{
            l.value = '';
        }
        $("#yulanzukeziliaotupian2").html("");
        return true;
    }else{
        return false;
    }
}
function removezukeziliao() {
    if(window.confirm('您确定要清空图片吗？')){
        var l  = $("#zukeziliaotupian")[0];
        if(l.outerHTML){
            l.outerHTML = l.outerHTML;
        }else{
            l.value = '';
        }
        $("#yulanzukeziliaotupian").html("");
        return true;
    }else{
        return false;
    }
}
function inputFangjian(fangjianId) {
    $.ajax({
        url:"../Room/selectOne.html",
        type:"POST",
        dataType:"json",
        data:{id:fangjianId},
        success:function (data) {
            var list = eval(data);
            xiutenanttupian = list.tenantPic.split(";");
            for (var q = 0;q<xiutenanttupian.length-1;q++){
                $("#yulanzukeziliaotupian").append('<img style="width:270px;height: 270px" src="' + xiutenanttupian[q] + '" />')
            }
            $("#xiugaifangjian_fangyuanid").val(list.listingId);
            $("#xiugaifangjian_fangjianid").val(list.roomId);
            var zhuangtai = $("#xiugaifangjian_dangqianzhuangtai")
            for (var ii=0;ii<dangqianzhuangtai.length;ii++){
                if (dangqianzhuangtai[ii]==list.status) {
                    zhuangtai.append("<option selected='selected' value="+ dangqianzhuangtai[ii] +">"+ dangqianzhuangtai[ii] +"</option>")
                }else {
                    zhuangtai.append("<option value="+ dangqianzhuangtai[ii] +">"+ dangqianzhuangtai[ii] +"</option>")
                }
            }
            zhuangtai.selectpicker("refresh");
            zhuangtai.selectpicker("render");
            $("#xiugaifangjian_mianji").val(list.acreage)
            $("#xiugaifangjian_qiandanyewu").val(list.business)
            $("#xiugaifangjian_chufangjia").val(list.payRoomPrice)
            $("#xiugaifangjian_zhuangtairiqi").val(list.statusDate);
            $("#xiugaifangjian_hetongid").val(list.contractId);
            $("#xiugaifangjian_dingjia").val(list.pricing);
            $("#xiugaifangjian_yajin").val(list.diposit);
            $("#xiugaifangjian_fuwufei").val(list.servicePrice);var fangshi = $("#xiugaifangjian_fukuanfangshi");
            fangshi.html("");
            for (var dd=0;dd<fukuanfangshi.length;dd++){
                if (fukuanfangshi[dd]==list.paymentStyle) {
                    fangshi.append("<option selected='selected' value="+ fukuanfangshi[dd] +">"+ fukuanfangshi[dd] +"</option>")
                }else {
                    fangshi.append("<option value="+ fukuanfangshi[dd] +">"+ fukuanfangshi[dd] +"</option>")
                }
            }
            fangshi.selectpicker("refresh");
            fangshi.selectpicker("render");
            $("#xiugaifangjian_zukexingming").val(list.tenantName);
            $("#xiugaifangjian_zukedianhua").val(list.tenantPhone);
            $("#xiugaifangjian_shenfenzhenghao").val(list.tenantCard);
            var xingbie = $("#xiugaifangjian_xingbie");
            xingbie.html("");
            for (var mm=0;mm<xingbienannv.length;mm++){
                if (xingbienannv[mm]==list.tenantSex) {
                    xingbie.append("<option selected='selected' value="+ xingbienannv[mm] +">"+ xingbienannv[mm] +"</option>")
                }else {
                    xingbie.append("<option value="+ xingbienannv[mm] +">"+ xingbienannv[mm] +"</option>")
                }
            }
            xingbie.selectpicker("refresh");
            xingbie.selectpicker("render");
            $("#xiugaifangjian_jinjilianxiren").val(list.tenantImName);
            $("#jinjilianxirendianhua").val(list.tenantImPhone);
            $("#xiugaifangjian_qizuriqi").val(list.startTime.split(" ")[0]);
            $("#xiugaifangjian_jiezhiriqi").val(list.endTime.split(" ")[0]);
            $("#xiugaifangjian_qiankuan").val(list.arrears);
            $("#xiugaifangjian_zuichihuankuanri").val(list.arrearsEndTime);
            var hetongzhuangtai = $("#xiugaifangjian_hetongzhuangtai");
            hetongzhuangtai.html("");
            for (var qq=0;qq<hetongzhuangtai1.length;qq++){
                if (hetongzhuangtai1[qq]==list.contractType) {
                    hetongzhuangtai.append("<option selected='selected' value="+ hetongzhuangtai1[qq] +">"+ hetongzhuangtai1[qq] +"</option>")
                }else {
                    hetongzhuangtai.append("<option value="+ hetongzhuangtai1[qq] +">"+ hetongzhuangtai1[qq] +"</option>")
                }
            }
            hetongzhuangtai.selectpicker("refresh");
            hetongzhuangtai.selectpicker("render");
            $("#xiugaifangjian_shuibiao").val(list.transferBaseWater);
            $("#xiugaifangjian_dulidianbiao").val(list.transferBaseElectricity);
            $("#xiugaifangjian_ranqi").val(list.transferBaseGas);
            $("#xiugaifangjian_dianfeng").val(list.transferBaseEleHigh);
            $("#xiugaifangjian_diangu").val(list.transferBaseEleLow);
            $("#xiugaifangjian_dianzong").val(list.transferBaseEleForm);
            // "listingConfig":listingConfig;
            var ddddd =list.listingConfig.split(";");
            if (ddddd[0]=="1") $("#modal_inlineCheckbox3_4").attr("checked", true);else $("#modal_inlineCheckbox3_4").removeAttr("checked")
            if (ddddd[1]=="1") $("#modal_inlineCheckbox4_4").attr("checked", true);else $("#modal_inlineCheckbox4_4").removeAttr("checked")
            if (ddddd[2]=="1") $("#modal_inlineCheckbox5_4").attr("checked", true);else $("#modal_inlineCheckbox5_4").removeAttr("checked")
            if (ddddd[3]=="1") $("#modal_inlineCheckbox6_4").attr("checked", true);else $("#modal_inlineCheckbox6_4").removeAttr("checked")
            if (ddddd[4]=="1") $("#modal_inlineCheckbox7_4").attr("checked", true);else $("#modal_inlineCheckbox7_4").removeAttr("checked")
            if (ddddd[5]=="1") $("#modal_inlineCheckbox8_4").attr("checked", true);else $("#modal_inlineCheckbox8_4").removeAttr("checked")
            $("#xiugaifangjian_hetongbeizhu").val(list.contractNote);
            $("#xiugaifangjian_fangjianbeizhu").val(list.roomNote);
            $("#xiugaifangjian_caiwubeizhu").val(list.financeNote);
            // "paymentPlan":paymentPlan,
            $("#fangjian_fukuanjihua1").html("");
            if (list.paymentPlan==null){
            } else {
                var pmp=list.paymentPlan.split("%");
                var yifu="";
                for (var n=0;n<pmp.length-1;n++){
                    if (pmp[n].split(";")[0]!="undefined"){
                        if (pmp[n].split(";")[2]=="2"){
                            yifu=" checked='true'";
                            $("#fangjian_fukuanjihua1").append( "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\""+yifu+"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>") ;
                        }else{
                            yifu=" checked='false'";
                            $("#fangjian_fukuanjihua1").append( "<div class=\"col-md-6\">\n" +
                                "                                    <div style=\"margin-top: 5px\">\n" +
                                "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                                "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                                "                                        元\n" +
                                "                                        <label class=\"checkbox-inline\">\n" +
                                "                                            <input type=\"checkbox\" class=\"yifu_check\" value=\"1\"> 已付\n" +
                                "                                        </label>\n" +
                                "                                        <button type=\"button\" class=\"btn btn-danger\" style=\"display: inline;\" onclick='tianjiafangyuan_delete(this)'>删除</button>\n" +
                                "                                    </div>\n" +
                                "</div>") ;
                        }
                    }
                }
            }
            // "tenantPic":null
        },
        error:function (xhr) {
            alert("处理失败！请稍候重试！");
        }
    });

}
function inputFangjian1(aa) {
    var r=allRoom.list[aa];
    $("#room_id").val(r.roomId);
    $("#room_dangqianzhuangtai").val(r.status);
    $("#room_zhuangtairiqi").val(r.statusDate.split(" ")[0]);
    $("#room_hetongbianhao").val(r.contractId);
    $("#room_dingjia").val(r.pricing);
    $("#room_qiandanyewu").val(r.business);
    $("#room_chufangjia").val(r.payRoomPrice);
    $("#room_yajin").val(r.diposit);
    $("#room_fuwufei").val(r.servicePrice);
    $("#room_fukuanfangshi").val(r.paymentStyle);
    $("#room_zukexingming").val(r.tenantName);
    $("#room_zukedianhua").val(r.tenantPhone);
    $("#room_shenfenzhenghao").val(r.tenantCard);
    $("#room_hetongzhuangtai").val(r.contractType);
    $("#room_qizuriqi").val(r.startTime.split(" ")[0]);
    $("#room_jiezhiriqi").val(r.endTime.split(" ")[0]);
    $("#room_qiankuan").val(r.arrears);
    $("#room_zuichihuankuanri").val(r.arrearsEndTime.split(" ")[0]);
    $("#room_xingbie").val(r.tenantSex);
    $("#room_shuibiao").val(r.transferBaseWater);
    $("#room_ranqi").val(r.transferBaseGas);
    $("#room_dianzong").val(r.transferBaseElectricity);
    $("#room_dianfeng").val(r.transferBaseEleHigh);
    $("#room_diangu").val(r.transferBaseEleLow);
    $("#room_dulidianbiao").val(r.transferBaseEleForm);
    $("#room_jinjilianxirenxingming").val(r.tenantImName);
    $("#room_jinjilianxirendianhua").val(r.tenantImPhone);
    $("#room_face").val(r.face);
    var dddd=r.listingConfig.split(";");
    if (dddd[0]=="1"){
        $("#inlineCheckbox1_3").attr("checked","true");
    }else{
        $("#inlineCheckbox1_3").removeAttr("checked");
    }
    if (dddd[1]=="1"){
        $("#inlineCheckbox2_3").attr("checked","true");
    }else{
        $("#inlineCheckbox2_3").removeAttr("checked");
    }
    if (dddd[2]=="1"){
        $("#inlineCheckbox3_3").attr("checked","true");
    }else{
        $("#inlineCheckbox3_3").removeAttr("checked");
    }
    if (dddd[3]=="1"){
        $("#inlineCheckbox4_3").attr("checked","true");
    }else{
        $("#inlineCheckbox4_3").removeAttr("checked");
    }
    if (dddd[4]=="1"){
        $("#inlineCheckbox5_3").attr("checked","true");
    }else{
        $("#inlineCheckbox5_3").removeAttr("checked");
    }
    if (dddd[5]=="1"){
        $("#inlineCheckbox6_3").attr("checked","true");
    }else{
        $("#inlineCheckbox6_3").removeAttr("checked");
    }
    $("#room_caiwubeizhu").val(r.financeNote);
    $("#room_hetongbeizhu").val(r.contractNote);
    $("#room_fangjianbeizhu").val(r.roomNote);
    $("#room_mianji").val(r.acreage)
}
function xiugaifangjian() {
    var formData = new FormData();
    var mmm = $("#zukeziliaotupian");
    for (var k = 0;k<mmm[0].files.length;k++){
        formData.append("tenantPic",mmm[0].files[k])
    }
    var listingConfig="";
    if ($("#modal_inlineCheckbox3_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox4_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox5_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox6_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox7_3").is(":checked")){
        listingConfig=listingConfig+"1;";
    } else {
        listingConfig=listingConfig+"2;";
    }
    if ($("#modal_inlineCheckbox8_3").is(":checked")){
        listingConfig=listingConfig+"1";
    } else {
        listingConfig=listingConfig+"2";
    }
    $("#xiugaifangjian_day").val("");
    $("#xiugaifangjian_month1").val("");
    $("#xiugaifangjian_month2").val("");
    $("#xiugaifangjian_piliang_money").val("");
    $("#xiugaifangjian_tianjiayitiao_money").val("");
    $("#xiugaifangjian_tianjiayitiao_shijian").val("");
    var paymentPlan="";
    var jihua_checked=1;
    for (var n=0;n<$("#fangjian_fukuanjihua1 .col-md-6").length;n++){
        jihua_checked=1;
        if ($("#fangjian_fukuanjihua1 .col-md-6 .checkbox-inline .yifu_check").eq(n).is(":checked")){
            jihua_checked=2;
        }
        paymentPlan=paymentPlan+$("#fangjian_fukuanjihua1 .col-md-6 .shijian").eq(n).val()+";"+$("#fangjian_fukuanjihua1 .col-md-6 .money").eq(n).val()+";"+jihua_checked+"%";
    }
    var json={
        "id":nowRoom.id,
        "listingId":$("#xiugaifangjian_fangyuanid").val(),
        "roomId":$("#xiugaifangjian_fangjianid").val(),
        "status":$("#xiugaifangjian_dangqianzhuangtai").find("option:selected").text(),
        "statusDate":$("#xiugaifangjian_zhuangtairiqi").val(),
        "contractId":$("#xiugaifangjian_hetongid").val(),
        "pricing":$("#xiugaifangjian_dingjia").val(),
        "business":$("#xiugaifangjian_qiandanyewu").val(),
        "acreage":$("#xiugaifangjian_mianji").val(),
        "payRoomPrice":$("#xiugaifangjian_chufangjia").val(),
        "diposit":$("#xiugaifangjian_yajin").val(),
        "servicePrice":$("#xiugaifangjian_fuwufei").val(),
        "paymentStyle":$("#xiugaifangjian_fukuanfangshi").find("option:selected").text(),
        "tenantName":$("#xiugaifangjian_zukexingming").val(),
        "tenantPhone":$("#xiugaifangjian_zukedianhua").val(),
        "tenantCard":$("#xiugaifangjian_shenfenzhenghao").val(),
        "tenantSex":$("#xiugaifangjian_xingbie").find("option:selected").text(),
        "tenantImName":$("#xiugaifangjian_jinjilianxiren").val(),
        "tenantImPhone":$("#jinjilianxirendianhua").val(),
        "startTime":$("#xiugaifangjian_qizuriqi").val()+" 00:00:00",
        "endTime":$("#xiugaifangjian_jiezhiriqi").val()+" 00:00:00",
        "arrears":$("#xiugaifangjian_qiankuan").val(),
        "arrearsEndTime":$("#xiugaifangjian_zuichihuankuanri").val(),
        "contractType":$("#xiugaifangjian_hetongzhuangtai").find("option:selected").text(),
        "transferBaseWater":$("#xiugaifangjian_shuibiao").val(),
        "transferBaseElectricity":$("#xiugaifangjian_dulidianbiao").val(),
        "transferBaseGas":$("#xiugaifangjian_ranqi ").val(),
        "transferBaseEleHigh":$("#xiugaifangjian_dianfeng").val(),
        "transferBaseEleLow":$("#xiugaifangjian_diangu").val(),
        "transferBaseEleForm":$("#xiugaifangjian_dianzong").val(),
        "listingConfig":listingConfig,
        "contractNote":$("#xiugaifangjian_hetongbeizhu").val(),
        "roomNote":$("#xiugaifangjian_fangjianbeizhu").val(),
        "financeNote":$("#xiugaifangjian_caiwubeizhu").val(),
        "paymentPlan":paymentPlan,
        "face":$("#xiugaifangjian_face").val()
    };
    formData.append("room",JSON.stringify(json));
    $.ajax({
        url: "/Room/updateRoom.html",
        type: "POST",
        dataType: "text",
        processData: false,
        contentType: false,
        data: formData,
        success: function (data) {
            alert("修改成功！");
        },
        error: function () {
            alert("修改失败！请稍后重试")
        }
    });
    $.ajax({
        url:"/Room/selectRoomForListing.html",
        type:"POST",
        dataType:"json",
        data:{
            listingId:$("#xiugaifangjian_fangyuanid").val()
        },
        success:function (data) {
            if (data==0){
                $.ajax({
                    url:"Listing/updateListingStatus.html",
                    type:"POST",
                    async:false,
                    dataType:"text",
                    data:{
                        status:2,
                        id:nowListing.id
                    },
                    success:function () {

                    },
                    error:function () {

                    }
                })
            }else {
                $.ajax({
                    url:"Listing/updateListingStatus.html",
                    type:"POST",
                    async:false,
                    dataType:"text",
                    data:{
                        status:1,
                        id:nowListing.id
                    },
                    success:function () {

                    },
                    error:function () {

                    }
                })
            }
        },
        error:function (xhr) {

        }
    })
}
function selectRoom(mmm,pn) {
    var listingId = allData.list[mmm].listingId;
    room_listing_id=listingId;
    $("#tianjiafangjian_fangyuanid").val(room_listing_id);
    $("#xiugaifangjian_fangyuanid").val(room_listing_id);
    $.ajax({
        url:"../Room/selectRoom.html",
        type:"POST",
        dataType:"json",
        data:{listingId:listingId,
            pn:pn},
        success:function (data) {
            var list = eval(data);
            roomAllPn = parseInt(list.pages);
            allRoom=list;
            nowRoom=null;
            $("#room_paper i").html("第"+roomPn+"页/共"+roomAllPn+"页");
            $("#room-tbody").html("");
            var aaaa="";
            var bbbb="";
            if (list.list==""){
            } else {for (var i = 0;i<list.list.length;i++){
                if (list.list[i].listingConfig.split(";")[0]=="2"){
                    aaaa="无";
                }else {
                    aaaa="有";
                }
                if (list.list[i].listingConfig.split(";")[1]=="2"){
                    bbbb="无";
                }else {
                    bbbb="有";
                }
                $("#room-tbody").append("<tr id='room_"+i+"'>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ list.list[i].roomId +"</td>"+
                    "<td>"+ list.list[i].status +"</td>"+
                    "<td>"+ list.list[i].statusDate.split(" ")[0] +"</td>"+
                    "<td>"+ aaaa +"</td>"+
                    "<td>"+ bbbb +"</td>"+
                    "<td>"+ list.list[i].face+"</td>"+
                    "<td>"+ list.list[i].pricing+"</td>"+
                    "<td>"+ list.list[i].roomNote+"</td>"+
                    "</tr>"
                );
            }}
        },
        error:function (xhr) {
            alert("处理失败！请稍候重试！");
        }
    });
}
function shaixuan_fun() {
    $("#shaixuanjiemian").toggle();
}
function fangjianshangyiye() {
    if (roomPn-1<=0){
        alert("没有上一页了")
    } else {
        $("#room-tbody").html("");
        roomPn=roomPn-1;
        selectRoom(room_listing_id,roomPn);
    }
}
function fangjianxiayiye() {
    if (roomPn+1>roomAllPn){
        alert("没有下一页了")
    } else {
        $("#room-tbody").html("");
        roomPn=roomPn+1;
        selectRoom(room_listing_id,roomPn);
    }
}
function fangyuanshangyiye() {
    if (listingPn-1<=0){
        alert("没有上一页了");
    } else {
        $("#listing-tbody").html("");
        listingPn=listingPn-1;
        if ($("#listing-tbody").attr("name")=="allListing") {
            selectAllListing(listingPn);
        }else if ($("#listing-tbody").attr("name")=="shaixuanListing") {
            quedingshaixuan(listingPn);
        }else if ($("#listing-tbody").attr("name")=="sousuoListing"){
            sousuofangyuan(listingPn);
        }
    }
}
function fangyuanxiayiye() {
    if (listingPn+1>listingAllPn){
        alert("没有下一页了");
    } else {
        $("#listing-tbody").html("");
        listingPn=listingPn+1;
        if ($("#listing-tbody").attr("name")=="allListing") {
            selectAllListing(listingPn);
        }else if ($("#listing-tbody").attr("name")=="shaixuanListing") {
            quedingshaixuan(listingPn);
        }else if ($("#listing-tbody").attr("name")=="sousuoListing"){
            sousuofangyuan(listingPn);
        }
    }
}
function selectRoomByListingId(listingId,pn) {
    $.ajax({
        url:"../Room/selectRoom.html",
        type:"POST",
        dataType:"json",
        data:{
            listingId:listingId,
            pn:pn
        },
        success:function (data) {
            var list = eval(data);
            for (var m = 0;m<list.list.length;m++){
                $("#room-tbody").append("<tr>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ list.list[i].roomId +"</td>"+
                    "<td>"+ list.list[i].status +"</td>"+
                    "<td>"+ list.list[i].statusDate +"</td>"+
                    "<td>"+ list.list[i].uniBath +"</td>"+
                    "<td>"+ list.list[i].uniBalcony +"</td>"+
                    "<td>"+ list.list[i].face +"</td>"+
                    "<td>"+ list.list[i].pricing+"</td>"+
                    "<td>"+ list.list[i].roomNote +"</td>"+
                    +"</tr>")
            }
        },
        error:function () {
            alert("处理失败！请稍候重试！");
        }
    });
}
function fangyuantupian(mmm) {
    $("#fangyuantupian").html("");
    $("#fangyuantupianol").html("");
    var picpic = allData.list[mmm].listingPic.split(";");
    for (var m = 0;m<picpic.length-1;m++){
        if (m==0){
            $("#fangyuantupian").append("<div class='item active'><img src='"+ picpic[m] +"' alt='#'></img></div>")
            $("#fangyuantupianol").append("<li data-target='#myCarousel'"+ +" data-slide-to='"+ m +"' class='active'></li>")
        } else {
            $("#fangyuantupian").append("<div class='item item'><img src='"+ picpic[m] +"' alt='#'></img></div>")
            $("#fangyuantupianol").append("<li data-target=#myCarousel data-slide-to='"+m+"'></li>")
        }
    }
}
function zukeziliaotupian(mmm) {
    $("#yzzl").html("");
    $("#yzzlol").html("");
    var picpic = allData.list[mmm].ownerPic.split(";");
    for (var m = 0;m<picpic.length-1;m++){
        if (m==0){
            $("#yzzl").append("<div class='item active'><img src='"+ picpic[m] +"' alt='#'></img></div>")
            $("#yzzlol").append("<li data-target='#myCarouse2'"+ +" data-slide-to='"+ m +"' class='active'></li>")
        } else {
            $("#yzzl").append("<div class='item item'><img src='"+ picpic[m] +"' alt='#'></img></div>")
            $("#yzzlol").append("<li data-target=#myCarouse2 data-slide-to='"+m+"'></li>")
        }
    }
}
function yezhuziliaotupian(mmm) {
    $("#zkzl").html("");
    $("#zkzlol").html("");
    var picpic = allRoom.list[mmm].ownerPic.split(";");
    for (var m = 0;m<picpic.length-1;m++){
        if (m==0){
            $("#zkzl").append("<div class='item active'><img src='"+ picpic[m] +"' alt='#'></img></div>")
            $("#zkzlol").append("<li data-target='#myCarouse3'"+ +" data-slide-to='"+ m +"' class='active'></li>")
        } else {
            $("#zkzl").append("<div class='item item'><img src='"+ picpic[m] +"' alt='#'></img></div>")
            $("#zkzlol").append("<li data-target=#myCarouse3 data-slide-to='"+m+"'></li>")
        }
    }
}
function quedingshaixuan(lpn) {
    var br = $("#branch").find("option:selected").text();
    var dp = $("#depa1").find("option:selected").text();
    var ar = $("#area").find("option:selected").text();
    var comm = $("#comm1").find("option:selected").text();
    var hx = $("#hx").find("option:selected").text();
    var lx = $("#lx").find("option:selected").text();
    var fzzt = $("#fzzt").find("option:selected").text();
    if (br.indexOf("请选择")!=-1){
        br="";
    }
    if (dp.indexOf("请选择")!=-1){
        dp="";
    }
    if (ar.indexOf("请选择")!=-1){
        ar="";
    }
    if (comm.indexOf("请选择")!=-1){
        comm="";
    }
    if (hx.indexOf("请选择")!=-1){
        hx="";
    }
    if (lx.indexOf("请选择")!=-1){
        lx="";
    }
    if (fzzt.indexOf("请选择")!=-1){
        fzzt="";
    }
    $.ajax({
        url:"../Listing/selectAllByStatement.html",
        type:"POST",
        dataType:"json",
        data:{
            branch:br,
            department:dp,
            area:ar,
            community:comm,
            borrowType:lx,
            houseType:hx,
            listingStatus:fzzt,
            pn:lpn
        },
        success:function (data) {
            var list = eval(data);
            allData = list;
            listingPn=lpn;
            listingAllPn=parseInt(list.pages);
            nowListing=null;
            nowRoom=null;
            $("#listing_paper i").html("第"+lpn+"页/共"+listingAllPn+"页");
            $("#listing-tbody").html("");
            $("#listing-tbody").attr("name","shaixuanListing");
            for (var i = 0;i<list.list.length;i++){
                $("#listing-tbody").append("<tr id='listing_"+i+"'>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ list.list[i].branch +"</td>"+
                    "<td>"+ list.list[i].department +"</td>"+
                    "<td>"+ list.list[i].area +"</td>"+
                    "<td>"+ list.list[i].address +"</td>"+
                    "<td>"+ list.list[i].houseType  +"</td>"+
                    "<td>"+ list.list[i].borrowType+"</td>"+
                    "<td>"+ list.list[i].acreage+"</td>"+
                    "<td>"+ list.list[i].housePrice +"</td>"+
                    "<td>"+ list.list[i].listingStatus +"</td>"+
                    "<td>"+ list.list[i].deposit +"</td>"+
                    "<td>"+ list.list[i].secretarial +"</td>"+
                    "<td>"+ list.list[i].endTime.split(" ")[0] +"</td>"+
                    "<td>"+ list.list[i].listingNote +"</td>"+
                    +"</tr>");
            }
        },
        error:function (xhr) {
            alert("处理失败！请稍候重试！");
        }
    });
}
function sousuofangyuan(lPn) {
    $.ajax({
        url:"../Listing/selectBlurry.html",
        type:"POST",
        dataType:"json",
        data:{
            blurry:$("#ssfy").val(),
            pn:lPn
        },
        success:function (data) {
            var list = eval(data);
            allData = list;
            listingPn=lPn;
            listingAllPn=parseInt(list.pages);
            nowListing=null;
            nowRoom=null;
            $("#listing_paper i").html("第"+lPn+"页/共"+listingAllPn+"页");
            $("#listing-tbody").html("");
            $("#listing-tbody").attr("name","sousuoListing");
            for (var i = 0;i<list.list.length;i++){
                $("#listing-tbody").append("<tr id='listing_"+i+"'>"+
                    "<td>"+ list.list[i].listingId +"</td>"+
                    "<td>"+ list.list[i].branch +"</td>"+
                    "<td>"+ list.list[i].department +"</td>"+
                    "<td>"+ list.list[i].area +"</td>"+
                    "<td>"+ list.list[i].address +"</td>"+
                    "<td>"+ list.list[i].houseType +"</td>"+
                    "<td>"+ list.list[i].borrowType +"</td>"+
                    "<td>"+ list.list[i].acreage+"</td>"+
                    "<td>"+ list.list[i].housePrice +"</td>"+
                    "<td>"+ list.list[i].listingStatus +"</td>"+
                    "<td>"+ list.list[i].deposit +"</td>"+
                    "<td>"+ list.list[i].secretarial +"</td>"+
                    "<td>"+ list.list[i].endTime.split(" ")[0] +"</td>"+
                    "<td>"+ list.list[i].listingNote +"</td>"+
                    +"</tr>")
            }
        },
        error:function (xhr) {
            alert("处理失败！请稍候重试！");
        }
    });
}
function shouzhichaxun(pn1,pn2) {
    var start=$("#shouzhi_start").val();
    var end="";
    if ($("#shouzhi_end").val()!=""){
        var end0=$("#shouzhi_end").val().replace("-","/");
        var end1=new Date(end0);
        end1.setDate(end1.getDate()+1);
        end = end1.getFullYear() + "-" +((end1.getMonth()+1)<10?"0":"")+(end1.getMonth()+1)+"-"+(end1.getDate()<10?"0":"")+end1.getDate();
    }
    var fendian=$("#yuangong_fendian").find("option:selected").text();
    var bumen=$("#yuangong_bumen").find("option:selected").text();
    $.ajax({
        url:"../Finance/selectAllByStatus.html",
        type:"POST",
        dataType:"json",
        data:{
            pn:pn1,
            status:1,
            listingId:nowListing.listingId,
            startTime:start,
            endTime:end
        },
        success:function (data) {
            var list=eval(data);
            shouruPn=pn1;
            shouruAllPn=parseInt(list.pages);
            $("#shouru-tbody").html("");
            $("#shouru_paper i").html("第"+shouruPn+"页/共"+shouruAllPn+"页");
            for (var i=0;i<list.list.length;i++){
                $("#shouru-tbody").append("<tr>" +
                    "<td>"+list.list[i].insertTime+"</td>"+
                    "<td>"+list.list[i].price+"</td>"+
                    "<td>"+list.list[i].thing+"</td>"+
                    "<td>"+list.list[i].person+"</td>"+
                    "</tr>");
                }
            },
        error:function (xhr) {
            alert("收入明细查询失败！");
        }
    });
    $.ajax({
        url:"../Finance/selectAllByStatus.html",
        type:"POST",
        dataType:"json",
        data:{
            pn:pn2,
            status:2,
            listingId:nowListing.listingId,
            startTime:start,
            endTime:end
        },
        success:function (data) {
            var list=eval(data);
            zhichuPn=pn2;
            zhichuAllPn=parseInt(list.pages);
            $("#zhichu-tbody").html("");
            $("#zhichu_paper i").html("第"+zhichuPn+"页/共"+zhichuAllPn+"页");
            for (var i=0;i<list.list.length;i++){
                $("#zhichu-tbody").append("<tr>" +
                    "<td>"+list.list[i].insertTime+"</td>"+
                    "<td>"+list.list[i].price+"</td>"+
                    "<td>"+list.list[i].thing+"</td>"+
                    "<td>"+list.list[i].person+"</td>"+
                    "</tr>");
            }
        },
        error:function (xhr) {
            alert("支出明细查询失败！");
        }
    });
}
function shouru_up() {
    if (shouruPn-1<=0){
        alert("没有上一页了！");
    } else {
        $("#shouru-tbody").html("");
        $("#zhichu-tbody").html("");
        shouruPn=shouruPn-1;
        shouzhichaxun(shouruPn,zhichuPn);
    }
}
function shouru_down() {
    if (shouruPn+1>shouruAllPn){
        alert("没有下一页了！");
    }else{
        $("#shouru-tbody").html("");
        $("#zhichu-tbody").html("");
        shouruPn=shouruPn+1;
        shouzhichaxun(shouruPn,zhichuPn);
    }
}
function zhichu_up() {
    if(zhichuPn-1<=0){
        alert("没有上一页了！");
    }else{
        $("#shouru-tbody").html("");
        $("#zhichu-tbody").html("");
        zhichuPn=zhichuPn-1;
        shouzhichaxun(shouruPn,zhichuPn);
    }
}
function zhichu_down() {
    if (zhichuPn+1>zhichuAllPn){
        alert("没有下一页了！");
    }else{
        $("#shouru-tbody").html("");
        $("#zhichu-tbody").html("");
        zhichuPn=zhichuPn+1;
        shouzhichaxun(shouruPn,zhichuPn);
    }
}
function add_shouru(){
    var listingId=nowListing.listingId;
    var financeType=1;
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var insertTime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    var price=$("#shourujine").val();
    var thing=$("#shourushixiang").val();
    var person=$("#shouru_luruyuan").val();
    var branch=nowListing.branch;
    var area=nowListing.department;
    var shouruJson={
        listingId:listingId,
        financeType:financeType,
        insertTime:insertTime,
        price:price,
        thing:thing,
        person:person,
        branch:branch,
        area:area
    };
    $.ajax({
        url:"../Finance/insertFinance.html",
        type:"POST",
        dataType:"text",
        data:{
            finance:JSON.stringify(shouruJson)
        },
        success:function (data) {
            alert("添加成功！");
            shouzhichaxun(1,zhichuPn);
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });
}
function add_zhichu(){
    var listingId=nowListing.listingId;
    var financeType=2;
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var insertTime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    var price=$("#zhichujine").val();
    var thing=$("#zhichushixiang").val();
    var person=$("#zhichu_luruyuan").val();
    var branch=nowListing.branch;
    var area=nowListing.department;
    var shouruJson={
        listingId:listingId,
        financeType:financeType,
        insertTime:insertTime,
        price:price,
        thing:thing,
        person:person,
        branch:branch,
        area:area
    };
    $.ajax({
        url:"../Finance/insertFinance.html",
        type:"POST",
        dataType:"text",
        data:{
            finance:JSON.stringify(shouruJson)
        },
        success:function (data) {
            alert("添加成功！");
            shouzhichaxun(shouruPn,1);
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });
}
function findlistingPlan() {
    if (nowListing.paymentPlan!=null) {
        var pmp=nowListing.paymentPlan.split("%");
        var yifu="";
        $("#fangyuanjihua_body").html("");
        for (var n=0;n<pmp.length-1;n++){
            if (pmp[n].split(";")[0]!="undefined"){
                if (pmp[n].split(";")[2]=="2"){
                    yifu=" checked='true'";
                    $("#fangyuanjihua_body").append( "<div class=\"col-md-6\">\n" +
                        "                                    <div style=\"margin-top: 5px\">\n" +
                        "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                        "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                        "                                        元\n" +
                        "                                        <label class=\"checkbox-inline\">\n" +
                        "                                            <input type=\"checkbox\" class=\"yifu_check\" disabled='true' value=\"1\""+yifu+"> 已付\n" +
                        "                                        </label>\n" +
                        "                                    </div>\n" +
                        "</div>") ;
                }else{
                    yifu=" checked='false'";
                    $("#fangyuanjihua_body").append( "<div class=\"col-md-6\">\n" +
                        "                                    <div style=\"margin-top: 5px\">\n" +
                        "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                        "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                        "                                        元\n" +
                        "                                        <label class=\"checkbox-inline\">\n" +
                        "                                            <input type=\"checkbox\" class=\"yifu_check\" disabled='true' value=\"1\"> 已付\n" +
                        "                                        </label>\n" +
                        "                                    </div>\n" +
                        "</div>") ;
                }
            }
        }
    }
}
function findroomPlan(){
    if (nowRoom.paymentPlan!=null) {
        var pmp=nowRoom.paymentPlan.split("%");
        var yifu="";
        $("#fangjianjihua_body").html("");
        for (var n=0;n<pmp.length-1;n++){
            if (pmp[n].split(";")[0]!="undefined"){
                if (pmp[n].split(";")[2]=="2"){
                    yifu=" checked='true'";
                    $("#fangjianjihua_body").append( "<div class=\"col-md-6\">\n" +
                        "                                    <div style=\"margin-top: 5px\">\n" +
                        "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                        "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                        "                                        元\n" +
                        "                                        <label class=\"checkbox-inline\">\n" +
                        "                                            <input type=\"checkbox\" class=\"yifu_check\" disabled='true' value=\"1\""+yifu+"> 已付\n" +
                        "                                        </label>\n" +
                        "                                    </div>\n" +
                        "</div>") ;
                }else{
                    yifu=" checked='false'";
                    $("#fangjianjihua_body").append( "<div class=\"col-md-6\">\n" +
                        "                                    <div style=\"margin-top: 5px\">\n" +
                        "                                        <input type=\"text\" class=\"form-control shijian\" value='"+pmp[n].split(";")[0]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 50%;display: inline\">\n" +
                        "                                        <input type=\"text\" class=\"form-control money\" value='"+pmp[n].split(";")[1]+"' onfocus='blur()' aria-describedby=\"sizing-addon3\" style=\"width: 20%;display: inline\">\n" +
                        "                                        元\n" +
                        "                                        <label class=\"checkbox-inline\">\n" +
                        "                                            <input type=\"checkbox\" class=\"yifu_check\" disabled='true' value=\"1\"> 已付\n" +
                        "                                        </label>\n" +
                        "                                    </div>\n" +
                        "</div>") ;
                }
            }
        }
    }
}
function findyeji() {
    $.ajax({
        url:"../Performance/selectAllPerson.html",
        type:"POST",
        dataType:"json",
        async:false,
        data:{
            listingId:nowListing.listingId
        },
        success:function (data) {
            var list = data.split(";");
            var ddd = 1;
            $("#yeji-tbody").html("");
            for (var i=0;i<list.length-1;i++){
                if (list[i]==$("#yuangong_name").val()){
                    ddd =0;
                    break;
                }
            }
            if (ddd==0){
                $.ajax({
                    url:"../Performance/selectAllByListing.html",
                    type:"POST",
                    dataType:"text",
                    async:false,
                    data:{
                        listingId:nowListing.listingId
                    },
                    success:function (data) {
                        var list=eval(data);
                        for (var i=0;i<list.length;i++){
                            $("#yeji-tbody").append("<tr>" +
                                "<td>"+list[i].insertTime+"</td>"+
                                "<td>"+list[i].details+"</td>"+
                                "<td>"+list[i].person+"</td>"+
                                "</tr>");
                        }
                    },
                    error:function (xhr) {
                        alert("业绩查询失败！");
                    }
                });
            }
        },
        error:function (xhr) {
            alert("业绩查询失败！");
        }
    });
}
function add_yeji() {
    var listingId=nowListing.listingId;
    var now = new Date();
    var hour=now.getHours();
    var minute=now.getMinutes();
    var second=now.getSeconds();
    var insertTime = now.getFullYear() + "-" +((now.getMonth()+1)<10?"0":"")+(now.getMonth()+1)+"-"+(now.getDate()<10?"0":"")+now.getDate()+" "+(hour<10?"0":"")+hour+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second;
    var details=$("#yeji_jiluxiangqing").val();
    var person=$("#yeji_luruyuan").val();
    var yejiJson={
        listingId:listingId,
        insertTime:insertTime,
        details:details,
        person:person
    };
    $.ajax({
        url:"../Performance/insertPerformance.html",
        type:"POST",
        dataType:"text",
        data:{
            performance:JSON.stringify(yejiJson)
        },
        success:function (data) {
            alert("添加成功！");
            findyeji();
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });
}
function yejidianji() {
    if (nowListing==null){
        $("#p7_7").css("display","none");
    }else{
        if ($("#empType").html()=="4"){
            $("#p7_7").css("display","block");
            findyeji();
        } else if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
            if($("#yuangong_zhiwu").find("option:selected").text()=="店长" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#p7_7").css("display","block");
                findyeji();
            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department) {
                if ($("#yuangong_name").val()==nowListing.houseManage || $("#yuangong_zhiwu").find("option:selected").text()=="经理" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘") {
                    $("#p7_7").css("display","block");
                    findyeji();
                }
            }
        }
    }
}

// function tianjiaSelectComm() {
//     $("#communityl").empty();
//     $.ajax({
//         url:"../Find/findComm.html",
//         type:"POST",
//         dataType:"json",
//         success:function (data) {
//             var list = eval(data);
//             for (var m = 0;m<list.length;m++){
//                 $("#communityl").append("<option value='" + list[m] + "'>"+ list[m] +"</option>")
//             }
//             $("#communityl").selectpicker("refresh");
//             $("#communityl").selectpicker("render");
//         },
//         error:function (xhr) {
//             alert("添加失败，请稍候重试！");
//         }
//     });
// }
// function shaixuanSelectComm() {
//     $("#comm1").empty();
//     $.ajax({
//         url:"../Find/findComm.html",
//         type:"POST",
//         dataType:"json",
//         success:function (data) {
//             var list = eval(data);
//             for (var m = 0;m<list.length;m++){
//                 $("#comm1").append("<option value='" + list[m] + "'>"+ list[m] +"</option>")
//             }
//             $("#comm1").selectpicker("refresh");
//             $("#comm1").selectpicker("render");
//         },
//         error:function (xhr) {
//             alert("添加失败，请稍候重试！");
//         }
//     });
// }
// function xiugaiSelectComm(d) {
//     var community = allData.list[d].community
//     $("#communityl-1").empty();
//     $.ajax({
//         url:"../Find/findComm.html",
//         type:"POST",
//         dataType:"json",
//         success:function (data) {
//             var list = eval(data);
//             for (var m = 0;m<list.length;m++){
//                 if (list[m]== community){
//                     $("#communityl-1").append("<option selected='selected' value='" + list[m] + "'>"+ list[m] +"</option>")
//                 }
//                 else{
//                     $("#communityl-1").append("<option value='" + list[m] +"'>"+ list[m] +"</option>")
//                 }
//             }
//             $("#communityl-1").selectpicker("refresh");
//             $("#communityl-1").selectpicker("render");
//         },
//         error:function (xhr) {
//             alert("添加失败，请稍候重试！");
//         }
//     });
// }
function tianjiaHouseManager() {
    $("#houseManagel").empty();
    var branch = $("#yuangong_fendian").html();
    var depa = $("#yuangong_bumen").html();
    $.ajax({
        url:"../Employee/selectHouseManager.html",
        type:"POST",
        dataType:"json",
        data:{
            branch:branch,
            department:depa,
        },
        success:function (data) {
            var list = eval(data);
            $("#houseManagel").html("");
            $("#houseManagel").append("<option value='" + 0 + "'>"+ "请选择房管" +"</option>")
            for (var m=0;m<list.length;m++) {
                $("#houseManagel").append("<option value='" + list[m] + "'>"+ list[m] +"</option>")
            }
            $("#houseManagel").selectpicker("refresh");
            $("#houseManagel").selectpicker("render");
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });

}
function xiugaiHouseManager(d) {
    var branch = allData.list[d].branch;
    var depa = allData.list[d].department;
    var houseManager = allData.list[d].houseManage;
    $("#houseManagel-1").empty();
    $.ajax({
        url:"../Employee/selectHouseManager.html",
        type:"POST",
        dataType:"json",
        data:{
            branch:branch,
            department:depa
        },
        success:function (data) {
            var list = eval(data);
            $("#houseManagel-1").html("");
            for (var m=0;m<list.length;m++) {
                if (houseManager==list[m]){
                    $("#houseManagel-1").append("<option selected='selected' value='" + list[m] + "'>"+ list[m] +"</option>")
                } else {
                    $("#houseManagel-1").append("<option value='" + list[m] + "'>"+ list[m] +"</option>")
                }
            }
            $("#houseManagel-1").selectpicker("refresh");
            $("#houseManagel-1").selectpicker("render");
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });
}
function tianjiaWenMi()     {
    $("#secretariall").empty();
    var branch = $("#yuangong_fendian").html();
    var depa = $("#yuangong_bumen").html();
    $.ajax({
        url:"../Employee/selectSe.html",
        type:"POST",
        dataType:"json",
        data:{
            branch:branch,
            department:depa
        },
        success:function (data) {
            var list = eval(data);
            $("#secretariall").html("");
            $("#secretariall").append("<option value='" + 0 + "'>"+ "请选择文秘" +"</option>")
            for (var m=0;m<list.length;m++) {
                $("#secretariall").append("<option value='" + list[m] + "'>"+ list[m] +"</option>")
            }
            $("#secretariall").selectpicker("refresh");
            $("#secretariall").selectpicker("render");
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });

}
function xiugaiHWenMi(d) {
    var branch = allData.list[d].branch
    var depa = allData.list[d].department
    var secretarial = allData.list[d].secretarial
    $("#secretariall-1").empty();
    $.ajax({
        url:"../Employee/selectSe.html",
        type:"POST",
        dataType:"json",
        data:{
            branch:branch,
            department:depa
        },
        success:function (data) {
            var list = eval(data);
            $("#secretariall-1").html("");
            for (var m=0;m<list.length;m++) {
                if (secretarial==list[m]){
                    $("#secretariall-1").append("<option selected='selected' value='" + list[m] + "'>"+ list[m] +"</option>")
                } else {
                    $("#secretariall-1").append("<option value='" + list[m] + "'>"+ list[m] +"</option>")
                }
            }
            $("#secretariall-1").selectpicker("refresh");
            $("#secretariall-1").selectpicker("render");
        },
        error:function (xhr) {
            alert("添加失败，请稍候重试！");
        }
    });
}
function fangyuandianji() {
    if (nowListing==null){
        $("#p2_2").css("display","none");
    }else{
        if ($("#empType").html()=="4"){
            $("#p2_2").css("display","block");
        } else if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
            if($("#yuangong_zhiwu").find("option:selected").text()=="店长" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#p2_2").css("display","block");
            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department) {
                if (nowListing.houseManage==$("#yuangong_name").val() || $("#yuangong_zhiwu").find("option:selected").text()=="经理" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘") {
                    $("#p2_2").css("display","block");
                }
            }
        }
    }
}
function fangjiandianji() {
    if (nowRoom==null){
        $("#p4_4").css("display","none");
    }else{
        if ($("#empType").html()=="4"){
            $("#p4_4").css("display","block");
        } else if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
            if($("#yuangong_zhiwu").find("option:selected").text()=="店长" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#p4_4").css("display","block");
            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department) {
                if (nowListing.houseManage==$("#yuangong_name").val() || $("#yuangong_zhiwu").find("option:selected").text()=="经理" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘"){
                    $("#p4_4").css("display","block");
                }
            }
        }
    }
}
function zukeziliaodianji() {
    if (nowListing==null){
        $("#p5_5").css("display","none");
    }else{
        if ($("#empType").html()=="4"){
            $("#p5_5").css("display","block");
        } else if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
            if($("#yuangong_zhiwu").find("option:selected").text()=="店长" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#p5_5").css("display","block");
            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department) {
                if (nowListing.houseManage==$("#yuangong_name").val() || $("#yuangong_zhiwu").find("option:selected").text()=="经理" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘"){
                    $("#p5_5").css("display","block");
                }
            }
        }
    }
}
function shouzhimingxidianji() {
    if (nowListing==null){
        $("#p6_6").css("display","none");
    }else{
        if ($("#empType").html()=="4"){
            $("#p6_6").css("display","block");
        } else if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
            if($("#yuangong_zhiwu").find("option:selected").text()=="店长" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#p6_6").css("display","block");
            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department) {
                if (nowListing.houseManage==$("#yuangong_name").val() || $("#yuangong_zhiwu").find("option:selected").text()=="经理" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘"){
                    $("#p6_6").css("display","block");
                }
            }
        }
    }
}
function yezhuziliaodianji() {
    if (nowListing==null){
        $("#p3_3").css("display","none");
    }else{
        if ($("#empType").html()=="4"){
            $("#p3_3").css("display","block");
        } else if ($("#yuangong_fendian").find("option:selected").text()==nowListing.branch){
            if($("#yuangong_zhiwu").find("option:selected").text()=="店长" || $("#yuangong_zhiwu").find("option:selected").text()=="财务"){
                $("#p3_3").css("display","block");
            }else if ($("#yuangong_bumen").find("option:selected").text()==nowListing.department) {
                if (nowListing.houseManage==$("#yuangong_name").val() || $("#yuangong_zhiwu").find("option:selected").text()=="经理" || $("#yuangong_zhiwu").find("option:selected").text()=="文秘"){
                    $("#p3_3").css("display","block");
                }
            }
        }
    }
}