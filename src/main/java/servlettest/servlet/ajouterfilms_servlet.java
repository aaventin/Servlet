/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "ajouterfilms", urlPatterns = {"/ajouterfilms"})
public class ajouterfilms_servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f =new Film();
        f.setTitre(req.getParameter("titre"));
        f.setSynopsis(req.getParameter("synopsis"));
        f.getGenre().setNom(req.getParameter("categorie"));
        
        
    }

}
