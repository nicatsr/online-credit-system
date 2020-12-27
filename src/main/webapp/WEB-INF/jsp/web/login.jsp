<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/" var="baseUrl" htmlEscape="true"/>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<!-- BEGIN: Head-->
<head>

    <jsp:include page="../../common/meta.jsp"/>
    <title>Admin dashboard</title>
    <jsp:include page="../../common/css.jsp"/>
    <style>
        .error{
            color:red;
        }
    </style>

</head>
<!-- END: Head-->

<!-- BEGIN: Body-->

<body class="vertical-layout vertical-menu-modern semi-dark-layout 2-columns  navbar-floating footer-static  " data-open="click" data-menu="vertical-menu-modern" data-col="2-columns" data-layout="semi-dark-layout">


<br><br><br><br>
<section id="multiple-column-form">
    <div class="row match-height">
        <div class="col-6 offset-md-3">
            <div class="card">
                <div class="card-content">
                    <div class="card-body">
                        <form method="post" action="credit_sign_in">
                        <div class="form-body">
                            <div class="row">
                                <div class="col-12 col-md-6 offset-md-3">
                                    <div class="form-label-group">
                                        Email
                                        <input type="text" class="form-control" placeholder="Email" name="username">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12 col-md-6 offset-md-3">
                                    <div class="form-label-group">
                                        Şifrə
                                        <input type="password" class="form-control" placeholder="Password" name="password">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12 offset-md-3">
                                    <button type="submit" class="btn btn-primary mr-1 mb-1 waves-effect waves-light">Təsdiqlə</button>
                                    <button type="reset" class="btn btn-outline-warning mr-1 mb-1 waves-effect waves-light">Təmizlə</button>
                                </div>
                            </div>
                        </div>
                     </form>
                        <a href="/"><i class="fa fa-sign-out" aria-hidden="true">Ana səhifə</i>
                        </a>
                </div>
            </div>
        </div>
    </div>
    </div>
</section>


<div class="sidenav-overlay"></div>
<div class="drag-target"></div>


<jsp:include page="../../common/js.jsp"/>
</body>
<!-- END: Body-->

</html>