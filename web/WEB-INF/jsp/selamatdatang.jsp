<%-- 
    Document   : SelamatDatang
    Created on : 14-Dec-2017, 11:22:14
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selamat Datang</title>
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    </head>
    <body>
        <h1>${fitri}</h1>
        <p>
            <a href="pendaftaran"><button>Pendaftaran</button></a>
            <a href="masuk"><button>Masuk</button></a>
        </p>
    </body>
</html>
