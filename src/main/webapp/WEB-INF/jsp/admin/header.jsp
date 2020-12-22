<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/admin/assets" var="assertBaseUrl" htmlEscape="true"/>
<nav class="header-navbar navbar-expand-lg navbar navbar-with-menu floating-nav navbar-light navbar-shadow">

    <div class="navbar-wrapper">
        <div class="navbar-container content">
            <div class="navbar-collapse" id="navbar-mobile">
                <div class="mr-auto float-left bookmark-wrapper d-flex align-items-center">
                                    <button id="getAllCreditResults"
                                            class="btn btn-primary mr-1 mb-1 waves-effect waves-ligh">Bütün kreditlərə bax</button>

                </div>
                <ul class="nav navbar-nav float-right">
                    <li class="dropdown dropdown-user nav-item"><a class="dropdown-toggle nav-link dropdown-user-link" href="#" data-toggle="dropdown">
                        <div class="user-nav d-sm-flex d-none"><span class="user-name text-bold-600">Admin</span></div>
                    </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>
</ul>