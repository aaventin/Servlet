<%-- 
    Document   : lister_series
    Created on : 8 mars 2016, 11:35:06
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contenu">
            <h1>${titrePage}</h1>               
            <c:forEach items="${mesSeries}" var="maSerie">
                Serie actuelle : ${maSerie.titre} <a href="?page=detail_serie&idSerie=${maSerie.id}">Detail de la serie</a>
                <br>
            </c:forEach>  
        </div>

    </body>
</html>
