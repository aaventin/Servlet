/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.service.FilmServiceMockImpl;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "listerfilms_servlet", urlPatterns = {"/listerfilms_servlet",})
public class listerfilms_servlet extends HttpServlet {

    private FilmServiceMockImpl filmServiceMockImpl = new FilmServiceMockImpl();
    private String titre = new String();
    private String msgErreur = new String();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> films = filmServiceMockImpl.listerTous();
        titre = "Liste des films";
        msgErreur = "Erreur : aucun film référencé";

        //Test si la liste de films est vide
        if (films.isEmpty() == false) {
            //Envoie l'attribut mesFilms vers ma JSP
            req.setAttribute("mesFilms", films);
            req.setAttribute("titrePage", titre);

            //Renvoie la main vers notre JSP film
            req.getRequestDispatcher("lister_films.jsp").forward(req, resp);
        }

        req.setAttribute("msgErreur", msgErreur);
        //Renvoie la main vers notre JSP erreur
        req.getRequestDispatcher("erreur.jsp").forward(req, resp);

    }

}
