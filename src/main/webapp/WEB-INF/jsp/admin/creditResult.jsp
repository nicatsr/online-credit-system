<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/admin/assets" var="assertBaseUrl" htmlEscape="true"/>
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
                    <td>${generalPayment}</td>
                    <td>${monthlyPayment}</td>
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
            <a href="/admin/loginWithFinCode" class="btn btn-primary" role="button">Əvvələ</a>
            <c:choose>
                <c:when test="${salaryResult == true}">
                    <a href="/admin/addCredit" class="btn btn-primary" role="button">Krediti al</a>
                    <a href="#" class="btn btn-primary" role="button">Excel yarat</a>
                </c:when>
            </c:choose>

        </div>


    </div>



<jsp:include page="js.jsp"/>

</body>
<!-- END: Body-->

</html>