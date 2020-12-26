<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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



<!-- BEGIN: Main Menu-->
<jsp:include page="customer-menu.jsp"/>
<!-- END: Main Menu-->
<div class="col-md-12">
    <div class="offset-3">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Ümumi ödəniş</th>
                <th>Aylıq ödəniş</th>
                <th>Başlama tarixi</th>
                <th>Bitmə tarixi</th>
                <th>Maaş uyğunluğu</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${payment.generalPayment}</td>
                <td>${payment.monthlyPayment}</td>
                <td>${creditDto.startDate}</td>
                <td>${endDate}</td>
                <td>
                    <c:choose>
                        <c:when test="${salaryResult == true}">
                            Maaş uyğundur
                        </c:when>
                        <c:otherwise>
                            Maaş uyğun deyil
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            </tbody>

        </table>
    </div>
    <div class="offset-3">
        <a href="/customer/loginWithFinCode" class="btn btn-primary" role="button">Əvvələ</a>
        <c:choose>
            <c:when test="${salaryResult == true}">
                <a href="/customer/addCredit" class="btn btn-primary" role="button">Krediti alın</a>
                <a href="/admin/excel" class="btn btn-primary" role="button">Excel yaradın</a>
            </c:when>
        </c:choose>

    </div>


</div>

<div class="sidenav-overlay"></div>
<div class="drag-target"></div>


<jsp:include page="../../common/js.jsp"/>


</body>
<!-- END: Body-->

</html>