<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/admind/assets" var="assertBaseUrl" htmlEscape="true"/>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<!-- BEGIN: Head-->
<head>

    <jsp:include page="../../common/meta.jsp"/>
    <title>Admin dashboard</title>
    <jsp:include page="../../common/css.jsp"/>
    <style>
        .error{
            color: red;
        }
    </style>

</head>
<!-- END: Head-->

<!-- BEGIN: Body-->

<body class="vertical-layout vertical-menu-modern semi-dark-layout 2-columns  navbar-floating footer-static  " data-open="click" data-menu="vertical-menu-modern" data-col="2-columns" data-layout="semi-dark-layout">



<!-- BEGIN: Main Menu-->
<jsp:include page="customer-menu.jsp"/>
<!-- END: Main Menu-->
<br><br><br><br>
<section id="multiple-column-form">
    <div class="row match-height">
        <div class="col-6 offset-md-4">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Müştəri əlavə et</h4>
                </div>
                <div class="card-content">
                    <div class="card-body">
                        <form:form modelAttribute="debtorDto" method="post" action="addDebtor">
                            <div class="form-body">
                                <div class="row">
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="relatedPersonFullName" cssClass="form-control" placeholder="Tam adınız"/>
                                            <form:errors path="relatedPersonFullName" cssClass="error"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="phoneNumber" cssClass="form-control" placeholder="Telefon nömrəsi , num:0551234567"/>
                                            <form:errors path="phoneNumber" cssClass="error"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="salary" cssClass="form-control" placeholder="Maaş"/>
                                            <form:errors path="salary" cssClass="error"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="finCode" cssClass="form-control" placeholder="Fin kod"/>
                                            <form:errors path="finCode" cssClass="error"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="guarantorFullName" cssClass="form-control" placeholder="Zaminin tam adı"/>
                                            <form:errors path="guarantorFullName" cssClass="error"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="guarantorPhoneNumber" cssClass="form-control"
                                                        placeholder="Zaminin telefon nömrəsi , num:0551234567"/>
                                            <form:errors path="guarantorPhoneNumber" cssClass="error"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-12">
                                        <div class="form-label-group">
                                            <form:input path="guarantorFinCode" cssClass="form-control" placeholder="Zaminin fin kodu"/>
                                            <form:errors path="guarantorFinCode" cssClass="error"/>

                                        </div>
                                    </div>
                                    <div class="col-12 offset-md-4">
                                        <button type="submit" class="btn btn-primary mr-1 mb-1 waves-effect waves-light">Təsdiqlə</button>
                                        <button type="reset" class="btn btn-outline-warning mr-1 mb-1 waves-effect waves-light">Təmizlə</button>
                                    </div>
                                </div>
                            </div>
                        </form:form>
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