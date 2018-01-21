<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>文件</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

    <style>
        .yg_form {
            width: 500px;
            height: 500px;
            margin-left: 400px;
        }
    </style>
</head>
<body>

<form class="yg_form"  action="http://localhost:9090/file_path/upload" method="post"
      enctype="multipart/form-data">
    <div class="form-group" >
        <label for="exampleInputFile">File input</label>
        <input type="file" id="exampleInputFile"name="file">
        <p class="help-block">Example block-level help text here.</p>
    </div>

    <button type="submit" class="btn  btn-info">上传</button>
</form>

</body>
</html>