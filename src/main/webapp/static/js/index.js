function cclick() {
    $("#insertImgs").click();

}
function insertImgs() {
    var formData = new FormData();
    var header_file = $("#insertImgs")[0].files[0]
    var phone = "18712341234"
    formData.append("applicationPic", header_file)
    formData.append("applicationTime", 2008-01-12)
    formData.append("applicationPerson",1)
    formData.append("applicationBranch",1)
    formData.append("applicationDepa",1)
    formData.append("applicationJob",1)
    formData.append("applicationPro",1)
    formData.append("applicationPrice",1)
    formData.append("applicationBankCard",1)
    formData.append("applicationReason",1)
    formData.append("applicationStatus",1)
    formData.append("applicationPersonId",1)
    $.ajax({
        url: "/Application/insertApplication.html",
        type: "POST",
        dataType: "json",
        processData: false,
        contentType: false,
        data: formData,
        success: function (data) {
            // var header = eval(data)
            // alert(header)
            alert("uuu")
        },
        error: function () {
            console.log(formData.get("applicationPic"))
            alert("motherFucker")
        }
    })
}