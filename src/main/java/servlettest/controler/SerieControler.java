/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.controler;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.service.SerieServiceMockImpl;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieControler {

    SerieServiceMockImpl serieServiceMockImpl = new SerieServiceMockImpl();

    public void listerseries(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Serie> series = serieServiceMockImpl.listerTout();
        String titre = new String();
        titre="Liste des series";
        req.setAttribute("mesSeries", series);
        req.setAttribute("titrePage", titre);
        req.getRequestDispatcher("lister_series.jsp").include(req, resp);
    }
    
    public void detail_serie (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Serie s = serieServiceMockImpl.findById(Long.parseLong(req.getParameter("idSerie")));
        req.setAttribute("maSerie", s);
        req.getRequestDispatcher("detail_serie.jsp").include(req, resp);
    }

}
