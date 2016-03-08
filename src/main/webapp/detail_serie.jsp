<%-- 
    Document   : detail_serie
    Created on : 8 mars 2016, 11:41:12
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STREAMING</title>
    </head>
    <body>
       <div class="contenu">
            <h1>Detail de la serie</h1>
            Titre : ${maSerie.titre}<br>
            Annee de production : ${maSerie.annee}<br>
            Synopsis : ${maSerie.synopsis}<br>            
            Pays de production : ${maSerie.pays}<br>
        </div>
        
    </body>
</html>
