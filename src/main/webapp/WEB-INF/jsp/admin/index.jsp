<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/admin/assets" var="assertBaseUrl" htmlEscape="true"/>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<!-- BEGIN: Head-->
<head>

    <jsp:include page="../../common/meta.jsp"/>
    <title>Admin dashboard</title>
    <jsp:include page="../../common/css.jsp"/>

</head>
<!-- END: Head-->

<!-- BEGIN: Body-->

<body class="vertical-layout vertical-menu-modern semi-dark-layout 2-columns  navbar-floating footer-static  " data-open="click" data-menu="vertical-menu-modern" data-col="2-columns" data-layout="semi-dark-layout">

<!-- BEGIN: Header-->
<jsp:include page="header.jsp"/>
<!-- END: Header-->

<!-- BEGIN: Main Menu-->
<jsp:include page="menu.jsp"/>
<!-- END: Main Menu-->
<br><br><br><br><br>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div class="col-md-6 offset-md-2">
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <button id="getDebtorResultByFinCode" class="btn btn-primary" type="button">Axtar</button>
                    </div>
                    <input id="debtorFinCode" type="text" class="form-control" placeholder="Fin koda uyğun müştərini tap" aria-label="" aria-describedby="basic-addon1">
                </div>
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <button id="getCreditResultByFinCode" class="btn btn-primary" type="button">Axtar</button>
                    </div>
                    <input id="creditResultFinCode" type="text" class="form-control" placeholder="Fin koda uyğun krediti tap" aria-label="" aria-describedby="basic-addon1">
                </div>
            </div>
        </div>
    </div>
</div>

<div class="col-md-12">
    <div class="offset-3">
        <table style="display: none"  id="credit" class="table table-striped">
            <thead>
                <tr>
                    <th>Baza miqdar</th>
                    <th>Faiz dərəcəsi</th>
                    <th>Ümumi ödəniş</th>
                    <th>Aylıq ödəniş</th>
                    <th>Ay ilə müddət</th>
                    <th>Başlama tarixi</th>
                    <th>Bitmə tarixi</th>
                    <th>Fin kod</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody  id="creditResultsTable">

            </tbody>
        </table>
    </div>
</div>
<hr>
<div class="col-md-12">
    <div class="offset-3">
        <table style="display: none" id="customer" class="table table-striped">
            <thead>
            <tr>
                <th>Müştəri</th>
                <th>Müştəri telefon nömrəsi</th>
                <th>Müştəri maaş</th>
                <th>Müştəri fin kodu</th>
                <th>Zamin</th>
                <th>Zamin telefon nömrəsi</th>
                <th>Zamin fin kodu</th>
            </tr>
            </thead>
            <tbody  id="debtorResultTable">

            </tbody>
        </table>
    </div>
</div>
<hr>
<div class="col-md-12">
    <div class="offset-3">
        <table style="display: none"  id="creditResult" class="table table-striped">
            <thead>
            <tr>
                <th>Baza miqdar</th>
                <th>Faiz dərəcəsi</th>
                <th>Ümumi ödəniş</th>
                <th>Aylıq ödəniş</th>
                <th>Ay ilə müddət</th>
                <th>Başlama tarixi</th>
                <th>Bitmə tarixi</th>
                <th>Fin kod</th>
                <th>Status</th>
            </tr>
            </thead>
            <tbody  id="creditResultTable">

            </tbody>
        </table>
    </div>
</div>

<div class="sidenav-overlay"></div>
<div class="drag-target"></div>

<jsp:include page="../../common/js.jsp"/>
<script src="${pageContext.request.contextPath}/admin/custom/admin-credit.js" type="text/javascript"></script>
</body>
<!-- END: Body-->
</html>