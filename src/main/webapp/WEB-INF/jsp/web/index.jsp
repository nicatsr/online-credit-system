<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/web/assets" var="assertBaseUrl" htmlEscape="true"/>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Ana səhifə</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="${assertBaseUrl}/img/favicon.png" rel="icon">
    <link href="${assertBaseUrl}/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="${assertBaseUrl}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/icofont/icofont.min.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/animate.css/animate.min.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/line-awesome/css/line-awesome.min.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/venobox/venobox.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/owl.carousel/${assertBaseUrl}/owl.carousel.min.css" rel="stylesheet">
    <link href="${assertBaseUrl}/vendor/aos/aos.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="${assertBaseUrl}/css/style.css" rel="stylesheet">
</head>

<body>

<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center  header-transparent ">
    <div class="container d-flex align-items-center">

        <div class="logo mr-auto"></div>

        <nav class="nav-menu d-none d-lg-block">
            <ul>
                <li class="active"><a href="/">Ana səhifə</a></li>
                <li><a href="/login">Daxil ol</a></li>
                <li><a href="/register">Qeydiyyat</a></li>

            </ul>
        </nav><!-- .nav-menu -->

    </div>
</header><!-- End Header -->

<!-- ======= Hero Section ======= -->
<section id="hero" class="d-flex flex-column justify-content-end align-items-center">
    <div id="heroCarousel" class="container carousel carousel-fade" data-ride="carousel">

        <!-- Slide 1 -->
        <div class="carousel-item active">
            <div class="carousel-container">
                <h2 class="animate__animated animate__fadeInDown">Online kredit</h2>
<%--                <p class="animate__animated fanimate__adeInUp">Ut velit est quam dolor ad a aliquid qui aliquid. Sequi ea ut et est quaerat sequi nihil ut aliquam. Occaecati alias dolorem mollitia ut. Similique ea voluptatem. Esse doloremque accusamus repellendus deleniti vel. Minus et tempore modi architecto.</p>--%>
                <a href="#about" class="btn-get-started animate__animated animate__fadeInUp scrollto">Daha çox</a>
            </div>
        </div>
        <a class="carousel-control-prev" href="#heroCarousel" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon bx bx-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>

        <a class="carousel-control-next" href="#heroCarousel" role="button" data-slide="next">
            <span class="carousel-control-next-icon bx bx-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>

    </div>

    <svg class="hero-waves" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 24 150 28 " preserveAspectRatio="none">
        <defs>
            <path id="wave-path" d="M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z">
        </defs>
        <g class="wave1">
            <use xlink:href="#wave-path" x="50" y="3" fill="rgba(255,255,255, .1)">
        </g>
        <g class="wave2">
            <use xlink:href="#wave-path" x="50" y="0" fill="rgba(255,255,255, .2)">
        </g>
        <g class="wave3">
            <use xlink:href="#wave-path" x="50" y="9" fill="#fff">
        </g>
    </svg>

</section><!-- End Hero -->


<!-- Vendor JS Files -->
<script src="${assertBaseUrl}/vendor/jquery/jquery.min.js"></script>
<script src="${assertBaseUrl}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${assertBaseUrl}/vendor/jquery.easing/jquery.easing.min.js"></script>
<script src="${assertBaseUrl}/vendor/php-email-form/validate.js"></script>
<script src="${assertBaseUrl}/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="${assertBaseUrl}/vendor/venobox/venobox.min.js"></script>
<script src="${assertBaseUrl}/vendor/owl.carousel/owl.carousel.min.js"></script>
<script src="${assertBaseUrl}/vendor/aos/aos.js"></script>

<!-- Template Main JS File -->
<script src="${assertBaseUrl}/js/main.js"></script>

</body>

</html>