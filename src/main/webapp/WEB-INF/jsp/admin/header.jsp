<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/admin/assets" var="assertBaseUrl" htmlEscape="true"/>
<nav class="header-navbar navbar-expand-lg navbar navbar-with-menu floating-nav navbar-light navbar-shadow">
    <div class="navbar-wrapper">
        <div class="navbar-container content">
            <div class="navbar-collapse" id="navbar-mobile">
                <div class="mr-auto float-left bookmark-wrapper d-flex align-items-center">


                            </div>
                            <!-- select.bookmark-select-->
                            <!--   option Chat-->
                            <!--   option email-->
                            <!--   option todo-->
                            <!--   option Calendar-->
                        </li>
                    </ul>
                </div>
                <ul class="nav navbar-nav float-right">

                    <li class="nav-item nav-search"><a class="nav-link nav-link-search"><i class="ficon feather icon-search"></i></a>
                        <div class="search-input">
                            <div class="search-input-icon"><i class="feather icon-search primary"></i></div>
                            <input class="input" type="text" placeholder="Axtarın" tabindex="-1" data-search="template-list">
                            <div class="search-input-close"><i class="feather icon-x"></i></div>
                            <ul class="search-list search-list-main"></ul>
                        </div>
                    </li>
                    <li class="dropdown dropdown-user nav-item"><a class="dropdown-toggle nav-link dropdown-user-link" href="#" data-toggle="dropdown">
                        <div class="user-nav d-sm-flex d-none"><span class="user-name text-bold-600">Admin</span></div>
                    </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>
<ul class="main-search-list-defaultlist d-none">
    <li class="d-flex align-items-center"><a class="pb-25" href="#">
        <h6 class="text-primary mb-0">Files</h6>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between w-100" href="#">
        <div class="d-flex">
            <div class="mr-50"><img src="${assertBaseUrl}/images/icons/xls.png" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">Two new item submitted</p><small class="text-muted">Marketing Manager</small>
            </div>
        </div><small class="search-data-size mr-50 text-muted">&apos;17kb</small>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between w-100" href="#">
        <div class="d-flex">
            <div class="mr-50"><img src="${assertBaseUrl}/images/icons/jpg.png" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">52 JPG file Generated</p><small class="text-muted">FontEnd Developer</small>
            </div>
        </div><small class="search-data-size mr-50 text-muted">&apos;11kb</small>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between w-100" href="#">
        <div class="d-flex">
            <div class="mr-50"><img src="${assertBaseUrl}/images/icons/pdf.png" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">25 PDF File Uploaded</p><small class="text-muted">Digital Marketing Manager</small>
            </div>
        </div><small class="search-data-size mr-50 text-muted">&apos;150kb</small>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between w-100" href="#">
        <div class="d-flex">
            <div class="mr-50"><img src="${assertBaseUrl}/images/icons/doc.png" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">Anna_Strong.doc</p><small class="text-muted">Web Designer</small>
            </div>
        </div><small class="search-data-size mr-50 text-muted">&apos;256kb</small>
    </a></li>
    <li class="d-flex align-items-center"><a class="pb-25" href="#">
        <h6 class="text-primary mb-0">Members</h6>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between py-50 w-100" href="#">
        <div class="d-flex align-items-center">
            <div class="avatar mr-50"><img src="${assertBaseUrl}/images/portrait/small/avatar-s-8.jpg" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">John Doe</p><small class="text-muted">UI designer</small>
            </div>
        </div>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between py-50 w-100" href="#">
        <div class="d-flex align-items-center">
            <div class="avatar mr-50"><img src="${assertBaseUrl}/images/portrait/small/avatar-s-1.jpg" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">Michal Clark</p><small class="text-muted">FontEnd Developer</small>
            </div>
        </div>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between py-50 w-100" href="#">
        <div class="d-flex align-items-center">
            <div class="avatar mr-50"><img src="${assertBaseUrl}/images/portrait/small/avatar-s-14.jpg" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">Milena Gibson</p><small class="text-muted">Digital Marketing Manager</small>
            </div>
        </div>
    </a></li>
    <li class="auto-suggestion d-flex align-items-center cursor-pointer"><a class="d-flex align-items-center justify-content-between py-50 w-100" href="#">
        <div class="d-flex align-items-center">
            <div class="avatar mr-50"><img src="${assertBaseUrl}/images/portrait/small/avatar-s-6.jpg" alt="png" height="32"></div>
            <div class="search-data">
                <p class="search-data-title mb-0">Anna Strong</p><small class="text-muted">Web Designer</small>
            </div>
        </div>
    </a></li>
</ul>
<ul class="main-search-list-defaultlist-other-list d-none">
    <li class="auto-suggestion d-flex align-items-center justify-content-between cursor-pointer"><a class="d-flex align-items-center justify-content-between w-100 py-50">
        <div class="d-flex justify-content-start"><span class="mr-75 feather icon-alert-circle"></span><span>No results found.</span></div>
    </a></li>
</ul>