<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags" %>
<%@page session="false" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>andydoo</title>
    <link href="<c:url value="/css/navbar.css"/>" rel="stylesheet">

    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
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
                    <li class="active"><a href="<c:url value="/"/>">MD5计算</a></li>
                    <li><a href="<c:url value="/md5check"/>">MD5校验</a></li>
                    <li><a href="<c:url value="/mymd5"/>">我的MD5</a></li>
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


    <div class="jumbotron" >

            <section>
                <div id="messages" class="container-fluid">
                    <div class="row-fluid">
                        <div class="span12">
                            <div class="span2">
                                <!-- Just for spacing -->
                            </div>
                            <div class="span8">
                                <c:if test="${not empty message}">
                                    <div class="alert">
                                        <button type="button" class="close" data-dismiss="alert">×</button>
                                            ${message}<br/>
                                    </div>
                                </c:if>
                                <c:if test="${not empty errorMessage}">
                                    <div class="alert alert-error">
                                        <button type="button" class="close" data-dismiss="alert">×</button>
                                            ${errorMessage}<br/>
                                    </div>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <section >
                <div class="container-fluid" >
                    <div class="row-fluid">
                        <div class="span12">
                            <div class="span2">
                                <!-- Place Holder -->
                            </div>
                            <div class="span8">
                                <div class="hero-unit">
                                    <form name='f' class="form-horizontal" action="<c:url value='../j_spring_security_check' />" method="POST">
                                        <div class="heading">
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for='j_username'><spring:message code="label.username" text="用户名"/></label>
                                            <div class="controls">
                                                <input type="text" name='j_username' placeholder="Username">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for='j_password'><spring:message code="label.password" text="密码"/></label>
                                            <div class="controls">
                                                <input type="password" name='j_password' placeholder="Min. 8 Characters">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <div class="controls">
                                                <!-- <label class="checkbox">
                                                    <input type="checkbox"> Keep me signed in   ¦
                                                    <a href="#" class="btn btn-link">Forgot my password</a>
                                                </label> -->
                                                <button type="submit" class="btn btn-success">Sign In</button>
                                                <button type="button" class="btn">Help</button>
                                            </div>
                                        </div>
                                    </form>
                                    <p><a class="btn" href="${pageContext.request.contextPath}/auth/signup"><spring:message code="button.no.account" text="Default No account? Create one now!"/></a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
  </div>




</body>
</html>