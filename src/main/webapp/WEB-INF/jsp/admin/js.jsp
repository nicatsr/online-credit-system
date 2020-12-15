<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url value="/admin/assets" var="assertBaseUrl" htmlEscape="true"/>

<!-- BEGIN: Vendor JS-->
<script src="${assertBaseUrl}/vendors/js/vendors.min.js"></script>
<!-- BEGIN Vendor JS-->

<!-- BEGIN: Page Vendor JS-->
<script src="${assertBaseUrl}/vendors/js/charts/apexcharts.min.js"></script>
<script src="${assertBaseUrl}/vendors/js/extensions/tether.min.js"></script>
<script src="${assertBaseUrl}/vendors/js/extensions/shepherd.min.js"></script>
<!-- END: Page Vendor JS-->

<!-- BEGIN: Theme JS-->
<script src="${assertBaseUrl}/js/core/app-menu.js"></script>
<script src="${assertBaseUrl}/js/core/app.js"></script>
<script src="${assertBaseUrl}/js/scripts/components.js"></script>
<!-- END: Theme JS-->

<!-- BEGIN: Page JS-->
<script src="${assertBaseUrl}/js/scripts/pages/dashboard-analytics.js"></script>
<!-- END: Page JS-->