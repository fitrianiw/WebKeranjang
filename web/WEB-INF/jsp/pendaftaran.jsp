<%-- 
    Document   : pendaftaran
    Created on : 14-Dec-2017, 13:31:30
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Pendaftaran Website</title>
    </head>
    <body>
        <h1>Form Pendaftaran</h1>
        <form:form action="pendaftaran/simpan" modelAttribute="pendaftaranBean" method="POST">
            <form:label path="namadepan">Nama Depan</form:label>
            <form:input path="namadepan"/><br/><br/>
            <form:label path="namabelakang">Nama Belakang</form:label>
            <form:input path="namabelakang"/><br/><br/>
            <form:label path="username">Username</form:label>
            <form:input path="username"/><br/><br/>
            <form:label path="password">Password</form:label>
            <form:input path="password"/><br/><br/>
            <form:label path="tempatlahir">Tempat Lahir</form:label>
            <form:input path="tempatlahir"/><br/><br/>
            <form:label path="email">E-mail</form:label>
            <form:input path="email"/><br/><br/>
            <form:label path="alamat">Alamat</form:label>
            <form:textarea path="alamat"/><br/><br/>
            <p>
                <form:button name="simpanButton" value="Simpan">Simpan</form:button>
            </p>
            
            
        </form:form>
    </body>
</html>
