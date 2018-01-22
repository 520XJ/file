<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table id="file" width="500px"></table>

</body>
<script>

$(function () {

    $.ajax({
        type: "post",
        url:ctx + "/file_details/queryFileByParams",
        dataType:"json",
        success:function (data) {
            
        }
    });

})

</script>
</html>