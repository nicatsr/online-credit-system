<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/" var="baseUrl" htmlEscape="true"/>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<!-- BEGIN: Head-->
<head>

    <jsp:include page="../../common/meta.jsp"/>
    <title>Admin dashboard</title>
    <jsp:include page="css.jsp"/>

</head>
<!-- END: Head-->

<!-- BEGIN: Body-->

<body class="vertical-layout vertical-menu-modern semi-dark-layout 2-columns  navbar-floating footer-static  " data-open="click" data-menu="vertical-menu-modern" data-col="2-columns" data-layout="semi-dark-layout">

<!-- BEGIN: Header-->
<%--<jsp:include page="header.jsp"/>--%>
<!-- END: Header-->


<!-- BEGIN: Main Menu-->
<jsp:include page="menu.jsp"/>
<!-- END: Main Menu-->
<br><br><br><br>
<section id="multiple-column-form">
    <div class="row match-height">
        <div class="col-6 offset-md-4">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Kredit əlavə et</h4>
                </div>
                <div class="card-content">
                    <div class="card-body">
                        <form:form modelAttribute="debtorDto" method="post" action="checkFin">
                            <div class="form-body">
                                <div class="row">
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            Fin kod
                                            <form:input path="finCode" cssClass="form-control"/>
                                        </div>
                                    </div>
                                    <div class="col-12 offset-md-4">
                                        <button type="submit" class="btn btn-primary mr-1 mb-1 waves-effect waves-light">Təsdiqlə</button>
                                        <button type="reset" class="btn btn-outline-warning mr-1 mb-1 waves-effect waves-light">Təmizlə</button>
                                    </div>
                                </div>
                            </div>
                        </form:form>
                        <p style="color:red">${message}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


<div class="sidenav-overlay"></div>
<div class="drag-target"></div>


<jsp:include page="js.jsp"/>
</body>
<!-- END: Body-->

</html>