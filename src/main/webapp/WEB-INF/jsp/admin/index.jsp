<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<jsp:include page="header.jsp"/>
<!-- END: Header-->


<!-- BEGIN: Main Menu-->
<jsp:include page="menu.jsp"/>
<!-- END: Main Menu-->


<div class="sidenav-overlay"></div>
<div class="drag-target"></div>


<jsp:include page="js.jsp"/>

</body>
<!-- END: Body-->

</html>