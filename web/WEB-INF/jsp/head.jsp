<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="jumbotron">
        <h1 align="center">IndoOLShop</h1> 
        <p>OLShop Terpercaya Dengan Kualitas Terbaik</p> 
        <div><a href="${pageContext.request.contextPath}">Home</a></div><br/>
        <c:if test="${not empty sessionScope.user}">
            <div><a href="${pageContext.request.contextPath}/logout">Logout</a></div>
        </c:if>

    </div>

</div>