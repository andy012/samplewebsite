<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; UTF-8">
    <title>andydoo</title>
    <link href="<c:url value="/css/navbar.css"/>" rel="stylesheet">

    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/spark-md5.js"/>"></script>

    <script>
        $(function () {
            $("#tabs1 a").click(function (e) {
                $(this).tab('show');
            });
        });
    </script>
</head>
<body>
<div>

<div class="container">
    <!-- Static navbar -->
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value="/"/>">MD5在线</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="<c:url value="/"/>">MD5计算</a></li>
                    <li><a href="<c:url value="/md5check"/>">MD5校验</a></li>
                    <li><a href="<c:url value="/mymd5"/>">我的MD5</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">

                    <c:if test="${empty pageContext.request.userPrincipal}">
                    <li><a href="<c:url value="/auth/login"/>">登录</a></li>
                    </c:if >
                    <c:if test="${not empty pageContext.request.userPrincipal}">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${pageContext.request.userPrincipal.getName()} <span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="<c:url value="/mymd5"/>">我的Md5</a></li>
                                    <li><a href="<c:url value="/auth/logout"/>">退出</a></li>
                                </ul>
                            </li>
                    </c:if >
                   </ul>
            </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
    </nav>
    <div class="jumbotron">
        <div class="row" style="background-color:#ffffff;padding:10px;">
            <div class="span12">
                <ul class="nav-tabs nav" id="tabs1">
                    <li class="active"><a href="#tabs-1">文本</a></li>
                    <li><a href="#tabs-2">文件</a></li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="tabs-1">
                        <div id="textdiv">

                            <div class="form-group">
                                <label for="name">文本框</label>
                                <textarea id ="sourcetextstring" class="form-control" rows="3"></textarea>
                            </div>

                            <button type="button" class="btn btn-primary btn-lg btn-block" onclick="clickText()">计算MD5值</button>
                            <div class="input-group input-group-lg" style="margin-top:20px">
                                <span class="input-group-addon">MD5值</span>
                                <input type="text" id="textmd5" class="form-control" />
                            </div>
                        </div>

                        <div class="panel panel-default" style="margin-top:40px">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordion"
                                       href="#collapseOne">
                                        保存到我的服务器
                                    </a>
                                </h4>
                            </div>
                            <div id="collapseOne" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <form class="form-horizontal" role="form"style="font-size:18px" action="<c:url value='/savemd5/text' />" method="POST">
                                        <div class="form-group">
                                            <label for="text_detail" class="col-sm-2 control-label">描述：</label>
                                            <div class="col-sm-8"style="margin-top:13px">
                                                <input type="text" class="form-control" id="text_detail" name="detail"
                                                        >
                                            </div>
                                        </div>
                                        <div class="form-group" >
                                            <label for="text_savemd5" class="col-sm-2 control-label">MD5值：</label>
                                            <div class="col-sm-8" style="margin-top:13px">
                                                <input type="text" class="form-control" id="text_savemd5" name="md5"
                                                        >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-8">
                                                <button type="submit" class="btn btn-default">保存</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="tab-pane" id="tabs-2">
                        <div id="filediv" style="margin-top:20px">
                            <input type="file" id="file">
                            <div class="input-group input-group-lg" style="margin-top:20px">
                                <span class="input-group-addon">MD5值</span>
                                <input type="text" id="filemd5" class="form-control" />
                            </div>
                        </div>

                        <div id="myprogress" class="progress progress-striped" style="display:none;margin-top:20px">
                            <div class="progress-bar progress-bar-info" role="progressbar"
                                 aria-valuenow="60" aria-valuemin="0" id="progressfile" aria-valuemax="100"
                                 style="width: 0%">
                                <span id="progresstext">0%</span>
                            </div>
                        </div>
                        <div class="panel panel-default" style="margin-top:40px">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordion"
                                       href="#collapseTwo">
                                        保存到我的服务器
                                    </a>
                                </h4>
                            </div>
                            <div id="collapseTwo" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <form class="form-horizontal"  role="form" action="<c:url value='/savemd5/file' />" method="POST">
                                        <div class="form-group">
                                            <label for="file_detail" class="col-sm-2 control-label">描述：</label>
                                            <div class="col-sm-8"style="margin-top:15px">
                                                <input type="text" class="form-control" id="file_detail" name="detail"
                                                        >
                                            </div>
                                        </div>
                                        <div class="form-group" >
                                            <label for="file_savemd5" class="col-sm-2 control-label">MD5值：</label>
                                            <div class="col-sm-8" style="margin-top:15px">
                                                <input type="text" class="form-control" id="file_savemd5" name="md5"
                                                        >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-8">
                                                <button type="submit" class="btn btn-default">保存</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


            </div>


        </div>
    </div>

</div>
</div>

<script type="text/javascript">

    //	$("#myprogress").hide()

    function clickText(){
        var text=$("#sourcetextstring").val().trim()
        if(text==""){alert("您输入的字符串为空！");return;}
        var p=SparkMD5.hash(text);
        $("#textmd5").val(p);
        $("#text_detail").val(text);
        $("#text_savemd5").val(p);
        //alert(p);
    }

    document.getElementById("file").addEventListener("change", function() {

        var fileReader = new FileReader(), box = $("#filemd5");
        blobSlice = File.prototype.mozSlice || File.prototype.webkitSlice || File.prototype.slice, file = document.getElementById("file").files[0], chunkSize = 2097152,
            // read in chunks of 2MB
                chunks = Math.ceil(file.size / chunkSize), currentChunk = 0, spark = new SparkMD5();

        fileReader.onload = function(e) {
            console.log("read chunk nr", currentChunk + 1, "of", chunks);
            spark.appendBinary(e.target.result);
            // append binary string
            currentChunk++;
            $("#progressfile").css("width",(currentChunk+1)*100/chunks+"%")
            $("#progresstext").text(Math.round((currentChunk+1)*100/chunks)+"%")

            if (currentChunk < chunks) {
                loadNext();

            } else {
                console.log("finished loading");
                var p=spark.end();
                box.val(p);
                console.info("computed hash", spark.end());
                $("#myprogress").hide()
                $("#file_detail").val(file.name);
                $("#file_savemd5").val(p);
                // compute hash
            }
        };

        function loadNext() {
            var start = currentChunk * chunkSize, end = start + chunkSize >= file.size ? file.size : start + chunkSize;

            fileReader.readAsBinaryString(blobSlice.call(file, start, end));
        }
        $("#progressfile").css("width","0%")
        $("#progresstext").text("0%")
        $("#myprogress").show()
        loadNext();
    });
</script>




</body>
</html>