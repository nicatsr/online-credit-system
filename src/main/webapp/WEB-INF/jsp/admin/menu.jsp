<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="main-menu menu-fixed menu-dark menu-accordion menu-shadow" data-scroll-to-active="true">
    <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">
            <li class="nav-item mr-auto"><a class="navbar-brand" href="/admin/admind">
                <div class="brand-logo"></div>
                <h2 class="brand-text mb-0">Online Credit</h2>
            </a></li>
            <li class="nav-item nav-toggle"><a class="nav-link modern-nav-toggle pr-0" data-toggle="collapse"><i class="feather icon-x d-block d-xl-none font-medium-4 primary toggle-icon"></i><i class="toggle-icon feather icon-disc font-medium-4 d-none d-xl-block collapse-toggle-icon primary" data-ticon="icon-disc"></i></a></li>
        </ul>
    </div>
    <div class="shadow-bottom"></div>
    <div class="main-menu-content">
        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">
            <li class=" nav-item"><a href="/admin/admind"><i class="feather icon-home"></i><span class="menu-title" data-i18n="Dashboard">Dashboard</span><span class="badge badge badge-warning badge-pill float-right mr-2"></span></a>

            </li>

            <li class=" nav-item"><a href="#"><i class="feather icon-user"></i><span class="menu-title" data-i18n="User">Müştəri əlavə et</span></a>
                <ul class="menu-content">
                    <li><a href="/admin/getDebtorForm"><i class="feather icon-circle"></i><span class="menu-item" data-i18n="List">Fiziki şəxs</span></a>
                    </li>
                    <li><a href="app-user-view.html"><i class="feather icon-circle"></i><span class="menu-item" data-i18n="View">Hüquqi şəxs</span></a>
                    </li>
                </ul>
            </li>
            <li class=" nav-item"><a href="#"><i class="feather icon-shopping-cart"></i><span class="menu-title" data-i18n="Ecommerce">Kredit əlavə et</span></a>
                <ul class="menu-content">
                    <li><a href="/admin/loginWithFinCode"><i class="feather icon-circle"></i><span class="menu-item" data-i18n="Shop">Fiziki şəxs</span></a>
                    </li>
                </ul>
            </li>
            <li class=" nav-item"><a href="/logout"><i class="fa fa-sign-out" aria-hidden="true"></i><span class="menu-title" data-i18n="Ecommerce">Çıxın</span></a>

            </li>
        </ul>
    </div>
</div>
