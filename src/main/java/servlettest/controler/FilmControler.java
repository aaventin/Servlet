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
import servlet.service.FilmServiceMockImpl;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmControler {
    FilmServiceMockImpl filmServiceMockImpl = new FilmServiceMockImpl();
    
    public void listerfilms(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = new String();
        titre = "Liste des films";
        List<Film> films = filmServiceMockImpl.listerTous();
        req.setAttribute("mesFilms", films);
        req.setAttribute("titrePage", titre);
        req.getRequestDispatcher("lister_films.jsp").include(req, resp);
        
    }

    public void detail_film(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f = filmServiceMockImpl.findById(Long.parseLong(req.getParameter("idFilm")));
        req.setAttribute("monFilm", f);
        req.getRequestDispatcher("detail_film.jsp").include(req, resp);
    }

    
}
