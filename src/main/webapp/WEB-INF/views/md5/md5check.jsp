<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15-4-30
  Time: 下午11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
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
                    <a class="navbar-brand" href="#">MD5在线</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li ><a href="<c:url value="/"/>">MD5计算</a></li>
                        <li class="active"><a href="<c:url value="/md5check"/>">MD5校验</a></li>
                        <li ><a href="<c:url value="/mymd5"/>">我的MD5</a></li>

                        <!--  <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                              <li><a href="#">Action</a></li>
                              <li><a href="#">Another action</a></li>
                              <li><a href="#">Something else here</a></li>
                              <li class="divider"></li>
                              <li class="dropdown-header">Nav header</li>
                              <li><a href="#">Separated link</a></li>
                              <li><a href="#">One more separated link</a></li>
                            </ul>
                          </li> -->
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
            <div class="row" style="background-color:#ffffff;padding:10px">
                <div class="span12">
                    <ul class="nav-tabs nav" id="tabs1">
                        <li class="active"><a href="#tabs-1">文本</a></li>
                        <li><a href="#tabs-2">文件</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="tabs-1">
                            <div id="textdiv">
                                <div class="input-group input-group-lg" style="margin-top:20px">
                                    <span class="input-group-addon">MD5值</span>
                                    <input type="text" id="textmd5" class="form-control" />
                                </div>
                                <div class="form-group">
                                    <label for="name">文本框</label>
                                    <textarea id ="sourcetextstring" class="form-control" rows="3"></textarea>
                                </div>

                                <button type="button" class="btn btn-primary btn-lg btn-block" onclick="cleckText()">校验</button>

                            </div>
                            <div  style="background-color:#ffffff;padding:10px;font-size:10px;margin-top:30px">
                                <label>输入MD5值：</label><label id="text_srcmd5"></label><p>
                                <label>当前MD5值：</label><label id="text_ansmd5"></label><p>
                                <label>校验结果：</label><label id="text_isequal"></label>
                            </div>
                        </div>
                        <div class="tab-pane" id="tabs-2">
                            <div class="input-group input-group-lg" style="margin-top:20px">
                                <span class="input-group-addon">MD5值</span>
                                <input type="text" id="filemd5" class="form-control" />
                            </div>
                            <div id="filediv" style="margin-top:20px">
                                选择要校验的文件：<input style="font-size:15px;"type="file" id="file"></div>

                            <div id="myprogress" class="progress progress-striped" style="display:none;margin-top:30px">
                                <div class="progress-bar progress-bar-info" role="progressbar"
                                     aria-valuenow="60" aria-valuemin="0" id="progressfile" aria-valuemax="100"
                                     style="width: 0%">
                                    <span id="progresstext">0%</span>
                                </div>
                            </div>
                            <div  style="background-color:#ffffff;padding:10px;font-size:10px;margin-top:20px">
                                <label>输入MD5值：</label><label id="file_srcmd5"></label><p>
                                <label>当前MD5值：</label><label id="file_ansmd5"></label><p>
                                <label>校验结果：</label><label id="file_isequal"></label>
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

    function cleckText(){
        var text=$("#sourcetextstring").val().trim()
        if(text==""){alert("您输入的字符串为空！");return;}
        var p=SparkMD5.hash(text);
        console.log(p);

        var srcmd5=$("#textmd5").val();
        $("#text_srcmd5").text(srcmd5);
        $("#text_ansmd5").text(p);
        if(p==srcmd5){
            $("#text_isequal").text("YES");
        }else{
            $("#text_isequal").text("NO");
        }
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

                console.info("computed hash", spark.end());
                $("#myprogress").hide()
                var file_srcmd5=box.val();
                $("#file_srcmd5").text(file_srcmd5);
                $("#file_ansmd5").text(p);
                if(p==file_srcmd5){
                    $("#file_isequal").text("YES");
                }else{
                    $("#file_isequal").text("NO");
                }
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
