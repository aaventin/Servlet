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
import servlettest.controler.FilmControler;
import servlettest.controler.SerieControler;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "FrontServlet", urlPatterns = {"/FrontServlet"})
public class FrontServlet extends HttpServlet {    
   
    FilmControler filmControler = new FilmControler();
    SerieControler serieControler = new SerieControler();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("_CSS.jsp").include(req, resp);
        req.getRequestDispatcher("_TITRE.jsp").include(req, resp);
        req.getRequestDispatcher("_MENU.jsp").include(req, resp);
        
        if(req.getParameter("page")==null){
            req.getRequestDispatcher("_PIED.jsp").include(req, resp); 
        }

            if (req.getParameter("page").equals("listerfilms")) {            
               filmControler.listerfilms(req, resp);
                
        }
            if (req.getParameter("page").equals("detail_film")) {
                filmControler.detail_film(req, resp);
            }
            
            if (req.getParameter("page").equals("listerseries")) {
                serieControler.listerseries(req, resp);                
            }
            
            if(req.getParameter("page").equals("detail_serie")){
                serieControler.detail_serie(req, resp);
            }
        
        req.getRequestDispatcher("_PIED.jsp").include(req, resp);
    }

}
