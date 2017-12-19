<%-- 
    Document   : SelamatDatang
    Created on : 14-Dec-2017, 11:22:14
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selamat Datang</title>
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    </head>
    <body>
        <h1 class="jumbotron">${fitri}</h1>
        <p>
            <a href="pendaftaran"><button>Pendaftaran</button></a>
            <a href="masuk"><button>Masuk</button></a>
        </p>
        <c:forEach var="p" items="${produk}">
            <div class="col-sm-4" style="text-align: center;">
                <img src="<c:url value="/resources/gambar/${p.gambar}"/>" style="width: 250px; height: 250px;" align="center;"/>
            </div>
        </c:forEach>
    </body>
</html>
