<%-- 
    Document   : TEMPLATE
    Created on : 7 mars 2016, 14:01:14
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%-- 
        <c:import url="_CSS.jsp"></c:import>
        --%>
            <title>STREAMING</title>
        </head>
        <body>
             <%-- 
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/>
             --%>
        <div class="contenu">
            <h1>Detail du film</h1>
            Titre : ${monFilm.titre}<br>
            Annee de production : ${monFilm.annee}<br>
            Synopsis : ${monFilm.synopsis}<br>
            Genre : ${monFilm.genre}<br>
            Pays de production : ${monFilm.pays}<br>
        </div>
         <%-- 
        <c:import url="_PIED.jsp"/>
          --%>
    </body>
</html>




